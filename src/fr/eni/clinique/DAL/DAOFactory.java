package fr.eni.clinique.DAL;

import fr.eni.clinique.DAL.interfaces.impl.PersonnelDAO;

public class DAOFactory {

    // Constante
    // Attributs
    private static PersonnelDAO personnelDAO;

    // Constructor
    // Methode
    public static PersonnelDAO getPersonnelDAO() {
        if (personnelDAO == null) {
            personnelDAO = new PersonnelDAO();
        }
        return personnelDAO;
    }

    // Get
    // Set
}
