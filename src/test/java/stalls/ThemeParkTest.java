package stalls;

import attractions.Attraction;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollerCoaster;
    IceCreamStall iceCreamStall;



    @Before
    public void before(){
        themePark = new ThemePark("Fun in the Sun");
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4);
    }

    @Test
    public void hasListOfReviewedItems() {
        assertEquals(0, themePark.countReviewedItems());
    }

    @Test
    public void canAddReviewedItem() {
        themePark.addReviewedItem(rollerCoaster);
        themePark.addReviewedItem(iceCreamStall);
        assertEquals(2, themePark.countReviewedItems());
    }
}
