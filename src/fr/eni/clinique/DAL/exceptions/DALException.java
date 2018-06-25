package fr.eni.clinique.DAL.exceptions;

public class DALException extends Exception {

    // Constructor
    public DALException() {
        super();
    }

    public DALException(String message) {
        super(message);
    }

    public DALException(String message, Throwable exception) {
        super(message, exception);
    }

    // Methode
    @Override
    public String getMessage() {
        StringBuilder sb = new StringBuilder("Couche DAL - ");
        sb.append(super.getMessage());

        return sb.toString();
    }

}
