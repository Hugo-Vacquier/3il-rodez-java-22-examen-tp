package Vue;

import Model.Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

/**
 * Classe représentant l'interface utilisateur pour ajouter une nouvelle tâche.
 * Cette classe étend JFrame et utilise Swing pour créer une fenêtre graphique.
 */
public class TachesUi extends JFrame {

    private JTextField titreField;
    private JTextArea descriptionArea;
    private JTextField dateField;
    private JComboBox<String> prioriteComboBox;

    /**
     * Constructeur de la classe TachesUi.
     */
    public TachesUi() {
        setTitle("Ajouter une nouvelle tâche");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Création des composants de l'interface utilisateur
        JLabel titreLabel = new JLabel("Titre:");
        titreField = new JTextField(20);

        JLabel descriptionLabel = new JLabel("Description:");
        descriptionArea = new JTextArea(5, 20);
        JScrollPane descriptionScrollPane = new JScrollPane(descriptionArea);

        JLabel dateLabel = new JLabel("Date d'échéance (YYYY-MM-DD):");
        dateField = new JTextField(10);

        JLabel prioriteLabel = new JLabel("Priorité:");
        String[] priorites = {"Haute", "Moyenne", "Basse"};
        prioriteComboBox = new JComboBox<>(priorites);

        JButton ajouterButton = new JButton("Ajouter");

        // Gestionnaire de mise en page
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        panel.add(titreLabel);
        panel.add(titreField);
        panel.add(descriptionLabel);
        panel.add(descriptionScrollPane);
        panel.add(dateLabel);
        panel.add(dateField);
        panel.add(prioriteLabel);
        panel.add(prioriteComboBox);
        panel.add(new JLabel());
        panel.add(ajouterButton);

        // Ajout du gestionnaire d'événements au bouton "Ajouter"
        ajouterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Récupération des valeurs saisies
                String titre = titreField.getText();
                String description = descriptionArea.getText();
                LocalDate dateEcheance = LocalDate.parse(dateField.getText());
                String priorite = (String) prioriteComboBox.getSelectedItem();

                // Création de la tâche
                Task nouvelleTache = new Task(0, titre, description, dateEcheance, priorite);

                // Ajout de la logique pour ajouter la tâche à votre système de gestion des tâches

                // Affichage d'un message de confirmation
                JOptionPane.showMessageDialog(TachesUi.this, "Tâche ajoutée avec succès");
            }
        });

        // Ajout du panneau au contenu de la fenêtre
        add(panel);

        // Centrage de la fenêtre sur l'écran
        setLocationRelativeTo(null);

        // Affichage de la fenêtre
        setVisible(true);
    }

    /**
     * Méthode principale pour démarrer l'application.
     * Crée une instance de TachesUi pour afficher l'interface utilisateur.
     * @param args les arguments de la ligne de commande (non utilisés dans cette application)
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TachesUi();
            }
        });
    }

}
