package attractions;

import behaviours.IReviewed;

public class Dodgems extends Attraction implements IReviewed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public String getName(String name) {
        return name;
    }

    public int getRating(int rating) {
        return rating;
    }
}
