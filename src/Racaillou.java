import java.util.ArrayList;
import java.util.List;

public class Racaillou extends Pokemon implements Vulnerabilite{

    public Racaillou(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    public Degats seisme(){
        System.out.println("Racaillou utilise sÃ©isme");
        return new Degats (30, Element.SOL);
    }

    public Degats charge(){
        System.out.println("Racaillou utilise Vive attaque");
        return new Degats (20, Element.NORMAL);
    }

    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>(){{
            add(Element.EAU);
            add(Element.PLANTE);
            add(Element.GLACE);
        }};
    }

    @Override
    public List<Element> resistance() {
        return new ArrayList<>(){{
            add(Element.POISON);
        }};
    }

    @Override
    public String toString() {
        return "Racaillou{" +
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