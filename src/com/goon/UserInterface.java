/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goon;

/**
 *
 * @author Drew
 */
public class UserInterface {
    
    private GameEngine game;
    
    public UserInterface(GameEngine game) {
        this.game = game;
    }

    public void getUserInput() {
        
        String input = Input.getUserInput("Type a commad: ");
        
        String[] args = input.split(" ");
        
        switch(args[0].toLowerCase()) {
            
            case "dank":
                System.out.println(args[1] + " is dank");
                break;
                
            case "eat":
                
        }
    }
}
