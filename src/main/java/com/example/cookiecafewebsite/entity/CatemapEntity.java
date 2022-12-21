package com.example.cookiecafewebsite.entity;

public class CatemapEntity {
    private int id;
    private int cateid;
    private int etcid;
    private String etctable;
    private String indate;

    public CatemapEntity() {
    }

    public CatemapEntity(int id, int cateid, int etcid, String etctable, String indate) {
        this.id = id;
        this.cateid = cateid;
        this.etcid = etcid;
        this.etctable = etctable;
        this.indate = indate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCateid() {
        return cateid;
    }

    public void setCateid(int cateid) {
        this.cateid = cateid;
    }

    public int getEtcid() {
        return etcid;
    }

    public void setEtcid(int etcid) {
        this.etcid = etcid;
    }

    public String getEtctable() {
        return etctable;
    }

    public void setEtctable(String etctable) {
        this.etctable = etctable;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }
}
