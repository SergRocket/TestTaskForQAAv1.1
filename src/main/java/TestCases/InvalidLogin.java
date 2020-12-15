package TestCases;
import PageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLogin extends LogIn {

    @Test
    public void Invalidlogin() throws InterruptedException {
        LoginPage LP = new LoginPage(driver);
        LP.Email().sendKeys("hr.doctor@hospn.io");
        LP.Password().sendKeys("HR312");
        LP.ButtonClick().click();
        Thread.sleep(3000);
        boolean errorMessage = LP.Error().isDisplayed();
        if (errorMessage)
            System.out.print("The error message is shown");
        else System.out.print("The error message is missing");
        Assert.assertTrue(driver.getCurrentUrl().contains("#/login"));
    }

    public static void main (String [] args)throws Exception {
        InvalidLogin IL = new InvalidLogin();
        IL.BeforeLogin();
        IL.Invalidlogin();
        IL.ShuttingDown();
        }
}
