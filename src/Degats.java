/**
 * Représente les dommages infligés par une attaque.
 *
 * Chaque attaque a un montant de dommages associé, qui est un entier, et un élément,
 * qui peut être l'un des éléments suivants : Feu, Eau, Plante, Insecite, Normal.
 *
 * La classe Degats permet de créer des objets qui représentent les dommages infligés
 * par une attaque en stockant son montant et son élément. Elle fournit également des
 * méthodes pour accéder à ces informations.
 */
public class Degats {
    private int montantDegats;

    private Element element;

    /**
     * Crée un objet Degats avec un montant et un élément donnés.
     *
     * @param montantDegats le montant des dommages infligés par l'attaque.
     * @param element       l'élément de l'attaque.
     */
    public Degats(int montantDegats, Element element) {
        this.montantDegats = montantDegats;
        this.element = element;
    }

    /**
     * Renvoie le montant des dommages infligés par l'attaque.
     *
     * @return le montant des dommages infligés par l'attaque.
     */
    public int getMontantDegats() {
        return montantDegats;
    }

    /**
     * Renvoie l'élément de l'attaque.
     *
     * @return l'élément de l'attaque.
     */
    public Element getElement() {
        return element;
    }
}