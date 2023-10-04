package ism.com.repositories.DB;

import ism.com.entities.Categorie;
import ism.com.repositories.List.ITables;

import java.util.ArrayList;

public class CategorieRepository implements ITables<Categorie> {

    @Override
    public int insert(Categorie data) {
        return 0;
    }

    @Override
    public int update(Categorie data) {
        return 0;
    }

    @Override
    public ArrayList<Categorie> findAll() {
        return null;
    }

    @Override
    public Categorie findById(int id) {
        return null;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int indeof(int id) {
        return 0;
    }
}
