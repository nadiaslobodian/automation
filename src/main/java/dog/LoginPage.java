package dog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {

        super(driver);

    }

    @FindBy(css = ".form-control")
    private List<WebElement> fields;

    public void inputEmailField(String email) {

        wait.until(ExpectedConditions.elementToBeClickable(fields.get(0)));

        fields.get(0).sendKeys(email);
    }

    public void inputPasswordField(String password) {

        wait.until(ExpectedConditions.elementToBeClickable(fields.get(1)));

        fields.get(1).sendKeys(password);
    }






}
