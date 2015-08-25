/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goon.entity;

import com.goon.inventory.*;
import com.goon.item.*;

/**
 *
 * @author Drew
 */
public class Player extends Entity {
    
    protected Inventory inv;
    
    public Player(int atk, int def, int hlt, int exp, String nm) {
        
        inv = new Inventory(4, 4);
        name = nm;
        
        attack = atk;
        defense = def;
        health = hlt;
        experience = exp;
    }
    
    public Player(String name) {
        this(3, 3, 15, 0, name);
    }
    
    public void consume(Edible edible) {
        health += edible.getSaturation();
    }
    
}
