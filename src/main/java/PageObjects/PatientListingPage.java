package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PatientListingPage {

    WebDriver driver;

    public PatientListingPage (WebDriver driver){
        this.driver = driver;
    }
    By CogWheel = By.xpath("//*[@id=\"ember412\"]/nav/header/a[2]");
    By LogoutButton = By.xpath("//*[@id=\"ember412\"]/nav/header/nav/a[1]");

    public WebElement cogWheel (){
        return driver.findElement(CogWheel);
    }

    public WebElement logOut (){
        return driver.findElement(LogoutButton);
    }


}
