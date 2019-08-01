package javaSql;

import java.sql.*;

public class javaDb {
    public static void main(String[] args) {

        try{
            // 1. Get connection to DB
            Connection myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","Dl113311");

            // 2. Create a statement
            Statement mystmt = myconn.createStatement();
            // 3. Execute SQL query
            ResultSet myrs = mystmt.executeQuery("select * from employees");
            //4 . Process the result set
            while (myrs.next()){
                System.out.println(myrs.getString("last_name")+ ", "+myrs.getString("first_name"));
            }

        }
        catch (Exception exc){
            exc.printStackTrace();
        }
    }

}
