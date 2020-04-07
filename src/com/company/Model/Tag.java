package com.company.Model;

public class Tag {
     private int tagID;
     private String tagName;

    /**
     * Constructor
     */
    public Tag(String tagName) {
        this.tagName = tagName;
    }

    /**
     * Getter and Setter
     */
    public int getTagID() {
        return tagID;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}
