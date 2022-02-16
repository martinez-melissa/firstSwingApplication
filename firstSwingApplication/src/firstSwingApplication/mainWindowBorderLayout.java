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
		//contentPane.setLayout(new BorderLayout());
		
		// ajout de la barre de menu
		contentPane.add(creerToolBar(), BorderLayout.NORTH);
		
		JButton btnClickButton = new JButton("click me");
			//fixer taille et positionnement dans la fen�tre (ne pas faire)
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
		// contr�ler une taille pr�f�r�e
		chTexteField.setPreferredSize(new Dimension (120, 30));
		contentPane.add(chTexteField);
		
		
		
	}
	
	// m�thode de cr�ation de la barre de menu
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
	
	// m�thode de cr�ation de barre de statut
	private JPanel creerStatusBar() {
		
		//cr�ation de la barre de statut
		JPanel statusBar = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		//cr�ation de 2 labels
		JLabel lblStatus = new JLabel("coucou");
		lblStatus.setPreferredSize(new Dimension(100, 30));
		
		JLabel lblStatus2 = new JLabel("�a va ?");
		lblStatus2.setPreferredSize(new Dimension(100, 30));
		
		//ajout des labels dans la barre de statut
		statusBar.add(lblStatus);
		statusBar.add(lblStatus2);

		
		return statusBar;
	}
		
	
	public static void main(String[] args) throws Exception{
		// application d'un look
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		// d�marrage de la fen�tre
		mainWindowBorderLayout menu = new mainWindowBorderLayout();
		menu.setVisible(true);
		
		
	}
	
}
