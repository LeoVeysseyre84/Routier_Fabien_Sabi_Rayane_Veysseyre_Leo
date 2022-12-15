import java.util.ArrayList;
import java.util.List;
/**
 * Classe représentant un Roucool, un type de Pokémon de type Vol.
 */
public class Roucool extends Pokemon implements Vulnerabilite {

    /**
     * Constructeur de la classe Roucool.
     *
     * @param nom le nom du Roucool
     * @param sexe le sexe du Roucool (mâle ou femelle)
     * @param numeroPokedex le numéro du Roucool dans le pokédex
     * @param vie la vie actuelle du Roucool
     * @param vieAdversaire la vie actuelle de l'adversaire du Roucool
     * @param soin l'état de santé du Roucool
     * @param type le type du Roucool (Vol)
     */

    public Roucool(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }
    /**
     * Méthode permettant au Roucool d'utiliser l'attaque Tornade.
     *
     * @return les dégâts infligés par l'attaque (20 points de dégâts de type Vol)
     */
    public Degats tornade(){
        System.out.println("Roucool utilise tornade");
        return new Degats (20, Element.VOL);
    }
    /**
     * Méthode permettant au Roucool d'utiliser l'attaque Vive attaque.
     *
     * @return les dégâts infligés par l'attaque (30 points de dégât de type Normal)
     */
    public Degats viveAttaque(){
        System.out.println("Roucool utilise Vive attaque");
        return new Degats (20, Element.NORMAL);
    }
    /**
     * Cette méthode retourne la liste des éléments auxquels Roucool est faible.
     *
     * @return La liste des éléments auxquels Roucool est faible (ELECTRIK, GLACE)
     */
    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>(){{
            add(Element.ELECTRIK);
            add(Element.GLACE);
        }};
    }
    /**
     * Cette méthode retourne la liste des éléments auxquels Roucool est résistant.
     *
     * @return La liste des éléments auxquels Roucool est résistant (SOL)
     */
    @Override
    public List<Element> resistance() {
        return new ArrayList<>(){{
            add(Element.SOL);
        }};
    }
    /**
     * Cette méthode retourne une représentation en chaîne de caractères de Roucool.
     *
     * @return La chaîne de caractères représentant Roucool
     */
    @Override
    public String toString() {
        return "Roucool{" +
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