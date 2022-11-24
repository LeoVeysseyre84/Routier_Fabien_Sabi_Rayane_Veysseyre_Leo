public enum Pokeball {

    DEDANS {
        public boolean estDansPokeball(){
            return true;
        }

        public boolean estPasDansPokeball(){
            return false;
        }
    },

    DEHORS {
        public boolean estDansPokeball(){
            return false;
        }

        public boolean estPasDansPokeball(){
            return true;
        }
    };

    abstract public boolean estDansPokeball();
    abstract public boolean estPasDansPokeball();

}
