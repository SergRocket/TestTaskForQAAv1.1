package TestCases;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class LogIn  {


    public WebDriver driver;
    public WebDriverWait WDW;
    @BeforeTest
    public void BeforeLogin (){
        System.setProperty("webdriver.chrome.driver", "chromedriver86.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.hospitalrun.io/#/login");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

    }

    @Test(priority = 0)
    public void ValidLog() {

        WDW = new WebDriverWait(driver,Duration.ofSeconds(12));
        LoginPage LP = new LoginPage(driver);

        LP.Email().sendKeys("hr.doctor@hospitalrun.io");
        LP.Password().sendKeys("HRt3st12");
        LP.ButtonClick().click();

        WDW.until(ExpectedConditions.urlContains("#/patients"));
        Assert.assertTrue(driver.getCurrentUrl().contains("#/patients"));

    }

    @AfterTest
    public void ShuttingDown (){
        driver.close();
        if(driver != null)
            driver.quit();
    }

}
