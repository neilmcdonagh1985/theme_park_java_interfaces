package stalls;

import behaviours.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> ridesAndStalls;


    public ThemePark(String name) {
        this.ridesAndStalls = new ArrayList<IReviewed>();
    }

    public int countReviewedItems() {
        return this.ridesAndStalls.size();

    }

    public ArrayList<IReviewed> returnAllReviewed() {
        return ridesAndStalls;

    }

    public void addReviewedItem(IReviewed item) {
        this.ridesAndStalls.add(item);
    }
}
