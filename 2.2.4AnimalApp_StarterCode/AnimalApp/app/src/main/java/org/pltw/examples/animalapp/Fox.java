package org.pltw.examples.animalapp;

/**
 * Created by justi on 1/30/2018.
 */

public class Fox extends Animal implements Fun {
    public String say()
    {
        return "Joff-tchoff-tchoffo-tchoffo-tchoff!";
    }
    public String play() //step 29
    {
        return "The fox chases mice and digs holes!";
    }
    public Fox(){}
}
