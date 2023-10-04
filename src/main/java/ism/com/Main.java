import java.util.Scanner;

import ism.com.Services.ArticleConfessionServiceImpl;
import ism.com.Services.CategorieServiceImpl;
import ism.com.entities.ArticleConf;
import ism.com.entities.Categorie;

public class main {
    private static Scanner scanner=new Scanner(System.in);


    public static void main(String[] args) throws Exception {

        //couplage fort
        CategorieServiceImpl categorieServiceImpl = new CategorieServiceImpl();
        ArticleConfessionServiceImpl articleConfessionServiceImpl= new ArticleConfessionServiceImpl();
        int choix;
        int choi1;
        do {
            // String pattern = "MM-dd-yyyy";

            effacer();
            System.out.println("1-Categorie Services");
            System.out.println("2-ArticleConfection Services");
            System.out.println("3-Quitter");
            System.out.print("Faites votre choix : ");
            choix=scanner.nextInt();
            scanner.nextLine();
            switch(choix){
                case 1:
                    effacer();

                    do{
                        effacer();
                        System.out.println("1-Ajouter une Categorie");
                        System.out.println("2-Lister les categorie");
                        System.out.println("3-Modifier categorie");
                        System.out.println("4-Editer categorie");
                        System.out.println("5-supprimer categorie");
                        System.out.println("6-Quitter");
                        System.out.print("Faites votre choix : ");
                        choi1=scanner.nextInt();
                        scanner.nextLine();

                        switch (choi1) {
                            case 1:
                                System.out.println("Vous allez ajouter Une categorie");
                                System.out.println("Entrer le libelle");
                                Categorie categorie= new Categorie(scanner.nextLine());
                                categorieServiceImpl.add(categorie);
                                break;

                            case 2:
                                System.out.println("Vous allez afficher les  categorie");
                                categorieServiceImpl.getAll().forEach(System.out::println);
                                pause();
                                break;
                            case 3:
                                System.out.println("Vous allez modifier Une categoerie");
                                categorieServiceImpl.getAll().forEach(System.out::println);
                                int id;

                                System.out.println("Entrer l'id du categorie a modifier");
                                id=scanner.nextInt();
                                scanner.nextLine();
                                categorie=categorieServiceImpl.get(id);
                                System.out.println("Entrer le nouveau libelle");
                                String libelle=scanner.nextLine();
                                categorie.setLibelle(libelle);
                                categorieServiceImpl.update(categorie);


                                break;
                            case 4:
                                System.out.println("Vous allez editter Une categorie");
                                categorieServiceImpl.getAll().forEach(System.out::println);

                                System.out.println("Entrer l'id du categorie a editer");
                                id=scanner.nextInt();
                                System.out.println(categorieServiceImpl.get(id));

                                pause();
                                break;

                            case 5:
                                System.out.println("Vous allez  supprimer Une categorie");
                                categorieServiceImpl.getAll().forEach(System.out::println);
                                System.out.println("Entrer l'id du categorie a supprimer");
                                id=scanner.nextInt();
                                categorieServiceImpl.remove(id-1);
                                break;

                            default:
                                break;
                        }
                    }while(choi1!=6);
                case 2:
                    effacer();

                    do{
                        effacer();
                        System.out.println("1-Ajouter Articleconf");
                        System.out.println("2-Lister lesn articles confection par ");
                        System.out.println("3-Modifier article conf");
                        System.out.println("4-Editer article conf");
                        System.out.println("5-supprimer article conf");
                        System.out.println("6-Quitter");
                        System.out.print("Faites votre choix : ");
                        choi1=scanner.nextInt();
                        scanner.nextLine();

                        switch (choi1) {
                            case 1:
                                int qte;
                                double pri;
                                System.out.println("Vous allez ajouter Un article de confection");
                                System.out.println("Entrer le libelle");
                                String libelle=scanner.nextLine();
                                System.out.println("Entrer le pri");
                                pri=scanner.nextDouble();
                                System.out.println("Entrer la quantite");
                                qte=scanner.nextInt();

                                ArticleConf article = new ArticleConf(libelle,pri,qte);
                                System.out.println("Vous allez afficher les  categorie");
                                categorieServiceImpl.getAll().forEach(System.out::println);
                                System.out.println("Entrer l'ID DE LA categorie de l'article");

                                article.setCategorie(categorieServiceImpl.get(scanner.nextInt()));
                                articleConfessionServiceImpl.add(article);
                                pause();
                                break;

                            case 2:
                                System.out.println("Vous allez afficher les  articles");
                                articleConfessionServiceImpl.getAll().forEach(System.out::println);
                                pause();
                                break;
                            case 3:
                                int id;
                                System.out.println("Vous allez modifier Un article");
                                articleConfessionServiceImpl.getAll().forEach(System.out::println);
                                System.out.println("Entrer l'id du categorie a modifier");
                                id=scanner.nextInt();
                                scanner.nextLine();
                                article=articleConfessionServiceImpl.get(id);
                                do {
                                    System.out.println("1-Modifier Libelle");
                                    System.out.println("2-Modifier Pri ");
                                    System.out.println("3-Modifier Quantite");
                                    System.out.println("3-Faites un choi");
                                    choix=scanner.nextInt();
                                    scanner.nextLine();
                                } while (choix!=3);
                                switch (choix) {
                                    case 1:
                                        System.out.println("1-Entrer le nouveau Libelle");
                                        article.setLibelle( scanner.nextLine());
                                        break;
                                    case 2:
                                        System.out.println("1-Entrer le nouveau pri");
                                        article.setPri( scanner.nextDouble());
                                        break;
                                    case 3:
                                        System.out.println("1-Entrer la nouvelle quantite");
                                        article.setQte( scanner.nextInt());
                                        break;
                                }
                                articleConfessionServiceImpl.update(article);


                                break;
                            case 4:
                                System.out.println("Vous allez editter Une categorie");
                                articleConfessionServiceImpl.getAll().forEach(System.out::println);
                                System.out.println("Entrer l'id de l'article a editer");
                                id=scanner.nextInt();
                                System.out.println(articleConfessionServiceImpl.get(id));
                                pause();
                                break;

                            case 5:
                                System.out.println("Vous allez  supprimer Une categorie");
                                categorieServiceImpl.getAll().forEach(System.out::println);
                                System.out.println("Entrer l'id de l'article a supprimer");
                                id=scanner.nextInt();
                                articleConfessionServiceImpl.remove(id-1);
                                break;

                            default:
                                break;
                        }
                    }while(choi1!=6);
            }
        } while (choix!=3);
    }
    public static void effacer(){
        // System.out.print("Everything on the console will be cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    static void pause(){
        int millis = 3000;

        try {
            Thread.sleep(millis);
        } catch (InterruptedException ie) {
            // ...
        }
    }


}