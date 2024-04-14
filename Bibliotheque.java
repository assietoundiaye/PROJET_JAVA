import java.util.ArrayList;
import java.util.HashMap;

public class Bibliotheque {

    private ArrayList<Livre> listeLivres; // Liste des livres de la bibliothèque
    private HashMap<Utilisateur, ArrayList<Livre>> empruntsUtilisateurs; // HashMap pour gérer les emprunts par utilisateur

    public Bibliotheque() {
        this.listeLivres = new ArrayList<>();
        this.empruntsUtilisateurs = new HashMap<>();
    }

    // Méthode pour ajouter un livre à la bibliothèque
   
    public void ajouterLivre(Livre livre) {
        // Vérifier si le livre existe déjà dans la bibliothèque
        if (listeLivres.contains(livre)) {
            System.out.println("Le livre \"" + livre.getTitre() + "\" existe déjà dans la bibliothèque.");
            return; // Arrêter l'exécution de la méthode si le livre existe déjà
        }
    
        // Ajouter le livre à la bibliothèque
        listeLivres.add(livre);
        System.out.println("Le livre \"" + livre.getTitre() + "\" a été ajouté à la bibliothèque.");
    }
    

    // Méthode pour supprimer un livre de la bibliothèque
    public void supprimerLivre(Livre livre) {
        // Vérifier si le livre existe dans la bibliothèque
        if (!listeLivres.contains(livre)) {
            System.out.println("Le livre \"" + livre.getTitre() + "\" n'est pas présent dans la bibliothèque.");
            return; // Arrêter l'exécution de la méthode si le livre n'existe pas
        }
    
        // Supprimer le livre de la bibliothèque
        listeLivres.remove(livre);
    
        // Supprimer le livre des emprunts en cours (si applicable)
        for (ArrayList<Livre> livresEmpruntes : empruntsUtilisateurs.values()) {
            livresEmpruntes.remove(livre);
        }
    
        System.out.println("Le livre \"" + livre.getTitre() + "\" a été supprimé de la bibliothèque.");
    }
    

    // Méthode pour rechercher un livre par titre, auteur ou ISBN
    public ArrayList<Livre> rechercherLivre(String recherche) {
        // Convertir la recherche et les titres/auteurs/ISBN en minuscules pour une comparaison insensible à la casse
        recherche = recherche.toLowerCase();
        ArrayList<Livre> resultatsRecherche = new ArrayList<>();
    
        // Parcourir la liste des livres
        for (Livre livre : listeLivres) {
            String titre = livre.getTitre().toLowerCase();
            String auteur = livre.getAuteur().toLowerCase();
            String isbn = livre.getISBN();
    
            // Vérifier si la recherche correspond au titre, à l'auteur ou à l'ISBN
            if (titre.contains(recherche) || auteur.contains(recherche) || isbn.equals(recherche)) {
                resultatsRecherche.add(livre);
            }
        }
    
        // Afficher les résultats ou un message d'absence de résultats
        if (resultatsRecherche.isEmpty()) {
            System.out.println("Aucun livre trouvé correspondant à votre recherche : \"" + recherche + "\".");
        } else {
            System.out.println("Résultat de la recherche pour \"" + recherche + "\" :");
            for (Livre livre : resultatsRecherche) {
                System.out.println("- " + livre);
            }
        }
    
        // Retourner la liste des résultats de recherche
        return resultatsRecherche;
    }
    
    // Méthode pour enregistrer l'emprunt d'un livre par un utilisateur
    public void enregistrerEmprunt(Utilisateur utilisateur, Livre livre) {
        /*on a utilisé la méthode containsKey pour vérifier si la clé (utilisateur) existe dans la HashMap empruntsUtilisateurs si oui,
         * on ajoute dans le tableau le livre emprunté
        */
        if (empruntsUtilisateurs.containsKey(utilisateur)) {
            ArrayList<Livre> livresEmpruntes = empruntsUtilisateurs.get(utilisateur);
            livresEmpruntes.add(livre);
        } else {
            ArrayList<Livre> livresEmpruntes = new ArrayList<>();
            livresEmpruntes.add(livre);
            empruntsUtilisateurs.put(utilisateur, livresEmpruntes);
        }
    }

    // Méthode pour enregistrer le retour d'un livre par un utilisateur
    public void enregistrerRetour(Utilisateur utilisateur, Livre livre) {
        /*on a utilisé aussi la méthode containsKey pour vérifier si la clé (utilisateur) existe dans la HashMap empruntsUtilisateurs
        ensuite on a supprimer le livre emprunté de la liste  */
        if (empruntsUtilisateurs.containsKey(utilisateur)) {
            ArrayList<Livre> livresEmpruntes = empruntsUtilisateurs.get(utilisateur);
            livresEmpruntes.remove(livre);
        }
    }

    // Méthode pour vérifier l'éligibilité d'un utilisateur à emprunter un livre
    /* 
    public boolean verifierEligibilite(Utilisateur utilisateur) {
        // Votre logique pour vérifier l'éligibilité de l'utilisateur ici
        return true; // Exemple : toujours éligible pour simplifier
    }
    */
    // Méthode pour afficher les statistiques de la bibliothèque
    public void afficherStatistiques() {
        int totalLivres = listeLivres.size();
        int totalEmpruntes = 0;
        for (ArrayList<Livre> livresEmpruntes : empruntsUtilisateurs.values()) {
            totalEmpruntes += livresEmpruntes.size();
        }
        System.out.println("Nombre total de livres : " + totalLivres);
        System.out.println("Nombre d'exemplaires empruntés : " + totalEmpruntes);
    }
}
