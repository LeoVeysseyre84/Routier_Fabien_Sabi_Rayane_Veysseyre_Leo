public abstract class Pokemon {
    String nom;
    String sexe;
    int numeroPokedex;
    int vie = 100;
    int vieAdversaire = 100;
    Soin soin;
    Pokeball pokeball;
    Attaque attaque;



    public Pokemon(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Pokeball pokeball, Attaque attaque) {
        this.nom = nom;
        this.sexe = sexe;
        this.numeroPokedex = numeroPokedex;
        this.vie = vie;
        this.vieAdversaire = vieAdversaire;
        this.soin = soin;
        this.pokeball = pokeball;
        this.attaque = attaque;
    }

    public Pokemon() {

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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getNumeroPokedex() {
        return numeroPokedex;
    }

    public void setNumeroPokedex(int numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public Soin getSoin() {
        return soin;
    }

    public void setSoin(Soin soin) {
        this.soin = soin;
    }

    public Pokeball getPokeball() {
        return pokeball;
    }

    public void setPokeball(Pokeball pokeball) {
        this.pokeball = pokeball;
    }

    public Attaque getAttaque() {
        return attaque;
    }

    public void setAttaque(Attaque attaque) {
        this.attaque = attaque;
    }
}
