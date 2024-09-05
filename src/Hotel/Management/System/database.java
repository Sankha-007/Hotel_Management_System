package Hotel.Management.System;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class database {
    Connection connection;
    Statement statement;

    public database(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:1000/hotelMS","root","12345");
            statement = connection.createStatement();
        }
        catch(Exception e){e.printStackTrace();}
    }

}
