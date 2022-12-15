public abstract class Pokemon implements Vulnerabilite {
    String nom;
    String sexe;
    int numeroPokedex;
    int vie = 100;
    int vieAdversaire = 100;
    Soin soin;
    Element type;



    public Pokemon(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Element type) {
        this.nom = nom;
        this.sexe = sexe;
        this.numeroPokedex = numeroPokedex;
        this.vie = vie;
        this.vieAdversaire = vieAdversaire;
        this.soin = soin;
        this.type = type;
    }

    public Pokemon() {}

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

    public int getVieAdversaire() {
        return vieAdversaire;
    }

    public void setVieAdversaire(int vieAdversaire) {
        this.vieAdversaire = vieAdversaire;
    }

    public Soin getSoin() {
        return soin;
    }

    public void setSoin(Soin soin) {
        this.soin = soin;
    }

    public Element getType() {
        return type;
    }

    public void setType(Element type) {
        this.type = type;
    }

    public int subirDegats(Degats degats) {
        if (resistance().contains(degats.getElement())) {
            return vie -= degats.getMontantDegats() * 0.5;
        }

        if (faiblesse().contains(degats.getElement())) {
            return vie -= degats.getMontantDegats() * 2;
        }
        return vie -= degats.getMontantDegats();
    }
}