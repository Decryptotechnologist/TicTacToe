/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.states;

import com.LOGamez.audio.Sound;
import com.LOGamez.graphics.Texture;
import com.LOGamez.tictactoe.*;
import com.LOGamez.utils.Fonts;
import com.LOGamez.input.MouseInput;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 * 
 * @author Nicholas Wright
 */
public class MenuState implements State {
    
    /**Attributes*/
    
    /**menuImageX variable of MenuState*/
    private int menuImageX = 0;
    
    /**menuImageY variable of MenuState*/
    private int menuImageY = 0;
    
    /**menuImageW variable of MenuState*/
    private int menuImageW = TicTacToe.getMainWidth()+12;
    
    /**menuImageH variable of MenuState*/
    private int menuImageH = TicTacToe.getMainHeight()-15;
    
    /**menuImage BufferedImage of MenuState*/
    private BufferedImage menuImage;
    
    /**menuImage BufferedImage of MenuState*/
    private BufferedImage menuImage0;
    
    /**menuImage BufferedImage of MenuState*/
    private BufferedImage menuImage1;
    
    /**menuImage BufferedImage of MenuState*/
    private BufferedImage menuImage2;
    
    /**menuImage BufferedImage of MenuState*/
    private BufferedImage menuImage3;
    
    
    
    
    /**leftArrowIcon BufferedImage of MenuState*/
    private final BufferedImage leftArrowIcon;
    
    /**rightArrowIcon BufferedImage of MenuState*/
    private final BufferedImage rightArrowIcon;
    
    /**arrowIconXOffs variable of MenuState*/
    private int arrowIconX = 70;
    
    /**arrowIconYOffs variable of MenuState*/
    private int arrowIconYOffs = 26;
    
    /**arrowIconW variable of MenuState*/
    private int arrowIconW = 22;
    
    /**arrowIconH variable of MenuState*/
    private int arrowIconH = 20;
    
    
    /**hlpCol variable of MenuState*/
    public Color hlpCol = Color.orange;
    
    /**hlpFont variable of MenuState*/
    public Font hlpFont = new Font("Times New Roman", Font.PLAIN, 16);
    
    
    
    /**playOffBtn BufferedImage of MenuState*/
    private final BufferedImage playOffBtn;
    
    /**playOnBtn BufferedImage of MenuState*/
    private final BufferedImage playOnBtn;
    
    /**playBtnX variable of MenuState*/
    private int playBtnX = 66;
    
    /**playBtnY variable of MenuState*/
    private int playBtnY = 308;
    
    /**playBtnW variable of MenuState*/
    private int playBtnW = 160;
    
    /**playBtnH variable of MenuState*/
    private int playBtnH = 60;
    
    
    /**optionsOffBtn BufferedImage of MenuState*/
    private final BufferedImage optionsOffBtn;
    
    /**optionsOnBtn BufferedImage of MenuState*/
    private final BufferedImage optionsOnBtn;
    
    /**optionsBtnX variable of MenuState*/
    private int optionsBtnX = 86;
    
    /**optionsBtnY variable of MenuState*/
    private int optionsBtnY = 372;
    
    /**optionsBtnW variable of MenuState*/
    private int optionsBtnW = 260;
    
    /**optionsBtnH variable of MenuState*/
    private int optionsBtnH = 60;
    
    
    /**helpOffBtn BufferedImage of MenuState*/
    private final BufferedImage helpOffBtn;
    
    /**helpOnBtn BufferedImage of MenuState*/
    private final BufferedImage helpOnBtn;
    
    /**helpBtnX variable of MenuState*/
    private int helpBtnX = 66;
    
    /**helpBtnY variable of MenuState*/
    private int helpBtnY = 432;
    
    /**helpBtnW variable of MenuState*/
    private int helpBtnW = 160;
    
    /**helpBtnH variable of MenuState*/
    private int helpBtnH = 60;
    
    
    /**quitOffBtn BufferedImage of MenuState*/
    private final BufferedImage quitOffBtn;
    
    /**quitOnBtn BufferedImage of MenuState*/
    private final BufferedImage quitOnBtn;
    
    /**quitBtnX variable of MenuState*/
    private int quitBtnX = 66;
    
