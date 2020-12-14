package TestCases;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LogIn  {

    //declaring the Chromedriver object and WedDriverWait object as public
    WebDriver driver;
    WebDriverWait WDW;

    @BeforeTest
    public void BeforeLogin (){
        System.setProperty("webdriver.chrome.driver", "chromedriver86.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.hospitalrun.io/#/login");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

    }

    @Test
    public void ValidLog() {
        //creating an object of the WebDriverWait
        WDW = new WebDriverWait(driver,Duration.ofSeconds(12));
        //creating an object if the login page
        LoginPage LP = new LoginPage(driver);
        //sending the credentials to the login page
        LP.Email().sendKeys("hr.doctor@hospitalrun.io");
        LP.Password().sendKeys("HRt3st12");
        //clicking login button
        LP.ButtonClick().click();
        //wait for the Patiens page to be opened
        WDW.until(ExpectedConditions.urlContains("#/patients"));

    }
    //setting method to end the session
    @AfterTest
    public void ShuttingDown (){
        driver.close();
        if(driver != null)
            driver.quit();
    }


}
