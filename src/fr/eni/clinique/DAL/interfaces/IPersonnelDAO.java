package fr.eni.clinique.DAL.interfaces;

import fr.eni.clinique.BO.Utilisateur;
import fr.eni.clinique.DAL.IDAO;
import fr.eni.clinique.DAL.exceptions.DALException;

/*
 * @author CHARTIER Corentin
 */
public interface IPersonnelDAO extends IDAO<Utilisateur> {
    
    Utilisateur readByUsernameAndPassword(String username, String password) throws DALException;
    
}
