package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(12, 147, 15.00);
        visitor2 = new Visitor(16, 143, 10.00);
        visitor3 = new Visitor(18, 146, 12.00);
        visitor4 = new Visitor(19,201, 35.00);

    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName("Blue Ridge"));
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating(10));
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canNotAllow() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canAllow() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void canChargeDoubleFee() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor4), 0.01);
    }

    @Test
    public void canChargeDefaultFee() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor3),0.01);
    }
}
