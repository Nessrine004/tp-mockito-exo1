package test;

import main.CalculatriceAire;
import main.Cercle;
import main.IForme;
import main.Rectangle;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class CalculatriceAireTest {

    @Test
    void testAireSansMockito() {
        List<IForme> formes = Arrays.asList(
                new Cercle(2.0),
                new Rectangle(2, 4)
        );

        double resultat = CalculatriceAire.aire(formes);

        // 12.56 + 8 = 20.56
        assertEquals(20.56, resultat, 0.01);
    }

    @Test
    void testAireAvecMockito() {
        IForme carre = mock(IForme.class);

        when(carre.aire()).thenReturn(4.0);

        List<IForme> formes = Arrays.asList(
                new Cercle(2.0),
                new Rectangle(2, 4),
                carre
        );

        double resultat = CalculatriceAire.aire(formes);

        assertEquals(24.56, resultat, 0.01);

        verify(carre, times(1)).aire();
    }
}
