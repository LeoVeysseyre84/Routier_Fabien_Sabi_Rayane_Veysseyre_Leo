import java.util.ArrayList;
import java.util.List;

public class Carapuce extends Pokemon implements  Vulnerabilite {


    public Carapuce(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Pokeball pokeball, Attaque attaque, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, pokeball, attaque, type);
    }

    public Degats pistoletAO() {
        System.out.println("Carapuce utilise Pistolet à O");
        return new Degats (20, Element.EAU);
    }
    public Degats pistoletAOAdverse() {
        System.out.println("Le Carapuce adverse utilise Pistolet à O");
        return new Degats (20, Element.EAU);
    }
    public Degats laserGlace() {
        System.out.println("Carapuce utilise Laser Glace");
        return new Degats (20, Element.GLACE);
    }
    public Degats laserGlaceAdverse() {
        System.out.println("Le Carapuce adverse utilise Laser Glace");
        return new Degats (20, Element.GLACE);
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
            add(Element.GLACE);
        }};
    }
}