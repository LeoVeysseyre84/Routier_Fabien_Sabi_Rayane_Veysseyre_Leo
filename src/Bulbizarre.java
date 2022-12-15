import java.util.ArrayList;
import java.util.List;

public class Bulbizarre extends Pokemon implements Vulnerabilite{

    public Bulbizarre(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    public Degats fouetLianes(){
        System.out.println("Bulbizarre utilise Fouet Lianes");
        return new Degats (20, Element.PLANTE);
    }

    public Degats synthese(){
        System.out.println("Bulbizarre utilise SynthÃ¨se");
        return new Degats (0, Element.PLANTE);
    }

    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>(){{
            add(Element.FEU);
            add(Element.VOL);
            add(Element.GLACE);
            add(Element.VOL);
        }};
    }

    @Override
    public List<Element> resistance() {
        return new ArrayList<>(){{
            add(Element.EAU);
            add(Element.PLANTE);
        }};
    }

    @Override
    public String toString() {
        return "Bulbizarre{" +
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