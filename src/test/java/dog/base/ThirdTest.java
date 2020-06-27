package dog.base;

import dog.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ThirdTest extends BaseTest {

    @Test
    public void thirdTest() throws InterruptedException {

        System.out.println("Start test Third");

        WebElement bookButton = driver.findElement(By.cssSelector(".sc-bxivhb.dmgvyV"));

        bookButton.click();

        Thread.sleep(4000);

        WebElement emailField = driver.findElement(By.cssSelector("input[name=\"email\"]"));

        emailField.click();

        WebElement passwordField = driver.findElement(By.cssSelector("input[name=\"password\"]"));

        passwordField.click();

        WebElement firstNameField = driver.findElement(By.cssSelector("input[name=\"firstName\"]"));

        firstNameField.click();

        WebElement lastNameField = driver.findElement(By.cssSelector("input[name=\"lastName\"]"));

        lastNameField.click();

        WebElement phoneField = driver.findElement(By.cssSelector("input[name=\"phone\"]"));

        phoneField.click();

        passwordField.click();

        List<WebElement> required = driver.findElements(By.cssSelector(".sc-bdVaJa.sc-bxivhb.laYMsi"));

        String emailError = required.get(0).getText();

        Assert.assertEquals("required", emailError);

        String firstNameError = required.get(1).getText();

        Assert.assertEquals("required", firstNameError);

        String lastNameError = required.get(2).getText();

        Assert.assertEquals("required", lastNameError);

        String phoneError = required.get(3).getText();

        Assert.assertEquals("required", phoneError);








    }












}
