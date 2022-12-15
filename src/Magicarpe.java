import java.util.ArrayList;
import java.util.List;

public class Magicarpe extends Pokemon implements Vulnerabilite {


    public Magicarpe(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Pokeball pokeball, Attaque attaque, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, pokeball, attaque, type);
    }

    public Degats trempette() {
        System.out.println("Magicarpe utilise Trempette");
        return new Degats (0, Element.EAU);
    }
    public Degats trempetteAdverse() {
        System.out.println("Le Magicarpe adbverse utilise Trempette");
        return new Degats (0, Element.EAU);
    }

    public Degats charge() {
        System.out.println("Magicarpe utilise Charge");
        return new Degats (20, Element.NORMAL);
    }
    public Degats chargeAdverse() {
        System.out.println("Le Magicarpe adverse utilise Charge");
        return new Degats (20, Element.NORMAL);

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
            add(Element.EAU);
        }};
    }
}