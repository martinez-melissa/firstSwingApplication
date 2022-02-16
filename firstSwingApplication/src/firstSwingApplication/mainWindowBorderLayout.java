package firstSwingApplication;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTree;
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
		
		// ajout de la barre de menu
		contentPane.add(creerToolBar(), BorderLayout.NORTH);
		
		JButton btnClickButton = new JButton("click me");
			//fixer taille et positionnement dans la fenêtre (ne pas faire)
			//btnClickButton.setBounds(200, 20, 160, 30);
		btnClickButton.setPreferredSize(new Dimension(200, 0));
		contentPane.add(btnClickButton, BorderLayout.EAST);
		
		// ajout d'une zone arborescence
		JScrollPane scrollPane = new JScrollPane(new JTree());
		scrollPane.setPreferredSize(new Dimension(150, 0));
		contentPane.add(scrollPane, BorderLayout.WEST);
		
		
		
		// ajout barre de statue
		contentPane.add(creerStatusBar(), BorderLayout.SOUTH);
		
		
		// ajout champs de saisie
		JTextArea chTexteField = new JTextArea("edit me:");
		// contrôler une taille préférée
		chTexteField.setPreferredSize(new Dimension (120, 30));
		contentPane.add(chTexteField);
		
		
		
	}
	
	// méthode de création de la barre de menu
	private JToolBar creerToolBar() {
		JToolBar toolBar = new JToolBar();
		
		JButton btnClickButton = new JButton("click me");
		toolBar.add(btnClickButton);
		
		JCheckBox chkCheckMeBox = new JCheckBox("ckeck me");
		toolBar.add(chkCheckMeBox);
		
		JTextField chTexteField = new JTextField("edit me:");
		toolBar.add(chTexteField);
		
		return toolBar;
	}
	
	// méthode de création de barre de statut
	private JPanel creerStatusBar() {
		
		//création de la barre de statut
		JPanel statusBar = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		//création de 2 labels
		JLabel lblStatus = new JLabel("coucou");
		lblStatus.setPreferredSize(new Dimension(100, 30));
		
		JLabel lblStatus2 = new JLabel("ça va ?");
		lblStatus2.setPreferredSize(new Dimension(100, 30));
		
		//ajout des labels dans la barre de statut
		statusBar.add(lblStatus);
		statusBar.add(lblStatus2);

		
		return statusBar;
	}
		
	
	public static void main(String[] args) throws Exception{
		// application d'un look
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		// démarrage de la fenêtre
		mainWindowBorderLayout menu = new mainWindowBorderLayout();
		menu.setVisible(true);
		
		
	}
	
}
