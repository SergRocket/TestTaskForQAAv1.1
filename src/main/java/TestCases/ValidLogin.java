package TestCases;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidLogin extends LogIn {


    @Test(priority = 0)
    public void Validlog() {
        System.out.print("The login has started");

    }

    public static void main (String [] args)throws Exception {
        ValidLogin VL = new ValidLogin();
        VL.BeforeLogin();
        VL.ValidLog();
        //VL.ShuttingDown();
    }
}
