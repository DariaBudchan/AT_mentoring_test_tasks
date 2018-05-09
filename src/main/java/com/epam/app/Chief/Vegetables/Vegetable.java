package com.epam.app.Chief.Vegetables;

import com.epam.app.Chief.CustomExceptions.NonExistingColourException;
import com.epam.app.Chief.CustomExceptions.NonExistingShapeException;
import com.epam.app.Chief.CustomExceptions.NonExistingTasteException;
import com.epam.app.Chief.Enums.Colour;
import com.epam.app.Chief.Enums.Shape;
import com.epam.app.Chief.Enums.Taste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Daria Budchan, May, 2018
 */

public abstract class Vegetable implements Comparable{

    public Shape shape;
    public Colour colour;
    public Double weight;
    public Taste taste;

    public Vegetable(Double weight){
        this.weight = weight;
    }

    public int compareTo(Vegetable vegetable) {
        return this.weight.compareTo(vegetable.weight);
    }

}
