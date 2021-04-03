import java.io.File;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class send_email_sms {
    String name ;
    String Date;
    String Time;
    String type;
    public send_email_sms(String name_, String Date_,String Time_,String type_)
    {
        name =name_;
        Date = Date_;
        Time = Time_;
        type = type_;
    }

     public void send_details()
    {
        File file = new File("C://Users//almog//Desktop/Documneted_.txt"); //initialize File object and passing path as argument
        boolean result;
        try
        {
            result = file.createNewFile();  //creates a new file
            if(result)      // test if successfully created a new file
            {
                System.out.println("file created "+file.getCanonicalPath()); //returns the path string
            }
            else
            {
                System.out.println("File already exist at location: "+file.getCanonicalPath());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();    //prints exception if any
        }
        try {
            FileWriter writer = new FileWriter("C://Users//almog//Desktop/Documneted_.txt", true);
            writer.write("Hello Mr. / Mrs. "+ name+"\r\n\r\n\r\n"+"We have submitted an appointment for you !"+"\r\n"+" with the " +
                    "following details:"+"\r\n\r\n");
            writer.write("\r\n");
            writer.write("Type of Appointment : "+type+"\r\n");
            writer.write("\r\n");
            writer.write("Your Appointment is schduled at date :"+Date+"\r\n");
            writer.write("At time :"+Time+"\r\n");

            writer.write("Please do NOT forget you membership card! \r\n\r\n");
            writer.write("Sincerely yours!---DENTIST APP \r\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
