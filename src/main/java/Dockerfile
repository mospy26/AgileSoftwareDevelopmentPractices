FROM openjdk:7
COPY . ./src/main/java
FROM openjdk:8-jdk
RUN apt-get update && apt-get install -y --no-install-recommends openjfx && rm -rf /var/lib/apt/lists/*
COPY . ./src/main/java
WORKDIR ./src/main/java
RUN javac ./src/main/java/Calculator.java
CMD ["java","-cp","./src/main/java","Calculator"]
