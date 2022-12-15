import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un Racaillou, un type de Pokémon de type Sol.
 */
public class Racaillou extends Pokemon implements Vulnerabilite {

    /**
     * Constructeur de la classe Racaillou.
     *
     * @param nom le nom du Racaillou
     * @param sexe le sexe du Racaillou (mâle ou femelle)
     * @param numeroPokedex le numéro du Racaillou dans le pokédex
     * @param vie la vie actuelle du Racaillou
     * @param vieAdversaire la vie actuelle de l'adversaire du Racaillou
     * @param soin l'état de santé du Racaillou
     * @param type le type du Racaillou (Sol)
     */
    public Racaillou(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    /**
     * Méthode permettant au Racaillou d'utiliser l'attaque Séisme.
     *
     * @return les dégâts infligés par l'attaque (30 points de dégâts de type Sol)
     */
    public Degats seisme() {
        System.out.println("Racaillou utilise séisme");
        return new Degats (30, Element.SOL);
    }

    /**
     * Méthode permettant au Racaillou d'utiliser l'attaque Charge.
     *
     * @return les dégâts infligés par l'attaque (20 points de dégât de type Normal)
     */
    public Degats charge() {
        System.out.println("Racaillou utilise Charge");
        return new Degats (20, Element.NORMAL);
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels Racaillou est faible.
     *
     * @return La liste des éléments auxquels Racaillou  est faible (EAU, PLANTE et GLACE)
     */
    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>(){{
            add(Element.EAU);
            add(Element.PLANTE);
            add(Element.GLACE);
        }};
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels Racaillou est résistant.
     *
     * @return La liste des éléments auxquels Racaillou est résistant (POISON)
     */
    @Override
    public List<Element> resistance() {
        return new ArrayList<>(){{
            add(Element.POISON);
        }};
    }

    /**
     * Cette méthode retourne une représentation en chaîne de caractères de Racaillou.
     *
     * @return La chaîne de caractères représentant Racaillou
     */
    @Override
    public String toString() {
        return "Racaillou {" +
                "sexe='" + sexe + '\'' +
                ", numeroPokedex=" + numeroPokedex +
                ", vie=" + vie +
                ", vieAdversaire=" + vieAdversaire +
                ", soin=" + soin +
                ", type=" + type +
                '}';
    }
}