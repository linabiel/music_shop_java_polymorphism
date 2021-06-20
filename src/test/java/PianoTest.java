import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Wood", "Dark", "Grand", 2000, 2400, 84);
    }

    @Test
    public void getPianoBuyingPrice() {
        assertEquals(2000, piano.getBuyingPrice(), 0.00);
    }

    @Test
    public void getMarkupPrice() {
        assertEquals(400, piano.calculateMarkup(), 0.00);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(2400, piano.getSellingPrice(), 0.00);
    }
}
