/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goon.item;

/**
 *
 * @author Drew
 */
public class Edible extends Item {

    private int saturation;

    public Edible(String name) {
        super(name);
    }

    /**
     * @return the saturation
     */
    public int getSaturation() {
        return saturation;
    }

}
