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
public class AppliTestDAL {

    public static void main(String[] args) {

        try {
            //Déclaration et instanciation de la DAO
            IPersonnelDAO personnelDAO = DAOFactory.getPersonnelDAO();
            int cd = personnelDAO.create(new Utilisateur("Gilbert", "Admin", "SEC", false));

            System.out.println(personnelDAO.read(cd));

            personnelDAO.update(new Utilisateur(cd, "Michel", "Admin", "SEC", false));
            personnelDAO.delete(new Utilisateur(cd, "Michel", "Admin", "SEC", false));
            
        } catch (DALException ex) {
            Logger.getLogger(AppliTestDAL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
