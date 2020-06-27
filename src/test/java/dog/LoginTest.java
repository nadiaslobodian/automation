package dog;

import org.junit.Test;

import java.util.logging.Logger;

public class LoginTest extends BaseTest {

    private Logger logger = Logger.getLogger(getClass().getName());


    @Test
    public void LoginTest() throws InterruptedException {

        logger.info("Creating Home Page");

        HomePage homePage = new HomePage(driver);

        logger.info("Click Login Button");

        LoginPage loginPage = homePage.clickLoginButton();

        logger.info("Input Email " + user.getEmail());

        loginPage.inputEmailField(user.getEmail());

        logger.info("Input Password " + user.getPassword());

        loginPage.inputPasswordField(user.getPassword());


    }









}
