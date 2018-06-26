package fr.eni.clinique.IHM;

import javax.swing.JInternalFrame;

public class InternalFrame1 extends JInternalFrame {

    public InternalFrame1() {
        //Ecran avec un titre, redimensionable, fermable, agrandissable, iconifiable
        super("Agenda", true, true, true, true);

        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        setBounds(100, 100, 600, 600);

    }
}
