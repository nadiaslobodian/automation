package dog;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.Logger;

public class TestInvalidEmail extends BaseTest {

    private Logger logger = Logger.getLogger(getClass().getName());


    @Test
    public void TestInvalidEmail() {

        logger.info("Creating Home Page");

        HomePage homePage = new HomePage(driver);

        logger.info("Home Page created. Click Book Walk button");

        ApplayPage applayPage = homePage.clickBookWalkButton();

        logger.info("Input invalid email 3598456");

        applayPage.inputEmailField("3598456");

        logger.info("Input password");

        applayPage.inputPasswordField(user.getPassword());

        logger.info("Find Web Element: please provide a valid email");

        logger.info("Get text from Web Element invalid email and compare with expected");

        WebElement errorEmail = driver.findElement(By.cssSelector(".sc-bdVaJa.sc-bxivhb.laYMsi"));

        String invalidEmail = errorEmail.getText();

        Assert.assertEquals("please provide a valid email", invalidEmail);

    }










}
