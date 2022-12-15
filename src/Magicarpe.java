import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un Magicarpe, un type de Pokémon de type Eau.
 */
public class Magicarpe extends Pokemon implements Vulnerabilite {

    /**
     * Constructeur de la classe Magicarpe.
     *
     * @param nom le nom du Magicarpe
     * @param sexe le sexe du Magicarpe (mâle ou femelle)
     * @param numeroPokedex le numéro du Pikachu dans le Magicarpe
     * @param vie la vie actuelle du Magicarpe
     * @param vieAdversaire la vie actuelle de l'adversaire du Magicarpe
     * @param soin l'état de santé du Magicarpe
     * @param type le type du Magicarpe (Eau)
     */
    public Magicarpe(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    /**
     * Méthode permettant au Magicarpe d'utiliser l'attaque Trempete.
     *
     * @return les dégâts infligés par l'attaque (0 point de dégâts de type Eau)
     */
    public Degats trempette() {
        System.out.println("Magicarpe utilise Trempette");
        return new Degats (0, Element.EAU);
    }

    /**
     * Méthode permettant au Magicarpe d'utiliser l'attaque Vive attaque.
     *
     * @return les dégâts infligés par l'attaque (20 points de dégât de type Normal)
     */
    public Degats charge() {
        System.out.println("Magicarpe utilise Charge");
        return new Degats (20, Element.NORMAL);
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels Magicarpe est faible.
     *
     * @return La liste des éléments auxquels Magicarpe est faible (Plante, Électrik)
     */
    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>() {{
            add(Element.PLANTE);
            add(Element.ELECTRIK);
        }};
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels Magicarpe est résistant.
     *
     * @return La liste des éléments auxquels Magicarpe est résistant (FEU, EAU, GLACE)
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
     * Cette méthode retourne une représentation en chaîne de caractères de Magicarpe.
     *
     * @return La chaîne de caractères représentant Magicarpe
     */
    @Override
    public String toString() {
        return "Magicarpe{" +
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