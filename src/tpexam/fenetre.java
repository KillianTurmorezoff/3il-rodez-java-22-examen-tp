package tpexam;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class fenetre extends JFrame {
	private JTextField titre = new JTextField("titre");
	private JTextField description = new JTextField("description");
	private JTextField date = new JTextField("date d'échéance");
	private JTextField priorite = new JTextField("priorité");
	private JButton bouton = new JButton("Ajouter");
	
	
	public fenetre(){
		JFrame mafenetre = new JFrame();
		JPanel conteneur = new JPanel();

		setTitle("gestion des taches");
		
		
		setSize(600,600);
		
        add(conteneur, BorderLayout.NORTH);
		conteneur.add(titre);
		conteneur.add(description);
		conteneur.add(date);
		conteneur.add(priorite);
		conteneur.add(bouton);
        setVisible(true);
		
	}
}
