/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.input;

import java.awt.event.*;

/**
 *
 * @author Nicholas Wright
 */
public class MouseInput implements MouseListener, MouseMotionListener {

    /**Attributes*/
    
    /**NUM_BUTTONS variable of MouseInput*/
    private static final int NUM_BUTTONS = 256;
    
    /**mouseX variable of MouseInput*/
    public static float MouseX;
    
    /**mouseX variable of MouseInput*/
    public static float MouseY;
    
    /**mouseDX variable of MouseInput*/
    public static int MouseDX;
    
    /**mouseDY variable of MouseInput*/
    public static int MouseDY;
    
    /**mousePX variable of MouseInput*/
    public static int MousePX;
    
    /**mousePY variable of MouseInput*/
    public static int MousePY;
    
    /**MouseButton variable of MouseInput*/
    public static int MouseButton = 0;
    
    /**buttons variable of MouseInput*/
    public static boolean[] buttons = new boolean[NUM_BUTTONS];
    
    /**dragged variable of MouseInput*/
    public static boolean dragged;
    
    /**moving variable of MouseInput*/
    public static boolean moving;
    
    /**lastButtons variable of MouseInput*/
    public static boolean[] lastButtons = new boolean[NUM_BUTTONS];
    
    
    /**Links*/
    
    
    /**Constructor*/
    
    
    
    /**Public Protocol*/
    
    
    /**
     * mouseClicked(MouseEvent m)
     * 
     * @param m
     */
    @Override
    public void mouseClicked(MouseEvent m) {
        
    }

    
    /**
     * mousePressed(MouseEvent m)
     * 
     * @param m
     */
    @Override
    public void mousePressed(MouseEvent m) {
        MousePX = m.getX();
        MousePY = m.getY();
        MouseButton = m.getButton();
        buttons[m.getButton()] = true;
    }

    
    /**
     * mouseReleased(MouseEvent m)
     * 
     * @param m
     */
    @Override
    public void mouseReleased(MouseEvent m) {
        dragged = false;
        MouseButton = 0;
        buttons[m.getButton()] = false;
    }

    
    /**
     * mouseEntered(MouseEvent m)
     * 
     * @param m
     */
    @Override
    public void mouseEntered(MouseEvent m) {
        
    }

    
    /**
     * mouseExited(MouseEvent m)
     * 
     * @param m
     */
    @Override
    public void mouseExited(MouseEvent m) {
        
    }
    

    /**
     * mouseDragged(MouseEvent m)
     * 
     * @param m
     */
    @Override
    public void mouseDragged(MouseEvent m) {
        MouseDX = m.getX();
        MouseDY = m.getY();
    }
    

    /**
     * mouseMoved(MouseEvent m)
     * 
     * @param m
     */
    @Override
    public void mouseMoved(MouseEvent m) {
        MouseX = m.getX();
        MouseY = m.getY();
        moving = true;
    }
    

    /**
     * getMouseX()
     * 
     * @return MouseX
     */
    public static float getMouseX() {
        return MouseX;
    }
    

    /**
     * getMouseY()
     * 
     * @return MouseY
     */
    public static float getMouseY() {
        return MouseY;
    }
    

    /**
     * isMoving()
     * 
     * @return moving
     */
    public static boolean isMoving() {
        return moving;
    }
    
    
    /**
     * isButtonDown(int btn)
     * 
     * @param btn
     * 
     * @return buttons[btn]
     */
    public static boolean isButtonDown(int btn) {
        return buttons[btn];
    }
    
    
    /**
     * wasPressed(int btn)
     * 
     * @param btn
     * 
     * @return isButtonDown(btn) && !lastButtons[btn]
     */
    public static boolean wasPressed(int btn) {
        return isButtonDown(btn) && !lastButtons[btn];
    }
    
    
    /**
     * wasReleased(int btn)
     * 
     * @param btn
     * 
     * @return !isButtonDown(btn) && lastButtons[btn]
     */
    public static boolean wasReleased(int btn) {
        return !isButtonDown(btn) && lastButtons[btn];
    }
    
}
