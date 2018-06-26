package fr.eni.clinique.IHM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

public class InternalFrame2 extends JInternalFrame{
	
	private JTable table;

	public InternalFrame2() {
        //Ecran avec un titre, redimensionable, fermable, agrandissable, iconifiable
        super("Titre Frame 2", true, true, true, true);

        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        setBounds(120, 120, 400, 400);
        JPanel panel = new JPanel();
		
		JButton btnNewButton = new JButton("Ajout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Supprimer");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("R\u00E9initialiser");
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(47)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 111, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table = new JTable();
		table.setBorder(null);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Nom Pr\u00E9nom", "Fonction", "Password"
			}
		));
		panel_1.add(table);
		this.getContentPane().setLayout(groupLayout);


    }
}
