package fr.eni.clinique.IHM.controller;

import fr.eni.clinique.BO.Utilisateur;
import fr.eni.clinique.IHM.observer.IHomeObserver;
import fr.eni.clinique.IHM.views.HomeFrame;
import javax.swing.JFrame;

/*
 * @author CHARTIER Corentin
 */
public class HomeController implements IHomeObserver {

    // Attributs
    private static HomeController homeController;
    private ConnexionController connexionController;
    private HomeFrame mainFrame;
    
    private Utilisateur utilisateur;

    // Constructeurs
    private HomeController() {
        connexionController = ConnexionController.getInstance();

    }

    // Methode
    public void initView() {
        mainFrame = new HomeFrame();
        mainFrame.setVisible(true);
        
        connexionController.initView(mainFrame, "Test", true);
        
    }

    @Override
    public void MBIDeconnexion_Click() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MBIFermer_Click() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MBIPriseRDV_Click() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MBIGestionClient_Click() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MBIAgenda_Click() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MBIGestionPersonnel_Click() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Get
    public static synchronized HomeController getInstance() {
        if (homeController == null) {
            homeController = new HomeController();
        }
        return homeController;
    }

    public static synchronized HomeController getObserver() {
        if (homeController == null) {
            homeController = new HomeController();
        }
        return homeController;
    }
    // Set
}
