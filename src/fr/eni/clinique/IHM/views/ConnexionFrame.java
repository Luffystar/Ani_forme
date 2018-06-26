package fr.eni.clinique.IHM.views;

import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;



public class ConnexionFrame extends JFrame {

    private JTextField txtNom;
    private JTextField textMdp;

    public ConnexionFrame() throws HeadlessException {
        super();
        setAlwaysOnTop(true);
        this.setResizable(false);
        this.setTitle("Connexion");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblNewLabel = new JLabel("Nom");

        txtNom = new JTextField();
        txtNom.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Mot de passe");

        textMdp = new JTextField();
        textMdp.setColumns(10);

        JButton btnValider = new JButton("Valider");
        btnValider.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
            	//Ici on test la connection
            	try {
            		//Ici on v�rifie si : 
            		//	-le nom Existe (et le fait que ce ne soit pas vide)
            		//	-et le mot de passe correspondant au nom de l'utilisateur
            		
            		// Si c'est ok : 
            		
                    setVisible(false);
                	
                	//sinon on affiche une erreur et on recommence.
            	} catch(Exception e){
            		
            	} // Pour l'instant
            }
        });
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(84)
                                                .addComponent(lblNewLabel)
                                                .addGap(20)
                                                .addComponent(txtNom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(41)
                                                .addComponent(lblNewLabel_1)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(textMdp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(136)
                                                .addComponent(btnValider)))
                                .addGap(83))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(60)
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(3)
                                                .addComponent(lblNewLabel))
                                        .addComponent(txtNom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(38)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_1)
                                        .addComponent(textMdp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(38)
                                .addComponent(btnValider))
        );
        getContentPane().setLayout(groupLayout);
        this.setSize(300, 300);
    }
}
