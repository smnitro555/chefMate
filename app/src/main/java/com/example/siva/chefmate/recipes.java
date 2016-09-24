package com.example.siva.chefmate;

import java.util.ArrayList;

/**
 * Created by Siva on 9/24/2016.
 */

public abstract class recipes {

    abstract ArrayList<String> getIngredients();

    abstract ArrayList<Integer> getIngredientAmounts();

    abstract ArrayList<String> getStep(int stepNumber);

    }

