import java.util.ArrayList;
import java.util.List;

public class Mystherbe extends Pokemon implements Vulnerabilite{

    public Mystherbe(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Pokeball pokeball, Attaque attaque, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, pokeball, attaque, type);
    }

    public Degats volVie(Element typeAdverse){
        System.out.println("Mystherbe utilise Vole vie");
        return new Degats (20, Element.PLANTE);
    }
    public Degats volVieAdverse(Element typeAdverse){
        System.out.println("Le Mystherbe adverse utilise Vole vie");
        return new Degats (20, Element.PLANTE);
    }

    public Degats chocVenin(Element typeAdverse){
        System.out.println("Mystherbe utilise Choc venin");
        return new Degats (30, Element.POISON);
    }
    public Degats chocVeninAdverse(Element typeAdverse){
        System.out.println("Le Mystherbe adverse utilise Choc venin");
        return new Degats (30, Element.POISON);
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