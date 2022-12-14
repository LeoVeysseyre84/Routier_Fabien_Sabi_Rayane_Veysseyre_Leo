import java.util.ArrayList;
import java.util.List;

public class Magicarpe extends Pokemon implements Vulnerabilite {


    public Magicarpe(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Pokeball pokeball, Attaque attaque) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, pokeball, attaque);
    }

    public Element trempette() {
        System.out.println("Magicarpe utilise Trempette");
        vieAdversaire -= 0;
        return Element.EAU;
    }
    public Element trempetteAdverse() {
        System.out.println("Le Magicarpe adbverse utilise Trempette");
        vie -= 0;
        return Element.EAU;
    }

    public Element charge() {
        System.out.println("Magicarpe utilise Charge");
        vieAdversaire -= 20;
        return Element.EAU;
    }
    public Element chargeAdverse() {
        System.out.println("Le Magicarpe adverse utilise Charge");
        vie -= 20;
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