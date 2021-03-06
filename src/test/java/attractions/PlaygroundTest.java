package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(14, 5.8, 5.0);
        visitor2 = new Visitor(16, 5.11, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName("Fun Zone"));
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating(7));
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void ifIsAllowedTo() {
        assertEquals(false, playground.isAllowedTo(visitor));
    }

    @Test
    public void ifNotAllowedTo() {
        assertEquals(true, playground.isAllowedTo(visitor2));
    }
}
