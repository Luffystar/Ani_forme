package fr.eni.clinique.IHM.login;

import java.awt.GridBagConstraints;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Connexion extends JFrame {

    private JTextField textField;
    private JTextField textField_1;

    public Connexion() throws HeadlessException {
        super();
        setAlwaysOnTop(true);
        setResizable(false);
        setTitle("Connexion");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblNewLabel = new JLabel("Nom");

        textField = new JTextField();
        textField.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Mot de passe");

        textField_1 = new JTextField();
        textField_1.setColumns(10);

        JButton btnValider = new JButton("Valider");
        btnValider.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                System.exit(0); // Pour l'instant
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
                                                .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(41)
                                                .addComponent(lblNewLabel_1)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(38)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_1)
                                        .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(38)
                                .addComponent(btnValider))
        );
        getContentPane().setLayout(groupLayout);
        this.setSize(300, 300);
        //initIHM();   
        //connex.addActionListener((ActionListener) connex);
        // TODO Auto-generated constructor stub
    }

    private void initIHM() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 2, 2, 2);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridx = 1;

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.gridx = 1;

        gbc.gridx = 2;

    }
}
