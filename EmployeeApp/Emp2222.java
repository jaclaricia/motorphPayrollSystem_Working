//Terminal Assessment - Final Code
//Group Members : Jon Alexander Claricia, Robert Mercado, Roberto Pablo Jr.

package EmployeeApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.junit.*;

public class Emp2222 {

	public JFrame frame;
	private JTextField txtEmpNo;
	private JTextField txtName;
	private JTextField txtDepartment;
	private JTextField txtEmail;
	private JTextField txtAddress;
	private JTextField txtContact;
	private JTextField txtBirthday;
	private JTextField txtSSS;
	private JTextField txtTIN;
	private JTextField txtPhilhealth;
	private JTextField txtPagibig;
	private JTextField txtGross;
	private JTextField txtNet;
	private JTextField txtTax;
	private JTextField txtInsurance;
	private JTextField txtBonus;
	private JTextField txtRice;
	private JTextField txtPhone;
	private JTextField txtClothing;
	private JTextField txtBasicSalary;
	private JTextField txtSick;
	private JTextField txtVacation;
	private JTextField txtEmergency;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emp2222 window = new Emp2222();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Emp2222() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	@Test // Use for JUnit Testing
	public void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int option = JOptionPane.showConfirmDialog(frame, "Proceed closing the window?", "Close Window",
						JOptionPane.YES_NO_OPTION);
				if (option == JOptionPane.YES_OPTION) {
					frame.dispose();
				} else
					frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
		});
		frame.getContentPane().setBackground(new Color(69, 69, 69));
		frame.setBounds(100, 100, 688, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(null);
		tabbedPane.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		tabbedPane.setBackground(new Color(255, 165, 89));
		tabbedPane.setForeground(new Color(69, 69, 69));
		tabbedPane.setBounds(343, 22, 319, 385);
		frame.getContentPane().add(tabbedPane);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		tabbedPane.addTab("Payroll", null, panel, null);
		panel.setLayout(null);

		JLabel lblNewLabel_11 = new JLabel("Basic Salary");
		lblNewLabel_11.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_11.setBounds(62, 26, 84, 14);
		panel.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("Allowances");
		lblNewLabel_12.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_12.setBounds(62, 51, 67, 14);
		panel.add(lblNewLabel_12);

		JLabel lblClothing = new JLabel("Clothing");
		lblClothing.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblClothing.setBounds(72, 76, 46, 14);
		panel.add(lblClothing);

		JLabel lblNewLabel_13 = new JLabel("Bonus");
		lblNewLabel_13.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_13.setBounds(62, 152, 46, 14);
		panel.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("Phone");
		lblNewLabel_14.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_14.setBounds(72, 101, 46, 14);
		panel.add(lblNewLabel_14);

		JLabel lblNewLabel_15 = new JLabel("Rice Subsidy");
		lblNewLabel_15.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_15.setBounds(72, 127, 74, 14);
		panel.add(lblNewLabel_15);

		JLabel lblNewLabel_16 = new JLabel("Deductions");
		lblNewLabel_16.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_16.setBounds(62, 177, 74, 14);
		panel.add(lblNewLabel_16);

		JLabel lblNewLabel_17 = new JLabel("Insurance");
		lblNewLabel_17.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_17.setBounds(72, 202, 74, 14);
		panel.add(lblNewLabel_17);

		JLabel lblNewLabel_18 = new JLabel("Tax");
		lblNewLabel_18.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_18.setBounds(72, 227, 46, 14);
		panel.add(lblNewLabel_18);

		JLabel lblNewLabel_19 = new JLabel("Salary (Net)");
		lblNewLabel_19.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_19.setBounds(62, 252, 67, 14);
		panel.add(lblNewLabel_19);

		JLabel lblNewLabel_20 = new JLabel("Salary (Gross)");
		lblNewLabel_20.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_20.setBounds(62, 277, 84, 14);
		panel.add(lblNewLabel_20);

		txtGross = new JTextField();
		txtGross.setEditable(false);
		txtGross.setBackground(new Color(255, 230, 199));
		txtGross.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtGross.setBounds(156, 274, 103, 20);
		panel.add(txtGross);
		txtGross.setColumns(10);

		txtNet = new JTextField();
		txtNet.setEditable(false);
		txtNet.setBackground(new Color(255, 230, 199));
		txtNet.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtNet.setColumns(10);
		txtNet.setBounds(156, 249, 103, 20);
		panel.add(txtNet);

		txtTax = new JTextField();
		txtTax.setEditable(false);
		txtTax.setBackground(new Color(255, 230, 199));
		txtTax.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtTax.setColumns(10);
		txtTax.setBounds(156, 224, 103, 20);
		panel.add(txtTax);

		txtInsurance = new JTextField();
		txtInsurance.setEditable(false);
		txtInsurance.setBackground(new Color(255, 230, 199));
		txtInsurance.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtInsurance.setColumns(10);
		txtInsurance.setBounds(156, 199, 103, 20);
		panel.add(txtInsurance);

		txtBonus = new JTextField();
		txtBonus.setEditable(false);
		txtBonus.setBackground(new Color(255, 230, 199));
		txtBonus.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtBonus.setColumns(10);
		txtBonus.setBounds(156, 149, 103, 20);
		panel.add(txtBonus);

		txtRice = new JTextField();
		txtRice.setEditable(false);
		txtRice.setBackground(new Color(255, 230, 199));
		txtRice.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtRice.setColumns(10);
		txtRice.setBounds(156, 124, 103, 20);
		panel.add(txtRice);

		txtPhone = new JTextField();
		txtPhone.setEditable(false);
		txtPhone.setBackground(new Color(255, 230, 199));
		txtPhone.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtPhone.setColumns(10);
		txtPhone.setBounds(156, 98, 103, 20);
		panel.add(txtPhone);

		txtClothing = new JTextField();
		txtClothing.setEditable(false);
		txtClothing.setBackground(new Color(255, 230, 199));
		txtClothing.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtClothing.setColumns(10);
		txtClothing.setBounds(156, 73, 103, 20);
		panel.add(txtClothing);

		txtBasicSalary = new JTextField();
		txtBasicSalary.setEditable(false);
		txtBasicSalary.setBackground(new Color(255, 230, 199));
		txtBasicSalary.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtBasicSalary.setColumns(10);
		txtBasicSalary.setBounds(156, 23, 103, 20);
		panel.add(txtBasicSalary);

		JPanel pnlLeave = new JPanel();
		pnlLeave.setBackground(SystemColor.controlHighlight);
		tabbedPane.addTab("Request Leave", null, pnlLeave, null);
		pnlLeave.setLayout(null);

		JLabel lblNewLabel_21 = new JLabel("Available Leaves");
		lblNewLabel_21.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_21.setBounds(10, 11, 99, 14);
		pnlLeave.add(lblNewLabel_21);

		JLabel lblNewLabel_22 = new JLabel("Sick Leave");
		lblNewLabel_22.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_22.setBounds(20, 36, 69, 14);
		pnlLeave.add(lblNewLabel_22);

		JLabel lblNewLabel_23 = new JLabel("Vacation Leave");
		lblNewLabel_23.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_23.setBounds(20, 61, 89, 14);
		pnlLeave.add(lblNewLabel_23);

		JLabel lblNewLabel_24 = new JLabel("Emergency Leave");
		lblNewLabel_24.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_24.setBounds(20, 82, 114, 23);
		pnlLeave.add(lblNewLabel_24);

		JComboBox<String> cmbLeave = new JComboBox<String>();
		cmbLeave.setBackground(new Color(255, 230, 199));
		cmbLeave.setBounds(10, 111, 168, 23);
		cmbLeave.addItem("....");
		cmbLeave.addItem("Sick Leave");
		cmbLeave.addItem("Vacation Leave");
		cmbLeave.addItem("Emergency Leave");
		pnlLeave.add(cmbLeave);

		txtSick = new JTextField();
		txtSick.setEditable(false);
		txtSick.setBackground(new Color(255, 230, 199));
		txtSick.setBounds(124, 33, 54, 20);
		pnlLeave.add(txtSick);
		txtSick.setColumns(10);

		txtVacation = new JTextField();
		txtVacation.setEditable(false);
		txtVacation.setBackground(new Color(255, 230, 199));
		txtVacation.setColumns(10);
		txtVacation.setBounds(124, 58, 54, 20);
		pnlLeave.add(txtVacation);

		txtEmergency = new JTextField();
		txtEmergency.setEditable(false);
		txtEmergency.setBackground(new Color(255, 230, 199));
		txtEmergency.setColumns(10);
		txtEmergency.setBounds(124, 83, 54, 20);
		pnlLeave.add(txtEmergency);

		JCalendar jcalendar = new JCalendar();
		jcalendar.getDayChooser().getDayPanel().setBackground(new Color(255, 230, 199));
		jcalendar.getMonthChooser().getSpinner().setBackground(new Color(255, 230, 199));
		jcalendar.getYearChooser().getSpinner().setBackground(new Color(255, 230, 199));
		jcalendar.getDayChooser().setSundayForeground(new Color(255, 0, 0));
		jcalendar.getDayChooser().setDecorationBackgroundColor(new Color(255, 165, 89));
		jcalendar.getYearChooser().getSpinner().setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 12));
		jcalendar.getMonthChooser().getComboBox().setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 12));
		jcalendar.setBounds(10, 145, 299, 180);
		pnlLeave.add(jcalendar);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.controlHighlight);
		panel_4.setBounds(10, 48, 323, 360);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(28, 68, 46, 14);
		panel_4.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Department");
		lblNewLabel_2.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(28, 93, 75, 14);
		panel_4.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(28, 118, 46, 14);
		panel_4.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(28, 143, 75, 14);
		panel_4.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Contact");
		lblNewLabel_5.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(28, 168, 46, 14);
		panel_4.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Birthday");
		lblNewLabel_6.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(28, 193, 75, 14);
		panel_4.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("SSS No.");
		lblNewLabel_7.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(28, 229, 46, 14);
		panel_4.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Philhealth No.");
		lblNewLabel_8.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(28, 279, 98, 14);
		panel_4.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("TIN No.");
		lblNewLabel_9.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_9.setBounds(28, 254, 46, 14);
		panel_4.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("Pagibig No.");
		lblNewLabel_10.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_10.setBounds(28, 304, 75, 17);
		panel_4.add(lblNewLabel_10);

		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtName.setBackground(new Color(255, 230, 199));
		txtName.setBounds(125, 65, 169, 20);
		panel_4.add(txtName);
		txtName.setColumns(10);

		txtDepartment = new JTextField();
		txtDepartment.setEditable(false);
		txtDepartment.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtDepartment.setBackground(new Color(255, 230, 199));
		txtDepartment.setColumns(10);
		txtDepartment.setBounds(125, 90, 169, 20);
		panel_4.add(txtDepartment);

		txtEmail = new JTextField();
		txtEmail.setEditable(false);
		txtEmail.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtEmail.setBackground(new Color(255, 230, 199));
		txtEmail.setColumns(10);
		txtEmail.setBounds(125, 115, 169, 20);
		panel_4.add(txtEmail);

		txtAddress = new JTextField();
		txtAddress.setEditable(false);
		txtAddress.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtAddress.setBackground(new Color(255, 230, 199));
		txtAddress.setColumns(10);
		txtAddress.setBounds(125, 140, 169, 20);
		panel_4.add(txtAddress);

		txtContact = new JTextField();
		txtContact.setEditable(false);
		txtContact.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtContact.setBackground(new Color(255, 230, 199));
		txtContact.setColumns(10);
		txtContact.setBounds(125, 165, 169, 20);
		panel_4.add(txtContact);

		txtBirthday = new JTextField();
		txtBirthday.setEditable(false);
		txtBirthday.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtBirthday.setBackground(new Color(255, 230, 199));
		txtBirthday.setColumns(10);
		txtBirthday.setBounds(125, 190, 169, 20);
		panel_4.add(txtBirthday);

		txtSSS = new JTextField();
		txtSSS.setEditable(false);
		txtSSS.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtSSS.setBackground(new Color(255, 230, 199));
		txtSSS.setColumns(10);
		txtSSS.setBounds(125, 226, 169, 20);
		panel_4.add(txtSSS);

		txtTIN = new JTextField();
		txtTIN.setEditable(false);
		txtTIN.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtTIN.setBackground(new Color(255, 230, 199));
		txtTIN.setColumns(10);
		txtTIN.setBounds(125, 251, 169, 20);
		panel_4.add(txtTIN);

		txtPhilhealth = new JTextField();
		txtPhilhealth.setEditable(false);
		txtPhilhealth.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtPhilhealth.setBackground(new Color(255, 230, 199));
		txtPhilhealth.setColumns(10);
		txtPhilhealth.setBounds(125, 276, 169, 20);
		panel_4.add(txtPhilhealth);

		txtPagibig = new JTextField();
		txtPagibig.setEditable(false);
		txtPagibig.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtPagibig.setBackground(new Color(255, 230, 199));
		txtPagibig.setColumns(10);
		txtPagibig.setBounds(125, 301, 169, 20);
		panel_4.add(txtPagibig);

		JLabel lblNewLabel = new JLabel("Employee No.");
		lblNewLabel.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel.setBounds(27, 30, 99, 14);
		panel_4.add(lblNewLabel);

		txtEmpNo = new JTextField();
		txtEmpNo.setEditable(false);
		txtEmpNo.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtEmpNo.setBackground(new Color(255, 230, 199));
		txtEmpNo.setBounds(125, 27, 44, 20);
		panel_4.add(txtEmpNo);
		txtEmpNo.setColumns(10);

		JLabel lblNewLabel_25 = new JLabel("Employee Information");
		lblNewLabel_25.setForeground(new Color(255, 230, 199));
		lblNewLabel_25.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 20));
		lblNewLabel_25.setBounds(11, 8, 192, 32);
		frame.getContentPane().add(lblNewLabel_25);

		// Reading CSV file for Employee 1111 information
		try {
			BufferedReader reader = new BufferedReader(new FileReader(
					"C:\\Users\\clari\\eclipse-workspace\\MotorPH_TerminalAssessment\\src\\Files\\employee2222.csv"));

			try {
				String lineInfo = reader.readLine();
				String[] dataInfo = lineInfo.split(",");

				txtEmpNo.setText(dataInfo[0]);
				txtName.setText(dataInfo[1]);
				txtDepartment.setText(dataInfo[2]);
				txtEmail.setText(dataInfo[3]);
				txtAddress.setText(dataInfo[4]);
				txtContact.setText(dataInfo[5]);
				txtBirthday.setText(dataInfo[6]);
				txtSSS.setText(dataInfo[7]);
				txtTIN.setText(dataInfo[9]);
				txtPhilhealth.setText(dataInfo[8]);
				txtPagibig.setText(dataInfo[10]);

				JButton btnNewButton = new JButton("Logout");
				btnNewButton.setBounds(214, 24, 80, 30);
				panel_4.add(btnNewButton);
				btnNewButton.setForeground(new Color(255, 255, 255));
				btnNewButton.setBackground(new Color(255, 96, 0));
				btnNewButton.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						LoginSystem login = new LoginSystem();
						frame.setVisible(false);
						login.frmDfsf.setVisible(true);
					}
				});

				reader.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {

			return;
		}

		try {
			BufferedReader reader = new BufferedReader(new FileReader(
					"C:\\Users\\clari\\eclipse-workspace\\MotorPH_TerminalAssessment\\src\\Files\\payroll2222.csv"));

			try {
				String linePay = reader.readLine();
				String[] dataPay = linePay.split(",");

				txtBasicSalary.setText(dataPay[0]);
				txtClothing.setText(dataPay[1]);
				txtPhone.setText(dataPay[2]);
				txtRice.setText(dataPay[3]);
				txtBonus.setText(dataPay[4]);
				txtInsurance.setText(dataPay[5]);
				txtTax.setText(dataPay[6]);
				txtNet.setText(dataPay[7]);
				txtGross.setText(dataPay[8]);

				JButton btnPrint = new JButton("Print");
				btnPrint.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							BufferedWriter writer = new BufferedWriter(new FileWriter(
									"C:\\Users\\clari\\eclipse-workspace\\MotorPH_TerminalAssessment\\src\\Files\\Payroll(Employee2222 Copy).txt"));
							writer.write("Employee No.: " + txtEmpNo.getText() + "\n");
							writer.write("Basic Salary: " + txtBasicSalary.getText() + "\n");
							writer.write("Clothing Allowance: " + txtClothing.getText() + "\n");
							writer.write("Phone Allowance: " + txtPhone.getText() + "\n");
							writer.write("Rice Subsidy: " + txtRice.getText() + "\n");
							writer.write("Insurance Deduction: " + txtInsurance.getText() + "\n");
							writer.write("Tax Deduction: " + txtTax.getText() + "\n");
							writer.write("Salary (Net): " + txtNet.getText() + "\n");
							writer.write("Salary (Gross): " + txtGross.getText() + "\n");
							writer.write("************************" + "\n");
							writer.close();

							JOptionPane.showMessageDialog(null, "Payroll Saved.");

						} catch (IOException e1) {

							e1.printStackTrace();
						}
					}
				});
				btnPrint.setBackground(new Color(255, 165, 89));
				btnPrint.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
				btnPrint.setBounds(120, 310, 80, 30);
				panel.add(btnPrint);
				reader.close();

			} catch (IOException e) {

				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		// Leaves

		try (BufferedReader readerLeave = new BufferedReader(new FileReader(
				"C:\\Users\\clari\\eclipse-workspace\\MotorPH_TerminalAssessment\\src\\Files\\leaves2222.csv"))) {
			try {
				String lineLeave = readerLeave.readLine();
				String[] dataLeave = lineLeave.split(",");

				txtSick.setText(dataLeave[0]);
				txtVacation.setText(dataLeave[1]);
				txtEmergency.setText(dataLeave[2]);

			} catch (IOException e1) {

				e1.printStackTrace();
			}

		} catch (FileNotFoundException e2) {

			e2.printStackTrace();
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cmbLeave.getSelectedItem().equals("Sick Leave")) {
					try (BufferedReader reader = new BufferedReader(new FileReader(
							"C:\\Users\\clari\\eclipse-workspace\\MotorPH_TerminalAssessment\\src\\Files\\leaves2222.csv"))) {
						String line = reader.readLine();
						StringBuilder leaveUpdate = new StringBuilder();

						while (line != null) {
							String[] data = line.split(",");
							int leaveCount = Integer.parseInt(data[0]);
							if (leaveCount > 0) {
								leaveCount = leaveCount - 1;
								data[0] = Integer.toString(leaveCount);

								Date selectedDate = jcalendar.getDate();
								SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
								String formattedDate = dateFormat.format(selectedDate);
								try {
									BufferedWriter writer = new BufferedWriter(new FileWriter(
											"C:\\Users\\clari\\eclipse-workspace\\MotorPH_TerminalAssessment\\src\\Files\\leaveApplication.csv",
											true));
									writer.write(txtEmpNo.getText() + "," + formattedDate + ","
											+ cmbLeave.getSelectedItem() + "\n");
									writer.close();

									JOptionPane.showMessageDialog(null, "Application Successfully Sent");

								} catch (IOException e1) {
									e1.printStackTrace();
								}

							} else {
								JOptionPane.showMessageDialog(null, "Not enough sick leave.");
							}
							leaveUpdate.append(String.join(",", data)).append("\n");
							line = reader.readLine();

							txtSick.setText(data[0]);
						}

						BufferedWriter writer = new BufferedWriter(new FileWriter(
								"C:\\Users\\clari\\eclipse-workspace\\MotorPH_TerminalAssessment\\src\\Files\\leaves2222.csv"));

						writer.write(leaveUpdate.toString());
						writer.flush();
						writer.close();

					} catch (IOException e1) {
						e1.printStackTrace();
					} catch (NumberFormatException | HeadlessException e1) {

						e1.printStackTrace();
					}
				} else if (cmbLeave.getSelectedItem().equals("Vacation Leave")) {
					try {
						BufferedReader reader = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\MotorPH_TerminalAssessment\\src\\Files\\leaves2222.csv"));
						String line = reader.readLine();
						StringBuilder leaveUpdate = new StringBuilder();

						while (line != null) {
							String[] data = line.split(",");
							int leaveCount = Integer.parseInt(data[1]);
							if (leaveCount > 0) {
								leaveCount = leaveCount - 1;
								data[1] = Integer.toString(leaveCount);

								Date selectedDate = jcalendar.getDate();
								SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
								String formattedDate = dateFormat.format(selectedDate);
								try {
									BufferedWriter writer = new BufferedWriter(new FileWriter(
											"C:\\Users\\clari\\eclipse-workspace\\MotorPH_TerminalAssessment\\src\\Files\\leaveApplication.csv",
											true));
									writer.write(txtEmpNo.getText() + "," + formattedDate + ","
											+ cmbLeave.getSelectedItem() + "\n");
									writer.close();

									JOptionPane.showMessageDialog(null, "Application Successfully Sent");

								} catch (IOException e1) {
									e1.printStackTrace();
								}

							} else {
								JOptionPane.showMessageDialog(null, "Not enough vacation leave.");
							}
							leaveUpdate.append(String.join(",", data)).append("\n");
							line = reader.readLine();

							txtVacation.setText(data[1]);
						}

						reader.close();

						BufferedWriter writer = new BufferedWriter(new FileWriter(
								"C:\\Users\\clari\\eclipse-workspace\\MotorPH_TerminalAssessment\\src\\Files\\leaves2222.csv"));
						writer.write(leaveUpdate.toString());
						writer.flush();
						writer.close();

					} catch (IOException el) {
						el.printStackTrace();
					}
				} else if (cmbLeave.getSelectedItem().equals("Emergency Leave")) {
					try {
						BufferedReader reader = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\MotorPH_TerminalAssessment\\src\\Files\\leaves2222.csv"));
						String line = reader.readLine();
						StringBuilder leaveUpdate = new StringBuilder();

						while (line != null) {
							String[] data = line.split(",");
							int leaveCount = Integer.parseInt(data[2]);
							if (leaveCount > 0) {
								leaveCount = leaveCount - 1;
								data[2] = Integer.toString(leaveCount);

								Date selectedDate = jcalendar.getDate();
								SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
								String formattedDate = dateFormat.format(selectedDate);
								try {
									BufferedWriter writer = new BufferedWriter(new FileWriter(
											"C:\\Users\\clari\\eclipse-workspace\\MotorPH_TerminalAssessment\\src\\Files\\leaveApplication.csv",
											true));
									writer.write(txtEmpNo.getText() + "," + formattedDate + ","
											+ cmbLeave.getSelectedItem() + "\n");
									writer.close();

									JOptionPane.showMessageDialog(null, "Application Successfully Sent");

								} catch (IOException e1) {
									e1.printStackTrace();
								}

							} else {
								JOptionPane.showMessageDialog(null, "Not enough emergency leave.");
							}
							leaveUpdate.append(String.join(",", data)).append("\n");
							line = reader.readLine();

							txtEmergency.setText(data[2]);
						}

						reader.close();

						BufferedWriter writer = new BufferedWriter(new FileWriter(
								"C:\\Users\\clari\\eclipse-workspace\\MotorPH_TerminalAssessment\\src\\Files\\leaves2222.csv"));
						writer.write(leaveUpdate.toString());
						writer.flush();
						writer.close();

					} catch (IOException el) {
						el.printStackTrace();
					}
				} else
					JOptionPane.showMessageDialog(null, "Please choose leave type.");
			}
		});
		btnSubmit.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		btnSubmit.setBackground(new Color(255, 165, 89));
		btnSubmit.setBounds(215, 106, 89, 30);
		pnlLeave.add(btnSubmit);
	}
}
