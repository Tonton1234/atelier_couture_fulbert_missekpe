package ism.com.repositories.List;

import java.util.ArrayList;

import ism.com.entities.AbstractEntities;

public class Table<T extends AbstractEntities> implements ITables<T>{
    private ArrayList<T> tables=new ArrayList<>();

    @Override
    public int insert(T data) {
        tables.add(data);
        return 1;
    }

    @Override
    public int update(T data) {
        int pos=indeof(data.getId());
        if(pos!=-1){
            tables.set(pos, data);
            return 1;
        }
       
        return 0;
    }

    @Override
    public ArrayList<T> findAll(){
        return tables;
    }

    @Override
    public T findById(int id){
        int pos=indeof(id);
        if(pos!=-1){
          return tables.get(pos);
 
        }
        return null ;
    }

    @Override
    public int delete(int id){
       int pos=indeof(id);
       if(pos!=-1){
         tables.remove(pos);
         return 1;

       }
       return 0;
    }

    @Override
    public int indeof(int id){
        int pos=0;
        for (T cat : tables) {
            if(cat.getId()==id){
                return pos;
            }
            pos++;
          
        }
        return -1;
    }
    
}
