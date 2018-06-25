package fr.eni.clinique.BO;

public class Utilisateur {

    //Attributs
    private int CodePers;
    private String Nom;
    private String MotPasse;
    private String Role;
    private String Archive;

    //Constructeurs
    public Utilisateur(int CodePers, String Nom, String MotPasse, String Role, String Archive) {
        this.CodePers = CodePers;
        this.Nom = Nom;
        this.MotPasse = MotPasse;
        this.Role = Role;
        this.Archive = Archive;
    }

    // Methode
    
    // Get
    public int getCodePers() {
        return CodePers;
    }

    public String getNom() {
        return Nom;
    }

    public String getMotPasse() {
        return MotPasse;
    }

    public String getRole() {
        return Role;
    }

    public String getArchive() {
        return Archive;
    }

    // Set
    public void setCodePers(int CodePers) {
        this.CodePers = CodePers;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setMotPasse(String MotPasse) {
        this.MotPasse = MotPasse;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public void setArchive(String Archive) {
        this.Archive = Archive;
    }

}
