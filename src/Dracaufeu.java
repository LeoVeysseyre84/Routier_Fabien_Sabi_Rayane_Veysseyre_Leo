import java.util.ArrayList;
import java.util.List;

public class Dracaufeu extends Pokemon implements Vulnerabilite {


    public Dracaufeu(String nom, String sexe, int numeroPokedex, int vie, Soin soin, Pokeball pokeball, Attaque attaque) {
        super(nom, sexe, numeroPokedex, vie, soin, pokeball, attaque);
    }

    public Element LanceFlammes(int vieAdversaire){
        System.out.println("Dracaufeu utilise Lance flammes");
        vieAdversaire -= 30;
        return Element.FEU;
    }
    public Element Aeropique(int vieAdversaire){
        System.out.println("Dracaufeu utilise Aéropique");
        vieAdversaire -= 20;
        return Element.FEU;
    }

    @Override
    public List<Element> faiblesse() {
        System.out.println("Dracaufeu est est plus faible face au type Eau et plus fort face au type Plante");
        return new ArrayList<>() {{
            add(Element.EAU);
        }};
    }

    @Override
    public List<Element> resistance() {
        return new ArrayList<>() {{
            add(Element.PLANTE);
        }};
    }
}

