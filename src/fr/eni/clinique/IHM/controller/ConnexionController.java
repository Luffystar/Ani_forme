package fr.eni.clinique.IHM.controller;

import fr.eni.clinique.BLL.AuthentificationService;
import fr.eni.clinique.BLL.exceptions.BLLException;
import fr.eni.clinique.IHM.observer.IConnexionObserver;
import fr.eni.clinique.IHM.views.ConnexionFrame;
import java.awt.Dialog;
import java.awt.Frame;
import java.util.ResourceBundle;


/*
 * @author CHARTIER Corentin
 */
public class ConnexionController implements IConnexionObserver {

    // Attributs
    ResourceBundle bundle = ResourceBundle.getBundle("fr/eni/clinique/texte_ressources"); // NOI18N
    private static ConnexionController connexionController;
    
    private ConnexionFrame connexionFrame;
    private AuthentificationService authentificationService;

    // Constructeurs
    private ConnexionController() {
        authentificationService = new AuthentificationService();
    }

    public void initView(Frame owner, String title, boolean modal) {
        connexionFrame = new ConnexionFrame(owner, title, modal);
        connexionFrame.setVisible(true);
    }

    // Methode
    @Override
    public void BTNValider_Click() {
        try {
            if (connexionFrame.getTxtNom().getText().isEmpty()) {
                throw new BLLException(bundle.getString("ERROR_CONNEXION_FRAME_LOGIN_VIDE"));
                
            } else if (connexionFrame.getTextMdp().getText().isEmpty()) {
                throw new BLLException(bundle.getString("ERROR_CONNEXION_FRAME_PASSWORD_VIDE"));
                
            } else {
                authentificationService.connection(
                        connexionFrame.getTxtNom().getText(),
                        connexionFrame.getTextMdp().getText()
                );
                
                //connexionFrame.
            }

        } catch (BLLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Get
    public static synchronized ConnexionController getInstance() {
        if (connexionController == null) {
            connexionController = new ConnexionController();
        }
        return connexionController;
    }

    public static synchronized ConnexionController getObserver() {
        if (connexionController == null) {
            connexionController = new ConnexionController();
        }
        return connexionController;
    }
    // Set

}
