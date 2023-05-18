#!/bin/bash

mvn -T 1C scoverage:report
mvn -Dscoverage.aggregateOnly=true  scoverage:report-only
