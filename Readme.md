# test-automation-project
Framework to test UI using Selenium


## Project Structure

The project is organized into multiple Maven modules
* `framework`
      - Contains Core Methods for Webdriver handling
* `page-objects`
      - Contains Page objects for Application
* `regression-tests`
      - Contains cucumber scenarios & steps

## Test Execution Steps

**PRE-REQUISITE**: The system needs to have JAVA 8 and Apache Maven 3.6.2 installed

 Inside the project directory, clean install the project to install all the dependencies
 
      mvn clean install
      
- This will install all the depedencies for the project
- Downloads all binaries -- chromedriver, geckodriver etc through `RepositoryMap.xml`
- Runs the cucumber tests 
