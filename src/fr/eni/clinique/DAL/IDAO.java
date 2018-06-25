package fr.eni.clinique.DAL;

import fr.eni.clinique.DAL.exceptions.DALException;

public interface IDAO<T> {

    //CRUD
    int create(T data) throws DALException;

    T read(int id);

    int update(T data);

    int delete(T data);
    
}
