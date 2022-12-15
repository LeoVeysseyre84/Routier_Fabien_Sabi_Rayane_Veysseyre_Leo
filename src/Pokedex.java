import java.lang.reflect.Array;
import java.util.*;

public class Pokedex extends Pokemon implements Runnable  {


    ArrayList<Pokemon> test = new ArrayList<>();
    HashMap<Pokemon, String> stest = new HashMap<>();


    public static List<Pokemon> sortByPokedexNumber(List<Pokemon> pokemonList) {
        // Utiliser l'algorithme de tri par insertion
        for (int i = 1; i < pokemonList.size(); i++) {
            Pokemon current = pokemonList.get(i);
            int j = i - 1;
            while (j >= 0 && pokemonList.get(j).numeroPokedex > current.numeroPokedex) {
                pokemonList.set(j + 1, pokemonList.get(j));
                j = j - 1;
            }
            pokemonList.set(j + 1, current);
        }

        return pokemonList;
    }

    @Override
    public void run() {
        Pokemon[] test = {
                new Dracaufeu("Dracaufeu", "mâle", 6, 100, 100, Soin.BonneSanté, Element.FEU),
                new Bulbizarre("Bulbizarre", "mâle", 1, 100, 100, Soin.BonneSanté, Element.PLANTE),
                new Carapuce("Carapuce", "femelle", 7, 100, 100, Soin.BonneSanté, Element.EAU),
                new Magicarpe("Magicarpe", "mâle", 129, 100, 100, Soin.BonneSanté, Element.EAU),
                new Mystherbe("Mystherbe", "mâle", 43, 100, 100, Soin.BonneSanté, Element.PLANTE),
                new Caninos("Caninos", "mâle", 58, 100, 100, Soin.BonneSanté, Element.FEU),
        };

        List<Pokemon> pokemonList = Arrays.asList(test);
        pokemonList.sort(Comparator.comparingInt(Pokemon::getNumeroPokedex));

        System.out.println(pokemonList);
        //sortByPokedexNumber(pokemonList);

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