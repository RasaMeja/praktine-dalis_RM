package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//div[@class='container']//a")
    WebElement createAccount;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateAccount() {
        createAccount.click();
    }
}
