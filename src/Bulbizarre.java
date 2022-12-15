import java.util.ArrayList;
import java.util.List;

public class Bulbizarre extends Pokemon implements Vulnerabilite{

    public Bulbizarre(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Pokeball pokeball, Attaque attaque, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, pokeball, attaque, type);
    }

    public Degats fouetLianes(){
        System.out.println("Bulbizarre utilise Fouet Lianes");
        return new Degats (20, Element.PLANTE);
    }


    public Degats fouetLianesAdverse(){
        System.out.println("Le Bulbizarre adverse utilise Fouet Lianes");
        return new Degats (20, Element.PLANTE);
    }
    public Degats synthese(){
        System.out.println("Bulbizarre utilise Synthèse");
        return new Degats (0, Element.PLANTE);
    }
    public Degats syntheseAdverse(){
        System.out.println("Bulbizarre adverse utilise Synthèse");
        return new Degats (0, Element.PLANTE);
    }

    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>(){{
            add(Element.FEU);
            add(Element.VOL);
            add(Element.GLACE);
        }};
    }

    @Override
    public List<Element> resistance() {
        return new ArrayList<>(){{
            add(Element.EAU);
            add(Element.PLANTE);
        }};
    }
}