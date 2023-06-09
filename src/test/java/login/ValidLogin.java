package login;

import comman.TestContrants;
import function.Cssfunctions;
import function.Login;
import function.Navigation;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValidLogin {
    Navigation navigation =new Navigation();
    Login login=new Login();
    Cssfunctions cssfunctions=new Cssfunctions();

@Parameters("myBrowser")
    @BeforeClass
    public void preCondition(String myBrowser){
        //navigate into the given URl
        navigation.navigate(TestContrants.BASE_URL,myBrowser);

    }
    @Test
    public void testLogin(){
        Assert.assertEquals(cssfunctions.loginCssVal(),"16px");

        //enter valid credintials
        login.login("standard_user","secret_sauce" );

    }
    @AfterClass
    public void postCondition(){
        //Close the browser
        //navigation.closeBrowser();

    }
}
