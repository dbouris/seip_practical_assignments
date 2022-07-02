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
View the initial Design of the Lirbary [here](https://github.com/dbouris/unavai-lab-le/blob/dev2/sourcecodeanalyzer/SourceCodeAnalyzer_v0.png) <br>
View the new Design of the SourceCodeAnalyzer Library after the major refactoring undertaken [here](https://github.com/dbouris/unavai-lab-le/blob/dev2/sourcecodeanalyzer/SourceCodeAnalyzer_v1.png).

### Design Patterns
The Design Patterns mostly used to refactor the SourceCodeAnalyzer module was:
- Strategy
- Factory
- Facade
- Null Object

To be more precise, the SourceFileReader, SourceCodeAnalyzer and the MetricsExport functionalities were refactored using a combination of the Factory, Strategy and Null Object Design Patterns. The functionalities of the Library are provided to the Client based on the Facade Design Pattern. <br>
Also, all the different functionalities (exporters, alalyzers, readers) have been organized in the corresponding packages.

### SourceFileReader
The rafactoring occured using the Factory, Strategy and NUll Object Desing Patterns. To implement those new Design Patters there were some changes needed to be implemented. In particular, following the Strategy pattern a SourceFileReader interface was created and the SourceFileReaderWeb, SourceFileReaderLocal, SourceFileReaderNull which implement this interface. Following the Factory Design Pattern, a SourceFileReaderFactory class was created in order to 'serve' the correct SourceFileReader object (Web - Local) based on the FileLocation parameter. (package: `readers`)

### SourceCodeAnalyzer
The rafactoring occured using the Factory, Strategy and NUll Object Desing Patterns. To implement those new Design Patters there were some changes needed to be implemented. In particular, following the Strategy pattern a SourceCodeAnalyzer interface was created and the SourceCodeAnalyzerRegex, SourceCodeAnalyzerString, SourceCodeAnalyzerNull which implement this interface. Following the Factory Design Pattern, a SourceCodeAnalyzerFactory class was created in order to 'serve' the correct SourceCodeAnalyzer object (Regex - Strcomp) based on the AnalyzerType parameter. (package: `analyzers`)

### MetricsExporter
The rafactoring occured using the Factory, Strategy and NUll Object Desing Patterns. To implement those new Design Patters there were some changes needed to be implemented. In particular, following the Strategy pattern a MetricsExporter interface was created and the CsvExporter, JsonExporter, NullExporter which implement this interface. Following the Factory Design Pattern, a MetricsExporterFactory class was created in order to 'serve' the correct MetricsExporter object (Csv - Json) based on the OutputFileType parameter. (package: `exporters`)

### CodeAnalyzer
The refactoring occured using the Facade Design Pattern as there was a need to use the Library as an independent library, and thus, hide any implementation details from the DemoClient. Inside the CodeAnalyzer class, there is a method created in order to handle all the functionalities and the method calls of the Library. (package: `codeanalyzer`)

### Benefits

- The factory classes help in order to decouple the Client from the SourceCodeAnalyzer, SourceFileReaders and MetricsExporters implementations.
- The Strategy Desing Pattern helps toward the extensibility of the SourceCodeAnalyzers, SourceFileReaders and the MetricsExporters.
- Each class now has a single responsiblity and follows the single responsiblity principle.
- Null Exporters - Analyzers - Readers are handled.
- A simple interface is now provided to use the Library.
- De-couples the subsystem for clients and other subsystems, thereby promoting subsystem independence and portability


### Trade-offs
- Big number of Classes required
- Big number of Abstractions required
- Higher complexity  


## Author
[Dimitris Bouris](https://github.com/dbouris)