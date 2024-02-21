package lt.techin.test;

import lt.techin.HomePage;
import org.junit.jupiter.api.Test;

public class HomeTest extends BaseTest{

    HomePage homePage;

    @Test
    void testClickCreateAccount() {
        homePage = new HomePage(driver);
        homePage.clickCreateAccount();
    }
}
