import java.util.ArrayList;
import java.util.List;

public class Carapuce extends Pokemon implements  Vulnerabilite {


    public Carapuce(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    public Degats pistoletAO() {
        System.out.println("Carapuce utilise Pistolet Ã  O");
        return new Degats (20, Element.EAU);
    }
    public Degats laserGlace() {
        System.out.println("Carapuce utilise Laser Glace");
        return new Degats (20, Element.GLACE);
    }


    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>() {{
            add(Element.PLANTE);
            add(Element.ELECTRIK);
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

    @Override
    public String toString() {
        return "Carapuce{" +
                "nom='" + nom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", numeroPokedex=" + numeroPokedex +
                ", vie=" + vie +
                ", vieAdversaire=" + vieAdversaire +
                ", soin=" + soin +
                ", type=" + type +
                '}';
    }
}