    /**quitBtnY variable of MenuState*/
    private int quitBtnY = 492;
    
    /**quitBtnW variable of MenuState*/
    private int quitBtnW = 160;
    
    /**quitBtnH variable of MenuState*/
    private int quitBtnH = 60;
    
    
    /**aboutOffBtn BufferedImage of MenuState*/
    private final BufferedImage aboutOffBtn;
    
    /**aboutOnBtn BufferedImage of MenuState*/
    private final BufferedImage aboutOnBtn;
    
    /**aboutBtnX variable of MenuState*/
    private int aboutBtnX = TicTacToe.getMainWidth() - 90;
    
    /**aboutBtnY variable of MenuState*/
    private int aboutBtnY = TicTacToe.getMainHeight() - 100;
    
    /**aboutBtnW variable of MenuState*/
    private int aboutBtnW = 80;
    
    /**aboutBtnH variable of MenuState*/
    private int aboutBtnH = 30;
    
    
    /**versionCol variable of MenuState*/
    public Color versionCol = Color.DARK_GRAY;
    
    /**versionFont variable of MenuState*/
    public Font versionFont = new Font("Times New Roman", Font.PLAIN, 12);
    
    /**versionX variable of MenuState*/
    private int versionX = TicTacToe.getMainWidth() - 50;
    
