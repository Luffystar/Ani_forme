package fr.eni.clinique.IHM;

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
import fr.eni.clinique.IHM.login.Connexion;

public class MDIAppExample extends JFrame implements ActionListener {

   
	private static final long serialVersionUID = 1L;
	
	private Window Con;
	private JDesktopPane desktopPane;
	private JMenuBar menuBarre;
	private JMenu menuAgenda;

	private static boolean connexionok = false;
	private InternalFrame1 frm1;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmAgenda;


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
					getMenuBarre().add(getMnNewMenu());
			
					// Menu Agenda
					// if Vétérinaire de co
					//if (){};
					mntmAgenda = new JMenuItem("Agenda");
					menuBarre.add(mntmAgenda);		
					mntmAgenda.setActionCommand("ecran");
					mntmAgenda.addActionListener(this);
			getMenuBarre().add(getMntmNewMenuItem_2());

			createMenuBar();
		}
		return menuBarre;
	}
	
	public InternalFrame1 getFrm1() {
		if(frm1== null){
			frm1 = new InternalFrame1();
			frm1.setTitle("Agenda");
		}
		return frm1;
	}

	private JMenu getMnNewMenu() {
		//Si Secréataire de co
		//if() {};
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("Gestion des rendez-vous");
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_1());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("Prise de rendez-vous");
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("Gestion des clients");
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		//Si Admin de co
		//if () {};
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("Gestion du personnel");
		}
		return mntmNewMenuItem_2;
	}
}
