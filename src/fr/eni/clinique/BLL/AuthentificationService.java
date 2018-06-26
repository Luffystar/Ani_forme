package fr.eni.clinique.BLL;

import fr.eni.clinique.DAL.DAOFactory;
import fr.eni.clinique.DAL.interfaces.IPersonnelDAO;

/*
 * @author CHARTIER Corentin
 */
public class AuthentificationService {

    //Attributs
    IPersonnelDAO personnelDAO;

    //Constructeurs
    public AuthentificationService() {
        personnelDAO = DAOFactory.getPersonnelDAO();
    }

    // Methode
    public void connection(String username, String password) {  
            
        
        
    }

    // Get
    // Set
}
