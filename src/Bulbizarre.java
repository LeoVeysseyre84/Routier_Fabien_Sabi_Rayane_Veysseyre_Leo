public class Bulbizarre extends Pokemon implements Plante{

    public Bulbizarre(String nom, String sexe, int numeroPokedex, int vie, Soin soin, Pokeball pokeball, Attaque attaque) {
        super(nom, sexe, numeroPokedex, vie, soin, pokeball, attaque);
    }

    public void FouetLianes(){
        System.out.println("Bulbizarre utilise Fouet Lianes");
    }

    public void Synthèse(){
        System.out.println("Bulbizarre utilise Synthèse");
    }

    @Override
    public void faiblesse() {
        System.out.println("Bulbizarre est est plus faible face au type Feu et plus fort face au type Eau");
    }

    @Override
    public void estPassif() {

    }
}
