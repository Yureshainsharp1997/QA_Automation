package function;

import webPages.BasePage;
import webPages.LoginPage;

public class Login {
    LoginPage loginPage = new LoginPage();

    public void login(String username, String password) {
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.clickloginButton();
    }
}
