public class Caninos extends Pokemon implements Feu{


    public Caninos(String nom, String sexe, int numeroPokedex, int vie, Soin soin, Pokeball pokeball, Attaque attaque) {
        super(nom, sexe, numeroPokedex, vie, soin, pokeball, attaque);
    }

    // Attaques du pokémon
    public void Flamèche(){
        System.out.println("Caninos utilise Flamèche");
    }
    public void FeuFollet(){
        System.out.println("Caninos utilise Feu Follet");
    }

    @Override
    public void faiblesse() {
        System.out.println("Caninos est est plus faible face au type Eau et plus fort face au type Plante");
    }

    @Override
    public void estAgressif() {

    }
}
