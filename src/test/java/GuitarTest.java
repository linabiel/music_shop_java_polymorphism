import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Wood", "Amber", "Acoustic", 500, 300, 6);;
    }

    @Test
    public void getGuitarBuyingPrice() {
        assertEquals(500, guitar.getBuyingPrice(), 0.00);
    }

    @Test
    public void getMarkupPrice() {
        assertEquals(100, guitar.calculateMarkup(), 0.00);
    }

    @Test
    public void getSellingPrice() {
        guitar.setSellingPrice();
        assertEquals(600, guitar.getSellingPrice(), 0.00);
    }

    @Test
    public void getToPlay() {
        assertEquals("playing whow whow", guitar.play("whow whow"));
    }
}