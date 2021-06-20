import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        double markup = 500 * 0.2;
        double sellingPrice = 500 + markup;
        guitar = new Guitar("Wood", "Amber", "Accoustic", 500, sellingPrice, 6);;
    }

    @Test
    public void getPianoBuyingPrice() {
        assertEquals(500, guitar.getBuyingPrice(), 0.00);
    }

    @Test
    public void getMarkupPrice() {
        assertEquals(100, guitar.calculateMarkup(), 0.00);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(600, guitar.getSellingPrice(), 0.00);
    }
}