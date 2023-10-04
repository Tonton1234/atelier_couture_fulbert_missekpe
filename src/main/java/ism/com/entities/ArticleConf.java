package ism.com.entities;

import java.util.ArrayList;

public class ArticleConf extends  AbstractEntities {
    private static int nbr;
    private double pri;
    private int qte;

    //atribut navigationnel
    Categorie categorie;
   ArrayList<Unite> unites=new ArrayList<>();
    public ArticleConf() {
       super(++nbr);
    }

    public void addUnite(Unite unite){
        unites.add(unite);
    }
    // public ArticleConf(String libelle, double pri, int qte) {
    //     this.id=++nbr;
    //     this.libelle = libelle;
    //     this.pri = pri;
    //     this.qte = qte;
    // }
    public ArticleConf( String libelle, double pri, int qte) {
        super(++nbr,libelle);
        this.pri = pri;
        this.qte = qte;
    }
    public static int getNbr() {
        return nbr;
    }
    public static void setNbr(int nbr) {
        ArticleConf.nbr = nbr;
    }
    
    public double getPri() {
        return pri;
    }
    public void setPri(double pri) {
        this.pri = pri;
    }
    public int getQte() {
        return qte;
    }
    public void setQte(int qte) {
        this.qte = qte;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ArticleConf other = (ArticleConf) obj;
        if (id != other.id)
            return false;
        return true;
    }
    public Categorie getCategorie() {
        return categorie;
    }
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    public ArrayList<Unite> getUnites() {
        return unites;
    }

    @Override
    public String toString() {
        return "ArticleConf [pri=" + pri + ", qte=" + qte + ", categorie=" + categorie + ", unites=" + unites + "]";
    }
   
   
    
}
