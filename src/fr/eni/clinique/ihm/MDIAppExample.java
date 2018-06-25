package fr.eni.clinique.ihm;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;


public class MDIAppExample extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JDesktopPane desktopPane;
	private JMenuBar menuBarre;
	private JMenu menuAgenda;
	private InternalFrame1 frm1;
	private InternalFrame1 frm2;
	private InternalFrame1 frm3;
	private InternalFrame1 frm4;


	public MDIAppExample() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, screenSize.width, screenSize.height);

		// initialiser l'ecran MDI
		desktopPane = new JDesktopPane();

		// Associer le JDesktopPane à la JFrame
		setContentPane(desktopPane);

		// Barre de menus
		setJMenuBar(getMenuBarre());
		
		//Frame interne exemple		
		desktopPane.add(getFrm1());
		desktopPane.add(getFrm2());
		desktopPane.add(getFrm3());
		desktopPane.add(getFrm4());

	}

	// Lancement de l'application
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				MDIAppExample ecran = new MDIAppExample();
				ecran.setVisible(true);
			}
		});

	}

	public void createMenuBar() {

		// Menu Fichier
		JMenu menu = new JMenu("Fichier");
		menuBarre.add(menu);

		// Sous menu Déconnexion
		JMenuItem menuItem = new JMenuItem("Déconnexion");
		menuItem.setActionCommand("deconnexion");
		menuItem.addActionListener(this);
		menu.add(menuItem);

		// Sous menu fermer
		menuItem = new JMenuItem("Fermer");
		menuItem.setActionCommand("fermer");
		menuItem.addActionListener(this);
		menu.add(menuItem);

		// Menu Gestion des rendez-vous
		JMenu menurdv = new JMenu("Gestion des rendez-vous");
		menuBarre.add(menurdv);
		
		// Sous menu Prise de rendez vous
		menuItem = new JMenuItem("Prise de rendez vous");
		menuItem.setActionCommand("Prisederendez-vous");
		menuItem.addActionListener(this);
		menurdv.add(menuItem);
		
		// Sous menu Prise de rendez vous
		menuItem = new JMenuItem("Gestion des clients");
		menuItem.setActionCommand("Gestiondesclients");
		menuItem.addActionListener(this);
		menurdv.add(menuItem);
		
		
		// Menu Agenda
		menuItem = new JMenuItem("Agenda");
		menuBarre.add(menuItem);		
		menuItem.setActionCommand("ecran");
		menuItem.addActionListener(this);
		
		// Menu Gestion du personnel
		menuItem = new JMenuItem("Gestion du personnel");
		menuBarre.add(menuItem);		
		menuItem.setActionCommand("Gestiondupersonnel");
		menuItem.addActionListener(this);
		
		

	}

	// Réagir aux clicks sur les menus
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
		case "Prisederendez-vous":
			System.out.println("Vous avez pris rendez-vous?");
			getFrm2().setVisible(true);
			break;
		case "Gestiondesclients":
			System.out.println("Clients");
			getFrm3().setVisible(true);
			break;
		case "Gestiondupersonnel":
			System.out.println("Gestion admin");
			getFrm4().setVisible(true);
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
	public InternalFrame1 getFrm2() {
		if(frm2== null){
			frm2 = new InternalFrame1();
			frm2.setTitle("Prise de rendez-vous");
		}
		return frm2;
	}
	public InternalFrame1 getFrm3() {
		if(frm3== null){
			frm3 = new InternalFrame1();
			frm3.setTitle("Gestion des clients");
		}
		return frm3;
	}
	public InternalFrame1 getFrm4() {
		if(frm4== null){
			frm4 = new InternalFrame1();
			frm4.setTitle("Gestion du personnel");
		}
		return frm4;
	}
}
