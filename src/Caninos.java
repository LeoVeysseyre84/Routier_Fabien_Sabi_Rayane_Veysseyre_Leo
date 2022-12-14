import java.util.ArrayList;
import java.util.List;

    public class Caninos extends Pokemon implements Vulnerabilite {


        public Caninos(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Pokeball pokeball, Attaque attaque) {
            super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, pokeball, attaque);
        }

        public Element flammeche(){
            System.out.println("Caninos utilise Flammèche");
            vieAdversaire -= 20;
            return Element.FEU;
        }
        public Element flammecheAdverse(){
            System.out.println("Le Caninos adverse utilise Flammèche");
            vie -= 20;
            return Element.FEU;
        }
        public Element feuFollet(){
            System.out.println("Caninos utilise Feu Follet");
            vieAdversaire -= 20;
            return Element.FEU;
        }
        public Element feuFolletAdverse(){
            System.out.println("Le Caninos adverse utilise Feu Follet");
            vie -= 20;
            return Element.FEU;
        }

        @Override
        public List<Element> faiblesse() {
            System.out.println("Caninos est est plus faible face au type Eau et plus fort face au type Plante");
            return new ArrayList<>() {{
                add(Element.EAU);
            }};
        }

        @Override
        public List<Element> resistance() {
            return new ArrayList<>() {{
                add(Element.PLANTE);
            }};
        }

    }

