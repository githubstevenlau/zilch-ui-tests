# Zilch UI tests

## Tools
The UI tests demonstrate the use of Java, Selenium WebDriver and TestNG as the
test runner for running tests. Near perfect substitutes could have been chosen,
eg, Playwright instead of WebDriver, JUnit instead of TestNG.

## Structure of the framework
The framework has been designed to use base classes for the tests and each
function, eg, log in and apply, uses its own base class to provide common
functionality that is specific to each feature. For example, 

## Page Object Model
The UI tests have been constructed using the Page Object Model design pattern.


# Alternative technologies

## Playwright

### Preamble
The *shift-left* approach to testing encourages quality by introducing testing
at the earliest possible opportunity and can also include the practice of
developers writing unit tests *and* end-to-end tests where resources are
limited with the QA resource acting as the gatekeeper, designing and reviewing
the test cases.

The current suite has been written using tools in the Java ecosystem. This
would complement back-end development if services are built using Java. However,
this would be unsuitable for front-end developers who may be using JavaScript
or TypeScript for React or Vue for front-end development.

### Locator strategies
Playwright has more modern and advanced locator strategies than Selenium.
For example, the Zilch pages use the *data-testid* attribute to identify
elements in the DOM. Selenium is unable to use these natively whereas this
is a default and recommended option with Playwright.

With Selenium, you would have to access it via xpath or CSS, for example:
`driver.findElement(By.xpath("//button[@data-testid='welcome-screen-log-in-button']))`

References: 

[Selenium locators](https://www.selenium.dev/documentation/webdriver/elements/locators/)

[Playwright locators](https://playwright.dev/docs/locators)

### Change management
Playwright would be an excellent candidate for unifying API and UI testing,
allowing the tests to be combined into a single application architecture rather
than having to maintain UI tests in Selenium WebDriver and API tests within a
REST Assured framework.

Playwright allows tests to be written in Java which would allow backend engineers
to develop tests and easily transition from WebDriver to Playwright. Frontend
engineers would be able to write tests in TypeScript.
