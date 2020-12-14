package TestCases;

import PageObjects.PatientListingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logout extends LogIn {

    @Test
    public void LogOut () throws InterruptedException {
        //ceating an object for the class
        PatientListingPage PLP = new PatientListingPage(driver);
        //click on the Settings button
        PLP.cogWheel().click();
        //click on the logout button
        PLP.logOut().click();
        Thread.sleep(3000);
        //asserting of the user is on the login page
        Assert.assertTrue(driver.getCurrentUrl().contains("#/login"));
    }
    //setting main method ot manage all methods on the class, and from inherited Login class
    public static void main (String [] args)throws Exception {
        Logout LG = new Logout();
        LG.BeforeLogin();
        LG.ValidLog();
        LG.LogOut();
        //LG.ShuttingDown();
    }

}
