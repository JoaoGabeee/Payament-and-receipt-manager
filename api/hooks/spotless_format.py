import subprocess

PROJECT_DIR = "./api/"

subprocess.run(["mvn", "spotless:apply"], cwd=PROJECT_DIR)
