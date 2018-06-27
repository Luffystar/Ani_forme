package fr.eni.clinique.BLL;

import fr.eni.clinique.BLL.exceptions.BLLException;
import fr.eni.clinique.BO.Utilisateur;
import fr.eni.clinique.DAL.DAOFactory;
import fr.eni.clinique.DAL.exceptions.DALException;
import fr.eni.clinique.DAL.interfaces.IPersonnelDAO;
import java.util.ResourceBundle;

/*
 * @author CHARTIER Corentin
 */
public class AuthentificationService {

    //Attributs
    ResourceBundle bundle = ResourceBundle.getBundle("fr/eni/clinique/texte_ressources"); // NOI18N
    IPersonnelDAO personnelDAO;

    //Constructeurs
    public AuthentificationService() {
        personnelDAO = DAOFactory.getPersonnelDAO();
    }

    // Methode
    public Utilisateur connection(String username, String password) throws BLLException {
        try {

            if (username == null) {
                throw new BLLException(bundle.getString("ERROR_CONNEXION_FRAME_LOGIN_VIDE"));
            } else if (password == null) {
                throw new BLLException(bundle.getString("ERROR_CONNEXION_FRAME_PASSWORD_VIDE"));
            }

            Utilisateur utilisateur = personnelDAO.readByUsernameAndPassword(
                    username.toUpperCase(),
                    password);

            if (utilisateur == null) {
                throw new BLLException(bundle.getString("ERROR_CONNEXION_FRAME_LOGIN_INVALIDE"));
            }

            return utilisateur;

        } catch (DALException e) {
            throw new BLLException(e.getMessage());
        }
    }

// Get
// Set
}
