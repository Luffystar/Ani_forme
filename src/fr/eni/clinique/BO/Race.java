package fr.eni.clinique.BO;

import java.util.Objects;

/*
 * @author CHARTIER Corentin
 */
public class Race {

    //Attributs
    private String Race;
    private String Espece;

    //Constructeurs
    public Race(String Race, String Espece) {
        this.Race = Race;
        this.Espece = Espece;
    }

    // Methode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.Race);
        hash = 67 * hash + Objects.hashCode(this.Espece);
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
        final Race other = (Race) obj;
        if (!Objects.equals(this.Race, other.Race)) {
            return false;
        }
        if (!Objects.equals(this.Espece, other.Espece)) {
            return false;
        }
        return true;
    }

    // Get
    public String getRace() {
        return Race;
    }

    public String getEspece() {
        return Espece;
    }

    // Set
    public void setRace(String Race) {
        this.Race = Race;
    }

    public void setEspece(String Espece) {
        this.Espece = Espece;
    }

}
