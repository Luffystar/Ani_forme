package fr.eni.clinique.IHM.views;

import fr.eni.clinique.IHM.controller.ConnexionController;
import fr.eni.clinique.IHM.observer.IConnexionObserver;
import fr.eni.clinique.IHM.observer.IObserverSubject;
import java.awt.Dialog;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

/*
 * @author POUSSIN Axel & CHARTIER Corentin
 */
public class ConnexionFrame extends JDialog implements IObserverSubject<IConnexionObserver> {

    private ResourceBundle bundle = ResourceBundle.getBundle("fr/eni/clinique/texte_ressources"); // NOI18N
    private List<IConnexionObserver> observers;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel;
    private JTextField txtNom;
    private JTextField textMdp;
    private JButton btnValider;

    public ConnexionFrame(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        initComponents();
        this.registerObserver(ConnexionController.getObserver());
    }

       
    private void initComponents() {

        setAlwaysOnTop(true);
        this.setResizable(false);
        this.setTitle(bundle.getString("TITRE_CONNEXION_FRAME"));
        this.setLocationRelativeTo(null);

        lblNewLabel = new JLabel(bundle.getString("CONNEXION_FRAME_LABEL_LOGIN"));
        txtNom = new JTextField();
        txtNom.setColumns(10);

        lblNewLabel_1 = new JLabel(bundle.getString("CONNEXION_FRAME_LABEL_PASSWORD"));
        textMdp = new JPasswordField();
        textMdp.setColumns(10);

        btnValider = new JButton(bundle.getString("CONNEXION_FRAME_BOUTON_VALIDER"));
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ValiderActionPerformed(evt);
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

    @Override
    public synchronized void registerObserver(IConnexionObserver observer) {
        if (observers == null) {
            observers = new ArrayList<>();
        }

        observers.add(observer);
    }

    @Override
    public synchronized void unregisterObserver(IConnexionObserver observer) {
        observers.remove(observer);
    }

    private void BTN_ValiderActionPerformed(java.awt.event.ActionEvent evt) {
        for (IConnexionObserver observer : observers) {
            observer.BTNValider_Click();
        }
    }

    public JTextField getTxtNom() {
        return txtNom;
    }

    public JTextField getTextMdp() {
        return textMdp;
    }

}
