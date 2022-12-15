import java.lang.reflect.Array;
import java.util.*;

public class Pokedex extends Pokemon implements Runnable  {
    @Override
    public void run() {
        Pokemon[] test = {
                new Dracaufeu("Dracaufeu", "mâle", 6, 100, 100, Soin.BonneSanté, Element.FEU),
                new Bulbizarre("Bulbizarre", "mâle", 1, 100, 100, Soin.BonneSanté, Element.PLANTE),
                new Carapuce("Carapuce", "femelle", 7, 100, 100, Soin.BonneSanté, Element.EAU),
                new Magicarpe("Magicarpe", "mâle", 129, 100, 100, Soin.BonneSanté, Element.EAU),
                new Mystherbe("Mystherbe", "mâle", 43, 100, 100, Soin.BonneSanté, Element.PLANTE),
                new Caninos("Caninos", "mâle", 58, 100, 100, Soin.BonneSanté, Element.FEU),
                new Roucool("Roucool","mâle",16, 100, 100, Soin.BonneSanté, Element.VOL),
                new Pikachu("Pikachu","mâle",25, 100, 100, Soin.BonneSanté, Element.ELECTRIK),
                new Racaillou("Racaillou","mâle",74, 100, 100, Soin.BonneSanté, Element.SOL),
                new Mewtwo("Mewtwo", "neutre", 150, 100, 100, Soin.BonneSanté, Element.PSY),
        };

        List<Pokemon> pokemonList = Arrays.asList(test);
        pokemonList.sort(Comparator.comparingInt(Pokemon::getNumeroPokedex));
        for (Pokemon element : pokemonList ) {
            System.out.println(element);
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