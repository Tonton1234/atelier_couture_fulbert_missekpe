package ism.com.Services;

import java.util.ArrayList;

import ism.com.entities.ArticleConf;

import ism.com.repositories.List.TableArticleConfection;

public class ArticleConfessionServiceImpl implements ArticleConfectioService {
    private TableArticleConfection art=new TableArticleConfection();
    @Override
    public int add(ArticleConf data) {
       return art.insert(data);
    }

    @Override
    public ArrayList<ArticleConf> getAll() {
        return art.findAll();
    }

    @Override
    public ArticleConf get(int id) {
        return art.findById(id);
    }

     @Override
    public int update(ArticleConf article) {
        return art.update(article);
    }
    // @Override
    // public int update(int id, String lib) {
    //         ArticleConf article=art.findById(id);
    //         article.setLibelle(lib);
    //         article.setId(id);
    //         System.out.println( article);
    //         pause();
    //         return art.update(article);
    // }

    @Override
    public ArticleConf show(int id) {
       return art.findById(id);
    }

    @Override
    public int remove(int id) {
        return art.delete(id);
    }

    @Override
    public int[] remove(int[] ids) {
        int[] idsNotDelete=new int[ids.length];
        int nbre=0;
        for (int id = 0; id < ids.length; id++) {
            if (art.delete(id)==0){
                idsNotDelete[nbre++]=id;
            }
        }
        return idsNotDelete;
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
