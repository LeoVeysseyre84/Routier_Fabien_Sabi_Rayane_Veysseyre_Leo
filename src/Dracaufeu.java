import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un Dracaufeu, un type de Pokémon de type Feu.
 */
public class Dracaufeu extends Pokemon implements Vulnerabilite {

    /**
     * Constructeur de la classe Dracaufeu.
     *
     * @param nom le nom du Dracaufeu
     * @param sexe le sexe du Dracaufeu (mâle ou femelle)
     * @param numeroPokedex le numéro du Dracaufeu dans le pokédex
     * @param vie la vie actuelle du Dracaufeu
     * @param vieAdversaire la vie actuelle de l'adversaire du Dracaufeu
     * @param soin l'état de santé du Dracaufeu
     * @param type le type du Dracaufeu (Feu)
     */
    public Dracaufeu(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, type);
    }

    /**
     * Méthode permettant au Dracaufeu d'utiliser l'attaque Lance flammes.
     *
     * @return les dégâts infligés par l'attaque (30 points de dégâts de type Feu)
     */
    public Degats lanceFlammes(){
        System.out.println("Dracaufeu utilise Lance flammes");
        return new Degats(30, Element.FEU);
    }

    /**
     * Méthode permettant au Dracaufeu d'utiliser l'attaque Aeropique.
     *
     * @return les dégâts infligés par l'attaque (20 points de dégât de type Vol)
     */
    public Degats aeropique(){
        System.out.println("Le Dracaufeu adverse utilise AÃ©ropique");
        return new Degats (20, Element.VOL);
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels Dracaufeu est faible.
     *
     * @return La liste des éléments auxquels Dracaufeu est faible (EAU et ELECTRIK)
     */

    @Override
    public List<Element> faiblesse() {
        return new ArrayList<>() {{
            add(Element.EAU);
            add(Element.ELECTRIK);
        }};
    }

    /**
     * Cette méthode retourne la liste des éléments auxquels Dracaufeu est résistant.
     *
     * @return La liste des éléments auxquels Dracaufeu est résistant (Plante et Feu)
     */
    @Override
    public List<Element> resistance() {
        return new ArrayList<>() {{
            add(Element.PLANTE);
            add(Element.FEU);
        }};
    }

    /**
     * Cette méthode retourne une représentation en chaîne de caractères de Dracaufeu.
     *
     * @return La chaîne de caractères représentant Dracaufeu
     */
    @Override
    public String toString() {
        return "Dracaufeu{" +
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