public class Magicarpe extends Pokemon implements Eau{
    public Magicarpe(String nom, String sexe, int numeroPokedex, int vie, Soin soin, Pokeball pokeball, Attaque attaque) {
        super(nom, sexe, numeroPokedex, vie, soin, pokeball, attaque);
    }

    public void Trempette(){
        System.out.println("Magicarpe utilise Trempette");
    }
    public void Charge(){
        System.out.println("Magicarpe utilise Charge");
    }

    @Override
    public void estRapide() {
        System.out.println("Magicarpe est est plus faible face au type Plante et plus fort face au type Feu");
    }

    @Override
    public void faiblesse() {

    }
}
