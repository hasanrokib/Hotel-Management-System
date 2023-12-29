import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Please select your preferred choice:");
        System.out.println("1.Register Account");
        System.out.println("2.Book Reservation");
        System.out.println("3.Generate Bill");
        System.out.println("4.Feedback");
        System.out.println("Please provide your option. ");
        int option = scanner.nextInt();
        if(option==1){
            registerAccount(scanner);
        }
        else {
            System.out.println("Invalid option.Please choose a valid option");
        }



    }

    public static void registerAccount(Scanner scanner) {
        //creating unique account file names for each new account
        Random random = new Random();
        int randomNumber = random.nextInt(100000);

        //create the folder
        String folderPath = "C:\\Users\\rok29\\Documents\\java project\\Project 1\\HotelManagementSystem\\";
        File userFolder = new File(folderPath);
        if(!userFolder.exists()){
            userFolder.mkdir();
        }
        //create a json file
        String filename = "ACC_"+randomNumber+".json";
        String filepath = folderPath+filename;
        try{
            File file = new File(filepath);
            //file.createNewFile();
            System.out.print("Enter firstname: ");
            String firstname = scanner.next();

            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.next();

            System.out.print("Enter email id: ");
            String emailId = scanner.next();

            System.out.print("Enter address: ");
            String address = scanner.next();
            //write details to json file
            FileWriter writer = new FileWriter(file);
            //uses curly braces {} to enclose objects
            writer.write("{\n");
            writer.write("  \"firstname\": \"" + firstname + "\",\n");
            writer.write("  \"phone\": \"" + phoneNumber + "\",\n");
            writer.write("  \"email\": \"" + emailId + "\",\n");
            writer.write("  \"address\": \"" + address + "\"\n");
            writer.write("}\n");


            writer.close();
            System.out.println("Account registered successfully");

        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}