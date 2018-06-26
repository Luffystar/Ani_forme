package fr.eni.clinique.BO;

import java.util.Objects;

/*
 * @author CHARTIER Corentin
 */
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
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.CodeVeto;
        hash = 97 * hash + Objects.hashCode(this.DateRdv);
        hash = 97 * hash + this.CodeAnimal;
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
        final Rdv other = (Rdv) obj;
        if (this.CodeVeto != other.CodeVeto) {
            return false;
        }
        if (this.CodeAnimal != other.CodeAnimal) {
            return false;
        }
        if (!Objects.equals(this.DateRdv, other.DateRdv)) {
            return false;
        }
        return true;
    }

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
