package TestCases;

import PageObjects.LoginPage;
import PageObjects.MedicationPage;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MedicationRequest extends LogIn {

    @Test
    public void Medicatonrequest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        MedicationPage MP = new MedicationPage(driver);
        MP.MedSec().click();
        WDW.until(ExpectedConditions.visibilityOfAllElements(MP.Reque(), MP.CompleteD(), MP.ReturnMedic(),
                MP.Newrequest()));
        MP.Newrequest().click();
        MP.PatienT().click();
        Thread.sleep(1000);
        MP.PatienT().sendKeys("Test Pati");
        Thread.sleep(2000);
        int i=1;
        while(i<4){
            MP.PatienT().sendKeys(Keys.ARROW_DOWN);
            i++;
        }
        MP.PatienT().sendKeys(Keys.ENTER);
        MP.DateVisit().click();
        Thread.sleep(1000);
        int c=1;
        while(c<4) {
            MP.DateVisit().sendKeys(Keys.ARROW_DOWN);
            c++;
        }
        MP.DateVisit().sendKeys(Keys.ENTER);
        MP.MedicatioN().sendKeys("Pramoxine");
        MP.MedicatioN().sendKeys(Keys.ARROW_DOWN);
        MP.MedicatioN().sendKeys(Keys.ENTER);
        MP.PrescriptioN().sendKeys("Testing prescription");
        MP.PrescrDate().click();
        Thread.sleep(1000);
        MP.weekDay().click();
        Thread.sleep(500);
        MP.PrescrDate().sendKeys(Keys.ARROW_LEFT);
        MP.PrescrDate().sendKeys(Keys.ENTER);
        Random rand = new Random();
        int qr = rand.nextInt(1)+3;
        int qrf = rand.nextInt(5)+8;
        String QR = Integer.toString(qr);
        String QRef = Integer.toString(qrf);
        MP.QuantitY().sendKeys(QR);
        MP.RefilS().sendKeys(QRef);
        MP.Addbutton().click();
        WDW.until(ExpectedConditions.visibilityOfAllElements(MP.ModalWindow(), MP.OKbut(), MP.CloseBut()));
        boolean popUp = (MP.ModalWindow().isDisplayed() && MP.OKbut().isDisplayed() &&
                MP.CloseBut().isDisplayed());
        if (popUp=true){
            System.out.print("The pop is displayed now ");
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
    public static void main (String [] args)throws Exception {
        MedicationRequest MR = new MedicationRequest();
        MR.BeforeLogin();
        MR.ValidLog();
        MR.Medicatonrequest();
        //MR.ShuttingDown();
    }






}
