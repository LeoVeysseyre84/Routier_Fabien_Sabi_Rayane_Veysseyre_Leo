/**
 * Représente un Pokémon.
 *
 * Un Pokémon est un être vivant possédant une force, une énergie, un sexe, un type, une vulnérabilité à certains éléments,
 * et un numéro dans le Pokedex.
 *
 * Chaque Pokémon peut subir des dommages d'une attaque, en fonction de son type et de l'élément de l'attaque.
 */
/**
 * Classe abstraite représentant un Pokémon.
 *
 * Un Pokémon a un nom, un sexe, un numéro de Pokedex, des points de vie,
 * un état de santé, un type et une liste de faiblesses et de résistances
 * aux différents éléments.
 *
 * @author [Votre nom]
 */
public abstract class Pokemon implements Vulnerabilite {

    /**
     * Le nom du Pokémon.
     */
    String nom;

    /**
     * Le sexe du Pokémon.
     */
    String sexe;

    /**
     * Le numéro de Pokedex du Pokémon.
     */
    int numeroPokedex;

    /**
     * Les points de vie du Pokémon.
     */
    int vie = 100;

    /**
     * Les points de vie du Pokémon adverse.
     */
    int vieAdversaire = 100;

    /**
     * L'état de santé du Pokémon.
     */
    Soin soin;

    /**
     * Le type du Pokémon.
     */
    Element type;

    /**
     * Constructeur de la classe Pokemon.
     *
     * @param nom           le nom du Pokémon
     * @param sexe          le sexe du Pokémon
     * @param numeroPokedex le numéro de Pokedex du Pokémon
     * @param vie           les points de vie du Pokémon
     * @param vieAdversaire les points de vie du Pokémon adverse
     * @param soin          l'état de santé du Pokémon
     * @param type          le type du Pokémon
     */
    public Pokemon(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        this.nom = nom;
        this.sexe = sexe;
        this.numeroPokedex = numeroPokedex;
        this.vie = vie;
        this.vieAdversaire = vieAdversaire;
        this.soin = soin;
        this.type = type;
    }

    /**
     * Constructeur par défaut de la classe Pokemon.
     */
    public Pokemon() {
    }

    /**
     * Retourne le nom du Pokémon.
     *
     * @return le nom du Pokémon
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom du Pokémon.
     *
     * @param nom le nouveau nom du Pokémon
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le sexe du Pokémon.
     *
     * @return le sexe du Pokémon
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * Modifie le sexe du Pokémon.
     *
     * @param sexe Le nouveau sexe du Pokémon.
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * Retourne le numéro dans le Pokédex du Pokémon.
     *
     * @return Le numéro dans le Pokédex du Pokémon.
     */
    public int getNumeroPokedex() {
        return numeroPokedex;
    }

    /**
     * Modifie le numéro dans le Pokédex du Pokémon.
     *
     * @param numeroPokedex Le nouveau numéro dans le Pokédex du Pokémon.
     */
    public void setNumeroPokedex(int numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }

    /**
     * Retourne la vie du Pokémon.
     *
     * @return La vie du Pokémon.
     */
    public int getVie() {
        return vie;
    }

    /**
     * Modifie la vie du Pokémon.
     *
     * @param vie La nouvelle vie du Pokémon.
     */
    public void setVie(int vie) {
        this.vie = vie;
    }
    /**
     * Retourne la vie du Pokémon adverse.
     *
     * @return La vie du Pokémon adverse.
     */

    public int getVieAdversaire() {
        return vieAdversaire;
    }

    /**
     * Modifie la vie du Pokémon adverse.
     *
     * @param vieAdversaire La nouvelle vie du Pokémon adverse.
     */
    public void setVieAdversaire(int vieAdversaire) {
        this.vieAdversaire = vieAdversaire;
    }
    /**
     *Retourne le soin du Pokémon.
     *
     *@return Le soin du Pokémon.
     */

    public Soin getSoin() {
        return soin;
    }

    /**
     * Modifie le soin du Pokémon.
     *
     * @param soin Le nouveau soin du Pokémon.
     */
    public void setSoin(Soin soin) {
        this.soin = soin;
    }
    /**
     *Retourne le type du Pokémon.
     *
     *@return Le type du Pokémon.
     */

    public Element getType() {
        return type;
    }

    /**
     * Modifie le type du Pokémon.
     *
     * @param type Le nouveau type du Pokémon.
     */
    public void setType(Element type) {
        this.type = type;
    }

    /**
     * Méthode permettant à un Pokémon de subir des dégâts.
     *
     * @param degats les dégâts à subir par le Pokémon
     * @return la vie du Pokémon après avoir subi les dégâts
     */
    public int subirDegats(Degats degats) {
        if (resistance().contains(degats.getElement())) {
            return vie -= degats.getMontantDegats() * 0.5;
        }

        if (faiblesse().contains(degats.getElement())) {
            return vie -= degats.getMontantDegats() * 2;
        }
        return vie -= degats.getMontantDegats();
    }
}