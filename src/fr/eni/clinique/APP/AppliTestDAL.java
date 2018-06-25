package fr.eni.clinique.APP;

import fr.eni.clinique.BO.Utilisateur;
import java.util.List;

import fr.eni.clinique.DAL.DAOFactory;
import fr.eni.clinique.DAL.exceptions.DALException;
import fr.eni.clinique.DAL.interfaces.IPersonnelDAO;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppliTestDAL {

    public static void main(String[] args) {

        try {
            //Déclaration et instanciation de la DAO
            IPersonnelDAO personnelDAO = DAOFactory.getPersonnelDAO();
            personnelDAO.create(new Utilisateur("Gilbert", "Admin", "SEC", false));
            
            
            
            
        } catch (DALException ex) {
            Logger.getLogger(AppliTestDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
