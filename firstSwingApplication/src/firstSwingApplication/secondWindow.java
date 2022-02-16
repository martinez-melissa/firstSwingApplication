package firstSwingApplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JToolBar;

public class secondWindow extends JFrame {
	private static final long serialVersionUID = 7260107247609860788L;
	
	private JPanel contentPane;
	private JTextField textField;
	private JRadioButton rdbtnNewRadioButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondWindow frame = new secondWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public secondWindow() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Enregistrer");
		btnNewButton_1.setBounds(175, 78, 122, 28);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(175, 31, 122, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		rdbtnNewRadioButton = new JRadioButton("oui");
		rdbtnNewRadioButton.setBounds(309, 83, 115, 18);
		contentPane.add(rdbtnNewRadioButton);
		
		JList list = new JList();
		list.setBounds(6, 35, 122, 184);
		contentPane.add(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(175, 133, 122, 26);
		contentPane.add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Favori");
		chckbxNewCheckBox.setBounds(309, 36, 104, 18);
		contentPane.add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNon = new JRadioButton("non");
		rdbtnNon.setBounds(309, 107, 115, 18);
		contentPane.add(rdbtnNon);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(6, 0, 418, 18);
		contentPane.add(toolBar);
	}
}
