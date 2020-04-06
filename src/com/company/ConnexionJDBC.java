package com.company;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnexionJDBC {

        // initilize Connection and Driver
        // public Connection con= null; //java.sql pour le choix
        // public  final String DRIVER_CONNECTOR ="com.mysql.cj.jdbc.Driver";

        //Version Wamp : get connection variables
        public static final String JDBC= "jdbc:mysql://localhost:3306/";
        public static final String DB_NAME= "ifp";
        public static final String URL= JDBC + DB_NAME;
        public static final String LOGIN= "root";
        public static final String PASSWORD= "";

}
