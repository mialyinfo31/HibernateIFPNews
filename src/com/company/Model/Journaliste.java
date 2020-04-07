package com.company.Model;

public class Journaliste {
    private int id_journaliste;
    private String login;
    private int credit;

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
