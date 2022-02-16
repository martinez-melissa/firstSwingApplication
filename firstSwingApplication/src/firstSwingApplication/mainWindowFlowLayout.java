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
		// déclaration du titre de la fenêtre
		super("Accueil");
		
		// fermer la seule fenêtre avec fin du programme
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		// définition de la taille
		this.setSize(new Dimension(600, 400));
		
		// placement de la fenêtre après sa définition de taille pour la centrer parfaitement
		this.setLocationRelativeTo(null);
		
		// création d'un panneau
		JPanel contentPane = (JPanel) this.getContentPane();
		
		// stratégie de positionnement = en lignes (les uns à côté des autres) (paramètre; centré avec espacement entre élém. 50px)
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		
		// ajouts de boutons
		JButton btnPushButton = new JButton("push me");
			//fixer taille et positionnement dans la fenêtre (ne pas faire)
			//btnPushButton.setBounds(200, 20, 160, 30);
		contentPane.add(btnPushButton);
		
		JButton btnClickButton = new JButton("click me");
		contentPane.add(btnClickButton);
		
		// ajout case à cocher
		JCheckBox chkCheckMeBox = new JCheckBox("ckeck me");
		contentPane.add(chkCheckMeBox);
		
		
		// ajout champs de saisie
		JTextField chTexteField = new JTextField("edit me:");
		// contrôler une taille préférée
		chTexteField.setPreferredSize(new Dimension (120, 30));
		contentPane.add(chTexteField);
		
	
	}
		
	
	public static void main(String[] args) throws Exception{
		// application d'un look
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		// démarrage de la fenêtre
		mainWindowFlowLayout menu = new mainWindowFlowLayout();
		menu.setVisible(true);
		
		
	}
	
}
