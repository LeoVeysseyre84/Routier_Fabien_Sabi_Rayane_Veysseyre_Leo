import java.util.ArrayList;
import java.util.Random;
public abstract class Feu extends Pokemon{


    public Feu(String nom, int vie, Soin soin, Pokeball pokeball) {
        super(nom, vie, soin, pokeball);
    }

    public abstract void estAgressif();


}
