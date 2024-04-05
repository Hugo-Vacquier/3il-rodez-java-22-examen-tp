import java.util.List;

public interface TaskManager {
    void ajouterTache(Task tache);
    void modifierTache(Task tache);
    void supprimerTache(Task tache);
    List<Task> getTaches();

}
