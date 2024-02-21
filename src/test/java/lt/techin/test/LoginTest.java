package lt.techin.test;

import lt.techin.HomePage;
import lt.techin.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class LoginTest extends BaseTest{

    LoginPage loginPage;

    @Test
    void testUserLoginPositive() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("marija");
        loginPage.setPassword("mamutas");
        loginPage.clickInputLogin();
        Assertions.assertEquals("Galimos operacijos: sudėti, atimti, dauginti, dalinti", loginPage.viewMyAccount());
    }

    @Test
    void testUserLoginNameNegative() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("marij");
        loginPage.setPassword("mamutas");
        loginPage.clickInputLogin();
        Assertions.assertEquals("Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi", loginPage.viewNameNegative());
    }

    @Test
    void testUserLoginPasswordNegative() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("marija");
        loginPage.setPassword("mamut");
        loginPage.clickInputLogin();
        Assertions.assertEquals("Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi", loginPage.viewNameNegative());
    }

    @Test
    void testUserLoginEmptyNegative() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("");
        loginPage.setPassword("");
        loginPage.clickInputLogin();
        Assertions.assertEquals("Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi", loginPage.viewNameNegative());
    }

    @Test
    void testUserLoginNoExistsAccount() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("marmeladas");
        loginPage.setPassword("pelikanas");
        loginPage.clickInputLogin();
        Assertions.assertEquals("Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi", loginPage.viewNameNegative());
    }
}
