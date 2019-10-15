package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    private double defaultPrice = 4.50;

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public String getName(String name) {
        return name;
    }

    public int getRating(int rating) {
        return rating;
    }

    public double defaultPrice() {
        return this.defaultPrice;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return defaultPrice / 2;
        }
        return defaultPrice;
    }
}
