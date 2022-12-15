import java.util.ArrayList;
import java.util.List;

public class Dracaufeu extends Pokemon implements Vulnerabilite {


    public Dracaufeu(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    public Degats lanceFlammes(){
        System.out.println("Dracaufeu utilise Lance flammes");
        return new Degats(30, Element.FEU);
    }
    public Degats aeropique(){
        System.out.println("Le Dracaufeu adverse utilise AÃ©ropique");
        return new Degats (20, Element.VOL);
    }

    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>() {{
            add(Element.EAU);
            add(Element.ELECTRIK);
        }};
    }

    @Override
    public List<Element> resistance() {
        return new ArrayList<>() {{
            add(Element.PLANTE);
            add(Element.FEU);
        }};
    }

    @Override
    public String toString() {
        return "Dracaufeu{" +
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