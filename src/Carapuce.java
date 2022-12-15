import java.util.ArrayList;
import java.util.List;

public class Carapuce extends Pokemon implements  Vulnerabilite {


    public Carapuce(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Pokeball pokeball, Attaque attaque, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, pokeball, attaque, type);
    }

    public Element pistoletAO(Element typeAdverse) {
        System.out.println("Carapuce utilise Pistolet à O");
        if (resistance().contains(typeAdverse)) {
            vieAdversaire -= 40;
        }
        else if (faiblesse().contains(typeAdverse)) {
            vieAdversaire -= 10;
        }
        else {
            vieAdversaire -= 20;
        }
        return Element.EAU;
    }
    public Element pistoletAOAdverse(Element type) {
        System.out.println("Le Carapuce adverse utilise Pistolet à O");
        if (resistance().contains(type)) {
            vie -= 40;
        }
        else if (faiblesse().contains(type)) {
            vie -= 10;
        }
        else {
            vie -= 20;
        }
        return Element.EAU;
    }
    public Element laserGlace(Element typeAdverse) {
        System.out.println("Carapuce utilise Laser Glace");
        if (resistance().contains(typeAdverse) && typeAdverse == Element.PLANTE || typeAdverse == Element.VOL) {
            vieAdversaire -= 40;
        }
        else if (faiblesse().contains(typeAdverse) && typeAdverse == Element.EAU || typeAdverse == Element.GLACE) {
            vieAdversaire -= 10;
        }
        else {
            vieAdversaire -= 20;
        }
        return Element.GLACE;
    }
    public Element laserGlaceAdverse(Element type) {
        System.out.println("Le Carapuce adverse utilise Laser Glace");
        if (resistance().contains(type) && type == Element.FEU) {
            vie -= 40;
        }
        else if (faiblesse().contains(type) && type == Element.PLANTE || type == Element.EAU) {
            vie -= 10;
        }
        else {
            vie -= 20;
        }
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
            add(Element.EAU);
            add(Element.GLACE);
        }};
    }
}