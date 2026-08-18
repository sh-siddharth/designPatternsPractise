#!/usr/bin/env bash
set -euo pipefail
if [ "${1:-}" = "" ]; then
	echo "Usage: $0 <fully-qualified-main-class>"
	exit 1
fi
# Build into target and run the class directly to ensure stdout appears in terminal
mvn -DskipTests=true package
java -cp target/classes "$1"
