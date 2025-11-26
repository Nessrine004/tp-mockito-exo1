package ex2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatriceRealTest {

    @Test
    void testAddAvecClasseReelle() {

        IAddition realAdd = new Additionneur();

        Calculatrice calc = new Calculatrice(realAdd);

        int resultat = calc.calcSomme(10, 20);

        assertEquals(30, resultat);
    }
}
