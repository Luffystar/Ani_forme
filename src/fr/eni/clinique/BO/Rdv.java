package fr.eni.clinique.BO;


public class Rdv {
    
    //Attributs
    private int CodeVeto;
    private String DateRdv;
    private int CodeAnimal;
    
    //Constructeurs
    public Rdv(int CodeVeto, String DateRdv, int CodeAnimal) {
        this.CodeVeto = CodeVeto;
        this.DateRdv = DateRdv;
        this.CodeAnimal = CodeAnimal;
    }
    
    // Methode

    // Get
    public int getCodeVeto() {
        return CodeVeto;
    }

    public String getDateRdv() {
        return DateRdv;
    }

    public int getCodeAnimal() {
        return CodeAnimal;
    }

    // Set
    public void setCodeVeto(int CodeVeto) {
        this.CodeVeto = CodeVeto;
    }

    public void setDateRdv(String DateRdv) {
        this.DateRdv = DateRdv;
    }

    public void setCodeAnimal(int CodeAnimal) {
        this.CodeAnimal = CodeAnimal;
    }

}
