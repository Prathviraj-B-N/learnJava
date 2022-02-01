package com.learnJava;
import java.sql.*;

public class MySqlDatabaseHandler{
    private String url;
    private String user;
    private String password;

    private Statement st;

    MySqlDatabaseHandler(){
        System.out.println("Pass (String url,String user,String password) to MySqlDatabaseHandler");
    }

    MySqlDatabaseHandler(String url,String user,String password) throws Exception{
        this.url = url;
        this.user = user;
        this.password = password;

        //Register driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Est. Connection
        Connection con = DriverManager.getConnection(url,user,password);  //DriverManager implements Connection and getConnection is static
        st = con.createStatement();
    }

    void getAll() throws Exception{
        ResultSet rs = st.executeQuery("select * from student");
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();

        while (rs.next()) {
            for(int i = 1 ; i <= columnsNumber; i++){
                System.out.print(rs.getString(i) + "\t\t\t"); //Print one element of a row
            }
            System.out.println();//Move to the next line to print the next row.
        }
    }

    void getNames() throws Exception{
        ResultSet rs = st.executeQuery("select name from student");
        System.out.println("\nNAMES:");
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }
    }
}
