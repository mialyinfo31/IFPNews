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

    public Journaliste(int id_journaliste, String journaliste, int credit) {
        this.id_journaliste = id_journaliste;
        this.login = journaliste;
        this.credit = credit;
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

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
