package inlämningsuppgift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    @Test
    public void testRaderplus() {
        Räknar räknar = new Räknar();
        assertEquals(1, räknar.raderplus());
        assertEquals(2, räknar.raderplus());
    }

    @Test
    public void testTextlengdthplus() {
        Räknar räknar = new Räknar();
        räknar.Textlengdthplus("hej");
        assertEquals(3, räknar.getTextlengdth());

        räknar.Textlengdthplus("världen");
        assertEquals(10, räknar.getTextlengdth());
    }

    @Test
    public void testMethoder() {
        Räknar räknar = new Räknar();
        räknar.raderplus();
        räknar.raderplus();
        räknar.Textlengdthplus("test");

        assertEquals(2, räknar.getRader());
        assertEquals(4, räknar.getTextlengdth());
    }

    @Test
    public void testTextmedmellanslag() {
        Räknar räknar = new Räknar();
        räknar.Textlengdthplus("hej                              hej");
        assertEquals(6, räknar.getTextlengdth());
    }

}