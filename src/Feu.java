import java.util.ArrayList;
import java.util.Random;
public abstract class Feu extends Pokemon{

    public Feu(String nom, int vie, Soin soin) {
        super(nom, vie, soin);
    }

    public abstract void estAgressif();


}
