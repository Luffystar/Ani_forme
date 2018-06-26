package fr.eni.clinique.DAL;

import fr.eni.clinique.DAL.exceptions.DALException;

/*
 * @author CHARTIER Corentin
 */
public interface IDAO<T> {

    //CRUD
    int create(T data) throws DALException;

    T read(int id) throws DALException;

    int update(T data) throws DALException;

    int delete(T data) throws DALException;

}
