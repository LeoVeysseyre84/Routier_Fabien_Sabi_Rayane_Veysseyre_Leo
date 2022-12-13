import java.util.ArrayList;
import java.util.List;

public class Caninos extends Pokemon implements Feu, Vulnerabilite{


    public Caninos(String nom, String sexe, int numeroPokedex, int vie, Soin soin, Pokeball pokeball, Attaque attaque) {
        super(nom, sexe, numeroPokedex, vie, soin, pokeball, attaque);
    }

    // Attaques du pokémon
    public void Flamèche(){
        System.out.println("Caninos utilise Flamèche");
    }
    public void FeuFollet(){
        System.out.println("Caninos utilise Feu Follet");
    }

    @Override
    public List<Element> faiblesse() {
        System.out.println("Caninos est est plus faible face au type Eau et plus fort face au type Plante");
        return new ArrayList<>(){{
            add(Element.EAU);
        }};
    }

    @Override
    public List<Element> resistance() {
        return new ArrayList<>(){{
            add(Element.PLANTE);
        }};
    }

    @Override
    public void estAgressif() {

    }
}
