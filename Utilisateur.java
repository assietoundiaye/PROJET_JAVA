/*Classe Utilisateur :
 Attributs :
 String nom
 int numeroIdentification
 ArrayList<Livre> livresEmpruntes
 Méthodes :
 Constructeur pour initialiser les attributs.
 Méthode pour emprunter un livre.
 Méthode pour retourner un livre.
 Méthode pour afficher les livres empruntés par l'utilisateur.
  */


  import java.util.ArrayList;

  public class Utilisateur {

    private String nom;
    private int numeroIdentification;
    private ArrayList<Livre> livresEmpruntes; // Déclaration d'une ArrayList de type Livre

    // Constructeurs
    public Utilisateur() {
        this.nom = "";
        this.numeroIdentification = 0;
        this.livresEmpruntes = new ArrayList<>();
    }

    public Utilisateur(String nom, int numeroIdentification) {
        this.nom = nom;
        this.numeroIdentification = numeroIdentification;
        this.livresEmpruntes = new ArrayList<>();
    }

    // Méthode pour emprunter un livre
    public void emprunterLivre(Livre livre) {
        livresEmpruntes.add(livre);
        System.out.println("L'utilisateur " + nom + " a emprunté le livre \"" + livre.getTitre() + "\".");
    }

    // Méthode pour retourner un livre
    public void retournerLivre(Livre livre) {
        if (livresEmpruntes.contains(livre)) {
            livresEmpruntes.remove(livre);
            System.out.println("L'utilisateur " + nom + " a retourné le livre \"" + livre.getTitre() + "\".");
        } else {
            System.out.println("Le livre \"" + livre.getTitre() + "\" n'est pas emprunté par " + nom + ".");
        }
    }

    // Méthode pour afficher les livres empruntés par l'utilisateur
    public void afficherLivresEmpruntes() {
        if (livresEmpruntes.isEmpty()) {
            System.out.println("Aucun livre n'est actuellement emprunté par " + nom + ".");
        } else {
            System.out.println("les livres empruntés sont " + nom + " :");
            for (Livre livre : livresEmpruntes) {
                System.out.println("- " + livre.getTitre());
            }
        }
    }


    
}
