import java.sql.SQLOutput;
import java.util.Scanner;

public class Main implements Runnable {

    public void run() {
    }

    public static void main(String[] args) {
        System.out.println("Bienvenue dans le monde des Pokemons, choisissez ce que vous voulez faire ");
        System.out.println("1 - Combattre des Pokemons sauvages adverses");
        System.out.println("2 - Visionner le Pokedex des Pokemons disponibles dans le jeu");
        Scanner sc = new Scanner(System.in);
        String choix = sc.nextLine();

        switch (choix) {
            case "1" -> {
                Runnable run = new Main();

                Thread t1 = new Thread(new Combat());

                t1.start();
            }
            case "2" -> {
                Runnable run = new Main();

                Thread t2 = new Thread(new Pokedex());

                t2.start();
            }


        }
    }
}