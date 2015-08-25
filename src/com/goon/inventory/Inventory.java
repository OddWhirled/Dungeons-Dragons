/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goon.inventory;

import com.goon.item.Item;

/**
 *
 * @author Drew
 */
public class Inventory {
    
    private Item[][] slots;
    
    public Inventory(int sizeX, int sizeY) {
        slots = new Item[sizeX][sizeY];
        java.util.Arrays.fill(slots, null);
    }
    
    public void add(int x, int y, Item item) {
        slots[x][y] = item;
    }
    
    public void remove(int x, int y) {
        slots[x][y] = null;
    }
    
    public void print() {
        System.out.print("");
    }
}
