import java.util.ArrayList;
import java.util.List;

public class Mystherbe extends Pokemon implements Vulnerabilite{

    public Mystherbe(String nom, String sexe, int numeroPokedex, int vie, Soin soin, Pokeball pokeball, Attaque attaque) {
        super(nom, sexe, numeroPokedex, vie, soin, pokeball, attaque);
    }

    public Element volVie(int vieAdversaire){
        System.out.println("Mystherbe utilise Vole vie");
        vieAdversaire -= 10;
        vie += 10;
        return Element.PLANTE;
    }

    public Element poudreToxic(int vieAdversaire){
        System.out.println("Mystherbe utilise Poudre Toxic");
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