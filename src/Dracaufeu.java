import java.util.ArrayList;
import java.util.List;

public class Dracaufeu extends Pokemon implements Vulnerabilite {


    public Dracaufeu(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Pokeball pokeball, Attaque attaque, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, pokeball, attaque, type);
    }

    public Degats lanceFlammes(){
        System.out.println("Dracaufeu utilise Lance flammes");
        return new Degats(30, Element.FEU);
    }
    public Degats lanceFlammesAdverse(){
        System.out.println("Dracaufeu utilise Lance flammes");
        return new Degats (30, Element.FEU);
    }
    public Degats aeropique(){
        System.out.println("Le Dracaufeu adverse utilise Aéropique");
        return new Degats (20, Element.VOL);
    }
    public Degats aeropiqueAdverse(){
        System.out.println("Le Dracaufeu adverse utilise Aéropique");
        return new Degats (20, Element.VOL);
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
        }};
    }
}

