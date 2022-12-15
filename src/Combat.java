import java.sql.SQLOutput;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Combat extends Pokemon implements Runnable {
    Element type;
    Element typeAdverse2;
    Pokemon pokemon;
    String nomAdversaire;

    Pokemon pokemonAdverse;

    Element attaque;

    Dracaufeu dracaufeu = new Dracaufeu("Dracaufeu", "mâle", 6, 100, 100, Soin.BonneSanté, Pokeball.DEDANS, Attaque.AttaquePas, Element.FEU);
    Bulbizarre bulbizarre = new Bulbizarre("Bulbizarre", "mâle", 1, 100, 100, Soin.BonneSanté, Pokeball.DEDANS, Attaque.AttaquePas, Element.PLANTE);
    Carapuce carapuce = new Carapuce("Carapuce", "femelle", 7, 100, 100, Soin.BonneSanté, Pokeball.DEDANS, Attaque.AttaquePas, Element.EAU);
    Magicarpe magicarpe = new Magicarpe("Magicarpe", "mâle", 129, 100, 100, Soin.BonneSanté, Pokeball.DEDANS, Attaque.AttaquePas, Element.EAU);
    Mystherbe mystherbe = new Mystherbe("Mystherbe", "mâle", 43, 100, 100, Soin.BonneSanté, Pokeball.DEDANS, Attaque.AttaquePas, Element.PLANTE);
    Caninos caninos = new Caninos("Caninos", "mâle", 58, 100, 100, Soin.BonneSanté, Pokeball.DEDANS, Attaque.AttaquePas, Element.FEU);

    int r = (int) (Math.random() * 5);

//    Dracaufeu dracaufeu;

    public Combat() {
        super();
    }

    public void attaquesAdverses(){
        if (r == 0) {
            int r2 = (int) (Math.random() * 2);
            if (r2 == 0) {
                Degats degats = dracaufeu.lanceFlammesAdverse(pokemon.type);
                pokemon.subirDegats(degats);
            }
            else {
                Degats degats = dracaufeu.aeropiqueAdverse(pokemon.type);
                pokemon.subirDegats(degats);
            }
        }
        if (r == 1) {
            int r2 = (int) (Math.random() * 2);
            if (r2 == 0) {
                bulbizarre.fouetLianesAdverse(pokemon.type);
                vie = bulbizarre.vie;
            }
            else {
                bulbizarre.syntheseAdverse();
                vie = bulbizarre.vie;
            }
        }
        if (r == 2) {
            int r2 = (int) (Math.random() * 2);
            if (r2 == 0) {
                carapuce.pistoletAOAdverse(pokemon.type);
                vie = carapuce.vie;
            }
            else {
                carapuce.laserGlaceAdverse(pokemon.type);
                vie = carapuce.vie;
            }
        }
        if (r == 3) {
            int r2 = (int) (Math.random() * 2);
            if (r2 == 0) {
                magicarpe.trempetteAdverse();
                vie = magicarpe.vie;
            }
            else {
                magicarpe.chargeAdverse();
                vie = magicarpe.vie;
            }
        }
        if (r == 4) {
            int r2 = (int) (Math.random() * 2);
            if (r2 == 0) {
                Degats degats = mystherbe.volVieAdverse(pokemon.type);
                pokemon.subirDegats(degats);
                vie = mystherbe.vie;
            }
            else {
                Degats degats = mystherbe.chocVeninAdverse(pokemon.type);
                pokemon.subirDegats(degats);
                vie = mystherbe.vie;
            }
        }
        if (r == 5) {
            int r2 = (int) (Math.random() * 2);
            if (r2 == 0) {
                caninos.flammecheAdverse(pokemon.type);
                vie = caninos.vie;
            }
            else {
                caninos.morsureAdverse();
                vie = caninos.vie;
            }
        }
    }

    public void run() {
        if (r == 0) {
            pokemonAdverse = dracaufeu;
            System.out.println("Votre adversaire est Dracaufeu");
            nomAdversaire = dracaufeu.getNom();
        } else if (r == 1) {
            pokemonAdverse = bulbizarre;
            System.out.println("Votre adversaire est Bulbizarre");
            nomAdversaire = bulbizarre.getNom();
        } else if (r == 2) {
            pokemonAdverse = carapuce;
            System.out.println("Votre adversaire est Carapuce");
            nomAdversaire = carapuce.getNom();
        } else if (r == 3) {
            pokemonAdverse = magicarpe;
            System.out.println("Votre adversaire est Magicarpe");
            nomAdversaire = magicarpe.getNom();
        } else if (r == 4) {
            pokemonAdverse = mystherbe;
            System.out.println("Votre adversaire est Mystherbe");
            nomAdversaire = mystherbe.getNom();
        } else if (r == 5) {
            pokemonAdverse = caninos;
            System.out.println("Votre adversaire est Caninos");
            nomAdversaire = caninos.getNom();
        }
        System.out.println("Veuillez choisir un Pokemon :");
        Scanner sc1 = new Scanner(System.in);
        String choixPokemon = sc1.nextLine();

        Soin etatDuPokemon = Soin.BonneSanté;
        Soin etatDuPokemonAdverse = Soin.BonneSanté;
        while (etatDuPokemon != Soin.Mort && etatDuPokemonAdverse != Soin.Mort) {
            System.out.println("Quel attaque voulez-vous utiliser ?");
            if (choixPokemon.equals("Dracaufeu")) {
                pokemon = dracaufeu;
                System.out.println("1. Lance flammes");
                System.out.println("2. Aeropique");

                Scanner sc2 = new Scanner(System.in);
                String attaqueChoisi = sc2.nextLine().toLowerCase();
                switch (attaqueChoisi) {
                    case "lance flammes" -> {
                        Degats degats = dracaufeu.lanceFlammes(pokemon.type);
                        pokemonAdverse.subirDegats(degats);
                    }
                    case "aeropique" -> {
                        Degats degats = dracaufeu.aeropique(pokemon.type);
                        pokemonAdverse.subirDegats(degats);
                    }
                    default -> System.out.println("L'attaque choisit n'existe pas");
                }
                attaquesAdverses();
            } else if (choixPokemon.equals("Mystherbe")) {
                pokemon = mystherbe;
                System.out.println("1. Vol vie");
                System.out.println("2. Choc venin");

                Scanner sc2 = new Scanner(System.in);
                String attaqueChoisi = sc2.nextLine().toLowerCase();
                switch (attaqueChoisi) {
                    case "vol vie" -> {
                        Degats degats = mystherbe.volVie(pokemonAdverse.type);
                        pokemon.subirDegats(degats);
                        vieAdversaire = mystherbe.vieAdversaire;
                    }
                    case "choc venin" -> {
                        Degats degats = mystherbe.chocVenin(pokemonAdverse.type);
                        pokemon.subirDegats(degats);
                        vieAdversaire = mystherbe.vieAdversaire;
                    }

                    default -> System.out.println("L'attaque choisit n'existe pas");
                }
                attaquesAdverses();
            }
            else if (choixPokemon.equals("Caninos")) {
                pokemon = caninos;
                System.out.println("1. Flammèche");
                System.out.println("2. Morsure");

                Scanner sc2 = new Scanner(System.in);
                String attaqueChoisi = sc2.nextLine().toLowerCase();
                switch (attaqueChoisi) {
                    case "flammèche" -> {
                        caninos.flammeche(pokemonAdverse.type);
                        vieAdversaire = caninos.vieAdversaire;
                    }
                    case "morsure" -> {
                        caninos.morsure();
                        vieAdversaire = caninos.vieAdversaire;
                    }

                    default -> System.out.println("L'attaque choisit n'existe pas");
                }
                attaquesAdverses();
            } else if (choixPokemon.equals("Bulbizarre")) {
                pokemon = bulbizarre;
                System.out.println("1. Fouet lianes");
                System.out.println("2. Synthèse");

                Scanner sc2 = new Scanner(System.in);
                String attaqueChoisi = sc2.nextLine().toLowerCase();
                switch (attaqueChoisi) {
                    case "fouet lianes" -> {
                        bulbizarre.fouetLianes(pokemonAdverse.type);
                        vieAdversaire = bulbizarre.vieAdversaire;
                    }
                    case "synthèse" -> {
                        bulbizarre.synthese();
                        vieAdversaire = bulbizarre.vieAdversaire;
                    }

                    default -> System.out.println("L'attaque choisit n'existe pas");
                }
                attaquesAdverses();
            } else if (choixPokemon.equals("Carapuce")) {
                pokemon = carapuce;
                System.out.println("1. Pistolet à O");
                System.out.println("2. Laser glace");

                Scanner sc2 = new Scanner(System.in);
                String attaqueChoisi = sc2.nextLine().toLowerCase();
                switch (attaqueChoisi) {
                    case "pistolet à o" -> {
                        carapuce.pistoletAO(pokemonAdverse.type);
                        vieAdversaire = carapuce.vieAdversaire;
                    }
                    case "laser glace" -> {
                        carapuce.laserGlace(pokemonAdverse.type);
                        vieAdversaire = carapuce.vieAdversaire;
                    }

                    default -> System.out.println("L'attaque choisit n'existe pas");
                }
                attaquesAdverses();
            }
            else if (choixPokemon.equals("Magicarpe")) {
                pokemon = magicarpe;
                System.out.println("1. Trempette");
                System.out.println("2. Charge");

                Scanner sc2 = new Scanner(System.in);
                String attaqueChoisi = sc2.nextLine().toLowerCase();
                switch (attaqueChoisi) {
                    case "trempette" -> {
                        magicarpe.trempette();
                        vieAdversaire = magicarpe.vieAdversaire;
                    }
                    case "charge" -> {
                        magicarpe.charge();
                        vieAdversaire = magicarpe.vieAdversaire;
                    }

                    default -> System.out.println("L'attaque choisit n'existe pas");
                }
                attaquesAdverses();
            }


            if (vieAdversaire <= 0) {
                vieAdversaire = 0;
                etatDuPokemonAdverse = Soin.Mort;
            }
            if (vie <= 0) {
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
            System.out.println("Vie du Pokemon adverse : " + pokemonAdverse.vie);
            System.out.println("--------------------");
        }
    }

    @Override
    public List<Element> faiblesse() {
        return null;
    }

    @Override
    public List<Element> resistance() {
        return null;
    }
}