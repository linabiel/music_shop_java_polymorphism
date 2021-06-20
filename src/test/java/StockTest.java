import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockTest {

    private Stock stock;
    private Piano grand;
    private Piano upright;
    private Piano digital;

    @Before
    public void before() {
        stock = new Stock();
        grand = new Piano("Wood", "Dark", "Grand", 2000, 0, 88);
        upright = new Piano("Wood", "Light", "Upright", 1000, 0, 52);
        digital = new Piano("Wood", "Light", "Digital", 500, 0, 36);
    }

    @Test
    public void canAddPianoToStock() {
        stock.addPianoToStock(grand);
        assertEquals(1, stock.getPianoStockSize());
    }

    @Test
    public void canRemovePianoFromStock() {
        stock.addPianoToStock(grand);
        stock.addPianoToStock(upright);
        stock.removePianoFromStock(grand);
        assertEquals(1, stock.getPianoStockSize());
        assertEquals("Upright", stock.getPianoType());
    }

    @Test
    public void canTellNoPianosAreInStock() {
        assertEquals("No pianos are in stock atm", stock.getPianoType());
    }

    @Test
    public void canGetPianoTypeFromStock() {
        stock.addPianoToStock(digital);
        assertSame("Digital", stock.getPianoType());
    }

    @Test
    public void isPianoTypeNotInStock() {
        stock.addPianoToStock(grand);
        assertEquals(1, stock.getPianoStockSize());
        assertEquals("Type not in stock", stock.searchPianoByType(upright));
    }

    @Test
    public void isPianoTypeInStock() {
        stock.addPianoToStock(grand);
        stock.addPianoToStock(upright);
        assertEquals(2, stock.getPianoStockSize());
        assertEquals("Upright", stock.searchPianoByType(upright));
    }
}
