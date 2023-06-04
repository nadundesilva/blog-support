#!/bin/bash

set -e

OUTPUT_DIR="./test-coverage"
rm -rf "${OUTPUT_DIR}"
mkdir -p "${OUTPUT_DIR}"

echo
echo "Running Tests with unsafe goals"
echo

mvn clean
mvn -T 1C -Dscoverage.aggregateOnly=true  scoverage:report
cp -r ./target/site/scoverage "${OUTPUT_DIR}/report"

echo
echo "Running Tests with safe goals"
echo

mvn clean
mvn -T 1C scoverage:test
mvn -Dscoverage.aggregateOnly=true  scoverage:report-only
cp -r ./target/site/scoverage "${OUTPUT_DIR}/report-fix"

echo
echo "Finished copying Test Reports"
echo "Original Report - ${OUTPUT_DIR}/report"
echo "Fixed Report    - ${OUTPUT_DIR}/report-fix"
echo
