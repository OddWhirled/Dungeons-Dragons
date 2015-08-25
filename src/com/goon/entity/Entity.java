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
public abstract class Entity {

    protected Inventory inv;
    protected Weapon weapon;
    
    protected String name;
    protected int id;
    
    protected int attack;
    protected int defense;
    protected int health;
    protected int experience;

    public void attack(Entity entity) {
        entity.damage(attack + weapon.getDamage());
    }

    public void move() {

    }
    
    public void damage(int amount) {
        health -= amount;
    }
}
