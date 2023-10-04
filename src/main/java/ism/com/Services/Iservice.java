package ism.com.Services;

import java.util.ArrayList;

public interface Iservice<B> {
    int add(B data);
    ArrayList<B> getAll();
    B get(int id);
    int update(B data);
    B show(int id);
    int remove(int id);
    int[] remove(int[] ids);
}
