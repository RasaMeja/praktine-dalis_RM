package lt.techin.test;

import lt.techin.LoginPage;
import lt.techin.LogoutPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogoutTest extends BaseTest{

    LoginPage loginPage;
    LogoutPage logoutPage;


    @Test
    void testUserLogin() {
        loginPage = new LoginPage(driver);
        logoutPage = new LogoutPage(driver);
        loginPage.setUserName("marija");
        loginPage.setPassword("mamutas");
        loginPage.clickInputLogin();
        logoutPage.clickInputLogout();
        Assertions.assertEquals("Sėkmingai atsijungėte", logoutPage.viewSuccessfulLogout());
    }
}
