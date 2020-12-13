package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MedicationPage {

    WebDriver driver;
    public MedicationPage (WebDriver driver){
        this.driver = driver;
    }

    By MedicationSection = By.id("ember767");
    By MedSecList = By.xpath("//*[@id=\"ember765\"]/div[2]");
    By Requests = By.xpath("//*[@id=\"ember2148\"]");
    By Completed = By.xpath("//*[@id=\"ember2151\"]");
    By NewRequest = By.xpath("//*[@id=\"ember2170\"]");
    By ReturnMedication = By.xpath("//*[@id=\"ember2210\"]");
    By Patient = By.xpath("//*[@id=\"patientTypeAhead-ember2510\"]");
    By PatientP00323 = By.xpath("//*[@id=\"ember2546\"]/span/div/div/div/strong");
    By VisitDate = By.xpath("//*[@id=\"visit-ember2555\"]");
    //By CalendarDate = By.xpath("");
    By Medication = By.xpath("//*[@id=\"inventoryItemTypeAhead-ember2577\"]");
    //By MedicationSelect = By.xpath("");
    By Prescription = By.xpath("//*[@id=\"prescription-ember2609\"]");
    By PrescriptionDate = By.xpath("//*[@id=\"display_prescriptionDate-ember2632\"]");
    By WeekDay = By.xpath("/html/body/div[2]/div/table/thead/tr/th[2]/abbr");
    By Quantity = By.xpath("//*[@id=\"quantity-ember2651\"]");
    By Refils = By.xpath("//*[@id=\"refills-ember2658\"]");
    By MedicationBlock = By.partialLinkText("#/medication/completed");
    By AddButton = By.xpath("//*[@id=\"ember2473\"]/div/div[2]/button[2]");
    By modalWin = By.xpath("/html/body/div[1]/div[2]/div/div/div");
    By closeBut = By.xpath("/html/body/div[1]/div[2]/div/div/div/div[1]/button");
    By OKBut = By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/button");
    By Medicationblock = By.partialLinkText("#/medication");

    public WebElement MedSec(){
        return driver.findElement(MedicationSection);
    }
    public WebElement MedSeclist (){

        return driver.findElement(MedSecList);
    }
    public WebElement Reque (){

        return driver.findElement(Requests);
    }

    public WebElement CompleteD (){

        return driver.findElement(Completed);
    }
    public WebElement Newrequest (){

        return driver.findElement(NewRequest);
    }
    public WebElement ReturnMedic (){

        return driver.findElement(ReturnMedication);
    }
    public WebElement PatienT (){

        return driver.findElement(Patient);
    }
    public WebElement PatientwithNum (){

        return driver.findElement(PatientP00323);
    }
    public WebElement DateVisit (){

        return driver.findElement(VisitDate);
    }
    public WebElement MedicatioN (){

        return driver.findElement(Medication);
    }
    public WebElement PrescriptioN (){

        return driver.findElement(Prescription);
    }
    public  WebElement PrescrDate (){

        return driver.findElement(PrescriptionDate);
    }
    public WebElement QuantitY (){

        return driver.findElement(Quantity);
    }
    public WebElement RefilS (){

        return driver.findElement(Refils);
    }
    public WebElement Addbutton (){

        return driver.findElement(AddButton);
    }
    public WebElement weekDay (){

        return driver.findElement(WeekDay);
    }
    public WebElement ModalWindow (){

        return driver.findElement(modalWin);
    }
    public WebElement CloseBut (){
        return driver.findElement(closeBut);
    }
    public WebElement OKbut(){

        return driver.findElement(OKBut);
    }
    public List<WebElement> MedBlock (){
        return (List<WebElement>) driver.findElement(Medicationblock);
    }




}
