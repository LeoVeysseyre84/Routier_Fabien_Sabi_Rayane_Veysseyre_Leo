public class Mystherbe extends Pokemon implements Plante{
    public Mystherbe(String nom, String sexe, int numeroPokedex, int vie, Soin soin, Pokeball pokeball, Attaque attaque) {
        super(nom, sexe, numeroPokedex, vie, soin, pokeball, attaque);
    }

    public void VoleVie(){
        System.out.println("Mystherbe utilise Vole-vie");
    }
    public void PoudreToxik(){
        System.out.println("Mystherbe utilise Poudre Toxik ");
    }

    @Override
    public void faiblesse() {
        System.out.println("Mystherbe est est plus faible face au type Feu et plus fort face au type Feu");
    }

    @Override
    public void estPassif() {

    }
}
