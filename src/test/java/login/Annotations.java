package login;
import org.testng.annotations.*;
import report.TestListeners;

@Listeners(TestListeners.class)
public class Annotations {
        @BeforeClass
        public void beforeClass(){
            System.out.println("BeforeClass");

        }
        @BeforeMethod
        public void beforeMethod(){
            System.out.println("BeforeMethod");
        }
        @Test()
        public void test1(){
            System.out.println("Test1");

        }
        @Test(dependsOnMethods = "test1")
        public void test2(){
            System.out.println("Test2");
        }
        @Test()
        public void test3(){
        System.out.println("Test3");
    }
        @AfterMethod
        public void afterMethod(){
            System.out.println("afterMethod");
        }
        @AfterClass
        public void afterClass(){
            System.out.println("afterClass");

        }
}

