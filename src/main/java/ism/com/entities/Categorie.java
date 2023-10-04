package ism.com.entities;

public class Categorie extends AbstractEntities{
    private static int nbr;
   
    public Categorie(int id, String libelle) {
       super(++nbr,libelle);
    }
    public Categorie() {
        super(++nbr);
    }
    public Categorie(String libelle) {
        super(++nbr,libelle);
    }
    public static int getNbr() {
        return nbr;
    }
    public static void setNbr(int nbr) {
        Categorie.nbr = nbr;
    }
   
    @Override
    public String toString() {
        return "Categorie [id=" + id + ", libelle=" + libelle + "]";
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
        Categorie other = (Categorie) obj;
        if (id != other.id)
            return false;
        return true;
    }
   
}
