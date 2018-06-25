package fr.eni.clinique.DAL;

import fr.eni.clinique.DAL.interfaces.impl.ClientDAO;
import fr.eni.clinique.DAL.interfaces.impl.PersonnelDAO;

public class DAOFactory {

    // Attributs
    private static PersonnelDAO personnelDAO;
    private static ClientDAO clientDAO;

    // Methode
    public static PersonnelDAO getPersonnelDAO() {
        if (personnelDAO == null) {
            personnelDAO = new PersonnelDAO();
        }
        return personnelDAO;
    }
    
    public static ClientDAO getClientDAO() {
        if (clientDAO == null) {
            clientDAO = new ClientDAO();
        }
        return clientDAO;
    }
}
