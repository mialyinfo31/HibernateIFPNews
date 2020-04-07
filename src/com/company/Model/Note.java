package com.company.Model;

public class Note {
    private int id_note;
    private int noteValue;
    private boolean isValid;
    private String comment;
    private int fk_news;
    private int fk_journaliste;

    /**
     * Constructor
     */
    public Note(int fk_news, int fk_journaliste) {
        this.fk_news = fk_news;
        this.fk_journaliste = fk_journaliste;
    }
    /**
     * Getter and setter
     */
    public int getId_note() {
        return id_note;
    }

    public int getNoteValue() {
        return noteValue;
    }

    public boolean isValid() {
        return isValid;
    }

    public String getComment() {
        return comment;
    }

    public int getFk_news() {
        return fk_news;
    }

    public int getFk_journaliste() {
        return fk_journaliste;
    }

    public void setNoteValue(int noteValue) {
        this.noteValue = noteValue;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
