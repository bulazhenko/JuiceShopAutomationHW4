package io.ctdev.pages;

import io.ctdev.SingletonWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver = SingletonWebDriver.getInstanceOfSingletonWebDriver();

    private By loginButton = By.cssSelector("button#navbarLoginButton");
    private By logoutButton = By.cssSelector("button#navbarLogoutButton");
    private By dismissButton = By.cssSelector("button[aria-label='Close Welcome Banner']");
    private By accountButton = By.cssSelector("button#navbarAccount");
    private By logoButton = By.cssSelector("button[aria-label='Back to homepage']");
    private By yourBasketButton = By.xpath("//button[@routerlink='/basket']");

    public void clickAccountButton() {
        driver.findElement(accountButton).click();
    }

    public void clickLoginButton() {

        driver.findElement(loginButton).click();
    }

    public void clickDismissButton() {
        driver.findElement(dismissButton).click();
    }

    public boolean isYourBasketPresent() {
        return !driver.findElements(yourBasketButton).isEmpty();
    }
}


