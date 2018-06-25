package fr.eni.clinique.ihm;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.eni.clinique.BO.Utilisateur;

public class Connexion extends JFrame implements ActionListener {
	
	JLabel noml = new JLabel("Nom");
	JLabel mdpl = new JLabel("Mot de passe");
	
	static JTextField jnom = new JTextField(15);
	static JTextField jmdp = new JTextField(15);

	JButton connex = new JButton("Valider");
	
	public Connexion() throws Exception {
		super();
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initIHM();   
		connex.addActionListener((ActionListener) this);
		// TODO Auto-generated constructor stub
	}

	private void initIHM() throws Exception {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		panel.setOpaque(true);
		panel.setLayout(new GridLayout(0, 1));
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(2, 2, 2, 2);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(getNoml());
		gbc.gridx = 1;
		panel.add(getJnom());
		
		gbc.gridy = 1;
		gbc.gridx = 0;
		panel.add(getMdpl());
		gbc.gridx = 1;
		panel.add(getJmdp());

		gbc.gridx = 2;
		panel.add(getConnex());

		this.add(panel, BorderLayout.CENTER);
		
	}
	public void actionPerformed(ActionEvent a){
		try{
			//for (int i = 1; i = Utilisateur.tableau.lenght(); i++){
				System.out.println("Bouton cliqué");
				// ---------------- A Modifier
				// Ici on vérifie que l'Utilisateur existe
				// et que le mot de passe correspond à l'utilisateur
				
				//Connecté = fermeture de Connexion
				this.setVisible(false);
			//}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public JLabel getNoml() {
		return noml;
	}

	public JLabel getMdpl() {
		return mdpl;
	}

	public static JTextField getJnom() {
		if (jnom == null){
			jnom = new JTextField(15);
		}
		return jnom;
	}

	public static JTextField getJmdp() {
		if (jmdp == null){
			jmdp = new JTextField(15);
		}
		return jmdp;
	}

	public JButton getConnex() {
		return connex;
	}


}
