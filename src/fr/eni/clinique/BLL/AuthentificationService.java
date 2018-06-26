package fr.eni.clinique.BLL;

import fr.eni.clinique.BLL.exceptions.BLLException;
import fr.eni.clinique.BO.Utilisateur;
import fr.eni.clinique.DAL.DAOFactory;
import fr.eni.clinique.DAL.exceptions.DALException;
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
    public Utilisateur connection(String username, String password) throws BLLException {
        try {
            Utilisateur utilisateur = personnelDAO.readByUsernameAndPassword(
                    username.toUpperCase(),
                    password);

            if (utilisateur == null) {
                throw new BLLException("L'utilisateur n'existe pas");
            }
            
            return utilisateur;

        } catch (DALException e) {
            throw new BLLException(e.getMessage());
        }
    }

    // Get
    // Set
}
