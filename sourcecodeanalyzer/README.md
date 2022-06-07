# SourceCodeAnalyzer
## Description

This module is part of an Exercise with the task to refctor a deliberately poorly designed library. The SourceCodeAnalyzer Library reads a Java source code file that is stored locally or on the web, calculates the Lines of Code (LOC), Number of Classes (NOC), and Number of Methods (NOM) metrics, and finally, exports these metrics to an output file.

The library can calculate the following metrics on the Java Source File:
- Lines of Code
- Number of Classes
- Number of Methods

The library analyzes the Source code using:
- Regular Expressions
- String Comparison

The library can export the Metrics in a:
- CSV file
- JSON file

## Getting Started
To succesfully install the project on your local machine, create a copy of it by cloning.

`git clone https://github.com/dbouris/unavai-lab-le.git`

## Installation
In the root directory of the project run `mvn package`. At the target folder, the `gradeshistogram-1.0-SNAPSHOT-jar-with-dependencies.jar` will be created.

## Running
To run the project, from the root directory run `java -jar target/sourcecodeanalyzer-1.0-SNAPSHOT-jar-with-dependencies.jar arg0 arg1 arg2 arg3 arg4`
<br>
arg0 = “JavaSourceCodeInputFile” (e.g., src/test/resources/TestClass.java)<br>
arg1 = “sourceCodeAnalyzerType” [regex | strcomp]<br>
arg2 = “SourceCodeLocationType” [local | web]<br>
arg3 = “OutputFilePath” (e.g., ../output_metrics_file)<br>
arg4 = “OutputFileType” [csv | json]

## Refactoring
View the initial Design of the Lirbary [here]() <br>
View the new Design of the SourceCodeAnalyzer Library after the major refactoring undertaken [here]().



## Author
[Dimitris Bouris](https://github.com/dbouris)