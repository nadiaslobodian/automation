package dog.base;

import dog.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends BaseTest {


    @Test
    public void testFirst() throws InterruptedException {

        System.out.println("Start testFirst");

        WebElement bookWalkButton = driver.findElement(By.cssSelector(".sc-bxivhb.dmgvyV"));

        bookWalkButton.click();

        Thread.sleep(5000);

        WebElement emailField = driver.findElement(By.cssSelector("input[name=\"email\"]"));

        emailField.sendKeys(user.getEmail());

        WebElement passwordField = driver.findElement(By.cssSelector("input[name=\"password\"]"));

        passwordField.sendKeys(user.getPassword());

        WebElement firstNameField = driver.findElement(By.cssSelector("input[name=\"firstName\"]"));

        firstNameField.sendKeys(user.getFirstName());

        WebElement lastNameField = driver.findElement(By.cssSelector("input[name=\"lastName\"]"));

        lastNameField.sendKeys(user.getLastName());

        WebElement phoneField = driver.findElement(By.cssSelector("input[name=\"phone\"]"));

        phoneField.sendKeys(user.getPhoneNumber());















    }
















}
