#!/usr/bin/env bash
set -euo pipefail
mvn -DskipTests=true compile exec:java -Dexec.mainClass="$1"
