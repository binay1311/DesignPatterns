package Facade;

import java.sql.Connection;

public class MySqlHelper {
    public static Connection getMySqlDBConnection(){
        //get MySql DB connection using connection parameters
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("Generating MySql pdf Report");
    }

    public void generateMySqlHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("Generating MySql HTML Report");
    }
}
