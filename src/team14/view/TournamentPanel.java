package team14.view;

import javax.swing.JPanel;

import team14.controller.WarForecasterDB;
import team14.model.Strategist;
import team14.model.Tournament;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



@SuppressWarnings("serial")
public class TournamentPanel extends JPanel {
	
	private GUI myGUI;
	
	private WarForecasterDB db;	

	private Tournament tournament;
	private JButton btnJoin;
	
	private Strategist strategist;
	private JTable tableTournament;
	private List<Tournament> list;
	private Object[][] data;
	private JTextField txtCurrentTourney;
	
	public TournamentPanel(GUI aGUI, Strategist aStrategist, WarForecasterDB adb) {
		strategist = aStrategist;
		db = adb;
		myGUI = aGUI;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{50, 369, 50, 0};
		gridBagLayout.rowHeights = new int[]{50, 232, 50, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		add(panel, gbc_panel);
		

		
		txtCurrentTourney = new JTextField();
		txtCurrentTourney.setEditable(false);
		txtCurrentTourney.setColumns(10);
		
		
		try {
			if (db.getCurrentTournamentID(strategist.getID()) != 0) {
				txtCurrentTourney.setText("Currently Joined: " +
						db.getTournamentName(db.getCurrentTournamentID(strategist.getID())).getName());
			} else {
				txtCurrentTourney.setText("Currently Joined: --------------- ");
			}
			
			
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		
		String[] columnNames = {"", "Name", "Deadline", "Status"};
		
		try
		{
			list = db.getTournaments();
			
			data = new Object[list.size()][columnNames.length];
			for (int i=0; i<list.size(); i++) {
				data[i][0] = list.get(i).getID();
				data[i][1] = list.get(i).getName();
				data[i][2] = list.get(i).getDeadline();
				data[i][3] = list.get(i).getStatus();
			}
			
		} catch (SQLException e)
		{
			e.printStackTrace();
		}	
		
		tableTournament = new JTable(data, columnNames);

		tableTournament.getColumnModel().getColumn(0).setMinWidth(0);
		tableTournament.getColumnModel().getColumn(0).setMaxWidth(0);
		tableTournament.getColumnModel().getColumn(1).setMinWidth(200);
		tableTournament.getColumnModel().getColumn(1).setMaxWidth(200);
		
		btnJoin = new JButton("Join");
		
		
		btnJoin.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnJoin.setEnabled(false);
		
		
		JButton btnUnJoin = new JButton("UnJoin");

		btnUnJoin.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		JScrollPane scrollPaneTournament = new JScrollPane();
		
		
		// ACTION
		tableTournament.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				btnJoin.setEnabled(true);
			}
		});
		
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame("MSG JOIN");
				try {
					
					if (db.getCurrentTournamentID(strategist.getID()) == 0) {
						db.updateTournamentStatus((int) tableTournament.getValueAt(tableTournament.getSelectedRow(), 0), 
							strategist.getID());
						JOptionPane.showMessageDialog(frame,
								"Joined Successfully",
						        "Join Success",
						        JOptionPane.INFORMATION_MESSAGE);
						txtCurrentTourney.setText("Currently Joined: " +
								db.getTournamentName(db.getCurrentTournamentID(strategist.getID())).getName());
						txtCurrentTourney.revalidate();
						txtCurrentTourney.repaint();
					} else {
						JOptionPane.showMessageDialog(frame,
								"You have are already joined another Tournament",
						        "Join Failure",
						        JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		
		btnUnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("MSG UNJOIN");
				try {
					
					if (db.getCurrentTournamentID(strategist.getID()) != 0) {
						db.updateTournamentStatus(strategist.getID());
						JOptionPane.showMessageDialog(frame,
								"Unjoined Successfully",
						        "UnJoin Success",
						        JOptionPane.INFORMATION_MESSAGE);
						txtCurrentTourney.setText("Currently Joined: --------------- ");
						txtCurrentTourney.revalidate();
						txtCurrentTourney.repaint();
					} 
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPaneTournament, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(btnJoin, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnUnJoin, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
						.addComponent(txtCurrentTourney, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtCurrentTourney, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(scrollPaneTournament, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnJoin, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
						.addComponent(btnUnJoin, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		
		scrollPaneTournament.setViewportView(tableTournament);
		panel.setLayout(gl_panel);

		
	}
}
