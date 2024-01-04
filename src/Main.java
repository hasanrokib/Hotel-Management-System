import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        BookingSystem booking = new BookingSystem();
        //System.out.println("Please select your preferred choice:");
        System.out.println("1.Register Account");
        System.out.println("2.Book Reservation");
        System.out.println("3.Generate Bill");
        System.out.println("4.Feedback");
        System.out.println("Please provide your option. ");
        int option = scanner.nextInt();
        if(option==1) {
            booking.newUser();
        } else {
            System.out.println("Invalid option.Please choose a valid option");
        }



    }


}