import java.sql.*;


public class Db_set {
    static void connect() {
        try {
    /*--------establishing an exterior mysql connection with the following parameters
               for a different DB connection you must change the variables target accordingly------*/

            String url = "jdbc:mysql://localhost:3306/mysql?serverTimezone=UTC";
            String user = "root";
            String password = "Aa08679188";
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs;
            /*creating the Data input to sql via Java sql util commands--------*/
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS Dentist_Clinic;");
            stmt.executeUpdate("drop table if exists Dentist_Clinic.employees");
            stmt.executeUpdate("CREATE TABLE if not exists Dentist_Clinic.employees " + "(first_name VARCHAR(20) not NULL, "
                    + " last_name VARCHAR(20), "
                    + " pass VARCHAR(20), "
                    + " position VARCHAR(20), "
                    + " manager int, "
                    + " phone VARCHAR(20) ) ");
            stmt.executeUpdate("INSERT INTO Dentist_Clinic.employees(first_name, last_name , pass, position, manager, phone)" +
                    "values ('Jhon','Macain','125a','Dentist','1','0558558555')," +
                    "('Albert','maine','127a','Dentist','1','0558778555')," +
                    "('Sharon','tanen','125wa','assistant','0','0578558555')," +
                    "('Rose','conway','120a','dandelion','0','0598558555')," +
                    "('Ruth','colins','160a','dandelion','0','0594858555')");

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
