import java.util.ArrayList;
import java.util.List;

public class Mystherbe extends Pokemon implements Vulnerabilite{

    public Mystherbe(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Pokeball pokeball, Attaque attaque) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, pokeball, attaque);
    }

    public Element volVie(){
        System.out.println("Mystherbe utilise Vole vie");
        vieAdversaire -= 10;
        return Element.PLANTE;
    }
    public Element volVieAdverse(){
        System.out.println("Le Mystherbe adverse utilise Vole vie");
        vie -= 10;
        return Element.PLANTE;
    }

    public Element poudreToxic(){
        System.out.println("Mystherbe utilise Poudre Toxic");
        vieAdversaire -=25;
        return Element.PLANTE;

    }
    public Element poudreToxicAdverse(){
        System.out.println("Le Mystherbe adverse utilise Poudre Toxic");
        vie -= 25;
        return Element.PLANTE;
    }

    @Override
    public List<Element> faiblesse() {
        System.out.println("Mystherbe est est plus faible face au type Feu et plus fort face au type Eau");
        return new ArrayList<>(){{
            add(Element.FEU);
        }};
    }

    @Override
    public List<Element> resistance() {
        return new ArrayList<>(){{
            add(Element.EAU);
        }};
    }


    public void estAgressif() {
    }

}