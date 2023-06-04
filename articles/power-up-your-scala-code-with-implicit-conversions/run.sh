#!/bin/bash

set -e

echo
echo "Building Sample"
echo

mvn clean package verify

echo
echo "Running Sample"
echo

java -jar ./target/app.jar
