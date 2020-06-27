package dog;

import org.junit.Test;

import java.util.logging.Logger;

public class BookWalkTest extends BaseTest {

    private Logger logger = Logger.getLogger(getClass().getName());


    @Test
    public void testBookWalk() throws InterruptedException {

        logger.info("Creating home page");

        HomePage homePage = new HomePage(driver);

        logger.info("Home page created");

        logger.info("Click Book Walk Button");

        ApplayPage applayPage = homePage.clickBookWalkButton();

        logger.info("Input email " + user.getEmail());

        applayPage.inputEmailField(user.getEmail());

        logger.info("Input password " + user.getPassword());

        applayPage.inputPasswordField(user.getPassword());

        logger.info("Input First Name " + user.getFirstName());

        applayPage.inputFirstName(user.getFirstName());

        logger.info("Input Last Name " + user.getLastName()) ;

        applayPage.inputLastNameField(user.getLastName());

        logger.info("Input Phone number " +  user.getPhoneNumber());

        applayPage.inputPhoneField(user.getPhoneNumber());

    }










}
