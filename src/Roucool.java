import java.util.ArrayList;
import java.util.List;

public class Roucool extends Pokemon implements Vulnerabilite{

    public Roucool(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    public Degats tornade(){
        System.out.println("Roucool utilise tornade");
        return new Degats (20, Element.VOL);
    }

    public Degats viveAttaque(){
        System.out.println("Roucool utilise Vive attaque");
        return new Degats (20, Element.NORMAL);
    }

    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>(){{
            add(Element.ELECTRIK);
            add(Element.GLACE);
        }};
    }

    @Override
    public List<Element> resistance() {
        return new ArrayList<>(){{
            add(Element.SOL);
        }};
    }

    @Override
    public String toString() {
        return "Roucool{" +
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