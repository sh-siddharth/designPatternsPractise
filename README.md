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

Detailed run steps
------------------

1) Install prerequisites

- Install a JDK (recommended: OpenJDK 17 or later — this project was tested with OpenJDK 23).
- Install Maven (Apache Maven 3.6+).

2) Build the project

From the project root run:

```bash
# compile (fast)
mvn -DskipTests=true compile

# or package (creates classes in target/)
mvn -DskipTests=true package
```

3) Run a main class

There are three supported ways to run a `main` in this repo.

- Using the helper script `run.sh` (recommended):

```bash
# make script executable (once)
chmod +x run.sh

# run a specific fully-qualified main class
./run.sh dsa.trees.LowestCommonAncestor

# example: run ContainerWithMostWater
./run.sh dsa.slidingWindowQues.twoPointers.collisionStrategy.ContainerWithMostWater
```

- Using Maven Exec plugin (may block in some environments):

```bash
mvn -DskipTests=true compile exec:java -Dexec.mainClass="dsa.trees.LowestCommonAncestor"
```

- Run the packaged classes directly:

```bash
mvn -DskipTests=true package
java -cp target/classes dsa.trees.LowestCommonAncestor
```

4) Running from VS Code

- Open the workspace in VS Code.
- Use the Run view and select the configuration named "Run Main via run.sh", then press the green Run button — you'll be prompted for a fully-qualified main class (a sensible default is provided).
- Alternatively, run the task `run-main-via-script` from the Command Palette → `Tasks: Run Task` and enter the main class when prompted.

5) Troubleshooting

- If you see "ClassNotFoundException" or "Could not find or load main class":
	- Ensure you passed a correct fully-qualified class name (package + class).
	- Run `mvn -DskipTests=true package` and then `java -cp target/classes <your.main.Class>` to verify.
- If VS Code still shows stale errors, run Command Palette → `Java: Clean the Java Language Server Workspace`, then reload the window.

Notes
-----
- `run.sh` expects a fully-qualified main class and will build/package as needed before running.
- Source files are under `src/main/java`.
- Build artifacts are stored in `target/` and are ignored by Git.

If you'd like, I can also add a small section that lists available example mains present in `src/main/java`.