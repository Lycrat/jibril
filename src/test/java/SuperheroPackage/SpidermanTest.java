package SuperheroPackage;

import ExceptionPackage.SpidermanSuitNonExistentException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpidermanParameterResolver.class)
class SpidermanTest {


    SpidermanTest() throws SpidermanSuitNonExistentException {
    }

    @Test
    @DisplayName("Spiderman tries to fly unsuccessfully")
    void testCanFly(Spiderman spiderman) {
        assertFalse(spiderman.fly());
    }

    @Test
    @DisplayName("Suit up for spiderman successfully")
    void setSuitedUp(Spiderman spiderman) {
        spiderman.setSuitedUp(true);
        assertTrue(spiderman.isSuitedUp());
    }

    @Test
    @DisplayName("Set suit for spiderman successfully to red")
    void setSuit(Spiderman spiderman) throws SpidermanSuitNonExistentException {
        spiderman.setSuit("red");
        assertEquals("red", spiderman.getSuit());
    }


    @ParameterizedTest
    @ValueSource(ints = {50, 80})
    @DisplayName("Spidey takes damage successfully")
    void takeDamage(int damage, Spiderman spiderman) {
        spiderman.takeDamage(damage);
        assertEquals(100 - damage, spiderman.getHealth());
    }

    @ParameterizedTest
    @ValueSource(ints = {100, 120})
    @DisplayName("Spidey takes critical damage successfully")
    void takeCriticalDamage(int damage, Spiderman spiderman) {
       spiderman.takeDamage(damage);
       assertEquals(100, spiderman.getHealth());
    }

    @ParameterizedTest
    @CsvSource({"energy bar, 20" , "chicken bar, 30", "V Serum, 100"})
    @DisplayName("Spidey eats successfully")
    void eat(String barType, int expectedValue, Spiderman spiderman) {
        spiderman.takeDamage(90);
        spiderman.eat(barType);
        assertEquals(expectedValue, spiderman.getHealth());
    }


}