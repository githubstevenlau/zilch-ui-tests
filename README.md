# Zilch UI tests

## Page Object Model


# Alternative technologies

## Playwright

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

### Timeout
