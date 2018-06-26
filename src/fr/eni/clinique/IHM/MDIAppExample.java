package fr.eni.clinique.IHM;

import fr.eni.clinique.IHM.login.Connexion;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

import fr.eni.clinique.DAL.interfaces.impl.PersonnelDAO;
import javax.swing.JInternalFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MDIAppExample extends JFrame implements ActionListener {

   
	private static final long serialVersionUID = 1L;
	
	private Window Con;
	private JDesktopPane desktopPane;
	private JMenuBar menuBarre;
	private JMenu menuAgenda;

	private static boolean connexionok = false;
	private InternalFrame1 frm1;
	private InternalFrame2 frm2;
	private InternalFrame3 frm3;
	private InternalFrame4 frm4;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmAgenda;
	private JTable table;


	public MDIAppExample() {
		this.setTitle("Clinique Vï¿½tï¿½rinaire");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, screenSize.width, screenSize.height);

		// initialiser l'ecran MDI
		desktopPane = new JDesktopPane();

		// Associer le JDesktopPane Ã  la JFrame
		setContentPane(desktopPane);

		// Barre de menus
		setJMenuBar(getMenuBarre());
		desktopPane.add(getFrm1());
		desktopPane.add(getFrmGestionperso());
		desktopPane.add(getFrmPrisederdv());
		desktopPane.add(getFrmGestionclient());
		
		
	}

	// Lancement de l'application
	public static void main(String[] args) throws Exception {
	//	Connexion main = new Connexion();
		
			SwingUtilities.invokeLater(new Runnable() {

				@Override
				public void run() {
					
					MDIAppExample ecran = new MDIAppExample();
					ecran.setVisible(true);

					
				}
			});
		

	}

	public void createMenuBar() {

	}

	// RÃ©agir aux clicks sur les menus
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "deconnexion":
			System.out.println("Deconnexion");
			break;
		case "fermer":
			System.exit(0);
			break;

		case "ecran":
			System.out.println("coucou");
			getFrm1().setVisible(true);
			break;

		case "gestionperso":
			System.out.println("Admin access pour la gestion des clients");
			getFrmGestionperso().setVisible(true);
			break;
		case "priserdv":
			System.out.println("Secrétaire access pour la prise de rdv");
			getFrmPrisederdv().setVisible(true);
			break;
		case "gestionclient":
			System.out.println("Secrétaire access pour la gestions des clients");
			getFrmGestionclient().setVisible(true);
			break;
		default:
			System.out.println("Probleme e=" + e);
		}

	}

	

	public JDesktopPane getDesktopPane() {
		return desktopPane;
	}

	public JMenuBar getMenuBarre() {
		if (menuBarre == null) {
			menuBarre = new JMenuBar();
					
							// Menu Fichier
							JMenu menu = new JMenu("Fichier");
							menuBarre.add(menu);
							
									// Sous menu DÃ©connexion
									JMenuItem menuItem = new JMenuItem("DÃ©connexion");
									menuItem.setActionCommand("deconnexion");
									menuItem.addActionListener(this);
									menu.add(menuItem);
									
											// Sous menu fermer
											menuItem = new JMenuItem("Fermer");
											menuItem.setActionCommand("fermer");
											menuItem.addActionListener(this);
											menu.add(menuItem);
											
											
							//Si Secréataire de co
							//if() {};
							JMenu mnNewMenu = new JMenu("Gestion des rendez-vous");
							menuBarre.add(mnNewMenu);
							
									JMenuItem menuItem2 = new JMenuItem("Prise de rendez-vous");
									menuItem2.setActionCommand("priserdv");
									menuItem2.addActionListener(this);
									mnNewMenu.add(menuItem2);
									
											menuItem2 = new JMenuItem("Gestion des clients");
											menuItem2.setActionCommand("gestionclient");
											menuItem2.addActionListener(this);
											mnNewMenu.add(menuItem2);
										
					// Menu Agenda
					// if Vétérinaire de co
					//if (){};
					mntmAgenda = new JMenuItem("Agenda");
					menuBarre.add(mntmAgenda);		
					mntmAgenda.setActionCommand("ecran");
					mntmAgenda.addActionListener(this);
					
					
					//Si Admin de co
						//if () {};
					mntmNewMenuItem_2 = new JMenuItem("Gestion du personnel");
					menuBarre.add(mntmNewMenuItem_2);
					mntmNewMenuItem_2.setActionCommand("gestionperso");
					mntmNewMenuItem_2.addActionListener(this);
					
					
					}

			createMenuBar();
		
		return menuBarre;
}
	
	public InternalFrame1 getFrm1() {
		if(frm1== null){
			frm1 = new InternalFrame1();
			frm1.setTitle("Agenda");
		}
		return frm1;
	}
	
	public InternalFrame2 getFrmGestionperso() {
		if(frm2== null){
			frm2 = new InternalFrame2();
			frm2.setTitle("Gestion du personnel");
		}
		return frm2;
	}

	private InternalFrame3 getFrmGestionclient() {
		// TODO Auto-generated method stub
		if(frm3== null){
			frm3 = new InternalFrame3();
			frm3.setTitle("Gestion des Clients");
		}
		return frm3;
	}

	private InternalFrame4 getFrmPrisederdv() {
		// TODO Auto-generated method stub
		if(frm4== null){
			frm4 = new InternalFrame4();
			frm4.setTitle("Prise de rendez-vous");
		}
		return frm4;
	}
}
