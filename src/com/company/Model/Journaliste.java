package com.company.Model;

import javax.persistence.*;

@Entity
@Table(name="journaliste")
public class Journaliste {
    @Id
    // Permet de définir la statégie de génération
    // de la clé lors d'une insertion en base de données.
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id_journaliste;

    @Column(name="journalisteName")
    private String login;

    @Column(name="credit")
    private int credit;

    @Override
    public String toString() {
        return "Journaliste{" +
                "id_journaliste=" + id_journaliste +
                ", login='" + login + '\'' +
                ", credit=" + credit +
                '}';
    }

    /**
     * Constructor
     */
    public Journaliste() {
    }

    public Journaliste( String login, int credit) {
        super();
        this.login = login;
        this.credit = credit;
    }

    public Journaliste(int idJournaliset, String journalisteName, int journalisteCredit) {
    }

    /**
     * Getters and setters
     * @return
     */
    public int getId_journaliste() {
        return id_journaliste;
    }

    public String getLogin() {
        return login;
    }

    public void setId_journaliste(int id_journaliste) {
        this.id_journaliste = id_journaliste;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
