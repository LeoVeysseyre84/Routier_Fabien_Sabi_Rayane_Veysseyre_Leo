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
