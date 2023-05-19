//Terminal Assessment - Final Code
//Group Members : Jon Alexander Claricia, Robert Mercado, Roberto Pablo Jr.

package EmployeeApp;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.io.*;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;

import org.junit.Test;

public class LoginSystem {

	public JFrame frmDfsf;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					LoginSystem window = new LoginSystem();
					window.frmDfsf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public LoginSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	// Use for JUnit Testing
	public void initialize() {

		// Frame Compositions (Label, Button, Text Fields, etc.)

		frmDfsf = new JFrame();
		frmDfsf.setBackground(new Color(255, 255, 255));
		frmDfsf.getContentPane().setBackground(new Color(255, 165, 89));
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(
					"C:\\Users\\clari\\eclipse-workspace\\MotorPH_TerminalAssessment\\src\\Files\\loginCred.csv"));
			writer.write("admin" + "," + "admin" + "\n");
			writer.close();

		} catch (IOException e1) {
			e1.printStackTrace();
		}

		frmDfsf.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				int option = JOptionPane.showConfirmDialog(frmDfsf, "Proceed closing the window?", "Close Window",
						JOptionPane.YES_NO_OPTION);
				if (option == JOptionPane.YES_OPTION) {
					frmDfsf.dispose();
				} else
					frmDfsf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
		});
		frmDfsf.setTitle("Motor PH: Employee App - Claricia, J. A.");
		frmDfsf.setBounds(200, 200, 500, 300);
		frmDfsf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDfsf.setLocationRelativeTo(null);
		frmDfsf.getContentPane().setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setForeground(new Color(255, 230, 199));
		lblNewLabel_2.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 30));
		lblNewLabel_2.setBounds(323, 18, 98, 50);
		frmDfsf.getContentPane().add(lblNewLabel_2);

		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 12));
		txtUsername.setBounds(342, 93, 112, 20);
		frmDfsf.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);

		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(255, 87, 51));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 239, 261);
		frmDfsf.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(LoginSystem.class.getResource("/Files/MotorPH Logo (1).png")));
		lblNewLabel.setBounds(0, 0, 239, 261);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(new Color(69, 69, 69));
		lblNewLabel_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(277, 97, 63, 14);
		frmDfsf.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(new Color(69, 69, 69));
		lblNewLabel_1_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(277, 127, 63, 14);
		frmDfsf.getContentPane().add(lblNewLabel_1_1);

		// Read file from text upon click
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings({ "resource", "deprecation" })

			public void actionPerformed(ActionEvent e) {
				try {
					BufferedReader reader = new BufferedReader(new FileReader(
							"C:\\Users\\clari\\eclipse-workspace\\MotorPH_TerminalAssessment\\src\\Files\\loginCred.csv"));
					String lineAdmin = reader.readLine();
					String[] dataAdmin = lineAdmin.split(",");
					if (txtUsername.getText().equals(dataAdmin[0]) && passwordField.getText().equals(dataAdmin[1])) {
						JOptionPane.showMessageDialog(null, "Admin Access Granted.");
						InformationAdd admin = new InformationAdd();
						frmDfsf.setVisible(false);
						admin.frmMotorPhEmployee.setVisible(true);

					} else if (txtUsername.getText().equals("Employee") && passwordField.getText().equals("1111")) {
						JOptionPane.showMessageDialog(null, "Welcome Employee 1111.");
						Emp1111 emp1 = new Emp1111();
						frmDfsf.setVisible(false);
						emp1.frame.setVisible(true);

					} else if (txtUsername.getText().equals("Employee") && passwordField.getText().equals("2222")) {
						JOptionPane.showMessageDialog(null, "Welcome Employee 2222.");
						Emp2222 emp2 = new Emp2222();
						frmDfsf.setVisible(false);
						emp2.frame.setVisible(true);
					} else
						JOptionPane.showMessageDialog(null, "Account not found.");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnLogin.setBounds(366, 190, 88, 27);
		frmDfsf.getContentPane().add(btnLogin);

		btnLogin.setBounds(366, 190, 88, 27);
		frmDfsf.getContentPane().add(btnLogin);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 12));
		passwordField.setToolTipText("");
		passwordField.setBounds(342, 124, 112, 20);
		frmDfsf.getContentPane().add(passwordField);

		// Hide and unhide password toggle w/ checkbox
		JCheckBox showPass = new JCheckBox("Show");
		showPass.setForeground(new Color(69, 69, 69));
		showPass.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		showPass.setBackground(new Color(255, 165, 89));
		showPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (showPass.isSelected()) {
					passwordField.setEchoChar((char) 0);
				} else {
					passwordField.setEchoChar('•');
				}
			}
		});
		showPass.setBounds(404, 144, 63, 23);
		frmDfsf.getContentPane().add(showPass);

	}
}
