package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 13 || visitor.getHeight() < 146.00 ) {
            return false;
        }
        return true;
    }

    public String getName(String name) {
        return name;
    }

    public int getRating(int rating) {
        return rating;
    }
}
