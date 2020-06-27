package dog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //WebElements

    @FindBy(css = ".sc-bxivhb.dmgvyV")
    private WebElement bookWalkButton;

    @FindBy(css = ".sc-bxivhb.lonzbf")
    private WebElement loginButton;

    public ApplayPage clickBookWalkButton() {

        wait.until(ExpectedConditions.elementToBeClickable(bookWalkButton));

        bookWalkButton.click();

        ApplayPage applayPage =  new ApplayPage(driver);

        return applayPage;
    }

    public LoginPage clickLoginButton() {
        loginButton.click();

        LoginPage loginPage = new LoginPage(driver);

        return loginPage;
    }















}
