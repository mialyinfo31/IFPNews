package com.company.Model;

public class Note {
    private int id_note;
    private int id_news;
    private int id_journaliste;

    /**
     * Constructor
     */
    public Note(int id_news, int id_journaliste) {
        this.id_news = id_news;
        this.id_journaliste = id_journaliste;
    }
    /**
     * Getter and setter
     */
    public int getId_note() {
        return id_note;
    }

    public int getId_news() {
        return id_news;
    }

    public int getId_journaliste() {
        return id_journaliste;
    }

    public void setId_news(int id_news) {
        this.id_news = id_news;
    }

    public void setId_journaliste(int id_journaliste) {
        this.id_journaliste = id_journaliste;
    }
}
