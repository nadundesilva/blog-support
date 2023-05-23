#!/bin/bash

set -e

mvn clean package verify

echo
echo "Running Sample"
echo

java -jar ./target/app.jar
