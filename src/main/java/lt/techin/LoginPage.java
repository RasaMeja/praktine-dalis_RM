package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "input[name='username']")
    WebElement inputName;

    @FindBy(css = "input[name='password']")
    WebElement inputPassword;

    @FindBy(css = "button")
    WebElement inputLogin;

    @FindBy(css = "h2")
    WebElement myAccount;

    @FindBy(css = "div > span:nth-of-type(2)")
    WebElement nameNegative;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setUserName(String userName) {
        inputName.sendKeys(userName);
    }

    public void setPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void clickInputLogin() {
        inputLogin.click();
    }

    public String viewMyAccount() {
        return myAccount.getText();
    }

    public String viewNameNegative() {
        return nameNegative.getText();
    }
}
