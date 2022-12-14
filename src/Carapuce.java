import java.util.ArrayList;
import java.util.List;

    public class Carapuce extends Pokemon implements  Vulnerabilite {


        public Carapuce(String nom, String sexe, int numeroPokedex, int vie, Soin soin, Pokeball pokeball, Attaque attaque) {
            super(nom, sexe, numeroPokedex, vie, soin, pokeball, attaque);
        }

        public Element PistoletAO(int vieAdversaire) {
            System.out.println("Carapuce utilise Pistolet à O");
            vieAdversaire -= 20;
            return Element.EAU;
        }

        public Element LaserGlace(int vieAdversaire) {
            System.out.println("Carapuce utilise Laser Glace");
            vieAdversaire -= 20;
            return Element.EAU;
        }


        @Override
        public List<Element> faiblesse() {
            return new ArrayList<>() {{
                add(Element.PLANTE);
            }};
        }

        @Override
        public List<Element> resistance() {
            return new ArrayList<>() {{
                add(Element.FEU);
            }};
        }
    }