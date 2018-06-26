package fr.eni.clinique.IHM;

import javax.swing.JInternalFrame;

public class InternalFrame3 extends JInternalFrame {
		public InternalFrame3() {
			super("Titre Frame 3", true, true, true, true);
		
		    this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		    setBounds(120, 120, 600, 400);
		}
}
