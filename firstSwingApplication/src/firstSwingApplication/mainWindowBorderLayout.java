package firstSwingApplication;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class mainWindowBorderLayout extends JFrame{
	private static final long serialVersionUID = -3333346029456412223L;


	public mainWindowBorderLayout() {
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
		//contentPane.setLayout(new BorderLayout());
		
		// ajouts de boutons
		JButton btnPushButton = new JButton("push me");
			//fixer taille et positionnement dans la fenêtre (ne pas faire)
			//btnPushButton.setBounds(200, 20, 160, 30);
		contentPane.add(btnPushButton, BorderLayout.NORTH);
		
		JButton btnClickButton = new JButton("click me");
		btnClickButton.setPreferredSize(new Dimension(200, 0));
		contentPane.add(btnClickButton, BorderLayout.WEST);
		
		// ajout case à cocher
		JCheckBox chkCheckMeBox = new JCheckBox("ckeck me");
		contentPane.add(chkCheckMeBox, BorderLayout.SOUTH);
		
		
		// ajout champs de saisie
		JTextArea chTexteField = new JTextArea("edit me:");
		// contrôler une taille préférée
		chTexteField.setPreferredSize(new Dimension (120, 30));
		contentPane.add(chTexteField);
		
	
	}
		
	
	public static void main(String[] args) throws Exception{
		// application d'un look
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		// démarrage de la fenêtre
		mainWindowBorderLayout menu = new mainWindowBorderLayout();
		menu.setVisible(true);
		
		
	}
	
}
