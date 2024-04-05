package Model;

import java.util.List;

/**
 * Interface définissant un ensemble de méthodes communes pour la gestion des tâches.
 * Les classes concrètes implémenteront cette interface pour fournir une implémentation spécifique.
 */
public interface TaskManager {

    /**
     * Ajoute une nouvelle tâche.
     * @param tache la tâche à ajouter
     */
    void ajouterTache(Task tache);

    /**
     * Modifie une tâche existante.
     * @param tache la tâche à modifier
     */
    void modifierTache(Task tache);

    /**
     * Supprime une tâche.
     * @param tache la tâche à supprimer
     */
    void supprimerTache(Task tache);

    /**
     * Récupère la liste de toutes les tâches.
     * @return la liste de toutes les tâches
     */
    List<Task> getTaches();
}
