package bank.management.system;

import java.sql.*;

public class con {
    Connection connection;
    Statement statement;
    public con(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","prateek");
            statement = connection.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
