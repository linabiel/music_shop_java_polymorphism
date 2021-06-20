import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StockTest {

    private Stock stock;
    private Piano grand;
    private Piano upright;

    @Before
    public void before() {
        stock = new Stock();
        grand = new Piano("Wood", "Dark", "Grand", 2000, 2400, 84);
        upright = new Piano("Wood", "Light", "Upright", 1000, 2400, 64);
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
}
