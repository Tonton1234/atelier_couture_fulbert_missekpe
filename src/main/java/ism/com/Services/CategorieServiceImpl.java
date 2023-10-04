package ism.com.Services;

import java.util.ArrayList;

import ism.com.entities.Categorie;

import ism.com.repositories.List.ITables;
import ism.com.repositories.List.TableCategories;

public class CategorieServiceImpl  implements CategorieService{

    //couplage fort
    //private TableCategories categoriesRepository=new TableCategories();

     //couplage faible
     private ITables categoriesRepository;

     public CategorieServiceImpl(ITables<Categorie> categoriesRepository){
         this.categoriesRepository=categoriesRepository;
     }


    @Override
    public int add(Categorie categorie) {
     return  categoriesRepository.insert(categorie);

    }

    @Override
    public ArrayList<Categorie> getAll() {
        return categoriesRepository.findAll();
    }

    @Override
    public int update(Categorie categorie) {
        return categoriesRepository.update(categorie);
    }

    //  @Override
    // public int update(int id,String lib) {
    //      categoriesRepository.findById(id);
    // //    return categoriesRepository.update();
    // }

    // public int update(int id, String lib) {
    //         Categorie cat=categoriesRepository.findById(id);
    //         cat.setLibelle(lib);
    //         cat.setId(id);
    //         return categoriesRepository.update(cat);
    // }
    
    

    // @Override
    // public Categorie show(int id) {
    //    return categoriesRepository.findById(id);
    // }

    @Override
    public Categorie show(int id){
        return (Categorie) categoriesRepository.findById(id);
    }

    @Override
    public int remove(int id) {
       return categoriesRepository.delete(id);
    }

    @Override
    public int[] remove(int[] ids) {
        int[] idsNotDelete=new int[ids.length];
        int nbre=0;
        for (int id = 0; id < ids.length; id++) {
            if (categoriesRepository.delete(id)==0){
                idsNotDelete[nbre++]=id;
            }
        }
        return idsNotDelete;
    }

    @Override
    public Categorie get(int id) {
        return (Categorie) categoriesRepository.findById(id);
    }

   
   

   

    static void pause(){
        int millis = 3000;

        try {
            Thread.sleep(millis);
        } catch (InterruptedException ie) {
            // ...
        }
    }
    
}
