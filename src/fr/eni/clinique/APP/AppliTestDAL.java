package fr.eni.clinique.APP;

import java.util.List;

import fr.eni.clinique.DAL.DAOFactory;
import fr.eni.clinique.DAL.interfaces.IPersonnelDAO;

public class AppliTestDAL {

    public static void main(String[] args) {

        //Déclaration et instanciation de la DAO
        IPersonnelDAO personnelDAO = DAOFactory.getPersonnelDAO();

    }

}
