# Histogram Generator
## Description

This Histogram Generator module can produce a Histogram chart. It receives as argument the *absolute path* of a txt file which contains the numbers. The numbers must be distributed to one number at a line. The chart created is based on the [JFreeChart](https://www.jfree.org/jfreechart/) library.

## Getting Started
To succesfully install the project on your local machine, create a copy of it by cloning.

`git clone https://github.com/dbouris/unavai-lab-le.git`

## Prerequisites
Requirements for the software to run and build.
- Java
- Maven

## Installation
In the root directory of the project run `mvn package`. At the target folder, the gradeshistogram-1.0-SNAPSHOT-jar-with-dependencies.jar will be created.

## Running
To run the project, from the root directory run `java -jar gradeshistogram/target/gradeshistogram-1.0-SNAPSHOT-jar-with-dependencies.jar path-of-file.txt`
<br>
Note that you should provide the absolute path of the .txt file for the app to succesfully identify it. 

## Author
---
Dimitris Bouris