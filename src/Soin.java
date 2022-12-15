/**
 * Représente les différents états de santé d'un Pokémon.
 *
 * Chaque état de santé est défini par une valeur de l'énumération, qui peut être l'une des
 * suivantes : BonneSanté, Faible, Soigne, Mort.
 *
 * Chaque valeur de l'énumération possède une méthode `SeFaitSoigner` et une méthode
 * `BesoinSoin`, qui renvoient respectivement un booléen indiquant si le Pokémon sous cet état
 * de santé peut se faire soigner ou a besoin de soins.
 */
public enum Soin {
    BonneSanté {
        public boolean SeFaitSoigner() {
            return false;
        }

        public boolean BesoinSoin() {
            return false;
        }
    },

    Faible {
        public boolean SeFaitSoigner() {
            return false;

        }

        public boolean BesoinSoin() {
            return true;
        }
    },

    Soigne {
        public boolean SeFaitSoigner() {
            return true;
        }

        public boolean BesoinSoin() {
            return false;
        }
    },

    Mort {
        public boolean SeFaitSoigner(){
            return false;
        }

        public boolean BesoinSoin(){
            return false;
        }
    };

    abstract public boolean SeFaitSoigner();
    abstract public boolean BesoinSoin();
}