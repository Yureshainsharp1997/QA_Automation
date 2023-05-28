package login;

import comman.TestContrants;
import function.Login;
import function.Navigation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvalidLogin {

        Navigation navigation =new Navigation();
        Login login=new Login();

        @BeforeClass
        public void preCondition(){
            //navigate into the given URl
            navigation.navigate(TestContrants.BASE_URL,TestContrants.BROWSER);

        }
        @Test
        public void invalidUserNameValidPassword(){
            //enter valid credintials
            login.login("standard_useraaa","secret_sauce");

        }
    @Test
    public void invalidPasswordValidUserName(){
        //enter valid credintials
        login.login("standard_user","secret_sauceee");
    }
        @AfterClass
        public void postCondition(){
            //Close the browser
            //navigation.closeBrowser();

        }
    }


