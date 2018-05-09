package com.epam.app.Chief.Vegetables;

import com.epam.app.Chief.Enums.Colour;
import com.epam.app.Chief.Enums.Shape;
import com.epam.app.Chief.Enums.Taste;

/**
 * Author: Daria Budchan, May, 2018
 */

public class Cucumber extends Vegetable {

    public Cucumber(Double weight){
        super(weight);
        this.colour = Colour.GREEN;
        this.shape = Shape.ELLIPSE;
        this.taste = Taste.SALTY;
    }

    public int compareTo(Object o) {
        return super.compareTo((Vegetable) o);
    }
}
