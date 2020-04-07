package com.company.Model;

public class News {
    private int id_news;
    private String title;
    private String content;
    private Long Date;
    private int id_journalist;

    /**Constructor
     */
    public News(String title, String content, Long date, int id_journalist) {
        this.title = title;
        this.content = content;
        Date = date;
        this.id_journalist = id_journalist;
    }
    /**Getter and setter
     */
    public int getId_news() {
        return id_news;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Long getDate() {
        return Date;
    }

    public int getId_journalist() {
        return id_journalist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId_journalist(int id_journalist) {
        this.id_journalist = id_journalist;
    }
}



