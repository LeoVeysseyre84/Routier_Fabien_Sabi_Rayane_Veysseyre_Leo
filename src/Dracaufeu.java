public class Dracaufeu extends Pokemon implements Feu{


    public Dracaufeu(String nom, String sexe, int numeroPokedex, int vie, Soin soin, Pokeball pokeball, Attaque attaque) {
        super(nom, sexe, numeroPokedex, vie, soin, pokeball, attaque);
    }

    public void LanceFlammes(){
        System.out.println("Dracaufeu utilise Lance-Flammes");
    }
    public void Aeropique(){
        System.out.println("Dracaufeu utilise Aéropique");
    }

    @Override
    public void faiblesse() {
        System.out.println("Dracaufeu est est plus faible face au type Eau et plus fort face au type Plante");

    }

    @Override
    public void estAgressif() {

    }
}
