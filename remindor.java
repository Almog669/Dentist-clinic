import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class remindor {
    public remindor (){}
    public void send_details()
    {
        File file = new File("C://Users//almog//Desktop/remindor_.txt"); //initialize File object and passing path as argument
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
            FileWriter writer = new FileWriter("C://Users//almog//Desktop/remindor_.txt", true);
            writer.write("Hello Mr. / Mrs. Michael "+"\r\n\r\n\r\n"+"Don't forget your appointment"+"\r\n"+" with the " +
                    "following details:"+"\r\n\r\n");
            writer.write("\r\n");
            writer.write("Type of Appointment : Cavity"+"\r\n");
            writer.write("\r\n");
            writer.write("Your Appointment is schduled at date : 23.2.21"+"\r\n");
            writer.write("At time : 14:00"+"\r\n");

            writer.write("Please do NOT forget you membership card! \r\n\r\n");
            writer.write("Sincerely yours!---DENTIST APP \r\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}