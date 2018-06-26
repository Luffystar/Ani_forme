package fr.eni.clinique.BO;

/*
 * @author CHARTIER Corentin
 */
public class Client {

    //Attributs
    private int CodeClient;
    private String NomClient;
    private String PrenomClient;
    private String Adresse1;
    private String Adresse2;
    private String CodePostal;
    private String Ville;
    private String NumTel;
    private String Assurance;
    private String Email;
    private String Remarque;
    private Boolean Archive;

    //Constructeurs
    public Client(int CodeClient, String NomClient, String PrenomClient, String Adresse1, String Adresse2, String CodePostal, String Ville, String NumTel, String Assurance, String Email, String Remarque, Boolean Archive) {
        this.CodeClient = CodeClient;
        this.NomClient = NomClient;
        this.PrenomClient = PrenomClient;
        this.Adresse1 = Adresse1;
        this.Adresse2 = Adresse2;
        this.CodePostal = CodePostal;
        this.Ville = Ville;
        this.NumTel = NumTel;
        this.Assurance = Assurance;
        this.Email = Email;
        this.Remarque = Remarque;
        this.Archive = Archive;
    }

    public Client(String NomClient, String PrenomClient, String Adresse1, String Adresse2, String CodePostal, String Ville, String NumTel, String Assurance, String Email, String Remarque, Boolean Archive) {
        this.NomClient = NomClient;
        this.PrenomClient = PrenomClient;
        this.Adresse1 = Adresse1;
        this.Adresse2 = Adresse2;
        this.CodePostal = CodePostal;
        this.Ville = Ville;
        this.NumTel = NumTel;
        this.Assurance = Assurance;
        this.Email = Email;
        this.Remarque = Remarque;
        this.Archive = Archive;
    }

    // Methode
    
    // Get
    public int getCodeClient() {
        return CodeClient;
    }

    public String getNomClient() {
        return NomClient;
    }

    public String getPrenomClient() {
        return PrenomClient;
    }

    public String getAdresse1() {
        return Adresse1;
    }

    public String getAdresse2() {
        return Adresse2;
    }

    public String getCodePostal() {
        return CodePostal;
    }

    public String getVille() {
        return Ville;
    }

    public String getNumTel() {
        return NumTel;
    }

    public String getAssurance() {
        return Assurance;
    }

    public String getEmail() {
        return Email;
    }

    public String getRemarque() {
        return Remarque;
    }

    public Boolean getArchive() {
        return Archive;
    }

    // Set
    public void setCodeClient(int CodeClient) {
        this.CodeClient = CodeClient;
    }

    public void setNomClient(String NomClient) {
        this.NomClient = NomClient;
    }

    public void setPrenomClient(String PrenomClient) {
        this.PrenomClient = PrenomClient;
    }

    public void setAdresse1(String Adresse1) {
        this.Adresse1 = Adresse1;
    }

    public void setAdresse2(String Adresse2) {
        this.Adresse2 = Adresse2;
    }

    public void setCodePostal(String CodePostal) {
        this.CodePostal = CodePostal;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public void setNumTel(String NumTel) {
        this.NumTel = NumTel;
    }

    public void setAssurance(String Assurance) {
        this.Assurance = Assurance;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setRemarque(String Remarque) {
        this.Remarque = Remarque;
    }

    public void setArchive(Boolean Archive) {
        this.Archive = Archive;
    }

}
