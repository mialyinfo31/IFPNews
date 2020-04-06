package com.company.DAO;

import com.company.Model.Journaliste;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.company.ConnexionJDBC.*;

public class DAOJournaliste {
    /**
     * QUERY STRING C_R_U_D
     */
    private final static String QUERY_INSERT_JOURNALISTE = "INSERT INTO journaliste (journalisteName,credit) VALUES (?),(?);";
    private final static String QUERY_FIND_ALL_JOURNALISTE= "SELECT * FROM journaliste;";
    private final static String QUERY_UPDATE_JOURNALISTE = "UPDATE journaliste SET credit=? where journalistName=?";

    /**
     * Attributs de la classe DAO à initialiser
     */
    public static List<Journaliste> journalisteList = new ArrayList<>();
    public static Journaliste journaliste = new Journaliste() ;


    /**
     * EXCECUTE QUERY
     * @throws SQLException
     * */

    // LECTURE AVEC SELECT
    public static void requestSelect() throws SQLException {
        Connection connection= null;
        Statement statement= null;
        try{
            //Pour travailler avec Tomcat et wamp Rajouter :
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection  = DriverManager.getConnection(URL, LOGIN, PASSWORD); //La connexion
            statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery(QUERY_FIND_ALL_JOURNALISTE);
            while(resultSet.next()) {
                // tant qu'il y a un resultat, je le récupères => creer un JournralisteBean
                Journaliste journaliste = resultSetToJournaliste( resultSet );
                journalisteList.add(journaliste);
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
    }

    private static Journaliste resultSetToJournaliste(ResultSet resultSet) throws SQLException {
        if(resultSet !=null ){
            int idJournalisetBDD = (int) resultSet.getLong(1);
            String journalisteNameBDD = resultSet.getString(2);
            int journalisteCreditBDD = resultSet.getInt(3);

            Journaliste journaliste = new Journaliste(
                    idJournalisetBDD,
                    journalisteNameBDD,
                    journalisteCreditBDD
            );
            return journaliste;
        }else {
            throw new UnsupportedOperationException();
        }
    }

    // ECRITURE AVEC INSTERT
    public static void requestInsert( Journaliste journaliste) throws SQLException {
        Connection connection= null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            preparedStatement = connection.prepareStatement(QUERY_INSERT_JOURNALISTE);
            // Remplir la requête
            preparedStatement.setString(1, journaliste.getLogin());
            preparedStatement.setInt(2, journaliste.getCredit());
            // Lancer la requête
            preparedStatement.executeUpdate();
        } finally{
            if(connection!= null) {// On ferme la connexion
                try{
                    connection.close();
                } catch(final SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }



    // @TODO : MODIFICATION AVEC UPDATE à finir
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