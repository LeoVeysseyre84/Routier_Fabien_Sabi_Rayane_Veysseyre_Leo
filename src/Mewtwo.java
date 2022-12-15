import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un Mewtwo, un type de Pokémon de type Psy.
 */
public class Mewtwo extends Pokemon implements Vulnerabilite{

    /**
     * Constructeur de la classe Mewtwo.
     *
     * @param nom le nom du Mewtwo
     * @param sexe le sexe du Mewtwo (mâle ou femelle)
     * @param numeroPokedex le numéro du Mewtwo dans le pokédex
     * @param vie la vie actuelle du Mewtwo
     * @param vieAdversaire la vie actuelle de l'adversaire du Mewtwo
     * @param soin l'état de santé du Mewtwo
     * @param type le type du Mewtwo (Psy)
     */
    public Mewtwo(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    /**
     * Méthode permettant au Mewtwo d'utiliser l'attaque Psyko.
     *
     * @return les dégâts infligés par l'attaque (40 points de dégâts de type Psy)
     */
    public Degats psyko(){
        System.out.println("Mewtwo utilise Psyko");
        return new Degats (40, Element.PSY);
    }

    /**
     * Méthode permettant au Mewtwo d'utiliser l'attaque Météores.
     *
     * @return les dégâts infligés par l'attaque (30 points de dégâts de type Normal)
     */
    public Degats meteores(){
        System.out.println("Mewtwo utilise Météores");
        return new Degats (30, Element.NORMAL);
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels Mewtwo est faible.
     *
     * @return La liste des éléments auxquels Mewtwo est faible (TENEBRES)
     */
    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>(){{
            add(Element.TENEBRES);
        }};
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels Mewtwo est résistant.
     *
     * @return La liste des éléments auxquels Mewtwo est résistant (PSY)
     */
    @Override
    public List<Element> resistance() {
        return new ArrayList<>(){{
            add(Element.PSY);
        }};
    }

    /**
     * Cette méthode retourne une représentation en chaîne de caractères de Mewtwo.
     *
     * @return La chaîne de caractères représentant Mewtwo
     */
    @Override
    public String toString() {
        return "Mewtwo{" +
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