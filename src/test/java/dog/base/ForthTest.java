package dog.base;

import dog.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ForthTest extends BaseTest {

    @Test
    public void forthTest() throws InterruptedException {

        List<WebElement> logins = driver.findElements(By.cssSelector(".sc-bxivhb.lonzbf"));

        logins.get(2).click();

        Thread.sleep(5000);

        List<WebElement> fields = driver.findElements(By.cssSelector(".form-control"));

        fields.get(0).sendKeys("nadia@yandex.ru");

        fields.get(1).sendKeys("Ngjtjkjr");

        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        loginButton.click();

        Thread.sleep(2000);

        WebElement errorMessage = driver.findElement(By.cssSelector("div[class$=\"3CyDn\"]"));

        String error = errorMessage.getText();

        Assert.assertEquals("Authentication Failed", error);

        List<WebElement> forgotPassword = driver.findElements(By.cssSelector("a"));

        forgotPassword.get(0).click();

        Thread.sleep(2000);

        WebElement emailField = driver.findElement(By.cssSelector(".form-control"));

        emailField.sendKeys("nadia@yandex.ru");

        WebElement resetButton = driver.findElement(By.cssSelector(".btn.btn-secondary.btn-block"));

        resetButton.click();

        Thread.sleep(2000);

        WebElement alert = driver.findElement(By.cssSelector(".alert.alert-warning"));

        String alertMessage = alert.getText();

        Assert.assertEquals("There was an error processing your request.", alertMessage);

        Thread.sleep(3000);


















    }



















}
