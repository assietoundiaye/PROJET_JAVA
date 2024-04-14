import java.util.Scanner;

public class InterfaceUtilisateur{
  
    private Scanner scanner;
    private Bibliotheque biblio;
    private Utilisateur user;
    // Constructeur pour initialiser les attributs
    public InterfaceUtilisateur() {
        this.biblio = new Bibliotheque();
        this.scanner = new Scanner(System.in);
        this.user = new Utilisateur();
    }

    // Méthode pour afficher le menu principal
    public void afficherMenuPrincipal() {
        int choix;
        do {
            System.out.println("\n\t\t+------------------------------------------------------------------------------------+");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|\u001b[1m\u001b[32m                  B I E N V E N U E  D A N S   L E  S Y S T È M E  D E \u001b[0m             |");
            System.out.println("\t\t|\u001b[1m\u001b[32m                      G E S T I O N  D E   B I B L I O T H È Q U E  \u001b[0m                |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t+------------------------------------------------------------------------------------+");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|\t\t\t1)   Gestion des Livres                                      |");
            System.out.println("\t\t|\t\t\t2)   Gestion des Emprunts                                    |");
            System.out.println("\t\t|\t\t\t3)   Gestion des Utilisateurs                                |");
            System.out.println("\t\t|\t\t\t4)   Quitter                                                 |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t+------------------------------------------------------------------------------------+\n");


            choix = getChoixUtilisateur(1, 4);

            switch (choix) {
                case 1:
                    
                    afficherMenuGestionLivres();
                    break;
                case 2:
                    afficherMenuGestionEmprunts();
                    break;
                case 3:
                    afficherMenuGestionUtilisateurs();
                    break;
                case 4:
                    System.out.println("Merci d'avoir utilisé notre système de gestion de bibliothèque. Au revoir !");
                    break;
            }
        } while (choix != 4);
    }

    // Méthode pour afficher le menu de gestion des livres
    public void afficherMenuGestionLivres() {
        int choix;
        do {
            System.out.println("\n\t\t+------------------------------------------------------------------------------------+");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|              \u001b[1m\u001b[32m         G E S T I O N   D E S   L I V R E S  \u001b[0m                        |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t+------------------------------------------------------------------------------------+");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|\t\t\t1)   Ajouter un livre                                        |");
            System.out.println("\t\t|\t\t\t2)   Supprimer un livre                                      |");
            System.out.println("\t\t|\t\t\t3)   Rechercher un livre                                     |");
            System.out.println("\t\t|\t\t\t4)   Retour au menu principal                                |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t+------------------------------------------------------------------------------------+\n");


            choix = getChoixUtilisateur(1, 4);

            switch (choix) {
                case 1:
                    ajouterLivreParametre();
                    break;
                case 2:
                    supprimerLivreParametre();
                    break;
                case 3:
                    rechercherLivreParametre();
                    break;
            }
        } while (choix != 4);
    }

    // Méthode pour afficher le menu de gestion des emprunts
    public void afficherMenuGestionEmprunts() {
        int choix;
        do {
            System.out.println("\n\t\t+------------------------------------------------------------------------------------+");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                    \u001b[1m\u001b[32m  G E S T I O N   D E S   E M P R U N T S  \u001b[0m                     |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t+------------------------------------------------------------------------------------+");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|\t\t\t1)   Enregistrer un emprunt                                  |");
            System.out.println("\t\t|\t\t\t2)   Enregistrer un retour                                   |");
            System.out.println("\t\t|\t\t\t3)   Statistiques                                            |");
            System.out.println("\t\t|\t\t\t4)   Vérifier l'éligibilité d'un utilisateur                 |");
            System.out.println("\t\t|\t\t\t5)   Retour au menu principal                                |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t+------------------------------------------------------------------------------------+\n");


            choix = getChoixUtilisateur(1, 5);

            switch (choix) {
                case 1:
                    enregistrerEmpruntUtilisateurParametre();
                    break;
                case 2:
                    enregistrerRetourUtilisateurParametre();
                    break;
                case 3:
                    biblio.afficherStatistiques();
                    break;
                case 4:
                    // a faire
                    break;
            }
        } while (choix != 5);
    }

    // Méthode pour afficher le menu de gestion des utilisateurs
    public void afficherMenuGestionUtilisateurs() {
        int choix;
        do {
            System.out.println("\n\t\t+------------------------------------------------------------------------------------+");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                 \u001b[1m\u001b[32m  G E S T I O N   D E S   U T I L I S A T E U R S  \u001b[0m                |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t+------------------------------------------------------------------------------------+");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|\t\t\t1)   Emprunter un livre                                      |");
            System.out.println("\t\t|\t\t\t2)   Retourner un livre                                      |");
            System.out.println("\t\t|\t\t\t3)   Afficher les livres empruntés par l'utilisateur         |");
            System.out.println("\t\t|\t\t\t4)   Retour au menu principal                                |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t|                                                                                    |");
            System.out.println("\t\t+------------------------------------------------------------------------------------+\n");


            choix = getChoixUtilisateur(1,4);

            switch (choix) {
                case 1:
                    emprunterLivreParametre();;
                    break;
                case 2:
                    retournerLivreParametre();;
                    break;
                case 3:
                    user.afficherLivresEmpruntes();
                    break;
        
            }
        } while (choix != 4);
    }

    // Méthode pour obtenir le choix de l'utilisateur en vérifiant les bornes
    private int getChoixUtilisateur(int min, int max) {
        int choix;
        System.out.println("\t\t+------------------------------------------------------------------------------------+\n");
        do {
            System.out.print("\t\t\t\tVeuillez choisir une option : ");
            choix = scanner.nextInt();
        } while (choix < min || choix > max);
        System.out.flush();
        return choix;
    }

   public void ajouterLivreParametre(){
            Livre L = new Livre();
            System.out.println("\t\t+------------------------------------------------------------------------------------+\n");
            System.out.println("\t\t|                                    Ajouter un livre                                |\n");
            System.out.println("\t\t+------------------------------------------------------------------------------------+\n");
            System.out.print("\t\t\t Titre :  ");
            String titre = scanner.next();
            System.out.print("\t\t\t Auteur : ");
            String auteur = scanner.next();
            System.out.println("\t\t\t ISBN : ");
            String ISBN = scanner.next();
            System.out.println("\t\t\t Annee de publication : ");
            int annee = scanner.nextInt();

            L.setTitre(titre);
            L.setAuteur(auteur);
            L.setISBN(ISBN);
            L.setAnneePublication(annee);
            biblio.ajouterLivre(L);
            System.out.println("\t\t+------------------------------------------------------------------------------------+\n\n\n");

   }
   public void supprimerLivreParametre(){
    Livre L = new Livre();
            System.out.println("\t\t+------------------------------------------------------------------------------------+\n");
            System.out.println("\t\t|                                  Supprimer un livre                                |\n");
            System.out.println("\t\t+------------------------------------------------------------------------------------+\n");
            System.out.print("\t\t\t Titre :  ");
            String titre = scanner.next();
            System.out.print("\t\t\t Auteur : ");
            String auteur = scanner.next();
            System.out.print("\t\t\t ISBN : ");
            String ISBN = scanner.next();
            System.out.print("\t\t\t Annee de publication : ");
            int annee = scanner.nextInt();

            L.setTitre(titre);
            L.setAuteur(auteur);
            L.setISBN(ISBN);
            L.setAnneePublication(annee);
            biblio.supprimerLivre(L);
            System.out.println("\t\t+------------------------------------------------------------------------------------+\n\n\n");

        }
    
   public void rechercherLivreParametre(){
   
            System.out.println("\t\t+------------------------------------------------------------------------------------+\n");
            System.out.println("\t\t|                                 Rechercher un livre                                |\n");
            System.out.println("\t\t+------------------------------------------------------------------------------------+\n");
            System.out.print("\t\t\t Entrez le titre, l'auteur ou l'ISBN du livre :  ");
            String critere = scanner.next();
            biblio.rechercherLivre(critere);
            System.out.println("\t\t+------------------------------------------------------------------------------------+\n\n\n");

        }
     
    public void enregistrerEmpruntUtilisateurParametre(){
        System.out.println("\t\t+------------------------------------------------------------------------------------+\n");
        System.out.println("\t\t|                         Enregistrer un emprunt                                     |\n");
        System.out.println("\t\t+------------------------------------------------------------------------------------+\n");

        System.out.print("\t\t\t Titre :  ");
        String titre = scanner.next();
        System.out.print("\t\t\t Auteur : ");
        String auteur = scanner.next();
        System.out.print("\t\t\t ISBN : ");
        String ISBN = scanner.next();
        System.out.print("\t\t\t Annee de publication : ");
        int annee = scanner.nextInt();

        Livre livre = new Livre();
        livre.setTitre(titre);
        livre.setAuteur(auteur);
        livre.setISBN(ISBN);
        livre.setAnneePublication(annee);

        System.out.println("Entrez le nom de l'utilisateur : ");
            String nomUtilisateur = scanner.next();

        System.out.println("Entrez le numéro d'identification de l'utilisateur : ");
            int numeroIdentification = scanner.nextInt();

// Créez une instance de l'utilisateur avec les informations fournies par l'utilisateur
        Utilisateur utilisateur = new Utilisateur(nomUtilisateur, numeroIdentification);
        biblio.enregistrerEmprunt(utilisateur, livre);
        System.out.println("\t\t+------------------------------------------------------------------------------------+\n\n\n");
        System.out.println("\t\t|                          Enregistrement  fait avec succes !                        |\n\n\n");
        System.out.println("\t\t+------------------------------------------------------------------------------------+\n\n\n");

    }
        public void enregistrerRetourUtilisateurParametre(){
            System.out.println("\t\t+------------------------------------------------------------------------------------+\n");
            System.out.println("\t\t|                       Enregistrer le retour d'un emprunt                           |\n");
            System.out.println("\t\t+------------------------------------------------------------------------------------+\n");
    
            System.out.print("\t\t\t Titre :  ");
            String titre = scanner.next();
            System.out.print("\t\t\t Auteur : ");
            String auteur = scanner.next();
            System.out.print("\t\t\t ISBN : ");
            String ISBN = scanner.next();
            System.out.print("\t\t\t Annee de publication : ");
            int annee = scanner.nextInt();
    
            Livre livre = new Livre();
            livre.setTitre(titre);
            livre.setAuteur(auteur);
            livre.setISBN(ISBN);
            livre.setAnneePublication(annee);
    
            System.out.println("Entrez le nom de l'utilisateur : ");
                String nomUtilisateur = scanner.next();
    
            System.out.println("Entrez le numéro d'identification de l'utilisateur : ");
                int numeroIdentification = scanner.nextInt();
    
    // Créez une instance de l'utilisateur avec les informations fournies par l'utilisateur
            Utilisateur utilisateur = new Utilisateur(nomUtilisateur, numeroIdentification);
            biblio.enregistrerRetour(utilisateur, livre);
            System.out.println("\t\t+------------------------------------------------------------------------------------+\n\n\n");
            System.out.println("\t\t|                           Retour  fait avec succes !                               |\n\n\n");
            System.out.println("\t\t+------------------------------------------------------------------------------------+\n\n\n");
            

            }
   
    public void emprunterLivreParametre(){
        Livre L = new Livre();
        System.out.println("\t\t+------------------------------------------------------------------------------------+\n");
        System.out.println("\t\t|                                  Emprunter un livre                                |\n");
        System.out.println("\t\t+------------------------------------------------------------------------------------+\n");
        System.out.print("\t\t\t Titre :  ");
        String titre = scanner.next();
        System.out.print("\t\t\t Auteur : ");
        String auteur = scanner.next();
        System.out.print("\t\t\t ISBN : ");
        String ISBN = scanner.next();
        System.out.print("\t\t\t Annee de publication : ");
        int annee = scanner.nextInt();

        L.setTitre(titre);
        L.setAuteur(auteur);
        L.setISBN(ISBN);
        L.setAnneePublication(annee);
        user.emprunterLivre(L);
        System.out.println("\t\t+------------------------------------------------------------------------------------+\n\n\n");


    }

    public void retournerLivreParametre(){
        Livre L = new Livre();
        System.out.println("\t\t+------------------------------------------------------------------------------------+\n");
        System.out.println("\t\t|                                  Retouner un livre                                 |\n");
        System.out.println("\t\t+------------------------------------------------------------------------------------+\n");
        System.out.print("\t\t\t Titre :  ");
        String titre = scanner.next();
        System.out.print("\t\t\t Auteur : ");
        String auteur = scanner.next();
        System.out.print("\t\t\t ISBN : ");
        String ISBN = scanner.next();
        System.out.print("\t\t\t Annee de publication : ");
        int annee = scanner.nextInt();

        L.setTitre(titre);
        L.setAuteur(auteur);
        L.setISBN(ISBN);
        L.setAnneePublication(annee);
        user.retournerLivre(L);
        System.out.println("\t\t+------------------------------------------------------------------------------------+\n\n\n");


    }
}