import java.util.ArrayList;
import java.util.List;

    public class Carapuce extends Pokemon implements  Vulnerabilite {


        public Carapuce(String nom, String sexe, int numeroPokedex, int vie, int vieAdversaire, Soin soin, Pokeball pokeball, Attaque attaque) {
            super(nom, sexe, numeroPokedex, vie, vieAdversaire, soin, pokeball, attaque);
        }

        public Element pistoletAO() {
            System.out.println("Carapuce utilise Pistolet à O");
            vieAdversaire -= 20;
            return Element.EAU;
        }
        public Element pistoletAOAdverse() {
            System.out.println("Le Carapuce adverse utilise Pistolet à O");
            vie -= 20;
            return Element.EAU;
        }
        public Element laserGlace() {
            System.out.println("Carapuce utilise Laser Glace");
            vieAdversaire -= 20;
            return Element.EAU;
        }
        public Element laserGlaceAdverse() {
            System.out.println("Le Carapuce adverse utilise Laser Glace");
            vie -= 20;
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