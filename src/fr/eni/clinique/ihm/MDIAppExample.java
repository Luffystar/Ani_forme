package fr.eni.clinique.ihm;

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

import fr.eni.clinique.ihm.login.Connexion;

public class MDIAppExample extends JFrame implements ActionListener {

   
	private static final long serialVersionUID = 1L;
	
	private Window Con;
	private JDesktopPane desktopPane;
	private JMenuBar menuBarre;
	private JMenu menuAgenda;
	private static InternalFrame1 frm;

	private static boolean connexionok = false;
	private InternalFrame1 frm1;


	public MDIAppExample() {
		this.setTitle("Clinique V�t�rinaire");
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
		desktopPane.add(getFrm());
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

					try {
						Connexion main = new Connexion();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
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

		// Menu Agenda
		menuItem = new JMenuItem("Ecran");
		menuBarre.add(menuItem);		
		menuItem.setActionCommand("ecran");
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

	public static InternalFrame1 getFrm() {
		if(frm== null){
			frm = new InternalFrame1();
			frm.setTitle("Connexion");
		}
		return frm;
	}
	
	public InternalFrame1 getFrm1() {
		if(frm1== null){
			frm1 = new InternalFrame1();
		}
		return frm1;
	}

}
