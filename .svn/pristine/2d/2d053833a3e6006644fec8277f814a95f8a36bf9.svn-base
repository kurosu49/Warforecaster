package team14.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class WelcomePanel extends JPanel {
	public WelcomePanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{50, 300, 50, 0};
		gridBagLayout.rowHeights = new int[]{50, 195, 50, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		GridBagConstraints gbc_panelTitle = new GridBagConstraints();
		gbc_panelTitle.insets = new Insets(0, 0, 5, 5);
		gbc_panelTitle.fill = GridBagConstraints.BOTH;
		gbc_panelTitle.gridx = 1;
		gbc_panelTitle.gridy = 1;
		add(panelTitle, gbc_panelTitle);
		
		JLabel lblname1 = new JLabel("WELCOME TO");
		lblname1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblname1.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		lblname1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblname2 = new JLabel("WAR FORECASTER");
		lblname2.setVerticalAlignment(SwingConstants.TOP);
		lblname2.setHorizontalAlignment(SwingConstants.CENTER);
		lblname2.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		GroupLayout gl_panelTitle = new GroupLayout(panelTitle);
		gl_panelTitle.setHorizontalGroup(
			gl_panelTitle.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelTitle.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelTitle.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblname2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(lblname1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelTitle.setVerticalGroup(
			gl_panelTitle.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTitle.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblname1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblname2, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
					.addContainerGap())
		);
		panelTitle.setLayout(gl_panelTitle);
	}
}
