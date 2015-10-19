package sk.upjs.ics.kalkulacka;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KalkulackaTest {
    private Kalkulacka kalkulacka;

    @Before
    public void setUp() throws Exception {
        kalkulacka = new Kalkulacka();
    }

    @Test(timeout = 1000)
    public void testScitanie() {
        int vysledok = kalkulacka.scitaj(1, 1);
        Assert.assertEquals(2, vysledok);
    }

    @Test
    public void testDelenie() {
        int podiel = kalkulacka.vydel(4, 2);
        Assert.assertEquals(2, podiel);
    }

    @Test(expected = ArithmeticException.class)
    public void testDelenieNulou() {
        int podiel = kalkulacka.vydel(4, 0);
    }
}
