package team14.view;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import team14.controller.WarForecasterDB;
import team14.model.Strategist;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.Component;


@SuppressWarnings("serial")
public class LoginPanel extends JPanel {
	
	private GUI myGUI;
	
	private JTextField txtUsername;
	
	private JPasswordField passPassword;
	
	private Map<String, char[]> userPassMap;
	
	private Strategist strategist;
	
	private WarForecasterDB db;
	
	public LoginPanel(GUI aGUI, WarForecasterDB adb) {
		db = adb;
		myGUI = aGUI;
		
		try {
			sqlStrategist();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		buildLoginPanel();
	}
	
	private void sqlStrategist() throws SQLException {
		userPassMap = new HashMap<String, char[]>();
		
		List<Strategist> list6 = db.getStrategists();
		for(Strategist s: list6) {
			userPassMap.put(s.getUsername(), s.getPassword().toCharArray());
		}
	}
	
    public boolean verifyLogin(String username, char[] givenPassword) {
        if (username.length() < 1 || givenPassword == null) 
        	return false;   

        if (userPassMap.containsKey(username)) {
                char[] actualPassword = userPassMap.get(username);
                if (actualPassword != null) {
                    return Arrays.equals(actualPassword, givenPassword);
                } else return false;
        } else return false;
    }
	
	
	private void buildLoginPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 316, 50, 0};
		gridBagLayout.rowHeights = new int[]{50, 108, 50, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panelLogin = new JPanel();
		panelLogin.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		GridBagConstraints gbc_panelLogin = new GridBagConstraints();
		gbc_panelLogin.insets = new Insets(0, 0, 5, 5);
		gbc_panelLogin.gridx = 1;
		gbc_panelLogin.gridy = 1;
		add(panelLogin, gbc_panelLogin);
		
		JButton btnLogin = new JButton("Login");

		
		JLabel lblUsername = new JLabel("Username");
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		
		passPassword = new JPasswordField();
		
		
		// BUTTON ACTION
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String username = txtUsername.getText();
				char[] password = passPassword.getPassword();
				
				try {
					strategist = db.getStrategist(username);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				if (verifyLogin(username, password)) {
					myGUI.loginSuccess(strategist);				
				}
			}
		});
		
		
		// GROUP LAYOUT
		GroupLayout gl_panelLogin = new GroupLayout(panelLogin);
		gl_panelLogin.setHorizontalGroup(
			gl_panelLogin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelLogin.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panelLogin.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUsername)
						.addGroup(gl_panelLogin.createSequentialGroup()
							.addGap(2)
							.addComponent(lblPassword)))
					.addGap(10)
					.addGroup(gl_panelLogin.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtUsername)
						.addComponent(passPassword, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panelLogin.setVerticalGroup(
			gl_panelLogin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelLogin.createSequentialGroup()
					.addGroup(gl_panelLogin.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelLogin.createSequentialGroup()
							.addGap(14)
							.addComponent(lblUsername)
							.addGap(17)
							.addComponent(lblPassword))
						.addGroup(gl_panelLogin.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panelLogin.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panelLogin.createSequentialGroup()
									.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(passPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		panelLogin.setLayout(gl_panelLogin);
	}
}
