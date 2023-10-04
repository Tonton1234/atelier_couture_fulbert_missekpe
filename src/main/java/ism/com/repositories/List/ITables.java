package ism.com.repositories.List;
import java.util.ArrayList;

import ism.com.entities.AbstractEntities;




public interface ITables<T extends AbstractEntities> {
    int insert(T data);
    int update(T data);
    ArrayList<T> findAll();
    T findById(int id);
    int delete(int id);
    int indeof(int id);
    // int findId(IClasse data);
}