    /**versionY variable of MenuState*/
    private int versionY = TicTacToe.getMainHeight() - 40;
    
    
    
    
    
    
    /**Constructor*/
    
    
    /**
    * MenuState Constructor
    * 
    * Creates a new MenuState object
    * 
    */
    public MenuState() {
        System.out.println("MenuState: New Menu State Created");
        
        //Setup MenuState: Button Images
        playOffBtn = new Texture("/buttons/play_off1").getImage();
        playOnBtn = new Texture("/buttons/play_on1").getImage();
        optionsOffBtn = new Texture("/buttons/options_off1").getImage();
        optionsOnBtn = new Texture("/buttons/options_on1").getImage();
        helpOffBtn = new Texture("/buttons/help_off1").getImage();
        helpOnBtn = new Texture("/buttons/help_on1").getImage();
        quitOffBtn = new Texture("/buttons/quit_off1").getImage();
        quitOnBtn = new Texture("/buttons/quit_on1").getImage();
        aboutOffBtn = new Texture("/buttons/about_off1").getImage();
        aboutOnBtn = new Texture("/buttons/about_on1").getImage();

        //Setup MenuState: Arrow Images
        leftArrowIcon = new Texture("/menu/arrow").getImage();
        rightArrowIcon = new Texture("/menu/arrowR").getImage();
        
        try {
            //Setup MenuState: Background Images
            menuImage = ImageIO.read(MenuState.class.getResource("/menu/menuState_1.png"));
            menuImage0 = ImageIO.read(MenuState.class.getResource("/menu/menuState_1.png"));
            menuImage2 = ImageIO.read(MenuState.class.getResource("/menu/menuState_2.png"));
            menuImage1 = ImageIO.read(MenuState.class.getResource("/menu/menuState_3.png"));
            menuImage3 = ImageIO.read(MenuState.class.getResource("/menu/menuState_4.png"));
        } catch (IOException ex) {
            Logger.getLogger(MenuState.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    /**Public Protocol*/
    
    
    /**
    * tick(StateManager statemanager, Game game)
    * 
    * Updates MenuState Object
    * 
    * @param statemanager
    * @param game
    */
    @Override
    public void tick(StateManager statemanager, Game game){        
    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * Renders/Repaints MenuState Objects
     * 
     * @param g
     */
    @Override
    public void render(Graphics2D g){
        MouseInput.MouseButton = 0;
        
        //Draw Background
        g.drawImage(menuImage, menuImageX, menuImageY, menuImageW, menuImageH, null);
        
        //Draw Play Button
        if (MouseInput.MouseX > playBtnX && MouseInput.MouseX < playBtnX + playBtnW && MouseInput.MouseY > playBtnY && MouseInput.MouseY < playBtnY + playBtnH) {
                g.drawImage(playOffBtn, playBtnX, playBtnY, playBtnW, playBtnH, null);
                menuImage = menuImage0;
                hlpCol = Color.orange;
                versionCol = Color.DARK_GRAY;
                
                //Draw Play Button Arrows
                if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                    g.drawImage(leftArrowIcon, playBtnX + playBtnW - 30, playBtnY + playBtnH/2 - arrowIconH/2, arrowIconW, arrowIconH, null);
                    g.drawImage(rightArrowIcon, arrowIconX, playBtnY + playBtnH/2 - arrowIconH/2, arrowIconW, arrowIconH, null);
                }
                TicTacToe.setStatusBar("Play");
                
                //Set Play Button Click Logic
                if (MouseInput.MouseButton == 1) {
                    Sound.stopAll();
                    Sound.btnPushed.play();
                    
                    System.out.println("MenuState: Play Selected");
                    Game.getGame().setStart();
                    //Game.getGame().setKeys();
                    //config.loadConfiguration("res/sys/config.xml");
                }
            } else {
                g.drawImage(playOnBtn, playBtnX, playBtnY, playBtnW, playBtnH, null);
            }

            //Draw Options Button
            if (MouseInput.MouseX > optionsBtnX && MouseInput.MouseX < optionsBtnX + optionsBtnW && MouseInput.MouseY > optionsBtnY && MouseInput.MouseY < optionsBtnY + optionsBtnH) {
                g.drawImage(optionsOffBtn, optionsBtnX, optionsBtnY, optionsBtnW, optionsBtnH, null);
                menuImage = menuImage1;
                hlpCol = Color.red;
                versionCol = Color.white;
                
                //Draw Options Button Arrows
                if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                    g.drawImage(leftArrowIcon, optionsBtnX + optionsBtnW - 6, optionsBtnY + optionsBtnH/2 - arrowIconH/2, arrowIconW, arrowIconH, null);
                    g.drawImage(rightArrowIcon, arrowIconX, optionsBtnY + optionsBtnH/2 - arrowIconH/2, arrowIconW, arrowIconH, null);
                }
                TicTacToe.setStatusBar("Options");
                
                //Set Options Button Click Logic
                if (MouseInput.MouseButton == 1) {
                    Sound.stopAll();
                    Sound.btnPushed.play();

                    System.out.println("MenuState: Options Selected");
                    Game.getGame().setOptions();
                }
                
            } else {
                g.drawImage(optionsOnBtn, optionsBtnX, optionsBtnY, optionsBtnW, optionsBtnH, null);
            }

            //Draw Help Button
            if (MouseInput.MouseX > helpBtnX && MouseInput.MouseX < helpBtnX + helpBtnW && MouseInput.MouseY > helpBtnY && MouseInput.MouseY < helpBtnY + helpBtnH) {
                g.drawImage(helpOffBtn, helpBtnX, helpBtnY, helpBtnW, helpBtnH, null);
                menuImage = menuImage2;
                hlpCol = Color.green;
                versionCol = Color.red;
                
                //Draw Help Button Arrows
                if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                    g.drawImage(leftArrowIcon, helpBtnX + helpBtnW - 30, helpBtnY + helpBtnH/2 - arrowIconH/2, arrowIconW, arrowIconH, null);
                    g.drawImage(rightArrowIcon, arrowIconX, helpBtnY + helpBtnH/2 - arrowIconH/2, arrowIconW, arrowIconH, null);
                }
                TicTacToe.setStatusBar("Help");
                
                //Set Help Button Click Logic
                if (MouseInput.MouseButton == 1) {
                    Sound.stopAll();
                    Sound.btnPushed.play();
                    
                    System.out.println("MenuState: Help Selected");
                    Game.getGame().setInstructions();
                }
                
            } else {
                g.drawImage(helpOnBtn, helpBtnX, helpBtnY, helpBtnW, helpBtnH, null);
            }

            //Draw Quit Button
            if (MouseInput.MouseX > quitBtnX && MouseInput.MouseX < quitBtnX + quitBtnW && MouseInput.MouseY > quitBtnY && MouseInput.MouseY < quitBtnY + quitBtnH) {
                g.drawImage(quitOffBtn, quitBtnX, quitBtnY, quitBtnW, quitBtnH, null);
                menuImage = menuImage3;
                hlpCol = Color.blue;
                versionCol = Color.CYAN;
                
                //Draw Quit Button Arrows
                if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                    g.drawImage(leftArrowIcon, quitBtnX + quitBtnW - 30, quitBtnY + quitBtnH/2 - arrowIconH/2, arrowIconW, arrowIconH, null);
                    g.drawImage(rightArrowIcon, arrowIconX, quitBtnY + quitBtnH/2 - arrowIconH/2, arrowIconW, arrowIconH, null);
                }
		TicTacToe.setStatusBar("Quit?");
                
                //Set Quit Button Click Logic
                if (MouseInput.MouseButton == 1) {
                    Sound.stopAll();
                    Sound.btnPushed.play();
                    TicTacToe.setStatusBar("Quit Game?");
                    
                    System.out.println("MenuState: Quit Selected");
                    Game.getGame().quitGame();
                }
                
            } else {
                g.drawImage(quitOnBtn, quitBtnX, quitBtnY, quitBtnW, quitBtnH, null);
            }
            
            //Draw About Button
            if (MouseInput.MouseX > aboutBtnX && MouseInput.MouseX < aboutBtnX + aboutBtnW && MouseInput.MouseY > aboutBtnY && MouseInput.MouseY < aboutBtnY + aboutBtnH) {
                g.drawImage(aboutOffBtn, aboutBtnX, aboutBtnY, aboutBtnW, aboutBtnH, null);
                
                //Draw About Button Arrows
                if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                    g.drawImage(leftArrowIcon, aboutBtnX + aboutBtnW - 10, aboutBtnY + aboutBtnH/2 - arrowIconH/2, arrowIconW, arrowIconH, null);
                    g.drawImage(rightArrowIcon, aboutBtnX - 10, aboutBtnY + aboutBtnH/2 - arrowIconH/2, arrowIconW, arrowIconH, null);
                }
		TicTacToe.setStatusBar("About");
                
                //Set About Button Click Logic
                if (MouseInput.MouseButton == 1) {
                    Sound.stopAll();
                    Sound.btnPushed.play();
                    
                    System.out.println("MenuState: About Selected");
                    
                    Game.getGame().setAbout();
                }
                
            } else {
                g.drawImage(aboutOnBtn, aboutBtnX, aboutBtnY, aboutBtnW, aboutBtnH, null);
            }
            
