package TestCases;
import org.testng.annotations.Test;

public class ValidLogin extends LogIn {

    @Test
    public void LogIn () throws InterruptedException {
          ValidLog();
    }

    public static void main (String [] args) throws InterruptedException {
        ValidLogin VL = new ValidLogin();
        VL.BeforeLogin();
        VL.ValidLog();
        VL.ShuttingDown();
    }

}
