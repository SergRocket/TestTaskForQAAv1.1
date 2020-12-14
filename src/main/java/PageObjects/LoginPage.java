package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

    WebDriver driver;

    //created constructor
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    //setting locators for the elements
    By username = By.id("identification");
    By password = By.xpath("//*[@id=\"password\"]");
    By pressLogin = By.xpath("/html/body/div/div/form/div[2]/button");
    By error = By.xpath("//*[@id=\"ember412\"]/div/form/div[2]/div[1]");
    //setting methods to return elements names
    public WebElement Email (){
        return  driver.findElement(username);
    }

    public WebElement Password (){
        return driver.findElement(password);
    }

    public WebElement ButtonClick (){
        return driver.findElement(pressLogin);
    }

    public WebElement Error () {
        return driver.findElement(error);
    }


}
