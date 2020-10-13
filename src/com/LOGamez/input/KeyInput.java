/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.input;

import com.LOGamez.audio.Sound;
import com.LOGamez.level.Level;
import com.LOGamez.menu.Menu;
import com.LOGamez.menu.PauseMenu;
import com.LOGamez.tictactoe.Game;
import com.LOGamez.player.Player;
import java.awt.event.*;

/**
 *
 * @author Nicholas Wright
 */
public class KeyInput extends KeyAdapter implements FocusListener {

    /**Attributes*/
    
    /**NUM_KEYS variable of KeyInput*/
    private static final int NUM_KEYS = 256;
    
    /**keys variable of KeyInput*/
    public static final boolean[] keys = new boolean[NUM_KEYS];
    
    /**lastKeys variable of KeyInput object*/
    public static final boolean[] lastKeys = new boolean[NUM_KEYS];
    
    /**up variable of KeyInput*/
    private static boolean up;
    
    /**down variable of KeyInput*/
    private static boolean down;
    
    /**left variable of KeyInput*/
    private static boolean left;
    
    /**right variable of KeyInput*/
    private static boolean right;
    
    /**fire variable of KeyInput*/
    private static boolean fire;
    
    
    
    /**Links*/
    
    
    
    
    /**Constructor*/
    
    
    /**
     * isKeyDown(int key)
     * 
     * @param key
     * @return keys[key]
     */
    public static boolean isKeyDown(int key) {
        return keys[key];
    }

    
    /**
     * keyPressed(KeyEvent e)
     * 
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e){
        keys[e.getKeyCode()] = true;
    }

    
    /**
     * keyReleased(KeyEvent e)
     * 
     * @param e
     */
    @Override
    public void keyReleased(KeyEvent e){
        keys[e.getKeyCode()] = false;
    }

    
    /**
     * wasPressed(int key)
     * 
     * @param key
     * @return isKeyDown(key) && !lastKeys[key]
     */
    public static boolean wasPressed(int key) {
        return isKeyDown(key) && !lastKeys[key];
    }
    
    
    /**
     * wasReleased(int key)
     * 
     * @param key
     * @return !isKeyDown(key) && lastKeys[key]
     */
    public static boolean wasReleased(int key) {
        return !isKeyDown(key) && lastKeys[key];
    }

    
    /**
     * focusLost(FocusEvent fe)
     * 
     * @param fe
     */
    @Override
    public void focusLost(FocusEvent fe) {
        for(int i = 0; i < keys.length; i++){
            keys[i] = false;
        }
    }
    
    
    /**
     * focusGained(FocusEvent fe)
     * 
     * @param fe
     */
    @Override
    public void focusGained(FocusEvent fe) {
        
    }
    
    
    /**
     * tick(Game game, Menu menu, Player player)
     * 
     * @param game
     * @param menu
     * @param player
     */
    public static void tick(Game game, Menu menu, Player player){
        up = false;
        down = false;
        left = false;
        right = false;
        fire = false;
        
        up = keys[KeyEvent.VK_W] || keys[KeyEvent.VK_UP];
        down = keys[KeyEvent.VK_S] || keys[KeyEvent.VK_DOWN];
        left = keys[KeyEvent.VK_A] || keys[KeyEvent.VK_LEFT];
        right = keys[KeyEvent.VK_D] || keys[KeyEvent.VK_RIGHT];
        fire = keys[KeyEvent.VK_SPACE];
        
        if(fire){
            keys[KeyEvent.VK_SPACE] = false;
        }
        
        if(keys[KeyEvent.VK_ESCAPE]) {
            keys[KeyEvent.VK_ESCAPE] = false;
            if (menu == null) {
                game.setMenu(new PauseMenu());
                Game.paused = true;
            } else {
                game.setMenu(null);
                Game.paused = false;
                Sound.Paused.stop();
            }
        }
        
        if(keys[KeyEvent.VK_M]){
            keys[KeyEvent.VK_M] = false;
//            Level.generateTerrain();
        }
        
        if (menu != null) {
            menu.tick(game, up, down, left, right, fire);
        } else {
            if(game.hasFocus()){
//                player.tick(game, up, down, left, right, fire);
            }
        }
        
        
        for(int i = 0; i < NUM_KEYS; i++){
            lastKeys[i] = keys[i];
        }
    }
    
}
