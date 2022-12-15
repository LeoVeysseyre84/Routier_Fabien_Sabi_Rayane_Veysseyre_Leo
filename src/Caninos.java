import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un Caninos, un type de Pokémon de type Feu.
 */
public class Caninos extends Pokemon implements Vulnerabilite {

    /**
     * Constructeur de la classe Caninos.
     *
     * @param nom le nom du Caninos
     * @param sexe le sexe du Caninos (mâle ou femelle)
     * @param numeroPokedex le numéro du Caninos dans le pokédex
     * @param vie la vie actuelle du Caninos
     * @param vieAdversaire la vie actuelle de l'adversaire du Caninos
     * @param soin l'état de santé du Caninos
     * @param type le type du Caninos (Feu)
     */
    public Caninos(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    /**
     * Méthode permettant au Caninos d'utiliser l'attaque Flammèche.
     *
     * @return les dégâts infligés par l'attaque (20 points de dégâts de type Feu)
     */
    public Degats flammeche(){
        System.out.println("Caninos utilise Flammèche");
        return new Degats (20, Element.FEU);
    }

    /**
     * Méthode permettant au Caninos d'utiliser l'attaque Morsure.
     *
     * @return les dégâts infligés par l'attaque (20 points de dégât de type Tenebres)
     */
    public Degats morsure(){
        System.out.println("Caninos utilise Morsure");
        return new Degats (20, Element.TENEBRES);
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels Caninos est faible.
     *
     * @return La liste des éléments auxquels Caninos est faible (EAU et SOL)
     */
    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>() {{
            add(Element.EAU);
            add(Element.SOL);
        }};
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels Caninos est résistant.
     *
     * @return La liste des éléments auxquels Caninos est résistant (PLANTE, FEU et GLACE)
     */
    @Override
    public List<Element> resistance() {
        return new ArrayList<>() {{
            add(Element.PLANTE);
            add(Element.FEU);
            add(Element.GLACE);
        }};
    }

    /**
     * Cette méthode retourne une représentation en chaîne de caractères de Caninos.
     *
     * @return La chaîne de caractères représentant Caninos
     */
    @Override
    public String toString() {
        return "Caninos{" +
                "nom='" + nom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", numeroPokedex=" + numeroPokedex +
                ", vie=" + vie +
                ", vieAdversaire=" + vieAdversaire +
                ", soin=" + soin +
                ", type=" + type +
                '}';
    }
}