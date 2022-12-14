import java.util.ArrayList;
import java.util.List;

    public class Bulbizarre extends Pokemon implements Vulnerabilite{

        public Bulbizarre(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Pokeball pokeball, Attaque attaque) {
            super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, pokeball, attaque);
        }

        public Element fouetLianes(){
            System.out.println("Bulbizarre utilise Fouet Lianes");
            vieAdversaire -= 20;
            return Element.PLANTE;
        }
        public Element fouetLianesAdverse(){
            System.out.println("Le Bulbizarre adverse utilise Fouet Lianes");
            vie -= 20;
            return Element.PLANTE;
        }
        public Element synthese(){
            System.out.println("Bulbizarre utilise Synthèse");
            vieAdversaire -= 20;
            return Element.PLANTE;
        }
        public Element syntheseAdverse(){
            System.out.println("Le Bulbizarre adverse utilise Synthèse");
            vie -= 20;
            return Element.PLANTE;
        }

                @Override
                    public List<Element> faiblesse() {
                        System.out.println("Bulbizarre est est plus faible face au type Feu et plus fort face au type Eau");
                        return new ArrayList<>(){{
                            add(Element.FEU);
                        }};
                    }

                    @Override
                    public List<Element> resistance() {
                        return new ArrayList<>(){{
                            add(Element.EAU);
                        }};
                    }


                    public void estAgressif() {
                    }

    }
