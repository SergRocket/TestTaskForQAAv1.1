package TestCases;
import PageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LogIn  {

    WebDriver driver;
    WebDriverWait WDW;

    @BeforeTest
    public void BeforeLogin (){
        System.setProperty("webdriver.chrome.driver", "chromedriver86.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.hospitalrun.io/#/login");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    public void ValidLog() throws InterruptedException {
        WDW = new WebDriverWait(driver,Duration.ofSeconds(12));
        LoginPage LP = new LoginPage(driver);
        LP.Email().sendKeys("hr.doctor@hospitalrun.io");
        LP.Password().sendKeys("HRt3st12");
        LP.ButtonClick().click();
        Thread.sleep(4000);
        WDW.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ember737\"]")));
        WDW.until(ExpectedConditions.urlContains("#/patients"));
    }

    @AfterTest
    public void ShuttingDown (){
        driver.close();
        if(driver != null)
            driver.quit();
    }

}
