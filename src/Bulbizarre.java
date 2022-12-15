import java.util.ArrayList;
import java.util.List;

public class Bulbizarre extends Pokemon implements Vulnerabilite{

    public Bulbizarre(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Pokeball pokeball, Attaque attaque, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, pokeball, attaque, type);
    }

    public Element fouetLianes(Element typeAdverse){
        System.out.println("Bulbizarre utilise Fouet Lianes");
        if (resistance().contains(typeAdverse == Element.EAU)) {
            vieAdversaire -= 40;
        }
        else if (faiblesse().contains(typeAdverse == Element.FEU)) {
            vieAdversaire -= 10;
        }
        else {
            vieAdversaire -= 20;
        }
        return Element.PLANTE;
    }


    public Element fouetLianesAdverse(Element type){
        System.out.println("Le Bulbizarre adverse utilise Fouet Lianes");
        if (resistance().contains(type == Element.EAU)) {
            vie -= 40;
        }
        else if (faiblesse().contains(type == Element.FEU)) {
            vie -= 10;
        }
        else {
            vie -= 20;
        }
        return Element.PLANTE;
    }
    public Element synthese(){
        System.out.println("Bulbizarre utilise Synthèse");
        vie += 25;
        return Element.PLANTE;
    }
    public Element syntheseAdverse(){
        System.out.println("Le Bulbizarre adverse utilise Synthèse");
        vieAdversaire += 25;
        return Element.PLANTE;
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