package firstSwingApplication;

import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class mainWindowFlowLayout extends JFrame {
	private static final long serialVersionUID = -3333346029456412223L;

	// ajouts de boutons
	private JButton btnPushButton = new JButton("push me");
	private JButton btnClickButton = new JButton("click me");
	private JButton btnClickButton2 = new JButton("cliiiiiiick me");
	
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
		
		
		//fixer taille et positionnement dans la fen�tre (ne pas faire)
		//btnPushButton.setBounds(200, 20, 160, 30);
		btnPushButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnListener(e);
			}
		});
		contentPane.add(btnPushButton);
		
		
		btnClickButton.addActionListener((event) -> System.out.println("bouton click cliqu�"));
		contentPane.add(btnClickButton);
		
		btnClickButton2.addActionListener(this::btnListener);
		contentPane.add(btnClickButton2);
		
		// ajout case � cocher
		JCheckBox chkCheckMeBox = new JCheckBox("ckeck me");
		contentPane.add(chkCheckMeBox);
		
		
		// ajout champs de saisie
		JTextField chTexteField = new JTextField("edit me:");
		// contr�ler une taille pr�f�r�e
		chTexteField.setPreferredSize(new Dimension (120, 30));
		contentPane.add(chTexteField);
		
	}
	private void btnListener (ActionEvent event) {
		btnPushButton.setText("a�e");
		System.out.println("bouton cliqu�");
	}
		
	
	public static void main(String[] args) throws Exception{
		// application d'un look
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		// d�marrage de la fen�tre
		mainWindowFlowLayout menu = new mainWindowFlowLayout();
		menu.setVisible(true);
		
		
	}

	
}
