import java.util.ArrayList;
import java.util.List;

public class Dracaufeu extends Pokemon implements Vulnerabilite {


    public Dracaufeu(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Pokeball pokeball, Attaque attaque) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, pokeball, attaque);
    }

    public Element lanceFlammes(){
        System.out.println("Dracaufeu utilise Lance flammes");
        vieAdversaire -= 30;
        return Element.FEU;
    }
    public Element lanceFlammesAdverse(){
        System.out.println("Dracaufeu utilise Lance flammes");
        vie -= 30;
        return Element.FEU;
    }
    public Element aeropique(){
        System.out.println("Le Dracaufeu adverse utilise Aéropique");
        vieAdversaire -= 20;
        return Element.FEU;
    }
    public Element aeropiqueAdverse(){
        System.out.println("Le Dracaufeu adverse utilise Aéropique");
        vie -= 20;
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

