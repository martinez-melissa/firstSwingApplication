package firstSwingApplication;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class catchMe extends JFrame {
	private static final long serialVersionUID = -3333346029456412223L;

	// ajouts de boutons
	private JButton btn = new JButton("attrape-moi");
	
	public catchMe() {
		// déclaration du titre de la fenêtre
		super("Accueil");
		
		// fermer la seule fenêtre avec fin du programme
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		// définition de la taille
		this.setSize(new Dimension(600, 400));
		
		// placement de la fenêtre après sa définition de taille pour la centrer parfaitement
		this.setLocationRelativeTo(null);
		
		// création d'un panneau
		JPanel contentPane = (JPanel) this.getContentPane();
		
		// stratégie de positionnement = en lignes (les uns à côté des autres) (paramètre; centré avec espacement entre élém. 50px)
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		
		
		btn.addActionListener((event) -> System.out.println("tu m'as eu"));
		btn.addMouseListener(new MouseAdapter() {		
			@Override
			public void mouseExited(MouseEvent e) {
				btn.setText("allez oust");			
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setText("quoi ?!");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btn.setText("aïe");	
			}
		});
		contentPane.add(btn);
		
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				int btnQuitter = JOptionPane.showConfirmDialog(catchMe.this, 
						"êtes-vous sûr de vouloir quitter ?", 
						"Au revoir", 
						JOptionPane.YES_NO_OPTION);
				if (btnQuitter == JOptionPane.YES_NO_OPTION) {
					dispose();
					
				}
			}
		});
	}

		



	public static void main(String[] args) throws Exception{
		// application d'un look
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		// démarrage de la fenêtre
		catchMe menu = new catchMe();
		menu.setVisible(true);
		
		
	}

	
}
