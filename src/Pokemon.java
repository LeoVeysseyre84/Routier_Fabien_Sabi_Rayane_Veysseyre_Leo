public abstract class Pokemon {
    String nom;
    String sexe;
    int vie;
    Soin soin;
    Pokeball pokeball;

    public Pokemon(String nom, int vie, Soin soin, Pokeball pokeball) {
        this.nom = nom;
        this.vie = vie;
        this.soin = soin;
        this.pokeball = pokeball;
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
    public void rentre(){
        if (pokeball.estDansPokeball()){
            return;
        }
        pokeball = Pokeball.DEDANS;
    }
    public void sort(){
        if (pokeball.estPasDansPokeball()){
            return;
        }
        pokeball = Pokeball.DEHORS;
    }
}
