package fr.eni.clinique.APP;

import fr.eni.clinique.BLL.AuthentificationService;
import fr.eni.clinique.BLL.exceptions.BLLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * @author CHARTIER Corentin
 */
public class AppliTestBLL {
    
    //Attributs

    //Constructeurs

    // Methode
    public static void main(String[] args) {
        
        try {
            AuthentificationService as = new AuthentificationService();
            as.connection("BOSAPIN", "sec");
            
            
        } catch (BLLException ex) {
            Logger.getLogger(AppliTestBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    // Get

    // Set

    
    
}
