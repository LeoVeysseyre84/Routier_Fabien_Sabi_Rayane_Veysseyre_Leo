import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Classe permettant de simuler un combat entre un pokemon et un pokemon adverse.
 */
/**
 * Classe qui gère les combats entre deux pokemons.
 *
 * @extends Pokemon
 * @implements Runnable
 */
public class Combat extends Pokemon implements Runnable {

    // Attributs de la classe
    private Pokemon pokemon;
    private Pokemon pokemonAdverse;
    private int choixPokemonAdverse = (int) (Math.random() * 9);

    // Instanciations des différents pokemons
    Dracaufeu dracaufeu = new Dracaufeu("Dracaufeu", "mâle", 6, 100, 100, Soin.BonneSanté, Element.FEU);
    Bulbizarre bulbizarre = new Bulbizarre("Bulbizarre", "mâle", 1, 100, 100, Soin.BonneSanté, Element.PLANTE);
    Carapuce carapuce = new Carapuce("Carapuce", "femelle", 7, 100, 100, Soin.BonneSanté, Element.EAU);
    Magicarpe magicarpe = new Magicarpe("Magicarpe", "mâle", 129, 100, 100, Soin.BonneSanté, Element.EAU);
    Mystherbe mystherbe = new Mystherbe("Mystherbe", "mâle", 43, 100, 100, Soin.BonneSanté, Element.PLANTE);
    Caninos caninos = new Caninos("Caninos", "mâle", 58, 100, 100, Soin.BonneSanté, Element.FEU);
    Roucool roucool = new Roucool("Roucool","mâle",16, 100, 100, Soin.BonneSanté, Element.VOL);
    Pikachu pikachu = new Pikachu("Pikachu","mâle",25, 100, 100, Soin.BonneSanté, Element.ELECTRIK);
    Racaillou racaillou = new Racaillou("Racaillou","mâle",74, 100, 100, Soin.BonneSanté, Element.SOL);
    Mewtwo mewtwo = new Mewtwo("Mewtwo", "neutre", 150, 100, 100, Soin.BonneSanté, Element.PSY);

    // Méthodes de la classe
    /**
     * Constructeur par défaut de la classe.
     */
    public Combat() {
        super();
    }

