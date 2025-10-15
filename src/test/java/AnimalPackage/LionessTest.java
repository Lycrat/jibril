package AnimalPackage;

import ExceptionPackage.LionessCubOverloadException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LionessTest {

    Lioness lioness = new Lioness(
            "Chloe Kelly",
            "carnivore",
            true,
            "female",
            "Europe",
            true,
            10);

    @Test
    void setPregnant() {
        lioness.setPregnant(false);
        assertFalse(lioness.isPregnant());
    }

    @Test
    void fly() {
        assertFalse(lioness.fly());
    }

    @Test
    void setCubCount() throws LionessCubOverloadException {
        lioness.setCubCount(1);
        assertEquals(1, lioness.getCubCount());
    }
}