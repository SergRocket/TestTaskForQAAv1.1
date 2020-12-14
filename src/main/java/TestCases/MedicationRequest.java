package TestCases;

import PageObjects.MedicationPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MedicationRequest extends LogIn {

    @Test
    public void Medicatonrequest() throws InterruptedException {
        //setting implicit wait
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        //creating an Object for the class
        MedicationPage MP = new MedicationPage(driver);
        //clicking on the medication element
        MP.MedSec().click();
        //Asserting all required elements are shown
        WDW.until(ExpectedConditions.visibilityOfAllElements(MP.Reque(), MP.CompleteD(), MP.ReturnMedic(),
                MP.Newrequest()));
        //Clicking on the NewRequest button
        MP.Newrequest().click();
        //Selecting the patient from the dropdown
        MP.PatienT().click();
        Thread.sleep(1000);
        MP.PatienT().sendKeys("Test Patient - P00");
        Thread.sleep(2000);
        int i=1;
        while(i<3){
            MP.PatienT().sendKeys(Keys.ARROW_DOWN);
            i++;
        }
        MP.PatienT().sendKeys(Keys.ENTER);
        //setting the date visit
        MP.DateVisit().click();
        Thread.sleep(1000);
        int c=1;
        while(c<4) {
            MP.DateVisit().sendKeys(Keys.ARROW_DOWN);
            c++;
        }
        MP.DateVisit().sendKeys(Keys.ENTER);
        //input of the medicine
        MP.MedicatioN().sendKeys("Pramoxine");
        MP.MedicatioN().sendKeys(Keys.ARROW_DOWN);
        MP.MedicatioN().sendKeys(Keys.ENTER);
        //input of the prescriprion
        MP.PrescriptioN().sendKeys("Testing prescription");
        //selecting the date from the calendar
        MP.PrescrDate().click();
        Thread.sleep(1000);
        MP.weekDay().click();
        Thread.sleep(500);
        MP.PrescrDate().sendKeys(Keys.ARROW_LEFT);
        MP.PrescrDate().sendKeys(Keys.ENTER);
        //creating an object for the class
        Random rand = new Random();
        //setting random integer
        int qr = rand.nextInt(1)+3;
        int qrf = rand.nextInt(5)+8;
        //converting the integer to the String
        String QR = Integer.toString(qr);
        String QRef = Integer.toString(qrf);
        //input of the ramdom integer
        MP.QuantitY().sendKeys(QR);
        MP.RefilS().sendKeys(QRef);
        //Click on the Add button
        MP.Addbutton().click();
        //waiting for the elements on the pop up to be visible
        WDW.until(ExpectedConditions.visibilityOfAllElements(MP.ModalWindow(), MP.OKbut(), MP.CloseBut()));
        boolean popUp = (MP.ModalWindow().isDisplayed() && MP.OKbut().isDisplayed() &&
                MP.CloseBut().isDisplayed());
        if (popUp){
            System.out.print("The pop is displayed after clicking Add button ");
        } else {
            System.out.println("The pop up is not shown after clicking Add button");
        }
        Thread.sleep(2000);
        MP.OKbut().click();
        try {
            MP.ModalWindow().isDisplayed();
        } catch (Exception e){
            System.out.println(" The pop up is gone, as expected");
        }
         Assert.assertTrue(driver.getCurrentUrl().contains("medication/edit/new"));
    }
    //setting main method to manage all methods in the class
    public static void main (String [] args)throws Exception {
        MedicationRequest MR = new MedicationRequest();
        MR.BeforeLogin();
        MR.ValidLog();
        MR.Medicatonrequest();
        MR.ShuttingDown();
    }


}
