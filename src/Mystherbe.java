import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un Mystherbe, un type de Pokémon de type Plante.
 */
public class Mystherbe extends Pokemon implements Vulnerabilite {

    /**
     * Constructeur de la classe Mystherbe.
     *
     * @param nom le nom du Mystherbe
     * @param sexe le sexe du Mystherbe (mâle ou femelle)
     * @param numeroPokedex le numéro du Mystherbe dans le pokédex
     * @param vie la vie actuelle du Mystherbe
     * @param vieAdversaire la vie actuelle de l'adversaire du Mystherbe
     * @param soin l'état de santé du Mystherbe
     * @param type le type du Mystherbe (Plante)
     */
    public Mystherbe(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    /**
     * Méthode permettant au Mystherbe d'utiliser l'attaque Vol Vie.
     *
     * @return les dégâts infligés par l'attaque (20 points de dégâts de type Plante)
     */
    public Degats volVie() {
        System.out.println("Mystherbe utilise Vol vie");
        return new Degats (20, Element.PLANTE);
    }

    /**
     * Méthode permettant au Mystherbe d'utiliser l'attaque Choc Venin.
     *
     * @return les dégâts infligés par l'attaque (30 points de dégât de type Poison)
     */
    public Degats chocVenin() {
        System.out.println("Mystherbe utilise Choc Venin");
        return new Degats (30, Element.POISON);
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels Mystherbe est faible.
     *
     * @return La liste des éléments auxquels Mystherbe est faible (FEU, GLACE, PSY et VOL)
     */
    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>(){{
            add(Element.FEU);
            add(Element.GLACE);
            add(Element.PSY);
            add(Element.VOL);
        }};
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels Mystherbe est résistant.
     *
     * @return La liste des éléments auxquels Mystherbe est résistant (Plante, Eau et Electrik)
     */
    @Override
    public List<Element> resistance() {
        return new ArrayList<>(){{
            add(Element.PLANTE);
            add(Element.EAU);
            add(Element.ELECTRIK);
        }};
    }

    /**
     * Cette méthode retourne une représentation en chaîne de caractères de Mystherbe.
     *
     * @return La chaîne de caractères représentant Mystherbe
     */
    @Override
    public String toString() {
        return "Mystherbe{" +
                "sexe='" + sexe + '\'' +
                ", numeroPokedex=" + numeroPokedex +
                ", vie=" + vie +
                ", vieAdversaire=" + vieAdversaire +
                ", soin=" + soin +
                ", type=" + type +
                '}';
    }
}