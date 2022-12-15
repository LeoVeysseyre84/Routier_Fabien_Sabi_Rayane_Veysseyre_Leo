import java.util.ArrayList;
import java.util.List;

public class Caninos extends Pokemon implements Vulnerabilite {


    public Caninos(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    public Degats flammeche(){
        System.out.println("Caninos utilise FlammÃ¨che");
        return new Degats (20, Element.FEU);
    }
    public Degats morsure(){
        System.out.println("Caninos utilise Morsure");
        return new Degats (20, Element.TENEBRES);
    }

    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>() {{
            add(Element.EAU);
            add(Element.SOL);
        }};
    }

    @Override
    public List<Element> resistance() {
        return new ArrayList<>() {{
            add(Element.PLANTE);
            add(Element.FEU);
            add(Element.GLACE);
        }};
    }

    @Override
    public String toString() {
        return "Caninos{" +
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