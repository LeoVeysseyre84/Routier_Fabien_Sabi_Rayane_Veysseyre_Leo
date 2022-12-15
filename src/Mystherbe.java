import java.util.ArrayList;
import java.util.List;

public class Mystherbe extends Pokemon implements Vulnerabilite{

    public Mystherbe(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    public Degats volVie(){
        System.out.println("Mystherbe utilise Vole vie");
        return new Degats (20, Element.PLANTE);
    }

    public Degats chocVenin(){
        System.out.println("Mystherbe utilise Choc venin");
        return new Degats (30, Element.POISON);
    }

    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>() {{
            add(Element.FEU);
            add(Element.GLACE);
            add(Element.PSY);
            add(Element.VOL);
        }};
    }

    @Override
    public List<Element> resistance() {
        return new ArrayList<>() {{
            add(Element.PLANTE);
            add(Element.EAU);
            add(Element.ELECTRIK);
        }};
    }

    @Override
    public String toString() {
        return "Mystherbe{" +
                "sexe='" + sexe + '\'' +
                ", numeroPokedex=" + numeroPokedex +
                ", vie=" + vie +
                ", vieAdversaire=" + vieAdversaire +
                ", soin=" + soin +
                ", type=" + type +
                '}';
    }
}