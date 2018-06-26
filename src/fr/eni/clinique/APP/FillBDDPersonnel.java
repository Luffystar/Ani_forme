package fr.eni.clinique.APP;

import fr.eni.clinique.BO.Utilisateur;
import fr.eni.clinique.DAL.DAOFactory;
import fr.eni.clinique.DAL.exceptions.DALException;
import fr.eni.clinique.DAL.interfaces.IPersonnelDAO;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * @author CHARTIER Corentin
 */
public class FillBDDPersonnel {

    //Attributs
    //Constructeurs
    // Methode
    public static void main(String[] args) {
        try {
            IPersonnelDAO personnelDAO = DAOFactory.getPersonnelDAO();
            personnelDAO.create(new Utilisateur("BOSAPIN", "admin", "ADM", false));
            personnelDAO.create(new Utilisateur("DE CAJOU", "admin", "ADM", false));
            
            personnelDAO.create(new Utilisateur("MALALANICH", "vet", "VET", false));
            personnelDAO.create(new Utilisateur("AIMONE", "vet", "VET", false));
            personnelDAO.create(new Utilisateur("TOURNE", "vet", "VET", false));
            
            personnelDAO.create(new Utilisateur("SWITAUME", "ast", "AST", false));
            personnelDAO.create(new Utilisateur("MONFILS", "ast", "AST", false));
            personnelDAO.create(new Utilisateur("ELABETE", "ast", "AST", false));
            
            personnelDAO.create(new Utilisateur("DE JEU", "sec", "SEC", false));
            personnelDAO.create(new Utilisateur("ABONDIEU", "sec", "SEC", false));
            personnelDAO.create(new Utilisateur("HISSON", "sec", "SEC", false));
            
        } catch (DALException ex) {
            Logger.getLogger(FillBDDPersonnel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    // Get

    // Set
}
