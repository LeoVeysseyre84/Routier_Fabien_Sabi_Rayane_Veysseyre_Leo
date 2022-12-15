import java.util.ArrayList;
import java.util.List;

public class Caninos extends Pokemon implements Vulnerabilite {


    public Caninos(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Pokeball pokeball, Attaque attaque, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, pokeball, attaque, type);
    }

    public Degats flammeche(){
        System.out.println("Caninos utilise Flammèche");
        return new Degats (20, Element.FEU);
    }
    public Degats flammecheAdverse(){
        System.out.println("Le Caninos adverse utilise Flammèche");
        return new Degats (20, Element.FEU);
    }
    public Degats morsure(){
        System.out.println("Caninos utilise Morsure");
        return new Degats (20, Element.TENEBRES);
    }
    public Degats morsureAdverse(){
        System.out.println("Le Caninos adverse utilise Morsure");
        return new Degats (20, Element.TENEBRES);
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