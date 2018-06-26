package fr.eni.clinique.IHM.views;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author CHARTIER Corentin
 */
public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuBar = new javax.swing.JMenuBar();
        Menu_Menu = new javax.swing.JMenu();
        MBI_Deconnexion = new javax.swing.JMenuItem();
        MBI_Fermer = new javax.swing.JMenuItem();
        Menu_GestionRDV = new javax.swing.JMenu();
        MBI_PriseRDV = new javax.swing.JMenuItem();
        MBI_GestionClient = new javax.swing.JMenuItem();
        Menu_Agenda = new javax.swing.JMenu();
        Menu_GestionPersonnel = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("fr/eni/clinique/texte_ressources"); // NOI18N
        setTitle(bundle.getString("bonjour")); // NOI18N

        Menu_Menu.setText(bundle.getString("MAIN_FRAME_MENU_BAR_MENU")); // NOI18N

        MBI_Deconnexion.setText(bundle.getString("MAIN_FRAME_MENU_BAR_MENU_DECONNEXION")); // NOI18N
        Menu_Menu.add(MBI_Deconnexion);

        MBI_Fermer.setText(bundle.getString("MAIN_FRAME_MENU_BAR_MENU_FERMER")); // NOI18N
        Menu_Menu.add(MBI_Fermer);

        MenuBar.add(Menu_Menu);

        Menu_GestionRDV.setText(bundle.getString("MAIN_FRAME_MENU_BAR_GESTION_RDV")); // NOI18N

        MBI_PriseRDV.setText(bundle.getString("MAIN_FRAME_MENU_BAR_GESTION_RDV_PRISE_RDV")); // NOI18N
        Menu_GestionRDV.add(MBI_PriseRDV);

        MBI_GestionClient.setText(bundle.getString("MAIN_FRAME_MENU_BAR_GESTION_RDV_GESTION_CLIENT")); // NOI18N
        Menu_GestionRDV.add(MBI_GestionClient);

        MenuBar.add(Menu_GestionRDV);

        Menu_Agenda.setText(bundle.getString("MAIN_FRAME_MENU_BAR_AGENDA")); // NOI18N
        MenuBar.add(Menu_Agenda);

        Menu_GestionPersonnel.setText(bundle.getString("MAIN_FRAME_MENU_BAR_GESTION_PERSONNEL")); // NOI18N
        MenuBar.add(Menu_GestionPersonnel);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MBI_Deconnexion;
    private javax.swing.JMenuItem MBI_Fermer;
    private javax.swing.JMenuItem MBI_GestionClient;
    private javax.swing.JMenuItem MBI_PriseRDV;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu Menu_Agenda;
    private javax.swing.JMenu Menu_GestionPersonnel;
    private javax.swing.JMenu Menu_GestionRDV;
    private javax.swing.JMenu Menu_Menu;
    // End of variables declaration//GEN-END:variables
}
