public class Carapuce extends Pokemon implements Eau{


    public Carapuce(String nom, String sexe, int numeroPokedex, int vie, Soin soin, Pokeball pokeball, Attaque attaque) {
        super(nom, sexe, numeroPokedex, vie, soin, pokeball, attaque);
    }

    public void  PistoletAO(){
        System.out.println("Carapuce utilise Pistolet à O");
    }
    public void LaserGlace(){
        System.out.println("Carapuce utilise Laser Glace");
    }
    @Override
    public void estRapide() {
        System.out.println("Carapuce est est plus faible face au type Plante et plus fort face au type Feu");
    }

    @Override
    public void faiblesse() {

    }
}
