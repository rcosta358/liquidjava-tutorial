package com.tutorial.part2;

import liquidjava.specification.StateRefinement;
import liquidjava.specification.StateSet;

@StateSet({"on", "off"})
public class LightBulb {

    @StateRefinement(to="off(this)")
    public LightBulb() {}

    @StateRefinement(from="off(this)", to="on(this)")
    public void turnOn() {}

    @StateRefinement(from="on(this)", to="off(this)")
    public void turnOff() {}

    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        bulb.turnOn();
        bulb.turnOff();
        // bulb.turnOff(); // uncomment for error
    }
}
