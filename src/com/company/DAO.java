package com.company;

import com.company.Model.Journaliste;

import java.sql.*;

import static com.company.ConnexionJDBC.*;

public class DAO {
    /**
     * QUERY STRING C_R_U_D
     */
    private final static String QUERY_FIND_ALL_JOURNALISTE= "SELECT * FROM journaliste;";
    private final static String QUERY_UPDATE_JOURNALISTE = "UPDATE journaliste SET credit=? where journalistName=?";

    /**
     * EXCECUTE QUERY
     * @throws SQLException

    public static void requestSelect() throws SQLException {
        Connection connection= null;
        Statement statement= null;

        try{
            //Pour travailler avec Tomcat et wamp Rajouter :
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection  = DriverManager.getConnection(URL_URL, LOGIN, PASSWORD); //La connexion
            statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery(QUERY_FIND_ALL_JOURNALISTE);
            while(resultSet.next()) {
                 = ( resultSet );
            }
        }
        finally{
            if(connection!= null) {// On ferme la connexion
                try{
                    connection.close();
                } catch(final SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/
    public static void requestUpdate() throws SQLException {
        Connection connection= null;

        PreparedStatement preparedStatement =
                connection.prepareStatement(QUERY_UPDATE_JOURNALISTE);

        preparedStatement.setString(4, "Journalist1");
        preparedStatement.setString(2, "Journalist2");
        preparedStatement.setString (3, "Journalist3");
        //preparedStatement.setLong  (3, "journaliste3");

        // normalement il renvoit -1 quand echec
        int rowsAffected = preparedStatement.executeUpdate();
    }


}