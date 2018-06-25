package fr.eni.clinique.DAL.interfaces;

public interface IDAO<T> {

    //CRUD
    int create(T data);

    T read(int id);

    int update(T data);

    int delete(T data);
    
}
