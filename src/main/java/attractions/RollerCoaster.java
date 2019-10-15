package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    private double defaultPrice = 8.40;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
//        this.defaultPrice = defaultPrice;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 13 || visitor.getHeight() < 146.00 ) {
            return false;
        }
        return true;
    }

    public double defaultPrice() {
        return this.defaultPrice;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200) {
            return defaultPrice * 2;
        }
        return defaultPrice;
    }


}
