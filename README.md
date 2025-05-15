# CBTW_Challenges

## Overview

This project is an automated testing framework for web and mobile applications using Selenium WebDriver and Appium. It includes ExtentReports for detailed test reporting and Faker for generating random test data.

## Project Structure

```
CBTW_Challenges/
├── .idea/
├── .git/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── config/    -- Load configuration for multiple environments
│   │       ├── driver/    -- Manage WebDriver and AppiumDriver instances
│   │       ├── enums/     -- Define shared enum types
│   │       ├── fixtures/  -- Store test data and mock responses
│   │       ├── pages/     -- Implement Page Object Model for web and mobile pages
│   │       └── utils/     -- Provide reusable utility functions
│   └── test/
│       ├── java/
│       │   ├── testBase/
│       │   │   └── BaseTest.java
│       │   └── tests/
│       │       ├── web/
│       │       │   └── WebE2E.java
│       │       └── mobile/
│       │           └── MobileE2E.java
│       └── resources/
├── target/
├── pom.xml
├── testng.xml
└── .gitignore
```

## Key Components

- **BaseTest**: Centralizes driver initialization and ExtentReports setup.
- **WebE2E**: Contains web-specific test cases.
- **MobileE2E**: Contains mobile-specific test cases.
- **ExtentReports**: Generates detailed HTML reports for test execution.
- **Faker**: Generates random data for testing.

## Dependencies

- Selenium WebDriver
- Appium Java Client
- TestNG
- WebDriverManager
- ExtentReports
- Faker

## How to Run

1. Ensure you have Java 11 and Maven installed.
2. Clone the repository.
3. Run the tests using Maven:
   ```bash
   mvn clean test
   ```
4. View the generated ExtentReports at `test-output/ExtentReport.html`.

## Contributing

Feel free to submit issues and pull requests.

## License

This project is licensed under the MIT License.
