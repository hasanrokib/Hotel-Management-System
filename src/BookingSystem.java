import java.util.Scanner;

public class BookingSystem {
    public void newUser(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter firstname: ");
        String firstname = scanner.next();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.next();

        System.out.print("Enter email id: ");
        String emailId = scanner.next();

        System.out.print("Enter address: ");
        String address = scanner.next();
        UserReg.registerAccount();
    }
    public void bookReservation(){
     }
    public void generateBill(){

    }
    public void userFeedback(){
    }

}
