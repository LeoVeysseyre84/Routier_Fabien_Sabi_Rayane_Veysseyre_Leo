import java.util.ArrayList;
import java.util.List;

    public class Caninos extends Pokemon implements Vulnerabilite {


        public Caninos(String nom, String sexe, int numeroPokedex, int vie, Soin soin, Pokeball pokeball, Attaque attaque) {
            super(nom, sexe, numeroPokedex, vie, soin, pokeball, attaque);
        }

        public Element Flammèche(int vieAdversaire){
            System.out.println("Caninos utilise Flammèche");
            vieAdversaire -= 20;
            return Element.FEU;
        }
        public Element FeuFollet(int vieAdversaire){
            System.out.println("Caninos utilise Feu Follet");
            vieAdversaire -= 20;
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

