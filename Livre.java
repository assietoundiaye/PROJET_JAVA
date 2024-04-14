/*Classe Livre :
 Attributs :
 String titre
 String auteur
 int anneePublication
 String ISBN
 Méthodes :
 Constructeur pour initialiser les attributs.
Getters et setters pour accéder et modifier les attributs.
Méthode toString() pour afficher les détails du livre. */

public class Livre{
    private String titre;
    private String auteur;
    private int anneePublication;
    private String ISBN;

    //Constructeur pour initialiser les attributs.
    public Livre(){}

    public Livre(String titre, String auteur, int anneePublication, String ISBN){
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.ISBN = ISBN;
    }

    // Getters et setters
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    // methode tostring
    // le '\' est utilisé pour insérer une apostrophe simple (') dans la chaîne de caractères 

    public String toString() {
        return "Livre{" +                                   // Début de la chaîne avec le nom de la classe Livre
                "titre='" + titre + '\'' +                  // Ajout du titre du livre avec délimiteur
                ", auteur='" + auteur + '\'' +              
                ", anneePublication=" + anneePublication +  
                ", ISBN='" + ISBN + '\'' +                  
                '}';                     
    }

}