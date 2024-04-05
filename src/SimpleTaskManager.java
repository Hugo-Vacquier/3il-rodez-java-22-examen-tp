import java.util.ArrayList;
import java.util.List;

public class SimpleTaskManager implements TaskManager {
    private List<Task> tasks;

    public SimpleTaskManager() {
        this.tasks = new ArrayList<>();
    }

    @Override
    public void ajouterTache(Task tache) {
        tasks.add(tache);
    }

    @Override
    public void modifierTache(Task tache) {
        // Implémentez la logique de modification de la tâche
    }

    @Override
    public void supprimerTache(Task tache) {
        tasks.remove(tache);
    }

    @Override
    public List<Task> getTaches() {
        return tasks;
    }
}
