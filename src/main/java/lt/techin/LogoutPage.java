package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage{

    @FindBy(css = "[onclick]")
    WebElement inputLogout;

    @FindBy(css = "div > span:nth-of-type(1)")
    WebElement logout;

    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    public void clickInputLogout() {
        inputLogout.click();
    }

    public String viewSuccessfulLogout() {
        return logout.getText();
    }
}
