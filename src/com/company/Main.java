package com.company;
import com.company.DAO.DAOJournaliste;
import com.company.Model.Journaliste;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        // écriture ==> INSERT
        Journaliste newJournaliste = new Journaliste("Andry", 2);
        insererJournaliste(newJournaliste);

        //lecture ==> GET
        List<Journaliste> ListeDesJournalistes = DAOJournaliste.journalisteList;
        lireListeJournaliste(ListeDesJournalistes);

    }

    public static void insererJournaliste( Journaliste journaliste) throws SQLException{
        DAOJournaliste.requestInsert(journaliste);
    }

    //@TODO : tester car sysout ne marche pas
    public static void lireListeJournaliste( List<Journaliste> listeJournaliste) throws SQLException {
        if(listeJournaliste == null){
            DAOJournaliste.requestSelect();
        }
        if(listeJournaliste != null){
            for ( Journaliste j : listeJournaliste ) {
                System.out.println("RESULTATS" + j.getLogin() + j.getCredit());
            }
        }else{
            System.out.println("Echec de la lecture de la liste des journalistes");
        }
    }
}

