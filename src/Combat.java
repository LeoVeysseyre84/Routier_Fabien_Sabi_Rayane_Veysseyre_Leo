import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Combat extends Pokemon implements Runnable {
    Element type;
    int vieAdversaire = 100;
    Pokemon pokemon;

    String nomAdversaire;

    Element attaque;

    Dracaufeu dracaufeu = new Dracaufeu("Dracaufeu", "mâle", 6, 100, Soin.BonneSanté, Pokeball.DEDANS, Attaque.AttaquePas);
    Bulbizarre bulbizarre = new Bulbizarre("Bulbizarre", "mâle", 1, 100, Soin.BonneSanté, Pokeball.DEDANS, Attaque.AttaquePas);
    Carapuce carapuce = new Carapuce("Carapuce", "femelle", 7, 100, Soin.BonneSanté, Pokeball.DEDANS, Attaque.AttaquePas);
    Magicarpe magicarpe = new Magicarpe("Bulbizarre", "mâle", 129, 100, Soin.BonneSanté, Pokeball.DEDANS, Attaque.AttaquePas);
    Mystherbe mystherbe = new Mystherbe("Mystherbe", "mâle", 43, 100, Soin.BonneSanté, Pokeball.DEDANS, Attaque.AttaquePas);

    Caninos caninos = new Caninos("Caninos", "mâle", 58, 100, Soin.BonneSanté, Pokeball.DEDANS, Attaque.AttaquePas);


//    Dracaufeu dracaufeu;

    public Combat() {
        super();
    }


    public void run() {
        int r = (int) (Math.random() * 5);
            if (r == 0) {
                System.out.println("Votre adversaire est Dracaufeu");
                nomAdversaire = dracaufeu.getNom();
                type = Element.FEU;
            }
            else if (r == 1) {
                System.out.println("Votre adversaire est Bulbizarre");
                nomAdversaire = bulbizarre.getNom();
                type = Element.PLANTE;
        }
            else if (r == 2) {
                System.out.println("Votre adversaire est Carapuce");
                nomAdversaire = carapuce.getNom();
                type = Element.EAU;
            }
            else if (r == 3) {
                System.out.println("Votre adversaire est Magicarpe");
                nomAdversaire = magicarpe.getNom();
                type = Element.EAU;
            }
            else if (r == 4) {
                System.out.println("Votre adversaire est Mystherbe");
                nomAdversaire = mystherbe.getNom();
                type = Element.PLANTE;
            }
            else if (r == 5) {
                System.out.println("Votre adversaire est Caninos");
                nomAdversaire = caninos.getNom();
                type = Element.FEU;
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
                    case "lance flammes" -> dracaufeu.LanceFlammes(vieAdversaire);
                    case "aeropique" -> dracaufeu.Aeropique(vieAdversaire);
                    default -> System.out.println("L'attaque choisit n'existe pas");
                }
            }

            else if (choixPokemon.equals("Mystherbe")) {
                System.out.println("1. Vol vie");
                System.out.println("2. Poudre toxic");

                Scanner sc2 = new Scanner(System.in);
                String attaqueChoisi = sc2.nextLine().toLowerCase();
                switch (attaqueChoisi) {
                    case "vol vie" -> {
                        mystherbe.volVie(vieAdversaire);
                    }
                    case "poudre toxic" -> {
                        mystherbe.poudreToxic(vieAdversaire);
                    }

                    default ->
                        System.out.println("L'attaque choisit n'existe pas");
                }
                if (nomAdversaire.equals("Dracaufeu")) {
                    int r2 = (int) (Math.random() * 2);
                    if (r2 == 0) {
                        System.out.println("Dracaufeu utilise Lance Flammes");
                        vie -= 30;
                    }
                    else {
                        System.out.println("Dracaufeu utilise aéropique");
                        vie -= 20;
                    }
                }
                else if (r == 1) {
                    System.out.println("Votre adversaire est Bulbizarre");
                }
                else if (r == 2) {
                    System.out.println("Votre adversaire est Carapuce");
                }
                else if (r == 3) {
                    System.out.println("Votre adversaire est Magicarpe");
                }
                else if (r == 4) {
                    System.out.println("Votre adversaire est Mystherbe");
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
            System.out.println("--------------------");
            System.out.println("Vie de votre Pokemon : " + vie);
            System.out.println("Vie du Pokemon adverse : " + vieAdversaire);
            System.out.println("--------------------");
        }
    }
}
