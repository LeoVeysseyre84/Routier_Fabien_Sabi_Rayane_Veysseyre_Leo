public abstract class Pokemon {
    String nom;
    String sexe;
    int numeroPokedex;
    int vie = 100;
    Soin soin;
    Pokeball pokeball;
    Attaque attaque;



    public Pokemon(String nom, String sexe, int numeroPokedex, int vie, Soin soin, Pokeball pokeball, Attaque attaque) {
        this.nom = nom;
        this.sexe = sexe;
        this.numeroPokedex = numeroPokedex;
        this.vie = vie;
        this.soin = soin;
        this.pokeball = pokeball;
        this.attaque = attaque;
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
        soin = Soin.Soigne;
    }
    public void meurt(){
        soin = Soin.Mort;
    }



    // Etat du Pokemon vis a vis de la Pokeball
    public void rentreDansPokeball(){
        if (pokeball.estDansPokeball()){
            return;
        }
        pokeball = Pokeball.DEDANS;
    }
    public void sortDePokeball(){
        if (pokeball.estPasDansPokeball()){
            return;
        }
        pokeball = Pokeball.DEHORS;
    }



    // Etat d'attaque du Pokemon
    public void attaque(){
        if (attaque.Attaquant()){
            return;
        }
        attaque = Attaque.EstEnTrainDAttaquer;
    }
    public void nAttaquePas(){
        if (attaque.AttaquePas()){
            return;
        }
        attaque = Attaque.AttaquePas;
    }
}
