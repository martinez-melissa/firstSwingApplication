package firstSwingApplication;

import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class mainWindow extends JFrame{
	private static final long serialVersionUID = -3333346029456412223L;


	public mainWindow() {
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
		// stratégie de positionnement = en lignes (les uns à côté des autres
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		// ajouts de boutons
		contentPane.add(new JButton("push me"));
		contentPane.add(new JButton("click me"));		
		// ajout case à cocher
		contentPane.add(new Checkbox("check me"));
		// ajout champs de saisie
		contentPane.add(new JTextField("edit me"));
		
	
	}
		
	
	public static void main(String[] args) throws Exception{
		// application d'un look
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		// démarrage de la fenêtre
		mainWindow menu = new mainWindow();
		menu.setVisible(true);
		
		
	}
	
}
