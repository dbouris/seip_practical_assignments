# Unittesting
## Description

This Unittesting module contains test cases which challenge the functionality of the classes included in the `src/main` folder. The testing framework used is Junit. Parametrized tests are being performed and Testing Suites are also being implemented. For the continuous integration of the project, Travis CI is being used. 

## Tools
- Maven, for the projects build and dependency management
- Junit, as a testing framework
- Travis CI, for continuous integration
- Mockito, to mock objects and isolate the method from its dependencies.
- Jacoco, to calculate code coverage.
- Codecov, to generate code coverage reports and graphs.


## Testing
To run all the tests, run `mvn test`.
<br>
Running `mvn test jacoco:report` runs the tests and generates the jacoco code coverage report. You can find it in the `target/site/jacoco/index.html`



## Author
[Dimitris Bouris](https://github.com/dbouris)