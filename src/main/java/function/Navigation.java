package function;

import webPages.BasePage;
import webPages.LoginPage;

public class Navigation {
    BasePage basePage=new BasePage();

    public void navigate(String url, String browser){
        basePage.navigation(url,browser);
    }

    public void closeBrowser(){
        basePage.closeBrowser();
    }
    public void refreshBrowser(){
        basePage.refreshBrowser();
    }
}
