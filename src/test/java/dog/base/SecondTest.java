package dog.base;

import dog.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SecondTest extends BaseTest {

    @Test
    public void testSecond() throws InterruptedException {

        System.out.println("Start testSecond");

        WebElement bookWalkButton = driver.findElement(By.cssSelector(".sc-bxivhb.dmgvyV"));

        bookWalkButton.click();

        Thread.sleep(5000);

        List<WebElement> fields = driver.findElements(By.cssSelector("input"));

        fields.get(0).sendKeys(user.getEmail());

        fields.get(1).sendKeys(user.getPassword());

        fields.get(2).sendKeys(user.getFirstName());

        fields.get(3).sendKeys(user.getLastName());

        fields.get(4).sendKeys(user.getPhoneNumber());















    }





}
