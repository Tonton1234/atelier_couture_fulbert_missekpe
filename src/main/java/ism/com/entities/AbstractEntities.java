package ism.com.entities;

public class AbstractEntities {
    protected int id;
    protected String libelle;
    public AbstractEntities(String libelle) {
        this.libelle = libelle;
    }
    public AbstractEntities(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }
    public AbstractEntities(int id) {
        this.id=id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
