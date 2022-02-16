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
		// strat�gie de positionnement = en lignes (les uns � c�t� des autres
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		// ajouts de boutons
		contentPane.add(new JButton("push me"));
		contentPane.add(new JButton("click me"));		
		// ajout case � cocher
		contentPane.add(new Checkbox("check me"));
		// ajout champs de saisie
		contentPane.add(new JTextField("edit me"));
		
	
	}
		
	
	public static void main(String[] args) throws Exception{
		// application d'un look
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		// d�marrage de la fen�tre
		mainWindow menu = new mainWindow();
		menu.setVisible(true);
		
		
	}
	
}
