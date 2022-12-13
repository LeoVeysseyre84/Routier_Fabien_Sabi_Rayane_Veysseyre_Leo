import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Combat extends Pokemon implements Runnable {
    String type;
    int vieAdversaire = 100;

    public Combat() {
        super();
    }


    public void run() {
        int r = (int) (Math.random() * 4);
            if (r == 0) {
                System.out.println("Votre adversaire est Dracaufeu");
                type = "feu";
            }
            else if (r == 1) {
                System.out.println("Votre adversaire est Bulbizarre");
                type = "plante";
        }
            else if (r == 2) {
                System.out.println("Votre adversaire est Carapuce");
                type = "eau";
            }
            else if (r == 3) {
                System.out.println("Votre adversaire est Magicarpe");
                type = "eau";
            }
            else if (r == 4) {
                System.out.println("Votre adversaire est Mystherbe");
                type = "plante";
            }

        System.out.println("Veuillez choisir un Pokemon :");
        Scanner sc1 = new Scanner(System.in);
        String choixPokemon = sc1.nextLine();

        Soin etatDuPokemon = Soin.BonneSanté;
        Soin etatDuPokemonAdverse = Soin.BonneSanté;
        while (etatDuPokemon != Soin.Mort && etatDuPokemonAdverse != Soin.Mort) {
            System.out.println("Quel attaque voulez-vous utiliser ?");
            if (choixPokemon.equals("Dracaufeu")) {
                System.out.println("1. Lance flammes");
                System.out.println("2. Aeropique");

                Scanner sc2 = new Scanner(System.in);
                String attaqueChoisi = sc2.nextLine().toLowerCase();
                switch (attaqueChoisi) {
                    case "lance flammes" -> vieAdversaire -= 30;
                    case "aeropique" -> vieAdversaire -= 20;
                    default -> System.out.println("L'attaque choisit n'existe pas");
                }
            }

            else if (choixPokemon.equals("Mystherbe")) {
                System.out.println("1. Vol vie");
                System.out.println("2. Poudre toxic");

                Scanner sc2 = new Scanner(System.in);
                String attaqueChoisi = sc2.nextLine().toLowerCase();
                switch (attaqueChoisi) {
                    case "vol vie" -> vieAdversaire -= 10;
                    case "poudre toxic" -> System.out.println("Good good");
                    default -> System.out.println("L'attaque choisit n'existe pas");
                }
            }

            else if (choixPokemon.equals("Bulbizarre")) {
                System.out.println("1. Fouet lianes");
                System.out.println("2. Synthèse");

                Scanner sc2 = new Scanner(System.in);
                String attaqueChoisi = sc2.nextLine().toLowerCase();
                switch (attaqueChoisi) {
                    case "fouet lianes" -> vieAdversaire -= 20 ;
                    case "synthèse" -> vie += 20;
                    default -> System.out.println("L'attaque choisit n'existe pas");
                }
            }

            else if (choixPokemon.equals("Magicarpe")) {
                System.out.println("1. Trempette");
                System.out.println("2. Charge");

                Scanner sc2 = new Scanner(System.in);
                String attaqueChoisi = sc2.nextLine().toLowerCase();
                switch (attaqueChoisi) {
                    case "trempette" -> vieAdversaire += 0;
                    case "charge" -> vieAdversaire += 20;
                    default -> System.out.println("L'attaque choisit n'existe pas");
                }
            }

            else if (choixPokemon.equals("Caninos")) {
            System.out.println("1. Flammèche");
            System.out.println("2. Feu follet");

                Scanner sc2 = new Scanner(System.in);
                String attaqueChoisi = sc2.nextLine().toLowerCase();
                switch (attaqueChoisi) {
                    case "flammèche" -> vieAdversaire -= 20;
                    case "feu follet" -> vieAdversaire -= 5;
                    default -> System.out.println("L'attaque choisit n'existe pas");
                }
        }

            if (vieAdversaire <= 0){
                vieAdversaire = 0;
                etatDuPokemonAdverse = Soin.Mort;
            }
            if (vie <= 0){
                vie = 0;
                etatDuPokemon = Soin.Mort;
            }

            if (etatDuPokemon == Soin.Mort) {
                System.out.println("Tu es mort...");
                break;
            }
            if (etatDuPokemonAdverse == Soin.Mort) {
                System.out.println("Bien joué, le pokémon adverse est KO");
                break;
            }
            System.out.println("Vie de l'adversaire : " + vieAdversaire);
        }

        /* if (str1.equals("Dracaufeu") && type == "eau") {
            System.out.println("Vous avez perdu");
        }
        else if (str1.equals("Dracaufeu") && type == "plante") {
            System.out.println("Vous avez gagné");
        }
        else if (str1.equals("Dracaufeu") && type == "feu") {
            System.out.println("Egalité");
        }
        else if (str1.equals("Mystherbe") || str1.equals("Bulbizarre") && type == "feu") {
            System.out.println("Vous avez perdu");
        }
        else if (str1.equals("Mystherbe") || str1.equals("Bulbizarre") && type == "eau") {
            System.out.println("Vous avez gagné");
        }
        else if (str1.equals("Mystherbe") || str1.equals("Bulbizarre") && type == "plante") {
            System.out.println("Egalité");
        }
        else if (str1.equals("Carapuce") || str1.equals("Magicarpe") && type == "plante") {
            System.out.println("Vous avez perdu");
        }
        else if (str1.equals("Carapuce") || str1.equals("Magicarpe") && type == "eau") {
            System.out.println("Egalité");
        }
        else if (str1.equals("Carapuce") || str1.equals("Magicarpe") && type == "feu") {
            System.out.println("Vous avez gagné");
        }*/
    }
}
