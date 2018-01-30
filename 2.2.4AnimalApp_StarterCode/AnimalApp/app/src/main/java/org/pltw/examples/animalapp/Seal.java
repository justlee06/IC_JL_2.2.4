package org.pltw.examples.animalapp;

/**
 * Created by justi on 1/29/2018.
 */

public class Seal extends Animal implements Fun {
    public String say() //step 14
    {
        return "The seal goes ow ow ow";
    }
    public String play() //step 25
    {
        return "The seal bounces a ball off its nose";
    }
    public Seal(){}
}
