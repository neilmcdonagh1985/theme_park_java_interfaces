package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitor = new Visitor(17, 5.5, 15.0);
        visitor2 = new Visitor(18, 5.11, 30.0);

    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName("Jacks Drum"));
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canAllowTobacco() {
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void canRefuseTobacco() {
        assertEquals(true, tobaccoStall.isAllowedTo(visitor2));
    }

    @Test
    public void canGetRating() {
        assertEquals(6, tobaccoStall.getRating(6));
    }
}
