package TestCases;


public class ValidLogin extends LogIn {

    //main method to manage the methods from inherited class
    public static void main (String [] args) {
        ValidLogin VL = new ValidLogin();
        VL.BeforeLogin();
        VL.ValidLog();
        VL.ShuttingDown();
    }
}
