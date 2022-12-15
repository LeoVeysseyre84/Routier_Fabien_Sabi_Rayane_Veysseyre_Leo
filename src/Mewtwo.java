import java.util.ArrayList;
import java.util.List;

public class Mewtwo extends Pokemon implements Vulnerabilite{

    public Mewtwo(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    public Degats psyko(){
        System.out.println("Mewtwo utilise Psyko");
        return new Degats (40, Element.PSY);
    }

    public Degats meteores(){
        System.out.println("Mewtwo utilise Météores");
        return new Degats (30, Element.NORMAL);
    }

    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>(){{
            add(Element.TENEBRES);
        }};
    }

    @Override
    public List<Element> resistance() {
        return new ArrayList<>(){{
            add(Element.PSY);
        }};
    }

    @Override
    public String toString() {
        return "Mewtwo{" +
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