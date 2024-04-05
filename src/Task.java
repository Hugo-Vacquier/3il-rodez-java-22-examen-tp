import java.time.LocalDate;

public class Task {
    private int id;
    private String titre;
    private String description;
    private LocalDate dateEcheance;
    private String priorite;

    // Constructeur
    public Task(int id, String titre, String description, LocalDate dateEcheance, String priorite) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.dateEcheance = dateEcheance;
        this.priorite = priorite;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(LocalDate dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public String getPriorite() {
        return priorite;
    }

    public void setPriorite(String priorite) {
        this.priorite = priorite;
    }

    


}
