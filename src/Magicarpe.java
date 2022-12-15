import java.util.ArrayList;
import java.util.List;

public class Magicarpe extends Pokemon implements Vulnerabilite {


    public Magicarpe(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    public Degats trempette() {
        System.out.println("Magicarpe utilise Trempette");
        return new Degats (0, Element.EAU);
    }

    public Degats charge() {
        System.out.println("Magicarpe utilise Charge");
        return new Degats (20, Element.NORMAL);
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
        return "Magicarpe{" +
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