Selenium-Java-Automation-Framework
# UI & API Automation Framework

**Overview**
This project is a hybrid automation framework that combines:
- UI Automation using Selenium WebDriver with TestNG and Page Factory Model
- API Automation using RestAssured
- Performance Testing using Apache JMeter (.jmx scripts)
- CI/CD Integration with Jenkins and GitHub Actions

The goal is to provide a scalable, maintainable, and robust automation solution for functional, API, and performance testing.

**Project Structure**
- src/ main/java/ pages/          - # Page Factory classes
- utils/          - # Utility classes
- test/java/tests/         - # TestNG test classes
- api/           - # RestAssured API tests
- jmeter-scripts/   -  # JMeter .jmx files
- pom.xml            - # Maven dependencies
- .github/workflows/ci.yml-  # GitHub Actions workflow

**Technologies Used**
- Java 17+
- Selenium WebDriver
- TestNG
- Page Factory Model
- RestAssured
- Apache JMeter
- Maven
- Jenkins
- GitHub Actions

**Key Features**
- UI Automation
    - Page Factory design pattern for maintainability
    - TestNG for test execution and reporting
- API Automation
    - RestAssured for REST API validation
    - JSON schema validation & response assertions
- Performance Testing
    - JMeter scripts (.jmx) for load & stress testing
- CI/CD
    - Jenkins pipeline for scheduled & on-demand runs
    - GitHub Actions for automated builds & tests on pull requests

**Getting Started**
1. Clone the Repository
   git clone https://github.com/your-repo-name.git
   cd your-repo-name

2. Install Dependencies
   mvn clean install

3. Run UI Tests
   mvn test -DsuiteXmlFile=testng.xml

4. Run API Tests
   mvn test -Dtest=ApiTestClass

5. Run JMeter Scripts
   jmeter -n -t jmeter-scripts/your-script.jmx -l results.jtl

**CI/CD Integration**
Jenkins
- Configured via Jenkinsfile
- Supports code checkout, build & test execution, report publishing

**GitHub Actions**
- Workflow defined in .github/workflows/ci.yml
- Runs on push to main and pull requests
- Steps include build project, run UI & API tests, archive reports

**Reports**
- TestNG Reports: HTML reports generated after test execution
- JMeter Reports: Performance metrics (response time, throughput, error %)
- CI/CD Reports: Published in Jenkins & GitHub Actions
