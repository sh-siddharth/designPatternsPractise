# designPatternsPractise
hands on for all the design patterns

Chain of Responsibility
Real life usecase - ATM, Vending Machine
Design Logger - asked in amazon

## Build & Run (Maven)

This repository has been converted to a Maven project with standard layout (`src/main/java`).

Prerequisites:
- JDK 17+
- Maven

Quick run (from project root):

```bash
# build and run a specific main class
./run.sh dsa.slidingWindowQues.twoPointers.collisionStrategy.ContainerWithMostWater

# or with Maven exec plugin
mvn -DskipTests=true compile exec:java -Dexec.mainClass="dsa.slidingWindowQues.twoPointers.collisionStrategy.ContainerWithMostWater"

# or package then run
mvn -DskipTests=true package
java -cp target/classes dsa.slidingWindowQues.twoPointers.collisionStrategy.ContainerWithMostWater
```

If you checkout this repo on another machine:
1. Install JDK and Maven.
2. Clone repo and run one of the commands above.

Notes:
- Sources moved to `src/main/java`.
- Build outputs go to `target/`.
- `.gitignore` excludes `target/`, `out/`, and `.class` files.