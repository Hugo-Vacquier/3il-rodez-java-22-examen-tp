package Controller;

import Model.Task;
import Model.TaskManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe implémentant l'interface TaskManager pour fournir une gestion simple des tâches.
 * Cette implémentation utilise une liste pour stocker les tâches.
 */
public class SimpleTaskManager implements TaskManager {
    private List<Task> tasks;

    /**
     * Constructeur de la classe SimpleTaskManager.
     * Initialise la liste de tâches.
     */
    public SimpleTaskManager() {
        this.tasks = new ArrayList<>();
    }

    /**
     * Ajoute une nouvelle tâche à la liste.
     * @param tache la tâche à ajouter
     */
    @Override
    public void ajouterTache(Task tache) {
        tasks.add(tache);
    }

    /**
     * Modifie une tâche existante.
     * @param tache la tâche à modifier
     *              (non implémenté dans cette version)
     */
    @Override
    public void modifierTache(Task tache) {
        // Implémentez la logique de modification de la tâche
    }

    /**
     * Supprime une tâche de la liste.
     * @param tache la tâche à supprimer
     */
    @Override
    public void supprimerTache(Task tache) {
        tasks.remove(tache);
    }

    /**
     * Récupère la liste de toutes les tâches.
     * @return la liste de toutes les tâches
     */
    @Override
    public List<Task> getTaches() {
        return tasks;
    }
}
