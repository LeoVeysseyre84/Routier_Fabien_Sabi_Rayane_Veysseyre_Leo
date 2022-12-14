import java.util.ArrayList;
import java.util.List;

public class Magicarpe extends Pokemon implements Vulnerabilite {


    public Magicarpe(String nom, String sexe, int numeroPokedex, int vie, Soin soin, Pokeball pokeball, Attaque attaque) {
        super(nom, sexe, numeroPokedex, vie, soin, pokeball, attaque);
    }

    public Element Trempette(int vieAdversaire) {
        System.out.println("Magicarpe utilise Trempette");
        vieAdversaire -= 0;
        return Element.EAU;
    }

    public Element Charge(int vieAdversaire) {
        System.out.println("Magicarpe utilise Charge");
        vieAdversaire -= 20;
        return Element.EAU;
    }


    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>() {{
            add(Element.PLANTE);
        }};
    }

    @Override
    public List<Element> resistance() {
        return new ArrayList<>() {{
            add(Element.FEU);
        }};
    }
}