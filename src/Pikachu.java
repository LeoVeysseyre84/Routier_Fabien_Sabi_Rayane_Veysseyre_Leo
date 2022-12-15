import java.util.ArrayList;
import java.util.List;

public class Pikachu extends Pokemon implements Vulnerabilite{

    public Pikachu(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    public Degats eclair(){
        System.out.println("Pikachu utilise Éclair");
        return new Degats (20, Element.ELECTRIK);
    }

    public Degats viveAttaque(){
        System.out.println("Pikachu utilise Vive attaque");
        return new Degats (20, Element.NORMAL);
    }

    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>(){{
            add(Element.SOL);
        }};
    }

    @Override
    public List<Element> resistance() {
        return new ArrayList<>(){{
            add(Element.ELECTRIK);
            add(Element.VOL);
        }};
    }

    @Override
    public String toString() {
        return "Pikachu{" +
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