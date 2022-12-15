import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un Carapuce, un type de Pokémon de type Eau.
 */
public class Carapuce extends Pokemon implements  Vulnerabilite {


    /**
     * Constructeur de la classe Carapuce.
     *
     * @param nom le nom du Carapuce
     * @param sexe le sexe du Carapuce (mâle ou femelle)
     * @param numeroPokedex le numéro du Carapuce dans le pokédex
     * @param vie la vie actuelle du Carapuce
     * @param vieAdversaire la vie actuelle de l'adversaire du Carapuce
     * @param soin l'état de santé du Carapuce
     * @param type le type du Carapuce (Eau)
     */
    public Carapuce(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    /**
     * Méthode permettant au Carapuce d'utiliser l'attaque Pistolet a O.
     *
     * @return les dégâts infligés par l'attaque (20 points de dégâts de type Eau)
     */
    public Degats pistoletAO() {
        System.out.println("Carapuce utilise Pistolet Ã  O");
        return new Degats (20, Element.EAU);
    }

    /**
     * Méthode permettant au Carapuce d'utiliser l'attaque Laser Glace.
     *
     * @return les dégâts infligés par l'attaque (20 points de dégâts de type Glace)
     */
    public Degats laserGlace() {
        System.out.println("Carapuce utilise Laser Glace");
        return new Degats (20, Element.GLACE);
    }


    /**
     * Cette méthode retourne la liste des éléments auxquels Carapuce est faible.
     *
     * @return La liste des éléments auxquels Carapuce est faible (PLANTE ET ELECTRIK)
     */
    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>() {{
            add(Element.PLANTE);
            add(Element.ELECTRIK);
        }};
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels Carapuce est résistant.
     *
     * @return La liste des éléments auxquels Carapuce est résistant (FEU, EAU, GLACE)
     */
    @Override
    public List<Element> resistance() {
        return new ArrayList<>() {{
            add(Element.FEU);
            add(Element.EAU);
            add(Element.GLACE);
        }};
    }

    /**
     * Cette méthode retourne une représentation en chaîne de caractères de Carapuce.
     *
     * @return La chaîne de caractères représentant Carapuce
     */
    @Override
    public String toString() {
        return "Carapuce{" +
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