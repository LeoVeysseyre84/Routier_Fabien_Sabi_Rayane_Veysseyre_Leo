import java.util.ArrayList;
import java.util.List;

public class Caninos extends Pokemon implements Vulnerabilite {


    public Caninos(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Pokeball pokeball, Attaque attaque, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, pokeball, attaque, type);
    }

    public Element flammeche(Element typeAdverse){
        System.out.println("Caninos utilise Flammèche");
        if (resistance().contains(typeAdverse) && typeAdverse == Element.PLANTE) {
            vieAdversaire -= 40;
        }
        else if (faiblesse().contains(typeAdverse) && typeAdverse == Element.FEU || typeAdverse == Element.EAU) {
            vieAdversaire -= 10;
        }
        else {
            vieAdversaire -= 20;
        }
        return Element.FEU;
    }
    public Element flammecheAdverse(Element type){
        System.out.println("Le Caninos adverse utilise Flammèche");
        if (resistance().contains(type) && type == Element.PLANTE) {
            vie -= 40;
        }
        else if (faiblesse().contains(type) && type == Element.FEU || type == Element.EAU) {
            vie -= 10;
        }
        else {
            vie -= 20;
        }
        return Element.FEU;
    }
    public Element morsure(){
        System.out.println("Caninos utilise Morsure");
        vieAdversaire -= 20;
        return Element.TENEBRES;
    }
    public Element morsureAdverse(){
        System.out.println("Le Caninos adverse utilise Morsure");
        vie -= 20;
        return Element.TENEBRES;
    }

    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>() {{
            add(Element.EAU);
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

}