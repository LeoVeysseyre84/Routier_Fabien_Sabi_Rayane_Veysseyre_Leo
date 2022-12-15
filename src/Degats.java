public class Degats {
    private int montantDegats;

    private Element element;

    public Degats(int montantDegats, Element element) {
        this.montantDegats = montantDegats;
        this.element = element;
    }

    public int getMontantDegats() {
        return montantDegats;
    }

    public Element getElement() {
        return element;
    }
}
