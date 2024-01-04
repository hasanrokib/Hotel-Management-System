import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class UserReg {
    private static String firstname;
    private static String phoneNumber;
    private static String emailId;
    private static String address;




public UserReg(String firstname,String phoneNumber,String emailId,String address)
{
UserReg.firstname =firstname;
UserReg.phoneNumber =phoneNumber;
UserReg.emailId =emailId;
UserReg.address =address;
}
public String getName(){
    return firstname;
}
public String setName(String name){
    firstname=name;
    return name;
}
    public String getNum(){
        return phoneNumber;
    }

    public String setNumber(String Number) {
    phoneNumber=Number;
        return Number;
    }

    public String getEmailId(){
        return emailId;
    }
   public String setEmailId(String EmailId){
       emailId= EmailId;
       return EmailId;
   }


    public String getAddress(){
        return address;
    }
    public String setAddress(String Address){
          address= Address;
          return Address;
    }


    public static void registerAccount() {
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

        } catch (
                IOException e) {
            e.printStackTrace();

        }


    }




}
