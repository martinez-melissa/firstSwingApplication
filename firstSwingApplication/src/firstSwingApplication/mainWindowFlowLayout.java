package firstSwingApplication;

import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class mainWindowFlowLayout extends JFrame{
	private static final long serialVersionUID = -3333346029456412223L;


	public mainWindowFlowLayout() {
		// d�claration du titre de la fen�tre
		super("Accueil");
		
		// fermer la seule fen�tre avec fin du programme
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		// d�finition de la taille
		this.setSize(new Dimension(600, 400));
		
		// placement de la fen�tre apr�s sa d�finition de taille pour la centrer parfaitement
		this.setLocationRelativeTo(null);
		
		// cr�ation d'un panneau
		JPanel contentPane = (JPanel) this.getContentPane();
		
		// strat�gie de positionnement = en lignes (les uns � c�t� des autres) (param�tre; centr� avec espacement entre �l�m. 50px)
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		
		// ajouts de boutons
		JButton btnPushButton = new JButton("push me");
			//fixer taille et positionnement dans la fen�tre (ne pas faire)
			//btnPushButton.setBounds(200, 20, 160, 30);
		contentPane.add(btnPushButton);
		
		JButton btnClickButton = new JButton("click me");
		contentPane.add(btnClickButton);
		
		// ajout case � cocher
		JCheckBox chkCheckMeBox = new JCheckBox("ckeck me");
		contentPane.add(chkCheckMeBox);
		
		
		// ajout champs de saisie
		JTextField chTexteField = new JTextField("edit me:");
		// contr�ler une taille pr�f�r�e
		chTexteField.setPreferredSize(new Dimension (120, 30));
		contentPane.add(chTexteField);
		
	
	}
		
	
	public static void main(String[] args) throws Exception{
		// application d'un look
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		// d�marrage de la fen�tre
		mainWindowFlowLayout menu = new mainWindowFlowLayout();
		menu.setVisible(true);
		
		
	}
	
}
