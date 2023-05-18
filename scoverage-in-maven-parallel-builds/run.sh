#!/bin/bash

OUTPUT_DIR="./test-coverage"
mkdir -p "${OUTPUT_DIR}"

mvn clean
mvn -T 1C -Dscoverage.aggregateOnly=true  scoverage:report
cp -r ./target/site/scoverage "${OUTPUT_DIR}/report"

mvn clean
mvn -T 1C scoverage:test
mvn -Dscoverage.aggregateOnly=true  scoverage:report-only
cp -r ./target/site/scoverage "${OUTPUT_DIR}/report-fix"
