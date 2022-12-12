public enum Attaque {
    EstEnTrainDAttaquer {
        public boolean Attaquant() {
            return true;
        }

        public boolean AttaquePas() {
            return false;
        }
    },

    AttaquePas {
        public boolean Attaquant() {
            return false;

        }

        public boolean AttaquePas() {
            return true;
        }
    };

    abstract public boolean Attaquant();
    abstract public boolean AttaquePas();
}
