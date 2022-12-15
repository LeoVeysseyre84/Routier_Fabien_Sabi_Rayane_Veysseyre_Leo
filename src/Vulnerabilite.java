import java.util.List;

/**
 * Représente la vulnérabilité d'un Pokémon à différents éléments.
 *
 * Chaque Pokémon peut être vulnérable à certains éléments et résistant à d'autres.
 * Cette interface définit deux méthodes, `faiblesse` et `resistance`, qui renvoient
 * respectivement une liste des éléments auxquels le Pokémon est vulnérable et une liste
 * des éléments auxquels il est résistant.
 */
public interface Vulnerabilite {
    /**
     * Renvoie une liste des éléments auxquels le Pokémon est vulnérable.
     *
     * @return une liste des éléments auxquels le Pokémon est vulnérable.
     */
    public abstract List<Element> faiblesse();

    /**
     * Renvoie une liste des éléments auxquels le Pokémon est résistant.
     *
     * @return une liste des éléments auxquels le Pokémon est résistant.
     */
    public abstract List<Element> resistance();
}