package TestCases;
import PageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLogin extends LogIn {

    @Test
    public void Invalidlogin() throws InterruptedException {
        //creating the object for the class Login Page
        LoginPage LP = new LoginPage(driver);
        //sending invalid credentials
        LP.Email().sendKeys("hr.doctor@hospn.io");
        LP.Password().sendKeys("HR312");
        //clicking the login button
        LP.ButtonClick().click();
        Thread.sleep(3000);
        //check if the error message is displayed
        boolean errorMessage = LP.Error().isDisplayed();
        if (errorMessage)
            System.out.print("The error message is shown");
        else System.out.print("The error message is missing");
        //assert that user is stayed on the login page
        Assert.assertTrue(driver.getCurrentUrl().contains("#/login"));

    }
    //setting main method to manage all the methods in the class and from the inherited class
    public static void main (String [] args)throws Exception {
        InvalidLogin IL = new InvalidLogin();
        IL.BeforeLogin();
        IL.Invalidlogin();
        IL.ShuttingDown();
        }
}
