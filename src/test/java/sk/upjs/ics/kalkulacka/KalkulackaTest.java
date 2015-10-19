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

    @Test(timeout = 1000)
    public void testNasobanie() {
        int vysledok = kalkulacka.nasob(10, 12);
        Assert.assertEquals(120, vysledok);
    }

    @Test(timeout = 1000)
    public void testOdmocnina() {
        int vysledok = (int) kalkulacka.druhaOdmocnina(-64);
        Assert.assertEquals(-8, vysledok);
    }

}
