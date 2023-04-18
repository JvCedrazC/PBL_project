package Aplication.DAO;

import java.util.List;

public interface CRUD <T>{
    //Create
    public T create(T obj);
    //Read
    public T findById(int id);
    public List<T> findMany(T obj);
    //update
    public void update(T obj);
    //delete
    public void deleteById(int id);
    public void deleteMany();

}
