import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class V_principale extends JFrame{
	
    private JPanel mainPanel;
    private JLabel connexionBDD;
    
    public V_principale() {
    	
    	this.setTitle("SIO +");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 500);
        
        // Instanciation des éléments
        mainPanel = new JPanel();
        
       
        // Connexion à la base de données et affichage du résultat dans un JLabel
        //connexionBDD = new JLabel(Modele.connexionBDD());
        V_connexion connexionPanel = new V_connexion();
       
        // Changement de Couleur du Fond
        mainPanel.setBackground(Color.magenta);
        
        // Ajout du JLabel à notre JPanel
        //connexionPanelmainPanel.add(connexionBDD);

        
        // Ajout du JPanel à la fenêtre principale
        getContentPane().add(mainPanel);
        
        // Affichage de la fenêtre
        this.setVisible(true);
    }

    // Méthode pour obtenir le JPanel principal
    public JPanel getMainPanel() {
        return mainPanel;
    }
}

