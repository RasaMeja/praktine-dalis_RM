package lt.techin.test;

import lt.techin.HomePage;
import lt.techin.RegisterPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegisterTest extends BaseTest {

    RegisterPage registerPage;
    HomePage homePage;

    @Test
    void testUserRegister() {
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.clickCreateAccount();
        registerPage.setUserName("marija");
        registerPage.setPassword("mamutas");
        registerPage.setConfirmPassword("mamutas");
        registerPage.clickInputRegister();
        Assertions.assertEquals("Galimos operacijos: sudėti, atimti, dauginti, dalinti", registerPage.viewMyAccount());
    }

    @Test
    void testUserRegisterEmpty() {
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.clickCreateAccount();
        registerPage.setUserName("");
        registerPage.setPassword("");
        registerPage.setConfirmPassword("");
        registerPage.clickInputRegister();
        registerPage.viewEmptyUserName();
        registerPage.viewEmptyPassword();
    }

    @Test
    void testShortNameAndPassword() {
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.clickCreateAccount();
        registerPage.setUserName("mi");
        registerPage.setPassword("ma");
        registerPage.setConfirmPassword("ma");
        registerPage.clickInputRegister();
        Assertions.assertEquals("Privaloma įvesti nuo 3 iki 32 simbolių", registerPage.viewShortUserName());
        Assertions.assertEquals("Privaloma įvesti bent 3 simbolius", registerPage.viewShortPassword());
    }

    @Test
    void testConfirmPasswordEmpty() {
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.clickCreateAccount();
        registerPage.setUserName("burundukas");
        registerPage.setPassword("mamutas");
        registerPage.setConfirmPassword("");
        registerPage.clickInputRegister();
        Assertions.assertEquals("Įvesti slaptažodžiai nesutampa", registerPage.viewEmptyConfirmPassword());
    }

    @Test
    void testUserRegisterExistsAccount() {
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.clickCreateAccount();
        registerPage.setUserName("marija");
        registerPage.setPassword("mamutas");
        registerPage.setConfirmPassword("mamutas");
        registerPage.clickInputRegister();
        Assertions.assertEquals("Toks vartotojo vardas jau egzistuoja", registerPage.viewExistsAccount());
    }
}
