package fr.eni.clinique.IHM.controller;

import fr.eni.clinique.BO.Utilisateur;
import fr.eni.clinique.IHM.IController;
import fr.eni.clinique.IHM.observer.IMainFrameObserver;
import fr.eni.clinique.IHM.views.MainFrame;


/*
 * @author CHARTIER Corentin
 */
public class MainFrameController implements IMainFrameObserver, IController {

    // Attributs
    private static MainFrameController mainFrameController;
    private MainFrame mainFrame;
    private Utilisateur utilisateur;

    // Constructeurs
    private MainFrameController() {

    }

    // Methode
    @Override
    public void initView() {
        
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
    public static synchronized MainFrameController getInstance() {
        if (mainFrameController == null) {
            mainFrameController = new MainFrameController();
        }
        return mainFrameController;
    }

    public static synchronized MainFrameController getObserver() {
        if (mainFrameController == null) {
            mainFrameController = new MainFrameController();
        }
        return mainFrameController;
    }
    // Set
}
