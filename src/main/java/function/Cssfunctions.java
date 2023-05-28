package function;

import webPages.LoginPage;

public class Cssfunctions {
    LoginPage loginPage=new LoginPage();
    public String loginCssVal(){
        return loginPage.getfontsize();
    }
}
