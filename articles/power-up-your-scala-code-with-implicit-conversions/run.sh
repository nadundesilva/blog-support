#!/bin/bash

set -e

mvn clean package
java -jar ./target/app.jar
