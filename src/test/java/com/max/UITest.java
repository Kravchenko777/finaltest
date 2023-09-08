package com.max;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class UITest extends UIAbstractTest{

    @Test
    void testGBNotEmailLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.toLogin("login","password");
        Assertions.assertFalse(driver.findElements(By.xpath("//*[@id=\"parsley-id-5\"]")).isEmpty());
    }

    @Test
    void testGBWithoutPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.toLogin("login@login.ru","");
        Assertions.assertFalse(driver.findElements(By.xpath("//*[@id=\"parsley-id-7\"]")).isEmpty());

    }

}
