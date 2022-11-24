public abstract class Plante extends Pokemon{


    public Plante(String nom, int vie, Soin soin, Pokeball pokeball) {
        super(nom, vie, soin, pokeball);
    }

    public abstract void estPassif();


}
