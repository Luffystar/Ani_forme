package fr.eni.clinique.BO;

public class Race {

    //Attributs
    private String Race;
    private String Espece;

    //Constructeurs
    public Race(String Race, String Espece) {
        this.Race = Race;
        this.Espece = Espece;
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
