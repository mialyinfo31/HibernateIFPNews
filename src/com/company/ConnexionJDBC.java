package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionJDBC {

        // initilize Connection and Driver
        public static Connection maConnection= null; //java.sql pour le choix
        public static final String DRIVER_CONNECTOR ="com.mysql.cj.jdbc.Driver";

        //Version Wamp : get connection variables
        public static final String JDBC= "jdbc:mysql://localhost:3306/";
        public static final String DB_NAME= "ifp";
        public static final String URL= JDBC + DB_NAME;
        public static final String LOGIN= "root";
        public static final String PASSWORD= "";


         public static void ouvrirConnexion() {
                try{
                        //Charge le driver jdbc
                        Class.forName(DRIVER_CONNECTOR);

                        //Connexion
                        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                        maConnection  = DriverManager.getConnection(URL,LOGIN,PASSWORD);
                        System.out.println("Connexion établie !");
                }
                catch(ClassNotFoundException e){
                        System.out.println("Impossible de charger le pilote!"+ e.getMessage());
                        return;
                }
                catch(SQLException e){
                        System.out.println("Connexion impossible !"+ e.getMessage());
                        return;
                }
        }

        public static void femerConnexion(Connection connection) {
                if(connection!= null) {
                        try{
                                connection.close();
                        } catch(final SQLException e) {
                                e.printStackTrace();
                        }
                }
        }
}
