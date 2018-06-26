package fr.eni.clinique.IHM.views;

import fr.eni.clinique.IHM.controller.MainFrameController;
import fr.eni.clinique.IHM.observer.IObserverSubject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UnsupportedLookAndFeelException;
import fr.eni.clinique.IHM.observer.IMainFrameObserver;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 *
 * @author CHARTIER Corentin
 */
public class MainFrame extends javax.swing.JFrame implements IObserverSubject<IMainFrameObserver> {

    private List<IMainFrameObserver> observers;

    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);

        this.registerObserver(MainFrameController.getObserver());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarreMenu = new javax.swing.JMenuBar();
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
        setTitle(bundle.getString("TITRE_MAIN_FRAME")); // NOI18N

        Menu_Menu.setText(bundle.getString("MAIN_FRAME_MENU_BAR_MENU")); // NOI18N

        MBI_Deconnexion.setText(bundle.getString("MAIN_FRAME_MENU_BAR_MENU_DECONNEXION")); // NOI18N
        MBI_Deconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBI_DeconnexionActionPerformed(evt);
            }
        });
        Menu_Menu.add(MBI_Deconnexion);

        MBI_Fermer.setText(bundle.getString("MAIN_FRAME_MENU_BAR_MENU_FERMER")); // NOI18N
        MBI_Fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBI_FermerActionPerformed(evt);
            }
        });
        Menu_Menu.add(MBI_Fermer);

        BarreMenu.add(Menu_Menu);

        Menu_GestionRDV.setText(bundle.getString("MAIN_FRAME_MENU_BAR_GESTION_RDV")); // NOI18N

        MBI_PriseRDV.setText(bundle.getString("MAIN_FRAME_MENU_BAR_GESTION_RDV_PRISE_RDV")); // NOI18N
        MBI_PriseRDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBI_PriseRDVActionPerformed(evt);
            }
        });
        Menu_GestionRDV.add(MBI_PriseRDV);

        MBI_GestionClient.setText(bundle.getString("MAIN_FRAME_MENU_BAR_GESTION_RDV_GESTION_CLIENT")); // NOI18N
        MBI_GestionClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBI_GestionClientActionPerformed(evt);
            }
        });
        Menu_GestionRDV.add(MBI_GestionClient);

        BarreMenu.add(Menu_GestionRDV);

        Menu_Agenda.setText(bundle.getString("MAIN_FRAME_MENU_BAR_AGENDA")); // NOI18N
        Menu_Agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_AgendaActionPerformed(evt);
            }
        });
        BarreMenu.add(Menu_Agenda);

        Menu_GestionPersonnel.setText(bundle.getString("MAIN_FRAME_MENU_BAR_GESTION_PERSONNEL")); // NOI18N
        Menu_GestionPersonnel.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                Menu_GestionPersonnelMenuSelected(evt);
            }
        });
        BarreMenu.add(Menu_GestionPersonnel);

        setJMenuBar(BarreMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public synchronized void registerObserver(IMainFrameObserver observer) {
        if (observers == null) {
            observers = new ArrayList<>();
        }

        observers.add(observer);
    }

    @Override
    public synchronized void unregisterObserver(IMainFrameObserver observer) {
        observers.remove(observer);
    }

    private void MBI_DeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBI_DeconnexionActionPerformed
        for (IMainFrameObserver observer : observers) {
            observer.MBIDeconnexion_Click();
        }
    }//GEN-LAST:event_MBI_DeconnexionActionPerformed

    private void MBI_FermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBI_FermerActionPerformed
        for (IMainFrameObserver observer : observers) {
            observer.MBIFermer_Click();
        }
    }//GEN-LAST:event_MBI_FermerActionPerformed

    private void MBI_PriseRDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBI_PriseRDVActionPerformed
        for (IMainFrameObserver observer : observers) {
            observer.MBIPriseRDV_Click();
        }
    }//GEN-LAST:event_MBI_PriseRDVActionPerformed

    private void MBI_GestionClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBI_GestionClientActionPerformed
        for (IMainFrameObserver observer : observers) {
            observer.MBIGestionClient_Click();
        }
    }//GEN-LAST:event_MBI_GestionClientActionPerformed

    private void Menu_AgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_AgendaActionPerformed
        for (IMainFrameObserver observer : observers) {
            observer.MBIAgenda_Click();
        }
    }//GEN-LAST:event_Menu_AgendaActionPerformed

    private void Menu_GestionPersonnelMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_Menu_GestionPersonnelMenuSelected
         for (IMainFrameObserver observer : observers) {
            observer.MBIGestionPersonnel_Click();
        }
    }//GEN-LAST:event_Menu_GestionPersonnelMenuSelected

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

    public JMenuItem getMBI_Deconnexion() {
        return MBI_Deconnexion;
    }

    public JMenuItem getMBI_Fermer() {
        return MBI_Fermer;
    }

    public JMenuItem getMBI_GestionClient() {
        return MBI_GestionClient;
    }

    public JMenuItem getMBI_PriseRDV() {
        return MBI_PriseRDV;
    }

    public JMenuBar getBarreMenu() {
        return BarreMenu;
    }

    public JMenu getMenu_Agenda() {
        return Menu_Agenda;
    }

    public JMenu getMenu_GestionPersonnel() {
        return Menu_GestionPersonnel;
    }

    public JMenu getMenu_GestionRDV() {
        return Menu_GestionRDV;
    }

    public JMenu getMenu_Menu() {
        return Menu_Menu;
    }

    public void setMBI_Deconnexion(JMenuItem MBI_Deconnexion) {
        this.MBI_Deconnexion = MBI_Deconnexion;
    }

    public void setMBI_Fermer(JMenuItem MBI_Fermer) {
        this.MBI_Fermer = MBI_Fermer;
    }

    public void setMBI_GestionClient(JMenuItem MBI_GestionClient) {
        this.MBI_GestionClient = MBI_GestionClient;
    }

    public void setMBI_PriseRDV(JMenuItem MBI_PriseRDV) {
        this.MBI_PriseRDV = MBI_PriseRDV;
    }

    public void setBarreMenu(JMenuBar BarreMenu) {
        this.BarreMenu = BarreMenu;
    }

    public void setMenu_Agenda(JMenu Menu_Agenda) {
        this.Menu_Agenda = Menu_Agenda;
    }

    public void setMenu_GestionPersonnel(JMenu Menu_GestionPersonnel) {
        this.Menu_GestionPersonnel = Menu_GestionPersonnel;
    }

    public void setMenu_GestionRDV(JMenu Menu_GestionRDV) {
        this.Menu_GestionRDV = Menu_GestionRDV;
    }

    public void setMenu_Menu(JMenu Menu_Menu) {
        this.Menu_Menu = Menu_Menu;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarreMenu;
    private javax.swing.JMenuItem MBI_Deconnexion;
    private javax.swing.JMenuItem MBI_Fermer;
    private javax.swing.JMenuItem MBI_GestionClient;
    private javax.swing.JMenuItem MBI_PriseRDV;
    private javax.swing.JMenu Menu_Agenda;
    private javax.swing.JMenu Menu_GestionPersonnel;
    private javax.swing.JMenu Menu_GestionRDV;
    private javax.swing.JMenu Menu_Menu;
    // End of variables declaration//GEN-END:variables

}
