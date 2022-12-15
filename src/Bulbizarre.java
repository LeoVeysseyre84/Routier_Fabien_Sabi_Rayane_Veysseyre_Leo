import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un Bulbizarre, un type de Pokémon de type Plante.
 */
public class Bulbizarre extends Pokemon implements Vulnerabilite {

    /**
     * Constructeur de la classe Bulbizarre.
     *
     * @param nom le nom du Bulbizarre
     * @param sexe le sexe du Bulbizarre (mâle ou femelle)
     * @param numeroPokedex le numéro du Bulbizarre dans le pokédex
     * @param vie la vie actuelle du Bulbizarre
     * @param vieAdversaire la vie actuelle de l'adversaire du Bulbizarre
     * @param soin l'état de santé du Bulbizarre
     * @param type le type du Bulbizarre (Plante)
     */
    public Bulbizarre(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    /**
     * Méthode permettant au Bulbizarre d'utiliser l'attaque Fouet Lianes.
     *
     * @return les dégâts infligés par l'attaque (20 points de dégâts de type Plante)
     */
    public Degats fouetLianes() {
        System.out.println("Bulbizarre utilise Fouet Lianes");
        return new Degats (20, Element.PLANTE);
    }

    /**
     * Méthode permettant au Bulbizarre d'utiliser l'attaque Synthèse.
     *
     * @return les dégâts infligés par l'attaque (0 point de dégât de type Plante)
     */
    public Degats synthese() {
        System.out.println("Bulbizarre utilise Synthèse");
        return new Degats (0, Element.PLANTE);
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels Bulbizarre est faible.
     *
     * @return La liste des éléments auxquels Bulbizarre est faible (FEU, VOL et GLACE)
     */
    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>(){{
            add(Element.FEU);
            add(Element.VOL);
            add(Element.GLACE);
            add(Element.VOL);
        }};
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels Bulbizarre est résistant.
     *
     * @return La liste des éléments auxquels Bulbizarre est résistant (EAU et PLANTE).
     */
    @Override
    public List<Element> resistance() {
        return new ArrayList<>(){{
            add(Element.EAU);
            add(Element.PLANTE);
        }};
    }

    /**
     * Cette méthode retourne une représentation en chaîne de caractères de Bulbizarre.
     *
     * @return La chaîne de caractères représentant Bulbizarre
     */
    @Override
    public String toString() {
        return "Bulbizarre{" +
                "sexe='" + sexe + '\'' +
                ", numeroPokedex=" + numeroPokedex +
                ", vie=" + vie +
                ", vieAdversaire=" + vieAdversaire +
                ", soin=" + soin +
                ", type=" + type +
                '}';
    }
}