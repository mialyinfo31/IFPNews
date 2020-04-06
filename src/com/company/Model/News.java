package com.company.Model;

public class News {
    private int id_news;
    private String titre;
    private String contenu;
    private Long Date;
    private int id_journalist;

    /**Constructor
     */
    public News(String titre, String contenu, Long date, int id_journalist) {
        this.titre = titre;
        this.contenu = contenu;
        Date = date;
        this.id_journalist = id_journalist;
    }
    /**Getter and setter
     */
    public int getId_news() {
        return id_news;
    }

    public String getTitre() {
        return titre;
    }

    public String getContenu() {
        return contenu;
    }

    public Long getDate() {
        return Date;
    }

    public int getId_journalist() {
        return id_journalist;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setId_journalist(int id_journalist) {
        this.id_journalist = id_journalist;
    }
}



