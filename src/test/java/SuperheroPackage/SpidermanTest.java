package SuperheroPackage;

import ExceptionPackage.SpidermanSuitNonExistentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpidermanTest {

    Spiderman spiderman = new Spiderman("peter parker",
            "spiderman",
            "marvel",
            "dollyo chagi",
            "male",
            true,
            "black");

    @Test
    void testCanFly() {
        assertFalse(spiderman.fly());
    }

    @Test
    void setSuitedUp() {
        spiderman.setSuitedUp(true);
        assertTrue(spiderman.isSuitedUp());
    }

    @Test
    void setSuit() throws SpidermanSuitNonExistentException {
        spiderman.setSuit("red");
        assertEquals("red", spiderman.getSuit());
    }
}