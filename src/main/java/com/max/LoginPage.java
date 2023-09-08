package com.max;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"user_email\"]")
    private WebElement login;

    @FindBy(xpath = "//*[@id=\"new_user\"]/div[4]/input")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"new_user\"]/div[4]/input")
    private WebElement enter;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void toLogin(String login, String password){
        this.login.sendKeys(login);
        this.password.sendKeys(password);
        this.enter.click();
    }

}
