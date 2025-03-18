🚀 API Automation Framework with RestAssured (Java) 🚀

Author - Pramod Dutta
API Automation Framework with the CRUD of Restful Booker

mvn test -Dsurefire.suiteXmlFiles=testng.xml

<img width="578" alt="image" src="https://github.com/user-attachments/assets/0abd85fb-d987-4759-99fc-4df5005976ce" />


🛠️ Tech Stack 🛠️

1. Java (JDK > 22)

2. Rest Assured

3. Apache POI, TestNG, Maven

4. AssertJ (Advanced assertions)

5. Jackson API and GSON

6. Log4j

7. Allure Report

8. Full Folder Structure (Hybrid Framework)

9. Jenkins File


🖼️ API Framework Important Components 🖼️

<img width="575" alt="image" src="https://github.com/user-attachments/assets/3b8cf7e5-a9d9-4424-897f-175daf053677" />



🏃‍♂️ Running via CI/CD 🏃‍♀️

<img width="574" alt="image" src="https://github.com/user-attachments/assets/92a315a6-22b3-4246-b83b-798e83d9bc96" />



🧪 Basic Create Test 🧪

Steps to Run the Framework:

Install Maven

Add the following configuration to your pom.xml to run the TestNG suite:

    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.3.0</version>
        <configuration>
          <suiteXmlFiles>
            <suiteXmlFile>${suiteXmlFile}</suiteXmlFile>
          </suiteXmlFiles>
        </configuration>
      </plugin>
    </plugins>
  </build>
  
   to pom.xml

      mvn clean test -DsuiteXmlFile=testng.xml 

Parallel Execution

To run tests in parallel, add the parallel attribute to your testng.xml file:

    <suite name="All Test Suite" parallel="methods" thread-count="2">

Integration Test (Create BookinG and Create Token , Update and Delete Booking)

   mvn clean test -DsuiteXmlFile=testng-integration.xml

   
📊 Allure Report Setup 📊

<img width="571" alt="image" src="https://github.com/user-attachments/assets/c2a959de-3d10-4a25-9bac-86bfc412aa5c" />


Certainly! I'll guide you through the steps to install Allure and generate a report for a Java project using TestNG. Here's a step-by-step process:

1. Install Allure
First, you need to install Allure Command Line Tool. If you're using a Mac, you can use the following Brew command:

brew install allure
For other operating systems, please refer to the official Allure documentation for installation instructions.

2. Set up your Java project
Ensure you have a Java project set up with TestNG. If not, create a new Maven project and add the necessary dependencies.

3. Add Allure dependencies
   
Add the following dependencies to your pom.xml file:

    <dependency>
      <groupId>io.qameta.allure</groupId>
      <artifactId>allure-testng</artifactId>
      <version>2.13.0</version>
    </dependency>

5. Configure Allure in your project
   
Update the <build> section of your pom.xml to include the Allure Maven plugin:

    <build>
        <plugins>
            <plugin>
                <groupId>io.qameta.allure</groupId>
                <artifactId>allure-maven</artifactId>
                <version>2.10.0</version>
                <configuration>
                    <reportVersion>2.13.0</reportVersion>
                </configuration>
            </plugin>
        </plugins>
    </build>

5. Run your tests
   
Execute your TestNG tests using Maven:

  mvn clean test
This will run your tests and generate the Allure results in the target/allure-results directory.

6. Generate the Allure report

 After running your tests, use the following command to generate the Allure report:

    allure generate target/allure-results --clean -o allure-report

This command will create an allure-report folder containing the generated report.

7. View the report
   
To view the report, you can use the following command:

    allure open allure-report
    
This will start a local web server and open the report in your default browser.

Additional Tips

1. You can use the @Severity annotation to indicate the importance of your tests.
2. Allure supports attaching screenshots, which can be useful for UI tests.
3. For more advanced configurations and features, refer to the official Allure documentation.
4. By following these steps, you should be able to successfully install Allure, run your TestNG tests, and generate a comprehensive Allure report for your Java project.

Try these Cases also

POSTMAN Assignments  Assignment 1

Create the Collections for the This Test cases :

App - Restful Booker with(Auth)

1.Create a Booking, Update the Booking Name, Get the Booking by Id and verify.

2.Create a Booking, Delete the Booking with Id and Verify using GET request that it should not exist.

3.Get an Existing Booking from Get All Bookings Ids , Update a Booking and Verify using GET by id.

4.Create a BOOKING, Delete It

5.Invalid Creation - enter a wrong payload or Wrong JSON.
6.Trying to Update on a Delete Id


Test for the Single Req

1.Response
2.Status Code
3.Headers
———

Create Collection

 RestfulBooker CRUD operation.
 Add from Snippets , Test cases
 Integration Scenarios (Hard Coded)








🎯 POSTMAN Assignments 🎯

Assignment 1: Restful Booker (Auth)
Create a Collection for the Following Test Cases:

Create a Booking, Update the Booking Name, Get the Booking by Id, and Verify.

Create a Booking, Delete the Booking with Id, and Verify using a GET request that it should not exist.

Get an Existing Booking from Get All Bookings Ids, Update the Booking, and Verify using GET by id.

Create a Booking, Delete It.

Invalid Creation - Enter a wrong payload or wrong JSON.

Trying to Update on a Deleted Id.

Test for the Following:

Response

Status Code

Headers

📂 Create Collection 📂
RestfulBooker CRUD Operations

Add Snippets and Test Cases

Integration Scenarios (Hard-Coded)

🌟 Why This Framework? 🌟
Robust and Scalable

Supports Parallel Execution

Detailed Allure Reporting

CI/CD Integration Ready

Hybrid Framework Structure
