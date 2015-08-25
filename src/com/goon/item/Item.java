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
public class Item {

    protected String name;
    protected String id;

    public Item(String name) {
        this.name = name;
        this.id = name.replaceAll(" ", "").toLowerCase();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
}
