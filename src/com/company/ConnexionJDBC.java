package com.company;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnexionJDBC {

        // initilize Connection and Driver
        // public Connection con= null; //java.sqlpour le choix
        // public  final String DRIVER_CONNECTOR ="com.mysql.cj.jdbc.Driver";

        //Version Wamp : get connection variables
        public static final String URL= "jdbc:mysql://localhost:3306/";
        public static final String DB_NAME= "ifp";
        public static final String URL_URL= URL + DB_NAME;
        public static final String LOGIN= "root";
        public static final String PASSWORD= "";

}
