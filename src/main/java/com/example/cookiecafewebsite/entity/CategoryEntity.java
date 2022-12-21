package com.example.cookiecafewebsite.entity;

public class CategoryEntity {
    private int id;
    private String catename;
    private String catetype;
    private String indate;

    public CategoryEntity() {
    }

    public CategoryEntity(int id, String catename, String catetype, String indate) {
        this.id = id;
        this.catename = catename;
        this.catetype = catetype;
        this.indate = indate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename;
    }

    public String getCatetype() {
        return catetype;
    }

    public void setCatetype(String catetype) {
        this.catetype = catetype;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }
}
