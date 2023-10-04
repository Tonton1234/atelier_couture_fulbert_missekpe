package ism.com.entities;

public class Unite extends AbstractEntities {
    private static int nbr;
  
    public Unite(int id, String libelle) {
        super(id,libelle);
     }
     public Unite() {
         super(++nbr);
     }
    public static int getNbr() {
        return nbr;
    }
    public static void setNbr(int nbr) {
        Unite.nbr = nbr;
    }
   
    
    @Override
    public String toString() {
        return "Unite [id=" + id + ", libelle=" + libelle + "]";
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
        Unite other = (Unite) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