            //Draw Version
            Fonts.drawString(g, versionFont, versionCol, Game.version, versionX, versionY);
            
            if(!(MouseInput.MouseX > playBtnX && MouseInput.MouseX < playBtnX + playBtnW && MouseInput.MouseY > playBtnY && MouseInput.MouseY < playBtnY + playBtnH) && 
                    !(MouseInput.MouseX > optionsBtnX && MouseInput.MouseX < optionsBtnX + optionsBtnW && MouseInput.MouseY > optionsBtnY && MouseInput.MouseY < optionsBtnY + optionsBtnH) && 
                    !(MouseInput.MouseX > helpBtnX && MouseInput.MouseX < helpBtnX + helpBtnW && MouseInput.MouseY > helpBtnY && MouseInput.MouseY < helpBtnY + helpBtnH) && 
                    !(MouseInput.MouseX > quitBtnX && MouseInput.MouseX < quitBtnX + quitBtnW && MouseInput.MouseY > quitBtnY && MouseInput.MouseY < quitBtnY + quitBtnH) && 
                    !(MouseInput.MouseX > aboutBtnX && MouseInput.MouseX < aboutBtnX + aboutBtnW && MouseInput.MouseY > aboutBtnY && MouseInput.MouseY < aboutBtnY + aboutBtnH)){
                TicTacToe.setStatusBar("Ready");
            }
            
    }

    
    /**
    * init()
    * 
    */
    @Override
    public void init() {
        System.out.println("MenuState: Initiating Menu State . . .");
    }

    
    /**
    * enter()
    * 
    */
    @Override
    public void enter() {
        System.out.println("MenuState: Entering Menu State . . .");
        Sound.stopAll();
        Sound.Menu.play();
    }

    
    /**
    * exit()
    * 
    */
    @Override
    public void exit() {
        System.out.println("MenuState: Exiting Menu State . . .");
        Sound.stopAll();
    }

    
    /**
    * getName()
    * 
    * @return "menu" - name of State
    */
    @Override
    public String getName() {
        return "menu";
    }
   
}
