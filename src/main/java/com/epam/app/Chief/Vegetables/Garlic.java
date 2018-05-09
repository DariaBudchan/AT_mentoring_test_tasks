package com.epam.app.Chief.Vegetables;

import com.epam.app.Chief.Enums.Colour;
import com.epam.app.Chief.Enums.Shape;
import com.epam.app.Chief.Enums.Taste;

/**
 * Author: Daria Budchan, May, 2018
 */

public class Garlic extends Vegetable {

    public Garlic(Double weight){
        super(weight);
        this.colour = Colour.WHITE;
        this.shape = Shape.ROUND;
        this.taste = Taste.BITTER;
    }

    public int compareTo(Object o) {
        return super.compareTo((Vegetable) o);
    }
}
