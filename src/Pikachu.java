import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un Pikachu, un type de Pokémon de type Électrik.
 */
public class Pikachu extends Pokemon implements Vulnerabilite{

    /**
     * Constructeur de la classe Pikachu.
     *
     * @param nom le nom du Pikachu
     * @param sexe le sexe du Pikachu (mâle ou femelle)
     * @param numeroPokedex le numéro du Pikachu dans le pokédex
     * @param vie la vie actuelle du Pikachu
     * @param vieAdversaire la vie actuelle de l'adversaire du Pikachu
     * @param soin l'état de santé du Pikachu
     * @param type le type du Pikachu (Électrik)
     */
    public Pikachu(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    /**
     * Méthode permettant au Pikachu d'utiliser l'attaque Éclair.
     *
     * @return les dégâts infligés par l'attaque (20 points de dégâts de type Électrik)
     */
    public Degats eclair(){
        System.out.println("Pikachu utilise Éclair");
        return new Degats (20, Element.ELECTRIK);
    }

    /**
     * Méthode permettant au Pikachu d'utiliser l'attaque Vive attaque.
     *
     * @return les dégâts infligés par l'attaque (20 points de dégât de type Normal)
     */
    public Degats viveAttaque(){
        System.out.println("Pikachu utilise Vive attaque");
        return new Degats (20, Element.NORMAL);
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels Pikachu est faible.
     *
     * @return La liste des éléments auxquels Pikachu est faible (SOL)
     */
    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>(){{
            add(Element.SOL);
        }};
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels Pikachu est résistant.
     *
     * @return La liste des éléments auxquels Pikachu est résistant (ELECTRIK, VOL)
     */
    @Override
    public List<Element> resistance() {
        return new ArrayList<>(){{
            add(Element.ELECTRIK);
            add(Element.VOL);
        }};
    }

    /**
     * Cette méthode retourne une représentation en chaîne de caractères de Pikachu.
     *
     * @return La chaîne de caractères représentant Pikachu
     */
    @Override
    public String toString() {
        return "Pikachu{" +
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