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
public class Tool extends Item {
    
    protected int damage;

    public Tool(String name) {
        super(name);
    }

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }
    
}
