package fr.eni.clinique.BLL.exceptions;

/*
 * @author CHARTIER Corentin
 */
public class BLLException extends Exception {

    // Constructor
    public BLLException() {
        super();
    }

    public BLLException(String message) {
        super(message);
    }

    public BLLException(String message, Throwable exception) {
        super(message, exception);
    }

    // Methode
    @Override
    public String getMessage() {
        StringBuilder sb = new StringBuilder("Couche BLL - ");
        sb.append(super.getMessage());

        return sb.toString();
    }

}
