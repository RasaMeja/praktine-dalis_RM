package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    @FindBy(id = "username")
    WebElement inputUserName;

    @FindBy(css = "input#password")
    WebElement inputPassword;

    @FindBy(xpath = "//input[@id='passwordConfirm']")
    WebElement inputConfirmPassword;

    @FindBy(xpath = "//form[@id='userForm']/button[@type='submit']")
    WebElement inputRegister;

    @FindBy(css = "h2")
    WebElement myAccount;

    @FindBy(xpath = "//span[@id='username.errors']")
    WebElement inputUserNameEmpty;

    @FindBy(xpath = "//span[@id='password.errors']")
    WebElement inputPasswordEmpty;

    @FindBy(id = "username.errors")
    WebElement shortUserName;

    @FindBy(id = "password.errors")
    WebElement shortPassword;

    @FindBy(id = "passwordConfirm.errors")
    WebElement emptyConfirmPassword;

    @FindBy(id = "username.errors")
    WebElement existsAccount;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void setUserName(String name) {
        inputUserName.sendKeys(name);
    }

    public void setPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword) {
        inputConfirmPassword.sendKeys(confirmPassword);
    }

    public void clickInputRegister() {
        inputRegister.click();
    }

    public String viewMyAccount() {
        return myAccount.getText();
    }

    public void viewEmptyUserName() {
        inputUserNameEmpty.isDisplayed();
    }

    public void viewEmptyPassword() {
        inputPasswordEmpty.isDisplayed();
    }

    public String viewShortUserName() {
        return shortUserName.getText();
    }

    public String viewShortPassword() {
        return shortPassword.getText();
    }

    public String viewEmptyConfirmPassword() {
        return emptyConfirmPassword.getText();
    }

    public String viewExistsAccount() {
        return existsAccount.getText();
    }
}
