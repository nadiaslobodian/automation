package dog;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;

    protected static User user;

    @BeforeClass
    public static void setUp() throws InterruptedException {

        System.out.println("Start setUp");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Freedom\\Desktop\\Drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://wagwalking.com/");

        driver.manage().window().maximize();

        String expectedTitle = "WagWalking.com | Trusted Local Dog Walkers, Pet Sitters, Trainers and More";

        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

        user = new User("Nadia", "Slob", "nadia@gmail.com", "3127303971", "Gh345Jkh");

    }

    @AfterClass
    public static void turnDown() {

        System.out.println("Start turnDown");

        driver.quit();
    }












}
