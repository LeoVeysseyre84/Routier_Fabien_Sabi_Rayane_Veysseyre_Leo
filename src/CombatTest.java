import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombatTest {

    @Test
    void simpleTest1(){
        Combat test = new Combat();
        assertEquals(70, test.dracaufeu.lanceFlammes());

    }

    @Test
    void simpleTest2(){
        Combat test = new Combat();
        assertEquals(70, test.mewtwo.meteores());

    }
    @Test
    void simpleTest3(){
        Combat test = new Combat();
        assertEquals(70, test.mystherbe.chocVenin());

    }

    @Test
    void attaquesAdverses() {
    }

    @Test
    void run() {
    }

    @Test
    void faiblesse() {
    }

    @Test
    void resistance() {
    }
}