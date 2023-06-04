#!/bin/bash

set -e

export MINIKUBE_PROFILE="buffer-pods-example"

echo
echo "Creating Minikube Cluster"
echo

minikube start --profile "${MINIKUBE_PROFILE}" \
    --cpus=2 \
    --memory=4g \
    --wait \
    --kubernetes-version=v1.26.3

echo
kubectl version
echo
kubectl get pods -A

if [ "${CI}" != "true" ]; then
    echo
    read -p "Press Enter to create K8s Resources" inputFromUser
fi

kubectl apply -k .

if [ "${CI}" != "true" ]; then
    echo
    read -p "Press Enter to scale up the workload Pods" inputFromUser
fi

kubectl scale deployment workload-deployment --replicas 10

if [ "${CI}" != "true" ]; then
    echo
    read -p "Press Enter to remove the Minikube Cluster" inputFromUser
fi

echo
echo "Destroying Minikube Cluster"
echo

minikube stop --profile "${MINIKUBE_PROFILE}"
minikube delete --profile "${MINIKUBE_PROFILE}"
