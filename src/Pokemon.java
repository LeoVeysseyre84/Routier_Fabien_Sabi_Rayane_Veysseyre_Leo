public abstract class Pokemon {
    String nom;
    String sexe;
    int vie;
    Soin soin;

    public Pokemon(String nom, int vie, Soin soin) {
        this.nom = nom;
        this.vie = vie;
        this.soin = soin;
    }

    // Etat de santé du Pokemon
    public void bonneSanté(){
        if (!soin.BesoinSoin() && !soin.SeFaitSoigner()){
            return;
        }
        soin = Soin.BonneSanté;
    }
    public void faible(){
        if (soin.BesoinSoin() || soin.SeFaitSoigner()){
            return;
        }
        soin = Soin.Faible;
    }
    public void soigne(){
        if (!soin.BesoinSoin() || soin.SeFaitSoigner()){
            return;
        }
        soin = Soin.Faible;
    }
}