    /**
     * Génère aléatoirement une attaque effectuée par un Pokémon adverse.
     * Cette attaque est ensuite lancée contre le Pokémon actuel.
     */
    public void attaquesAdverses() {
        // Génère aléatoirement le choix du Pokémon adverse
        int choixPokemonAdverse = (int) (Math.random() * 9);

        // En fonction du Pokémon adverse choisi, génère aléatoirement une attaque
        // et lance cette attaque contre le Pokémon actuel
        if (choixPokemonAdverse == 0) {
            int choixAttaqueAdverse = (int) (Math.random() * 2);
            if (choixAttaqueAdverse == 0) {
                Degats degats = dracaufeu.lanceFlammes();
                pokemon.subirDegats(degats);
            }
            else {
                Degats degats = dracaufeu.aeropique();
                pokemon.subirDegats(degats);
            }
        }
        // ...

        // Pour les autres choix de Pokémon adverse, effectue la même logique
        if (choixPokemonAdverse == 1) {
            int choixAttaqueAdverse = (int) (Math.random() * 2);
            if (choixAttaqueAdverse == 0) {
                Degats degats = dracaufeu.lanceFlammes();
                pokemon.subirDegats(degats);
            }
            else {
                bulbizarre.synthese();
                vie = bulbizarre.vie;
            }
        }
        if (choixPokemonAdverse == 2) {
            int choixAttaqueAdverse = (int) (Math.random() * 2);
            if (choixAttaqueAdverse == 0) {
                Degats degats = carapuce.pistoletAO();
                pokemon.subirDegats(degats);
            }
            else {
                Degats degats = carapuce.laserGlace();
                pokemon.subirDegats(degats);
            }
        }
        if (choixPokemonAdverse == 3) {
            int choixAttaqueAdverse = (int) (Math.random() * 2);
            if (choixAttaqueAdverse == 0) {
                Degats degats = magicarpe.trempette();
                pokemon.subirDegats(degats);
            }
            else {
                Degats degats = magicarpe.charge();
                pokemon.subirDegats(degats);
            }
        }
        if (choixPokemonAdverse == 4) {
            int choixAttaqueAdverse = (int) (Math.random() * 2);
            if (choixAttaqueAdverse == 0) {
                Degats degats = mystherbe.volVie();
                pokemon.subirDegats(degats);
            }
            else {
                Degats degats = mystherbe.chocVenin();
                pokemon.subirDegats(degats);
            }
        }
        if (choixPokemonAdverse == 5) {
            int choixAttaqueAdverse = (int) (Math.random() * 2);
            if (choixAttaqueAdverse == 0) {
                Degats degats = caninos.flammeche();
                pokemon.subirDegats(degats);
            }
            else {
                Degats degats = caninos.morsure();
                pokemon.subirDegats(degats);
            }
        }
        if (choixPokemonAdverse == 6) {
            int choixAttaqueAdverse = (int) (Math.random() * 2);
            if (choixAttaqueAdverse == 0) {
                Degats degats = roucool.tornade();
                pokemon.subirDegats(degats);
            }
            else {
                Degats degats = roucool.viveAttaque();
                pokemon.subirDegats(degats);
            }
        }
        if (choixPokemonAdverse == 7) {
            int choixAttaqueAdverse = (int) (Math.random() * 2);
            if (choixAttaqueAdverse == 0) {
                Degats degats = pikachu.eclair();
                pokemon.subirDegats(degats);
            }
            else {
                Degats degats = pikachu.viveAttaque();
                pokemon.subirDegats(degats);
            }
        }
        if (choixPokemonAdverse == 8) {
            int choixAttaqueAdverse = (int) (Math.random() * 2);
            if (choixAttaqueAdverse == 0) {
                Degats degats = racaillou.seisme();
                pokemon.subirDegats(degats);
            }
            else {
                Degats degats = racaillou.charge();
                pokemon.subirDegats(degats);
            }
        }
        if (choixPokemonAdverse == 9) {
            int choixAttaqueAdverse = (int) (Math.random() * 2);
            if (choixAttaqueAdverse == 0) {
                Degats degats = mewtwo.psyko();
                pokemon.subirDegats(degats);
            }
            else {
                Degats degats = mewtwo.meteores();
                pokemon.subirDegats(degats);
            }
        }
    }
    /**
     * Simule un combat entre deux Pokémon.
     *
     * Le Pokémon adverse est choisi en fonction de la valeur de la variable choixPokemonAdverse,
     * qui doit être un entier compris entre 0 et 9. Le Pokémon du joueur est choisi en fonction
     * de l'entrée du joueur.
     *
     * Lors du combat, le joueur peut choisir une attaque pour son Pokémon en utilisant l'entrée
     * du clavier. Les dommages infligés par chaque attaque sont calculés en utilisant les méthodes
     * de la classe Degats, et sont ensuite soustraits de la vie du Pokémon adverse en utilisant
     * la méthode subirDegats de la classe Pokemon.
     *
     * Le combat se poursuit jusqu'à ce que l'un des deux Pokémon soit déclaré "Mort" en utilisant
     * l'énumération Soin.
     */
    public void run() {
        if (choixPokemonAdverse == 0) {
            pokemonAdverse = dracaufeu;
            System.out.println("Votre adversaire est Dracaufeu");
        } else if (choixPokemonAdverse == 1) {
            pokemonAdverse = bulbizarre;
            System.out.println("Votre adversaire est Bulbizarre");
        } else if (choixPokemonAdverse == 2) {
            pokemonAdverse = carapuce;
            System.out.println("Votre adversaire est Carapuce");
        } else if (choixPokemonAdverse == 3) {
            pokemonAdverse = magicarpe;
            System.out.println("Votre adversaire est Magicarpe");
        } else if (choixPokemonAdverse == 4) {
            pokemonAdverse = mystherbe;
            System.out.println("Votre adversaire est Mystherbe");
        } else if (choixPokemonAdverse == 5) {
            pokemonAdverse = caninos;
            System.out.println("Votre adversaire est Caninos");
        } else if (choixPokemonAdverse == 6) {
            pokemonAdverse = roucool;
            System.out.println("Votre adversaire est Roucool");
        } else if (choixPokemonAdverse == 7) {
            pokemonAdverse = pikachu;
            System.out.println("Votre adversaire est Pikachu");
        } else if (choixPokemonAdverse == 8) {
            pokemonAdverse = racaillou;
            System.out.println("Votre adversaire est Racaillou");
        } else if (choixPokemonAdverse == 9) {
            pokemonAdverse = mewtwo;
            System.out.println("Votre adversaire est Mewtwo");
        }

        System.out.println("--------------------");
        System.out.println("Liste des Pokemon disponibles : ");
        System.out.println("1. Dracaufeu");
        System.out.println("2. Bulbizarre");
        System.out.println("3. Carapuce");
        System.out.println("4. Magicarpe");
        System.out.println("5. Mystherbe");
        System.out.println("6. Caninos");
        System.out.println("7. Roucool");
        System.out.println("8. Pikachu");
        System.out.println("9. Racaillou");
        System.out.println("10. Mewtwo");
        System.out.println("--------------------");
        
        System.out.println("Veuillez choisir un Pokemon :");
        Scanner sc1 = new Scanner(System.in);
        String choixPokemon = sc1.nextLine().toLowerCase();

        Soin etatDuPokemon = Soin.BonneSanté;
        Soin etatDuPokemonAdverse = Soin.BonneSanté;
        while (etatDuPokemon != Soin.Mort && etatDuPokemonAdverse != Soin.Mort) {
            System.out.println("Quel attaque voulez-vous utiliser ?");
            switch (choixPokemon) {
                case "dracaufeu" -> {
                    pokemon = dracaufeu;
                    System.out.println("1. Lance flammes");
                    System.out.println("2. Aeropique");

                    Scanner sc2 = new Scanner(System.in);
                    String attaqueChoisi = sc2.nextLine().toLowerCase();
                    switch (attaqueChoisi) {
                        case "lance flammes" -> {
                            Degats degats = dracaufeu.lanceFlammes();
                            pokemonAdverse.subirDegats(degats);
                        }
                        case "aeropique" -> {
                            Degats degats = dracaufeu.aeropique();
                            pokemonAdverse.subirDegats(degats);
                        }
                        default -> System.out.println("L'attaque choisit n'existe pas");
                    }
                    attaquesAdverses();
                }
                case "mystherbe" -> {
                    pokemon = mystherbe;
                    System.out.println("1. Vol vie");
                    System.out.println("2. Choc venin");

                    Scanner sc2 = new Scanner(System.in);
                    String attaqueChoisi = sc2.nextLine().toLowerCase();
                    switch (attaqueChoisi) {
                        case "vol vie" -> {
                            Degats degats = mystherbe.volVie();
                            pokemonAdverse.subirDegats(degats);
                        }
                        case "choc venin" -> {
                            Degats degats = mystherbe.chocVenin();
                            pokemonAdverse.subirDegats(degats);
                        }

                        default -> System.out.println("L'attaque choisit n'existe pas");
                    }
                    attaquesAdverses();
                }
                case "caninos" -> {
                    pokemon = caninos;
                    System.out.println("1. Flammèche");
                    System.out.println("2. Morsure");

                    Scanner sc2 = new Scanner(System.in);
                    String attaqueChoisi = sc2.nextLine().toLowerCase();
                    switch (attaqueChoisi) {
                        case "flammèche" -> {
                            Degats degats = caninos.flammeche();
                            pokemonAdverse.subirDegats(degats);
                        }
                        case "morsure" -> {
                            Degats degats = caninos.morsure();
                            pokemonAdverse.subirDegats(degats);
                        }

                        default -> System.out.println("L'attaque choisit n'existe pas");
                    }
                    attaquesAdverses();
                }
                case "bulbizarre" -> {
                    pokemon = bulbizarre;
                    System.out.println("1. Fouet lianes");
                    System.out.println("2. Synthèse");

                    Scanner sc2 = new Scanner(System.in);
                    String attaqueChoisi = sc2.nextLine().toLowerCase();
                    switch (attaqueChoisi) {
                        case "fouet lianes" -> {
                            Degats degats = bulbizarre.fouetLianes();
                            pokemonAdverse.subirDegats(degats);
                        }
                        case "synthèse" -> {
                            Degats degats = bulbizarre.synthese();
                            pokemonAdverse.subirDegats(degats);;
                        }

                        default -> System.out.println("L'attaque choisit n'existe pas");
                    }
                    attaquesAdverses();
                }
                case "carapuce" -> {
                    pokemon = carapuce;
                    System.out.println("1. Pistolet à O");
                    System.out.println("2. Laser glace");

                    Scanner sc2 = new Scanner(System.in);
                    String attaqueChoisi = sc2.nextLine().toLowerCase();
                    switch (attaqueChoisi) {
                        case "pistolet à o" -> {
                            Degats degats = carapuce.pistoletAO();
                            pokemonAdverse.subirDegats(degats);
                        }
                        case "laser glace" -> {
                            Degats degats = carapuce.laserGlace();
                            pokemonAdverse.subirDegats(degats);
                        }

                        default -> System.out.println("L'attaque choisit n'existe pas");
                    }
                    attaquesAdverses();
                }
                case "magicarpe" -> {
                    pokemon = magicarpe;
                    System.out.println("1. Trempette");
                    System.out.println("2. Charge");

                    Scanner sc2 = new Scanner(System.in);
                    String attaqueChoisi = sc2.nextLine().toLowerCase();
                    switch (attaqueChoisi) {
                        case "trempette" -> {
                            Degats degats = magicarpe.trempette();
                            pokemonAdverse.subirDegats(degats);
                        }
                        case "charge" -> {
                            Degats degats = magicarpe.charge();
                            pokemonAdverse.subirDegats(degats);
                        }

                        default -> System.out.println("L'attaque choisit n'existe pas");
                    }
                    attaquesAdverses();
                }
                case "roucool" -> {
                    pokemon = roucool;
                    System.out.println("1. Tornade");
                    System.out.println("2. Vive attaque");

                    Scanner sc2 = new Scanner(System.in);
                    String attaqueChoisi = sc2.nextLine().toLowerCase();
                    switch (attaqueChoisi) {
                        case "tornade" -> {
                            Degats degats = roucool.tornade();
                            pokemonAdverse.subirDegats(degats);
                        }
                        case "vive attaque" -> {
                            Degats degats = roucool.viveAttaque();
                            pokemonAdverse.subirDegats(degats);
                        }

                        default -> System.out.println("L'attaque choisit n'existe pas");
                    }
                    attaquesAdverses();
                }
                case "pikachu" -> {
                    pokemon = pikachu;
                    System.out.println("1. Éclair");
                    System.out.println("2. Vive attaque");

                    Scanner sc2 = new Scanner(System.in);
                    String attaqueChoisi = sc2.nextLine().toLowerCase();
                    switch (attaqueChoisi) {
                        case "éclair" -> {
                            Degats degats = pikachu.eclair();
                            pokemonAdverse.subirDegats(degats);
                        }
                        case "vive attaque" -> {
                            Degats degats = pikachu.viveAttaque();
                            pokemonAdverse.subirDegats(degats);
                        }

                        default -> System.out.println("L'attaque choisit n'existe pas");
                    }
                    attaquesAdverses();
                }
                case "racaillou" -> {
                    pokemon = racaillou;
                    System.out.println("1. Séisme");
                    System.out.println("2. Charge");

                    Scanner sc2 = new Scanner(System.in);
                    String attaqueChoisi = sc2.nextLine().toLowerCase();
                    switch (attaqueChoisi) {
                        case "séisme" -> {
                            Degats degats = racaillou.seisme();
                            pokemonAdverse.subirDegats(degats);
                        }
                        case "charge" -> {
                            Degats degats = racaillou.charge();
                            pokemonAdverse.subirDegats(degats);
                        }

                        default -> System.out.println("L'attaque choisit n'existe pas");
                    }
                    attaquesAdverses();
                }
                case "mewtwo" -> {
                    pokemon = mewtwo;
                    System.out.println("1. Psyko");
                    System.out.println("2. Météores");

                    Scanner sc2 = new Scanner(System.in);
                    String attaqueChoisi = sc2.nextLine().toLowerCase();
                    switch (attaqueChoisi) {
                        case "psyko" -> {
                            Degats degats = mewtwo.psyko();
                            pokemonAdverse.subirDegats(degats);
                        }
                        case "météores" -> {
                            Degats degats = mewtwo.meteores();
                            pokemonAdverse.subirDegats(degats);
                        }

                        default -> System.out.println("L'attaque choisit n'existe pas");
                    }
                    attaquesAdverses();
                }
            }

            if (pokemonAdverse.vie <= 0) {
                pokemonAdverse.vie = 0;
                etatDuPokemonAdverse = Soin.Mort;
            }
            if (pokemon.vie <= 0) {
                pokemon.vie = 0;
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
            System.out.println("Vie de votre Pokemon : " + pokemon.vie);
            System.out.println("Vie du Pokemon adverse : " + pokemonAdverse.vie);
            System.out.println("--------------------");
        }
    }
    /**
     * Cette méthode retourne la liste des éléments auxquels le Pokémon est faible.
     *
     * @return La liste des éléments auxquels le Pokémon est faible
     */
    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>(){{
        }};
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels le Pokémon est résistant.
     *
     * @return La liste des éléments auxquels le Pokémon est résistant
     */
    @Override
    public List<Element> resistance() {
        return new ArrayList<>(){{
        }};
    }
}
