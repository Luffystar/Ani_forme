package fr.eni.clinique.IHM.controller;

import fr.eni.clinique.BO.Utilisateur;
import fr.eni.clinique.IHM.IController;
import fr.eni.clinique.IHM.observer.IMainFrameObserver;
import fr.eni.clinique.IHM.views.HomeFrame;


/*
 * @author CHARTIER Corentin
 */
public class HomeController implements IMainFrameObserver, IController {

    // Attributs
    private static HomeController mainFrameController;
    private HomeFrame mainFrame;
    private Utilisateur utilisateur;

    // Constructeurs
    private HomeController() {

    }

    // Methode
    @Override
    public void initView() {
        mainFrame = new HomeFrame();
        mainFrame.setVisible(true);
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
        if (mainFrameController == null) {
            mainFrameController = new HomeController();
        }
        return mainFrameController;
    }

    public static synchronized HomeController getObserver() {
        if (mainFrameController == null) {
            mainFrameController = new HomeController();
        }
        return mainFrameController;
    }
    // Set
}
