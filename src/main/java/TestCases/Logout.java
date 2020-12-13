package TestCases;

import PageObjects.LoginPage;
import PageObjects.PatientListingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.SyncFailedException;

public class Logout extends LogIn {


    @Test(priority = 1)
    public void Logout () throws InterruptedException {

        Thread.sleep(6000);
        PatientListingPage PLP = new PatientListingPage(driver);
        PLP.cogWheel().click();
        Thread.sleep(2000);
        PLP.logOut().click();
        Thread.sleep(4000);
        Assert.assertTrue(driver.getCurrentUrl().contains("#/login"));

        try { driver.switchTo().alert().dismiss();}
        catch (Exception e){
            System.out.print("Failed to close the pop up");
        }
    }
    public static void main (String [] args)throws Exception {
        Logout LG = new Logout();
        LG.BeforeLogin();
        LG.ValidLog();
        LG.Logout();
        //LG.ShuttingDown();
    }

}
