package TestCases;
import PageObjects.PatientListingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logout extends LogIn {

    @Test
    public void LogOut () throws InterruptedException {
        ValidLog();
        PatientListingPage PLP = new PatientListingPage(driver);
        PLP.cogWheel().click();
        PLP.logOut().click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.getCurrentUrl().contains("#/login"));
    }

    public static void main (String [] args)throws Exception {
        Logout LG = new Logout();
        LG.BeforeLogin();
        LG.ValidLog();
        LG.LogOut();
        LG.ShuttingDown();
    }

}
