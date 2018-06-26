package fr.eni.clinique.BO;

import java.util.Objects;

/*
 * @author CHARTIER Corentin
 */
public class Utilisateur {

    //Attributs
    private int CodePers;
    private String Nom;
    private String MotPasse;
    private String Role;
    private Boolean Archive;

    //Constructeurs
    public Utilisateur(String Nom, String MotPasse, String Role, Boolean Archive) {
        this.Nom = Nom;
        this.MotPasse = MotPasse;
        this.Role = Role;
        this.Archive = Archive;
    }

    public Utilisateur(int CodePers, String Nom, String MotPasse, String Role, Boolean Archive) {
        this.CodePers = CodePers;
        this.Nom = Nom;
        this.MotPasse = MotPasse;
        this.Role = Role;
        this.Archive = Archive;
    }

    // Methode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.CodePers;
        hash = 53 * hash + Objects.hashCode(this.Nom);
        hash = 53 * hash + Objects.hashCode(this.MotPasse);
        hash = 53 * hash + Objects.hashCode(this.Role);
        hash = 53 * hash + Objects.hashCode(this.Archive);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Utilisateur other = (Utilisateur) obj;
        if (this.CodePers != other.CodePers) {
            return false;
        }
        if (!Objects.equals(this.Nom, other.Nom)) {
            return false;
        }
        if (!Objects.equals(this.MotPasse, other.MotPasse)) {
            return false;
        }
        if (!Objects.equals(this.Role, other.Role)) {
            return false;
        }
        if (!Objects.equals(this.Archive, other.Archive)) {
            return false;
        }
        return true;
    }

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

    public Boolean getArchive() {
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

    public void setArchive(Boolean Archive) {
        this.Archive = Archive;
    }

}
