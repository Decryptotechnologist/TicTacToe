/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.level;

import com.LOGamez.audio.Sound;
import com.LOGamez.graphics.*;
import com.LOGamez.tictactoe.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Nicholas Wright
 */
public class Level {
    
    /**Attributes*/ 
    
    /**levelNo variable of Level*/ 
    public static int levelNo;
    
    /**levelName variable of Level*/ 
    private static String levelName;
    
    /**levelComplete variable of Level*/ 
    public static boolean levelComplete = false;
    
    /**gameComplete variable of Level*/ 
    private static boolean gameComplete;
    
    /**playerStartX variable of Level*/ 
    public static int playerStartX;
    
    /**playerStartY variable of Level*/ 
    public static int playerStartY;
    
    private static final int worldScale = 6;
    
    /**mapWidth variable of Level*/ 
    private static final int mapWidth = 1024 * worldScale;
    
    /**random variable of Level*/ 
    private static Random random;
    
    /**mapHeight variable of Level*/ 
    private static final int mapHeight = 512 * worldScale;
    
    /**map variable of Level*/ 
    private static char[] map;
    
    /**cameraPOSX variable of Level*/ 
    private static float cameraPOSX = 0;
    
    /**cameraPOSY variable of Level*/ 
    private static float cameraPOSY = 0;//900;
    
    /**tp1 variable of Level*/ 
    private static long tp1;
    
    /**tp2 variable of Level*/ 
    private static long tp2;
    
    /**levelCompleteCount variable of Level*/ 
    private int levelCompleteCount;
    
    /**levelStartCount variable of Level*/ 
    private int levelStartCount;
    
    /**firstTick variable of Level*/
    public static boolean firstTick;
    
    /**lastTick variable of Level*/
    public static boolean lastTick;
    
    /**groundColor variable of Level*/
    private Color groundColor = Color.GREEN.darker();
    
    /**theLevelTime variable of Level*/
    public static String theLevelTime;
    
    /**time variable of Level*/
    private static float time;
    
    /**buttonz variable of Level*/
    public static Button buttonz;
    
    /**panel variable of Level*/
    public static JPanel panel;
    private Display display;
    
    
    
    
    /**Constructor*/
    
    /**
     * Level(int lNo)
     * 
     * @param lNo - level number of Level Object
     * @param w
     * @param h
     */
    public Level(int lNo, int w, int h){
        System.out.println("Level: New Level "+lNo+" Created");
//        Game.labels = new Labels();
        //Game.hud = new HUD();
        levelNo = lNo;
        
        System.out.println("Level: Loading Level "+levelNo+" : "+getLevelName());
        
        //Create Player
//        if(Player.getLives() > 0 && levelNo != 1){
//            //set player lives to current player lives
//            Game.player = new Player(Game.gameWidth/2 +10, Game.gameHeight - 120, 80, 80, Game.getPName(), Player.getLives());
//        } else {
//            //set player lives to 3
//            Game.player = new Player(Game.gameWidth/2 +10, Game.gameHeight - 120, 80, 80, Game.getPName(), 3);
//        }
        
        setUp();
        
        init();
    }
    
    
    /**
     * setUp()
     * 
     */
    private void setUp(){
        
        switch(levelNo){
            case 1:
                setUpLevel1();
                break;
            case 2:
                setUpLevel2();
                break;
            case 3:
                setUpLevel3();
                break;
            case 4:
                setUpLevel4();
                break;
            case 5:
                setUpLevel5();
                break;
            case 6:
                setUpLevel6();
                break;
            case 7:
                setUpLevel7();
                break;
            case 8:
                setUpLevel8();
                break;
            case 9:
                setUpLevel9();
                break;
        }
        
    }
    
    
    /**
     * setUpLevel1()
     * 
     */
    private void setUpLevel1() {
        int width = TicTacToe.getMainWidth();
        
        //Set Enemies Color
        //Set Enemy Color: White
//        Enemy.setEnemyCol(0xffffff);//White

        //Set Enemy Bullet Color: White
//        Bullet.setEnemyBulletCol(0xffffff);//White

        //Set Level Background: 1
        setBackground(1);//1: Moon(Small)
        
        //Set Barricade Color: Green
//        Barricade.setBarricadeCol(0x00ff00);//Green
        
        //Set Ground Color: Green
//        setGroundColor(0x00ff00);//Green

        //Set Level Text Background Color: Green
//        levelTxtBGCol = 0x00ff00;//Green

        //Set Enter Level Icon Background Color: Light Green
//        enterLvlIconBG = 0x00CD02;//Light Green

        //Set Enter Level Icon Foreground Color: Crimson
//        enterLvlIconFG = 0x00B200;//Crimson
                
        switch(width){
            case 300:
                //Set Enemies
                //E0rows = 10, E1rows = 10, E2rows = 10, E3rows = 10, E4rows = 10, E5rows = 10, E6rows = 10, E7rows = 0, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *   **********
                *   **********
                *   **********
                *   **********
                *   **********
                *   **********
                * 
                * 
                * 
                */
//                Enemy.setNoEnemy(10, 10, 10, 10, 10, 10, 10, 0, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
//                //Set Enemy Color: White
//                Enemy.setEnemyCol(0xffffff);//White
//                
//                //Set Enemy Bullet Color: White
//                Bullet.setEnemyBulletCol(0xffffff);//White
//    
//                //Set Level Background: 1
//                setBackground(1);//1: Moon(Small)
            
                //Set Barricades
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **     **
                *  ****   ****   ****   ****
                *  ****   ****   ****   ****
                */
//                Barricade.setNoBarricades(4);
                
//                //Set Barricade Color: Green
//                Barricade.setBarricadeCol(0x00ff00);//Green
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
            
                //Set Ground
                //Set Ground Scale: 1.0
//                groundScale = 1.0;
                
                //Set Ground POS: 4, Game.getGameHeight() - 140;
//                groundX = 4;
//                groundY = TicTacToe.getMainHeight() - 140;
                
//                //Set Ground Color: Green
//                setGroundColor(0x00ff00);//Green
//                
//                //Set Level Text Background Color: Green
//                levelTxtBGCol = 0x00ff00;//Green
//                
//                //Set Enter Level Icon Background Color: Light Green
//                enterLvlIconBG = 0x00CD02;//Light Green
//                
//                //Set Enter Level Icon Foreground Color: Crimson
//                enterLvlIconFG = 0x00B200;//Crimson
                
                break;
                
            case 480:
                //Set Enemies
                //E0rows = 10, E1rows = 10, E2rows = 10, E3rows = 10, E4rows = 10, E5rows = 10, E6rows = 10, E7rows = 0, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *   **********
                *   **********
                *   **********
                *   **********
                *   **********
                *   **********
                * 
                * 
                * 
                */
//                Enemy.setNoEnemy(10, 10, 10, 10, 10, 10, 10, 0, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
//                //Set Enemy Color: White
//                Enemy.setEnemyCol(0xffffff);//White
//                
//                //Set Enemy Bullet Color: White
//                Bullet.setEnemyBulletCol(0xffffff);//White
//    
//                //Set Level Background: 1
//                setBackground(1);//1: Moon(Small)
            
                //Set Barricades
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **     **
                *  ****   ****   ****   ****
                *  ****   ****   ****   ****
                */
//                Barricade.setNoBarricades(4);
                
//                //Set Barricade Color: Green
//                Barricade.setBarricadeCol(0x00ff00);//Green
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 1.25
//                groundScale = 1.25;
                
                //Set Ground POS: 10, Game.getGameHeight() - 140
//                groundX = 10;
//                groundY = TicTacToe.getMainHeight() - 140;
                
//                //Set Ground Color: Green
//                setGroundColor(0x00ff00);//Green
//                
//                //Set Level Text Background Color: Green
//                levelTxtBGCol = 0x00ff00;//Green
//                
//                //Set Enter Level Icon Background Color: Light Green
//                enterLvlIconBG = 0x00CD02;//Light Green
//                
//                //Set Enter Level Icon Foreground Color: Crimson
//                enterLvlIconFG = 0x00B200;//Crimson
                
                break;
                
            case 604:
                //Set Enemies
                //E0rows = 10, E1rows = 10, E2rows = 10, E3rows = 10, E4rows = 10, E5rows = 10, E6rows = 10, E7rows = 0, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *   **********
                *   **********
                *   **********
                *   **********
                *   **********
                *   **********
                * 
                * 
                * 
                */
//                Enemy.setNoEnemy(10, 10, 10, 10, 10, 10, 10, 0, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
//                //Set Enemy Color: White
//                Enemy.setEnemyCol(0xffffff);//White
//                
//                //Set Enemy Bullet Color: White
//                Bullet.setEnemyBulletCol(0xffffff);//White
//    
//                //Set Level Background: 1
//                setBackground(1);//1: Moon(Small)
            
                //Set Barricades
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **     **
                *  ****   ****   ****   ****
                *  ****   ****   ****   ****
                */
//                Barricade.setNoBarricades(4);
                
//                //Set Barricade Color: Green
//                Barricade.setBarricadeCol(0x00ff00);//Green
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
                
//                //Set Ground Color: Green
//                setGroundColor(0x00ff00);//Green
//                
//                //Set Level Text Background Color: Green
//                levelTxtBGCol = 0x00ff00;//Green
//                
//                //Set Enter Level Icon Background Color: Light Green
//                enterLvlIconBG = 0x00CD02;//Light Green
//                
//                //Set Enter Level Icon Foreground Color: Crimson
//                enterLvlIconFG = 0x00B200;//Crimson
                
                break;
                
            default:
                //Set Enemies
                //E0rows = 10, E1rows = 10, E2rows = 10, E3rows = 10, E4rows = 10, E5rows = 10, E6rows = 10, E7rows = 0, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *   **********
                *   **********
                *   **********
                *   **********
                *   **********
                *   **********
                * 
                * 
                * 
                */
//                Enemy.setNoEnemy(10, 10, 10, 10, 10, 10, 10, 0, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
//                //Set Enemy Color: White
//                Enemy.setEnemyCol(0xffffff);//White
//                
//                //Set Enemy Bullet Color: White
//                Bullet.setEnemyBulletCol(0xffffff);//White
//    
//                //Set Level Background: 1
//                setBackground(1);//1: Moon(Small)
            
                //Set Barricades
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **     **
                *  ****   ****   ****   ****
                *  ****   ****   ****   ****
                */
//                Barricade.setNoBarricades(4);
                
//                //Set Barricade Color: Green
//                Barricade.setBarricadeCol(0x00ff00);//Green
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
                
//                //Set Ground Color: Green
//                setGroundColor(0x00ff00);//Green
//                
//                //Set Level Text Background Color: Green
//                levelTxtBGCol = 0x00ff00;//Green
//                
//                //Set Enter Level Icon Background Color: Light Green
//                enterLvlIconBG = 0x00CD02;//Light Green
//                
//                //Set Enter Level Icon Foreground Color: Crimson
//                enterLvlIconFG = 0x00B200;//Crimson
                
                break;
                
        }
        
    }

    
    /**
     * setUpLevel2()
     * 
     */
    private void setUpLevel2(){
        int width = TicTacToe.getMainWidth();
        
        //Set Enemy Color: Red
//        Enemy.setEnemyCol(0xff0000);//Red

        //Set Enemy Bullet Color: Red
//        Bullet.setEnemyBulletCol(0xff0000);//Red

        //Set Level Background: 2
        setBackground(2);//2: Mars(Small)
        
        //Set Ground Color: Maroon
//        setGroundColor(0x800000);

        //Set Level Text Background Color: Maroon
//        levelTxtBGCol = 0x800000;//Maroon

        //Set Enter Level Icon Background Color: Indian Red
//        enterLvlIconBG = 0xCD5C5C;//Indian Red

        //Set Enter Level Icon Foreground Color: Crimson
//        enterLvlIconFG = 0xDC100C;//Crimson
        
        switch(width){
            case 300:
                //Set Enemies
                //E0rows = 11, E1rows = 11, E2rows = 11, E3rows = 9, E4rows = 7, E5rows = 5, E6rows = 5, E7rows = 0, E8rows = 0, E9rows = 0;
                /**
                *   ***********
                *   ***********
                *    *********
                *     *******
                *      *****
                *      *****
                *   
                * 
                * 
                * 
                */
//                Enemy.setNoEnemy(11, 11, 11, 9, 7, 5, 5, 0, 0, 0);
                
                //Set Enemy UFOfreq: 8
//                Enemy.setUFOFreq(8);
                
//                //Set Enemy Color: Red
//                Enemy.setEnemyCol(0xff0000);//Red
//                
//                //Set Enemy Bullet Color: Red
//                Bullet.setEnemyBulletCol(0xff0000);//Red
//    
//                //Set Level Background: 2
//                setBackground(2);//2: Mars(Small)
            
                //Set Barricades
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *      **     **
                *     ****   ****
                *     ****   ****
                */
//                Barricade.setNoBarricades(2);
                
                //Set Barricade Color: Indian Red
//                Barricade.setBarricadeCol(0xCD5C5C);//Indian Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
            
                //Set Ground
                //Set Ground Scale: 1.0
//                groundScale = 1.0;
                
                //Set Ground POS: 4, Game.getGameHeight() - 140;
//                groundX = 4;
//                groundY = TicTacToe.getMainHeight() - 140;
//                
//                //Set Ground Color: Maroon
//                setGroundColor(0x800000);
//                
//                //Set Level Text Background Color: Maroon
//                levelTxtBGCol = 0x800000;//Maroon
//                
//                //Set Enter Level Icon Background Color: Indian Red
//                enterLvlIconBG = 0xCD5C5C;//Indian Red
//                
//                //Set Enter Level Icon Foreground Color: Crimson
//                enterLvlIconFG = 0xDC100C;//Crimson
                
                break;
                
            case 480:
                //Set Enemies
                //E0rows = 11, E1rows = 11, E2rows = 11, E3rows = 9, E4rows = 7, E5rows = 5, E6rows = 5, E7rows = 0, E8rows = 0, E9rows = 0;
                /**
                *   ***********
                *   ***********
                *    *********
                *     *******
                *      *****
                *      *****
                *   
                * 
                * 
                * 
                */
//                Enemy.setNoEnemy(11, 11, 11, 9, 7, 5, 5, 0, 0, 0);
                
                //Set Enemy UFOfreq: 8
//                Enemy.setUFOFreq(8);
                
//                //Set Enemy Color: Red
//                Enemy.setEnemyCol(0xff0000);//Red
//                
//                //Set Enemy Bullet Color: Red
//                Bullet.setEnemyBulletCol(0xff0000);//Red
//    
//                //Set Level Background: 2
//                setBackground(2);//2: Mars(Small)
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *      **     **
                *     ****   ****
                *     ****   ****
                */
//                Barricade.setNoBarricades(2);
                
                //Set Barricade Color: Indian Red
//                Barricade.setBarricadeCol(0xCD5C5C);//Indian Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 1.25
//                groundScale = 1.25;
                
                //Set Ground POS: 10, Game.getGameHeight() - 140;
//                groundX = 10;
//                groundY = TicTacToe.getMainHeight() - 140;
                
//                //Set Ground Color: Maroon
//                setGroundColor(0x800000);//Maroon
//                
//                //Set Level Text Background Color: Maroon
//                levelTxtBGCol = 0x800000;//Maroon
//                
//                //Set Enter Level Icon Background Color: Indian Red
//                enterLvlIconBG = 0xCD5C5C;//Indian Red
//                
//                //Set Enter Level Icon Foreground Color: Crimson
//                enterLvlIconFG = 0xDC100C;//Crimson
                
                break;
                
            case 604:
                //Set Enemies
                //E0rows = 11, E1rows = 11, E2rows = 11, E3rows = 9, E4rows = 7, E5rows = 5, E6rows = 5, E7rows = 0, E8rows = 0, E9rows = 0;
                /**
                *   ***********
                *   ***********
                *    *********
                *     *******
                *      *****
                *      *****
                *   
                * 
                * 
                * 
                */
//                Enemy.setNoEnemy(11, 11, 11, 9, 7, 5, 5, 0, 0, 0);
                
                //Set Enemy UFOfreq: 8
//                Enemy.setUFOFreq(8);
                
//                //Set Enemy Color: Red
//                Enemy.setEnemyCol(0xff0000);//Red
//                
//                //Set Enemy Bullet Color: Red
//                Bullet.setEnemyBulletCol(0xff0000);//Red
//    
//                //Set Level Background: 2
//                setBackground(2);//2: Mars(Small)
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *      **     **
                *     ****   ****
                *     ****   ****
                */
//                Barricade.setNoBarricades(2);
                
//                //Set Barricade Color: Indian Red
//                Barricade.setBarricadeCol(0xCD5C5C);//Indian Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
                
//                //Set Ground Color: Maroon
//                setGroundColor(0x800000);//Maroon
//                
//                //Set Level Text Background Color: Maroon
//                levelTxtBGCol = 0x800000;//Maroon
//                
//                //Set Enter Level Icon Background Color: Indian Red
//                enterLvlIconBG = 0xCD5C5C;//Indian Red
//                
//                //Set Enter Level Icon Foreground Color: Crimson
//                enterLvlIconFG = 0xDC100C;//Crimson
                
                break;
                
            default:
                //Set Enemies
                //E0rows = 11, E1rows = 11, E2rows = 11, E3rows = 9, E4rows = 7, E5rows = 5, E6rows = 5, E7rows = 0, E8rows = 0, E9rows = 0;
                /**
                *   ***********
                *   ***********
                *    *********
                *     *******
                *      *****
                *      *****
                *   
                * 
                * 
                * 
                */
//                Enemy.setNoEnemy(11, 11, 11, 9, 7, 5, 5, 0, 0, 0);
                
                //Set Enemy UFOfreq: 8
//                Enemy.setUFOFreq(8);
                
//                //Set Enemy Color: Red
//                Enemy.setEnemyCol(0xff0000);//Red
//                
//                //Set Enemy Bullet Color: Red
//                Bullet.setEnemyBulletCol(0xff0000);//Red
//    
//                //Set Level Background: 2
//                setBackground(2);//2: Mars(Small)
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *      **     **
                *     ****   ****
                *     ****   ****
                */
//                Barricade.setNoBarricades(2);
                
//                //Set Barricade Color: Indian Red
//                Barricade.setBarricadeCol(0xCD5C5C);//Indian Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
                
//                //Set Ground Color: Maroon
//                setGroundColor(0x800000);//Maroon
//                
//                //Set Level Text Background Color: Maroon
//                levelTxtBGCol = 0x800000;//Maroon
//                
//                //Set Enter Level Icon Background Color: Indian Red
//                enterLvlIconBG = 0xCD5C5C;//Indian Red
//                
//                //Set Enter Level Icon Foreground Color: Crimson
//                enterLvlIconFG = 0xDC100C;//Crimson
                
                break;
        }
        
    }
    
    
    /**
     * setUpLevel3()
     * 
     */
    private void setUpLevel3(){
        int width = TicTacToe.getMainWidth();
        
        //Set Enemy Color: Cadet Blue
//        Enemy.setEnemyCol(0x5F9EA0);//Cadet Blue

        //Set Enemy Bullet Color: Green
//        Bullet.setEnemyBulletCol(0x00ff00);//Green

        //Set Level Background: 3
        setBackground(3);//3: Earth(Small)
        
        //Set Barricade Color: Blue
//        Barricade.setBarricadeCol(0x0000ff);//Blue
        
        //Set Ground Color: Medium Blue
//        setGroundColor(0x0000dd);//Medium Blue

        //Set Level Text Background Color: Medium Blue
//        levelTxtBGCol = 0x0000dd;//Medium Blue

        //Set Enter Level Icon Background Color: Green Blue
//        enterLvlIconBG = 0x00d5fc;//Green Blue

        //Set Enter Level Icon Foreground Color: Dark Green blue
//        enterLvlIconFG = 0xc0c0c0;//Dark Green blue
        
        switch(width){
            case 300:
                //Set Enemies
                //E0rows = 0, E1rows = 11, E2rows = 11, E3rows = 11, E4rows = 0, E5rows = 11, E6rows = 11, E7rows = 0, E8rows = 0, E9rows = 0;
                /**
                *   
                *   ***********
                *   ***********
                *   ***********
                *   
                *   ***********
                *   ***********
                * 
                * 
                * 
                */
//                Enemy.setNoEnemy(0, 11, 11, 11, 0, 11, 11, 0, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
//                //Set Enemy Color: Cadet Blue
//                Enemy.setEnemyCol(0x5F9EA0);//Cadet Blue
//                
//                //Set Enemy Bullet Color: Green
//                Bullet.setEnemyBulletCol(0x00ff00);//Green
//    
//                //Set Level Background: 3
//                setBackground(3);//3: Earth(Small)
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
//                //Set Barricade Color: Blue
//                Barricade.setBarricadeCol(0x0000ff);//Blue
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
            
                //Set Ground
                //Set Ground Scale: 1.0
//                groundScale = 1.0;
                
                //Set Ground POS: 4, Game.getGameHeight() - 140;
//                groundX = 4;
//                groundY = TicTacToe.getMainHeight() - 140;
                
//                //Set Ground Color: Medium Blue
//                setGroundColor(0x0000dd);//Medium Blue
//                
//                //Set Level Text Background Color: Medium Blue
//                levelTxtBGCol = 0x0000dd;//Medium Blue
//                
//                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
//                
//                //Set Enter Level Icon Foreground Color: Dark Green blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            case 480:
                //E0rows = 0, E1rows = 11, E2rows = 11, E3rows = 11, E4rows = 0, E5rows = 11, E6rows = 11, E7rows = 0, E8rows = 0, E9rows = 0;
                /**
                *   
                *   ***********
                *   ***********
                *   ***********
                *   
                *   ***********
                *   ***********
                * 
                * 
                * 
                */
//                Enemy.setNoEnemy(0, 11, 11, 11, 0, 11, 11, 0, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
//                //Set Enemy Color: Cadet Blue
//                Enemy.setEnemyCol(0x5F9EA0);//Cadet Blue
//                
//                //Set Enemy Bullet Color: Green
//                Bullet.setEnemyBulletCol(0x00ff00);//Green
//    
//                //Set Level Background: 3
//                setBackground(3);//3: Earth(Small)
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
//                //Set Barricade Color: Blue
//                Barricade.setBarricadeCol(0x0000ff);//Blue
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 1.25
//                groundScale = 1.25;
                
                //Set Ground POS: 10, Game.getGameHeight() - 140;
//                groundX = 10;
//                groundY = TicTacToe.getMainHeight() - 140;
                
//                //Set Ground Color: Medium Blue
//                setGroundColor(0x0000dd);//Medium Blue
//                
//                //Set Level Text Background Color: Medium Blue
//                levelTxtBGCol = 0x0000dd;//Medium Blue
//                
//                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
//                
//                //Set Enter Level Icon Foreground Color: Dark Green blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            case 604:
                //E0rows = 0, E1rows = 11, E2rows = 11, E3rows = 11, E4rows = 0, E5rows = 11, E6rows = 11, E7rows = 0, E8rows = 0, E9rows = 0;
                /**
                *   
                *   ***********
                *   ***********
                *   ***********
                *   
                *   ***********
                *   ***********
                * 
                * 
                * 
                */
//                Enemy.setNoEnemy(0, 11, 11, 11, 0, 11, 11, 0, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
//                //Set Enemy Color: Cadet Blue
//                Enemy.setEnemyCol(0x5F9EA0);//Cadet Blue
//                
//                //Set Enemy Bullet Color: Green
//                Bullet.setEnemyBulletCol(0x00ff00);//Green
//    
//                //Set Level Background: 3
//                setBackground(3);//3: Earth(Small)
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
//                //Set Barricade Color: Blue
//                Barricade.setBarricadeCol(0x0000ff);//Blue
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
                
//                //Set Ground Color: Medium Blue
//                setGroundColor(0x0000dd);//Medium Blue
//                
//                //Set Level Text Background Color: Medium Blue
//                levelTxtBGCol = 0x0000dd;//Medium Blue
//                
//                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
//                
//                //Set Enter Level Icon Foreground Color: Dark Green blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            default:
                //E0rows = 0, E1rows = 11, E2rows = 11, E3rows = 11, E4rows = 0, E5rows = 11, E6rows = 11, E7rows = 0, E8rows = 0, E9rows = 0;
                /**
                *   
                *   ***********
                *   ***********
                *   ***********
                *   
                *   ***********
                *   ***********
                * 
                * 
                * 
                */
//                Enemy.setNoEnemy(0, 11, 11, 11, 0, 11, 11, 0, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
//                //Set Enemy Color: Cadet Blue
//                Enemy.setEnemyCol(0x5F9EA0);//Cadet Blue
//                
//                //Set Enemy Bullet Color: Green
//                Bullet.setEnemyBulletCol(0x00ff00);//Green
//    
//                //Set Level Background: 3
//                setBackground(3);//3; Earth(Small)
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
//                //Set Barricade Color: Blue
//                Barricade.setBarricadeCol(0x0000ff);//Blue
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
                
//                //Set Ground Color: Medium Blue
//                setGroundColor(0x0000dd);//Medium Blue
//                
//                //Set Level Text Background Color: Medium Blue
//                levelTxtBGCol = 0x0000dd;//Medium Blue
//                
//                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
//                
//                //Set Enter Level Icon Foreground Color: Dark Green blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
        }
        
    }
    
    
    /**
     * setUpLevel4()
     * 
     */
    private void setUpLevel4(){
        int width = TicTacToe.getMainWidth();
        switch(width){
            case 300:
                //Set Enemies
                //E0rows = 11, E1rows = 6, E2rows = 11, E3rows = 11, E4rows = 6, E5rows = 11, E6rows = 4, E7rows = 0, E8rows = 0, E9rows = 2;
                /**
                *   ***********
                *     ******
                *   ***********
                *   ***********
                *     ******
                *   ***********
                *      ****
                * 
                * 
                *       **
                */
//                Enemy.setNoEnemy(11, 6, 11, 11, 6, 11, 4, 0, 0, 2);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: 0xf7cb07
//                Enemy.setEnemyCol(0xf7cb07);
                
                //Set Enemy Bullet Color: 0xf7cb07
//                Bullet.setEnemyBulletCol(0xf7cb07);
    
                //Set Level Background: 4
                setBackground(4);//4: Sun
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Red
//                Barricade.setBarricadeCol(0xff0000);//Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
            
                //Set Ground
                //Set Ground Scale: 1.0
//                groundScale = 1.0;
                
                //Set Ground POS: 4, Game.getGameHeight() - 140;
//                groundX = 4;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: OrangeRed
//                setGroundColor(0xFF4500);//OrangeRed
                
                //Set Level Text Background Color: OrangeRed
//                levelTxtBGCol = 0xFF4500;//OrangeRed
                
                //Set Enter Level Icon Background Color: Orange
//                enterLvlIconBG = 0xFFA500;//Orange
                
                //Set Enter Level Icon Foreground Color: Gold
//                enterLvlIconFG = 0xffd700;//Gold
                
                break;
                
            case 480:
                //E0rows = 11, E1rows = 6, E2rows = 11, E3rows = 11, E4rows = 6, E5rows = 11, E6rows = 4, E7rows = 0, E8rows = 0, E9rows = 2;
                /**
                *   ***********
                *     ******
                *   ***********
                *   ***********
                *     ******
                *   ***********
                *      ****
                * 
                * 
                *       **
                */
//                Enemy.setNoEnemy(11, 6, 11, 11, 6, 11, 4, 0, 0, 2);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: 0xf7cb07
//                Enemy.setEnemyCol(0xf7cb07);
                
                //Set Enemy Bullet Color: 0xf7cb07
//                Bullet.setEnemyBulletCol(0xf7cb07);
    
                //Set Level Background: 4
                setBackground(4);//4: Sun
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Red
//                Barricade.setBarricadeCol(0xff0000);//Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 1.25
//                groundScale = 1.25;
                
                //Set Ground POS: 10, Game.getGameHeight() - 140;
//                groundX = 10;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: OrangeRed
//                setGroundColor(0xFF4500);//OrangeRed
                
                //Set Level Text Background Color: OrangeRed
//                levelTxtBGCol = 0xFF4500;//OrangeRed
                
                //Set Enter Level Icon Background Color: Orange
//                enterLvlIconBG = 0xFFA500;//Orange
                
                //Set Enter Level Icon Foreground Color: Gold
//                enterLvlIconFG = 0xffd700;//Gold
                
                break;
                
            case 604:
                //E0rows = 11, E1rows = 6, E2rows = 11, E3rows = 11, E4rows = 6, E5rows = 11, E6rows = 4, E7rows = 0, E8rows = 0, E9rows = 2;
                /**
                *   ***********
                *     ******
                *   ***********
                *   ***********
                *     ******
                *   ***********
                *      ****
                * 
                * 
                *       **
                */
//                Enemy.setNoEnemy(11, 6, 11, 11, 6, 11, 4, 0, 0, 2);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: 0xf7cb07
//                Enemy.setEnemyCol(0xf7cb07);
                
                //Set Enemy Bullet Color: 0xf7cb07
//                Bullet.setEnemyBulletCol(0xf7cb07);
    
                //Set Level Background: 4
                setBackground(4);//4: Sun
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Red
//                Barricade.setBarricadeCol(0xff0000);//Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: OrangeRed
//                setGroundColor(0xFF4500);//OrangeRed
                
                //Set Level Text Background Color: OrangeRed
//                levelTxtBGCol = 0xFF4500;//OrangeRed
                
                //Set Enter Level Icon Background Color: Orange
//                enterLvlIconBG = 0xFFA500;//Orange
                
                //Set Enter Level Icon Foreground Color: Gold
//                enterLvlIconFG = 0xffd700;//Gold
                
                break;
                
            default:
                //E0rows = 11, E1rows = 6, E2rows = 11, E3rows = 11, E4rows = 6, E5rows = 11, E6rows = 4, E7rows = 0, E8rows = 0, E9rows = 2;
                /**
                *   ***********
                *     ******
                *   ***********
                *   ***********
                *     ******
                *   ***********
                *      ****
                * 
                * 
                *       **
                */
//                Enemy.setNoEnemy(11, 6, 11, 11, 6, 11, 4, 0, 0, 2);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: 0xf7cb07
//                Enemy.setEnemyCol(0xf7cb07);
                
                //Set Enemy Bullet Color: 0xf7cb07
//                Bullet.setEnemyBulletCol(0xf7cb07);
    
                //Set Level Background: 4
                setBackground(4);//4: Sun
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Red
//                Barricade.setBarricadeCol(0xff0000);//Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: OrangeRed
//                setGroundColor(0xFF4500);//OrangeRed
                
                //Set Level Text Background Color: OrangeRed
//                levelTxtBGCol = 0xFF4500;//OrangeRed
                
                //Set Enter Level Icon Background Color: Orange
//                enterLvlIconBG = 0xFFA500;//Orange
                
                //Set Enter Level Icon Foreground Color: Gold
//                enterLvlIconFG = 0xffd700;//Gold
                
                break;
        }
        
    }
    
    
    /**
     * setUpLevel5()
     * 
     */
    private void setUpLevel5() {
        int width = TicTacToe.getMainWidth();
        switch(width){
            case 300:
                //Set Enemies
                //E0rows = 5, E1rows = 5, E2rows = 11, E3rows = 10, E4rows = 7, E5rows = 7, E6rows = 4, E7rows = 10, E8rows = 0, E9rows = 0;
                /**
                *      *****
                *      *****
                *   ***********
                *   **********
                *     *******
                *     *******
                *      ****
                *   **********
                * 
                *   
                */
//                Enemy.setNoEnemy(5, 5, 11, 10, 7, 7, 4, 10, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: Grey
//                Enemy.setEnemyCol(0x778899);//Grey
                
                //Set Enemy Bullet Color: Dark Grey
//                Bullet.setEnemyBulletCol(0x2F4FFF);//Dark Grey
    
                //Set Level Background: 1
                setBackground(1);//1: Moon
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Dark Grey
//                Barricade.setBarricadeCol(0x090909);//Dark Grey
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
            
                //Set Ground
                //Set Ground Scale: 1.0
//                groundScale = 1.0;
                
                //Set Ground POS: 4, Game.getGameHeight() - 140;
//                groundX = 4;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: Grey
//                setGroundColor(0x696969);//Grey
                
                //Set Level Text Background Color: Grey
//                levelTxtBGCol = 0x696969;//Grey
                
                //Set Enter Level Icon Background Color: Grey
//                enterLvlIconBG = 0x696969;//Grey
                
                //Set Enter Level Icon Foreground Color: Dark Grey
//                enterLvlIconFG = 0x090909;//Dark Grey
                
                break;
                
            case 480:
                //E0rows = 5, E1rows = 5, E2rows = 11, E3rows = 10, E4rows = 7, E5rows = 7, E6rows = 4, E7rows = 10, E8rows = 0, E9rows = 0;
                /**
                *      *****
                *      *****
                *   ***********
                *   **********
                *     *******
                *     *******
                *      ****
                *   **********
                * 
                *   
                */
//                Enemy.setNoEnemy(5, 5, 11, 10, 7, 7, 4, 10, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: Grey
//                Enemy.setEnemyCol(0x778899);//Grey
                
                //Set Enemy Bullet Color: Dark Grey
//                Bullet.setEnemyBulletCol(0x2F4FFF);//Dark Grey
    
                //Set Level Background: 1
                setBackground(1);//1: Moon
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Dark Grey
//                Barricade.setBarricadeCol(0x090909);//Dark Grey
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 1.25
//                groundScale = 1.25;
                
                //Set Ground POS: 10, Game.getGameHeight() - 140;
//                groundX = 10;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: Grey
//                setGroundColor(0x696969);//Grey
                
                //Set Level Text Background Color: Grey
//                levelTxtBGCol = 0x696969;//Grey
                
                //Set Enter Level Icon Background Color: Grey
//                enterLvlIconBG = 0x696969;//Grey
                
                //Set Enter Level Icon Foreground Color: Dark Grey
//                enterLvlIconFG = 0x090909;//Dark Grey
                
                break;
                
            case 604:
                //E0rows = 5, E1rows = 5, E2rows = 11, E3rows = 10, E4rows = 7, E5rows = 7, E6rows = 4, E7rows = 10, E8rows = 0, E9rows = 0;
                /**
                *      *****
                *      *****
                *   ***********
                *   **********
                *     *******
                *     *******
                *      ****
                *   **********
                * 
                *   
                */
//                Enemy.setNoEnemy(5, 5, 11, 10, 7, 7, 4, 10, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: Grey
//                Enemy.setEnemyCol(0x778899);//Grey
                
                //Set Enemy Bullet Color: Dark Grey
//                Bullet.setEnemyBulletCol(0x2F4F4F);//Dark Grey
    
                //Set Level Background: 1
                setBackground(1);//1: Moon
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Dark Grey
//                Barricade.setBarricadeCol(0x090909);//Dark Grey
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: Grey
//                setGroundColor(0x696969);//Grey
                
                //Set Level Text Background Color: Grey
//                levelTxtBGCol = 0x696969;//Grey
                
                //Set Enter Level Icon Background Color: Grey
//                enterLvlIconBG = 0x696969;//Grey
                
                //Set Enter Level Icon Foreground Color: Dark Grey
//                enterLvlIconFG = 0x090909;//Dark Grey
                
                break;
                
            default:
                //E0rows = 5, E1rows = 5, E2rows = 11, E3rows = 10, E4rows = 7, E5rows = 7, E6rows = 4, E7rows = 10, E8rows = 0, E9rows = 0;
                /**
                *      *****
                *      *****
                *   ***********
                *   **********
                *     *******
                *     *******
                *      ****
                *   **********
                * 
                *   
                */
//                Enemy.setNoEnemy(5, 5, 11, 10, 7, 7, 4, 10, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: Grey
//                Enemy.setEnemyCol(0x778899);//Grey
                
                //Set Enemy Bullet Color: Dark Grey
//                Bullet.setEnemyBulletCol(0x2F4F4F);//Dark Grey
    
                //Set Level Background: 1
                setBackground(1);
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Dark Grey
//                Barricade.setBarricadeCol(0x090909);//Dark Grey
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: Grey
//                setGroundColor(0x696969);//Grey
                
                //Set Level Text Background Color: Grey
//                levelTxtBGCol = 0x696969;//Grey
                
                //Set Enter Level Icon Background Color: Grey
//                enterLvlIconBG = 0x696969;//Grey
                
                //Set Enter Level Icon Foreground Color: Dark Grey
//                enterLvlIconFG = 0x090909;//Dark Grey
                
                break;
        }
        
    }
    
    
    /**
     * setUpLevel6()
     * 
     */
    private void setUpLevel6(){
        int width = TicTacToe.getMainWidth();
        switch(width){
            case 300:
                //Set Enemies
                //E0rows = 6, E1rows = 6, E2rows = 6, E3rows = 6, E4rows = 6, E5rows = 6, E6rows = 10, E7rows = 4, E8rows = 0, E9rows = 0;
                /**
                *     ******
                *     ******
                *     ******
                *     ******
                *     ******
                *     ******
                *   **********
                *      ****
                * 
                *   
                */
//                Enemy.setNoEnemy(6, 6, 6, 6, 6, 6, 10, 4, 0, 0);
                
                //Set Enemy UFOfreq: 8
//                Enemy.setUFOFreq(8);
                
                //Set Enemy Color: Crimson
//                Enemy.setEnemyCol(0xDC1000);//Crimson
                
                //Set Enemy Bullet Color: Red
//                Bullet.setEnemyBulletCol(0xff0000);//Red
    
                //Set Level Background: 2
                setBackground(2);//2: Mars
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *      **     **
                *     ****   ****
                *     ****   ****
                */
//                Barricade.setNoBarricades(2);
                
                //Set Barricade Color: Red
//                Barricade.setBarricadeCol(0xff0000);//Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
            
                //Set Ground
                //Set Ground Scale: 1.0
//                groundScale = 1.0;
                
                //Set Ground POS: 4, Game.getGameHeight() - 140;
//                groundX = 4;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: Maroon
//                setGroundColor(0x800000);//Maroon
                
                //Set Level Text Background Color: Maroon
//                levelTxtBGCol = 0x800000;//Maroon
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            case 480:
                //E0rows = 6, E1rows = 6, E2rows = 6, E3rows = 6, E4rows = 6, E5rows = 6, E6rows = 10, E7rows = 4, E8rows = 0, E9rows = 0;
                /**
                *     ******
                *     ******
                *     ******
                *     ******
                *     ******
                *     ******
                *   **********
                *      ****
                * 
                *   
                */
//                Enemy.setNoEnemy(6, 6, 6, 6, 6, 6, 10, 4, 0, 0);
                
                //Set Enemy UFOfreq: 8
//                Enemy.setUFOFreq(8);
                
                //Set Enemy Color: Crimson
//                Enemy.setEnemyCol(0xDC1000);//Crimson
                
                //Set Enemy Bullet Color: Red
//                Bullet.setEnemyBulletCol(0xff0000);//Red
    
                //Set Level Background: 2
                setBackground(2);//2: Mars
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *      **     **
                *     ****   ****
                *     ****   ****
                */
//                Barricade.setNoBarricades(2);
                
                //Set Barricade Color: Red
//                Barricade.setBarricadeCol(0xff0000);//Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 1.25
//                groundScale = 1.25;
                
                //Set Ground POS: 10, Game.getGameHeight() - 140;
//                groundX = 10;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: Maroon
//                setGroundColor(0x800000);//Maroon
                
                //Set Level Text Background Color: Maroon
//                levelTxtBGCol = 0x800000;//Maroon
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            case 604:
                //E0rows = 6, E1rows = 6, E2rows = 6, E3rows = 6, E4rows = 6, E5rows = 6, E6rows = 10, E7rows = 4, E8rows = 0, E9rows = 0;
                /**
                *     ******
                *     ******
                *     ******
                *     ******
                *     ******
                *     ******
                *   **********
                *      ****
                * 
                *   
                */
//                Enemy.setNoEnemy(6, 6, 6, 6, 6, 6, 10, 4, 0, 0);
                
                //Set Enemy UFOfreq: 8
//                Enemy.setUFOFreq(8);
                
                //Set Enemy Color: Crimson
//                Enemy.setEnemyCol(0xDC1000);//Crimson
                
                //Set Enemy Bullet Color: Red
//                Bullet.setEnemyBulletCol(0xff0000);//Red
    
                //Set Level Background: 2
                setBackground(2);//2: Mars
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *      **     **
                *     ****   ****
                *     ****   ****
                */
//                Barricade.setNoBarricades(2);
                
                //Set Barricade Color: Red
//                Barricade.setBarricadeCol(0xff0000);//Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: Maroon
//                setGroundColor(0x800000);//Maroon
                
                //Set Level Text Background Color: Maroon
//                levelTxtBGCol = 0x800000;//Maroon
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            default:
                //E0rows = 6, E1rows = 6, E2rows = 6, E3rows = 6, E4rows = 6, E5rows = 6, E6rows = 10, E7rows = 4, E8rows = 0, E9rows = 0;
                /**
                *     ******
                *     ******
                *     ******
                *     ******
                *     ******
                *     ******
                *   **********
                *      ****
                * 
                *   
                */
//                Enemy.setNoEnemy(6, 6, 6, 6, 6, 6, 10, 4, 0, 0);
                
                //Set Enemy UFOfreq: 8
//                Enemy.setUFOFreq(8);
                
                //Set Enemy Color: Crimson
//                Enemy.setEnemyCol(0xDC1000);//Crimson
                
                //Set Enemy Bullet Color: Red
//                Bullet.setEnemyBulletCol(0xff0000);//Red
    
                //Set Level Background: 2
                setBackground(2);//2: Mars
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *      **     **
                *     ****   ****
                *     ****   ****
                */
//                Barricade.setNoBarricades(2);
                
                //Set Barricade Color: Red
//                Barricade.setBarricadeCol(0xff0000);//Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: Maroon
//                setGroundColor(0x800000);//Maroon
                
                //Set Level Text Background Color: Maroon
//                levelTxtBGCol = 0x800000;//Maroon
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
        }
        
    }
    
    
    /**
     * setUpLevel7()
     * 
     */
    private void setUpLevel7(){
        int width = TicTacToe.getMainWidth();
        switch(width){
            case 300:
                //Set Enemies
                //E0rows = 10, E1rows = 2, E2rows = 10, E3rows = 8, E4rows = 10, E5rows = 6, E6rows = 9, E7rows = 6, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *       **
                *   **********
                *    ********
                *   **********
                *     ******
                *    *********
                *     ******
                * 
                *   
                */
//                Enemy.setNoEnemy(10, 2, 10, 8, 10, 6, 9, 6, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: 0xf7cb07
//                Enemy.setEnemyCol(0xf7cb07);
                
                //Set Enemy Bullet Color: 0xf7cb07
//                Bullet.setEnemyBulletCol(0xf7cb07);
    
                //Set Level Background: 4
                setBackground(4);//4: Sun
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Gold
//                Barricade.setBarricadeCol(0xFFD700);//Gold
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
            
                //Set Ground
                //Set Ground Scale: 1.0
//                groundScale = 1.0;
                
                //Set Ground POS: 4, Game.getGameHeight() - 140;
//                groundX = 4;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: Red
//                setGroundColor(0xff0000);//Red
                
                //Set Level Text Background Color: Red
//                levelTxtBGCol = 0xff0000;//Red
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            case 480:
                //E0rows = 10, E1rows = 2, E2rows = 10, E3rows = 8, E4rows = 10, E5rows = 6, E6rows = 9, E7rows = 6, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *       **
                *   **********
                *    ********
                *   **********
                *     ******
                *    *********
                *     ******
                * 
                *   
                */
//                Enemy.setNoEnemy(10, 2, 10, 8, 10, 6, 9, 6, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: 0xf7cb07
//                Enemy.setEnemyCol(0xf7cb07);
                
                //Set Enemy Bullet Color: 0xf7cb07
//                Bullet.setEnemyBulletCol(0xf7cb07);
    
                //Set Level Background: 4
                setBackground(4);//4: Sun
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Gold
//                Barricade.setBarricadeCol(0xFFD700);//Gold
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 1.25
//                groundScale = 1.25;
                
                //Set Ground POS: 10, Game.getGameHeight() - 140;
//                groundX = 10;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: Red
//                setGroundColor(0xff0000);//Red
                
                //Set Level Text Background Color: Red
//                levelTxtBGCol = 0xff0000;//Red
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            case 604:
                //E0rows = 10, E1rows = 2, E2rows = 10, E3rows = 8, E4rows = 10, E5rows = 6, E6rows = 9, E7rows = 6, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *       **
                *   **********
                *    ********
                *   **********
                *     ******
                *    *********
                *     ******
                * 
                *   
                */
//                Enemy.setNoEnemy(10, 2, 10, 8, 10, 6, 9, 6, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: 0xf7cb07
//                Enemy.setEnemyCol(0xf7cb07);
                
                //Set Enemy Bullet Color: 0xf7cb07
//                Bullet.setEnemyBulletCol(0xf7cb07);
    
                //Set Level Background: 4
                setBackground(4);//4: Sun
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Gold
//                Barricade.setBarricadeCol(0xFFD700);//Gold
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: Red
//                setGroundColor(0xff0000);//Red
                
                //Set Level Text Background Color: Red
//                levelTxtBGCol = 0xff0000;//Red
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            default:
                //E0rows = 10, E1rows = 2, E2rows = 10, E3rows = 8, E4rows = 10, E5rows = 6, E6rows = 9, E7rows = 6, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *       **
                *   **********
                *    ********
                *   **********
                *     ******
                *    *********
                *     ******
                * 
                *   
                */
//                Enemy.setNoEnemy(10, 2, 10, 8, 10, 6, 9, 6, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: 0xf7cb07
//                Enemy.setEnemyCol(0xf7cb07);
                
                //Set Enemy Bullet Color: 0xf7cb07
//                Bullet.setEnemyBulletCol(0xf7cb07);
    
                //Set Level Background: 4
                setBackground(4);//4: Sun
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Gold
//                Barricade.setBarricadeCol(0xFFD700);//Gold
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: Red
//                setGroundColor(0xff0000);//Red
                
                //Set Level Text Background Color: Red
//                levelTxtBGCol = 0xff0000;//Red
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
        }
        
    }
    
    
    /**
     * setUpLevel8()
     * 
     */
    private void setUpLevel8(){
        int width = TicTacToe.getMainWidth();
        random = new Random();
        switch(width){
            case 300:
                //Set Enemies
                //E0rows = 10, E1rows = 10, E2rows = 10, E3rows = 8, E4rows = 8, E5rows = 6, E6rows = 6, E7rows = 4, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *   **********
                *   **********
                *    ********
                *    ********
                *     ******
                *     ******
                *      ****
                * 
                *   
                */
//                Enemy.setNoEnemy(10, 10, 10, 8, 8, 6, 6, 4, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: Random Blue
//                Enemy.setEnemyCol(0x0000ff + random.nextInt(0x0000ff));//Random Blue
                
                //Set Enemy Bullet Color: Random Blue
//                Bullet.setEnemyBulletCol(0x0000ff + random.nextInt(0x0000ff));//Random Blue
    
                //Set Level Background: 3
                setBackground(3);//3: Earth
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Random Green
//                Barricade.setBarricadeCol(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
            
                //Set Ground
                //Set Ground Scale: 1.0
//                groundScale = 1.0;
                
                //Set Ground POS: 4, Game.getGameHeight() - 140;
//                groundX = 4;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: Random Green
//                setGroundColor(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
                //Set Level Text Background Color: Green
//                levelTxtBGCol = 0x00ff00;//Green
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            case 480:
                //E0rows = 10, E1rows = 10, E2rows = 10, E3rows = 8, E4rows = 8, E5rows = 6, E6rows = 6, E7rows = 4, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *   **********
                *   **********
                *    ********
                *    ********
                *     ******
                *     ******
                *      ****
                * 
                *   
                */
//                Enemy.setNoEnemy(10, 10, 10, 8, 8, 6, 6, 4, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: Random Blue
//                Enemy.setEnemyCol(0x0000ff + random.nextInt(0x0000ff));//Random Blue
                
                //Set Enemy Bullet Color: Random Blue
//                Bullet.setEnemyBulletCol(0x0000ff + random.nextInt(0x0000ff));//Random Blue
    
                //Set Level Background: 3
                setBackground(3);//3: Earth
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Random Green
//                Barricade.setBarricadeCol(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 1.25
//                groundScale = 1.25;
                
                //Set Ground POS: 10, Game.getGameHeight() - 140;
//                groundX = 10;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: Random Green
//                setGroundColor(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
                //Set Level Text Background Color: Green
//                levelTxtBGCol = 0x00ff00;//Green
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            case 604:
                //E0rows = 10, E1rows = 10, E2rows = 10, E3rows = 8, E4rows = 8, E5rows = 6, E6rows = 6, E7rows = 4, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *   **********
                *   **********
                *    ********
                *    ********
                *     ******
                *     ******
                *      ****
                * 
                *   
                */
//                Enemy.setNoEnemy(10, 10, 10, 8, 8, 6, 6, 4, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: Random Blue
//                Enemy.setEnemyCol(0x0000ff + random.nextInt(0x0000ff));//Random Blue
                
                //Set Enemy Bullet Color: Random Blue
//                Bullet.setEnemyBulletCol(0x0000ff + random.nextInt(0x0000ff));//Random Blue
    
                //Set Level Background: 3
                setBackground(3);//3: Earth
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Random Green
//                Barricade.setBarricadeCol(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: Random Green
//                setGroundColor(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
                //Set Level Text Background Color: Green
//                levelTxtBGCol = 0x00ff00;//Green
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            default:
                //E0rows = 10, E1rows = 10, E2rows = 10, E3rows = 8, E4rows = 8, E5rows = 6, E6rows = 6, E7rows = 4, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *   **********
                *   **********
                *    ********
                *    ********
                *     ******
                *     ******
                *      ****
                * 
                *   
                */
//                Enemy.setNoEnemy(10, 10, 10, 8, 8, 6, 6, 4, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: Random Blue
//                Enemy.setEnemyCol(0x0000ff + random.nextInt(0x0000ff));//Random Blue
                
                //Set Enemy Bullet Color: Random Blue
//                Bullet.setEnemyBulletCol(0x0000ff + random.nextInt(0x0000ff));//Random Blue
    
                //Set Level Background: 3
                setBackground(3);//3: Earth
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Random Green
//                Barricade.setBarricadeCol(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
                
                //Set Ground Color: Random Green
//                setGroundColor(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
                //Set Level Text Background Color: Green
//                levelTxtBGCol = 0x00ff00;//Green
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
        }
        
    }
    
    
    /**
     * setUpLevel9()
     * 
     */
    private void setUpLevel9(){
        int width = TicTacToe.getMainWidth();
        random = new Random();
        switch(width){
            case 300:
                
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Random Green
//                Barricade.setBarricadeCol(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
//                powScale = 0.75;
            
//                groundScale = 1.0;
//                groundX = 4;
//                groundY = TicTacToe.getMainHeight() - 140;
//                setGroundColor(0x00ff00 + random.nextInt(0xffffff));
                
                break;
                
            case 480:
                
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Random Green
//                Barricade.setBarricadeCol(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
//                powScale = 0.75;
           
//                groundScale = 1.25;
//                groundX = 10;
//                groundY = TicTacToe.getMainHeight() - 140;
//                setGroundColor(0x00ff00 + random.nextInt(0xffffff));
                
                break;
                
            case 604:
                
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Random Green
//                Barricade.setBarricadeCol(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
//                powScale = 0.75;
           
//                groundScale = 2.45;
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
//                setGroundColor(0x00ff00 + random.nextInt(0xffffff));
                
                break;
                
            default:
                
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Random Green
//                Barricade.setBarricadeCol(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
//                powScale = 0.75;
           
//                groundScale = 2.45;
//                groundX = -14;
//                groundY = TicTacToe.getMainHeight() - 140;
//                setGroundColor(0x00ff00 + random.nextInt(0xffffff));
                
                break;
                
        }
    }
    
    
    /**
     * init()
     * 
     */
    private void init(){
        Texture.clearMaps();
        
        panel = new JPanel();
        
        display = new Display(5, 5, TicTacToe.getMainWidth(), 120);
        panel.add(display.panel, BorderLayout.NORTH);
        panel.setBackground(Color.decode("#4D4D4D"));
        
        //Create Buttons
        buttonz = new Button(0);
        buttonz.init();
        
        firstTick = true;
        lastTick = false;

        //Reset Level Time
        resetLevelTime();
        
    }
    
    
    /**
     * changeLevel()
     * 
     */
    public static void changeLevel(){
        if(levelNo < 8){
            levelNo++;
            setLevelNo(levelNo);
        } else {
            gameComplete = true;
        }
    }
    
    
    /**
     * getLevelNo()
     * 
     * 
     * @return levelNo
     */
    public static int getLevelNo(){
        return levelNo;
    }
    
    
    /**
     * setLevelNo()
     * 
     * 
     * @param levNo
     */
    public static void setLevelNo(int levNo){
        levelNo = levNo;
        Game.level = new Level(levelNo, TicTacToe.getMainWidth(), TicTacToe.getMainHeight());
    }
    
    
    /**
     * getLevelName()
     * 
     * 
     * @return levelName
     */
    public static String getLevelName(){
        switch(levelNo){
            case 1:
                levelName = "Start Zone - Dark side of the moon";
                
                break;
                
            case 2:
                levelName = "Martian Orbit - The Red Planet";
                
                break;
                
            case 3:
                levelName = "Terra Ferma - Protect Earth";
                
                break;
                
            case 4:
                levelName = "Fourth Quarter - Save the Sun";
                
                break;
                
            case 5:
                levelName = "Lunar Orbit - The Full Moon";
                
                break;
                
            case 6:
                levelName = "Martian Resistance - Defend Mars";
                
                break;
                
            case 7:
                levelName = "3rd Rock From The Sun - Protect Earth (again)";
                
                break;
                
            case 8:
                levelName = "Final Frontier - Send em to the Sun";
                
                break;
            
            default:
                levelName = "GAME COMPLETE!";
                
                break;
            
        }

        return levelName;
    }
    
    
    
//    public static void generateTerrain(){
//        System.out.println("Generating Terrain!!!");
//        random = new Random();
//        
//        //Use PerlinNoise
//        float[] surface = new float[mapWidth];
//        float[] noiseSeed = new float[mapWidth];
//        
//        for(int i = 0; i < mapWidth; i++){
//            noiseSeed[i] = random.nextFloat();
//        }
//        
//        noiseSeed[0] = 0.4f;
//        //noiseSeed[mapWidth-1] = 0.4f;
//        perlinNoise1D(mapWidth, noiseSeed, 8, 2.0f, surface);
//        
//        for(int x = 0; x < mapWidth; x++){
//            for(int y = 0; y < mapHeight; y++){
//                if(y >= surface[x] * mapHeight){
//                    map[y * mapWidth + x] =  '1';
//                } else {
//                    map[y * mapWidth + x] =  '0';
//                }        
//            }
//        }
//        
//        surface = new float[mapWidth];
//        noiseSeed = new float[mapWidth];    
//    }
    
    
//    public static void perlinNoise1D(int count, float[] seed, int octaves, float bias, float[] output){
//        
//        //Used 1D Perlin Noise
//        for(int x = 0; x < count; x++){
//        
//            float noise = 0.0f;
//            float scaleAcc = 0.0f;
//            float scale = 1.0f;
//            
//            for(int o = 0; o < octaves; o++){
//                int pitch = count >> o;
//                int sample1 = (x/pitch) * pitch;
//                int sample2 = (sample1 + pitch) % count;
//                float blend = (float) (x - sample1)/(float) pitch;
//                float sample = (1.0f - blend) * seed[sample1] + blend * seed[sample2];
//                scaleAcc += scale;
//                noise += sample * scale;
//                scale = scale / bias;
//            }
//            
//            //Scale to seed range 
//            output[x] = noise/scaleAcc;
//        }
//    
//    }
    
    
    /**
    * tick()
    * 
    * 
    * Updates Level Object
    */
    public static void tick(){
        //Manage Level: First Tick
        if(firstTick) {
            //Set firstTick: false
            firstTick = false;
            
            //Reset Game Time
            Game.resetGameTime();
            
            //Reset Level Time
            resetLevelTime();
            
            //tp1 = System.currentTimeMillis();
            
            if(Game.getGameMusic()){
                if(Game.levelNo == 1 && !Sound.Level1.isPlaying()){
                    Sound.Level1.loop();
                }
                if(Game.levelNo == 2 && !Sound.Level2.isPlaying()){
                    Sound.Level2.loop();
                }
                if(Game.levelNo == 3 && !Sound.Level3.isPlaying()){
                    Sound.Level3.loop();
                }
                if(Game.levelNo == 4 && !Sound.Level4.isPlaying()){
                    Sound.Level4.loop();
                }
                if(Game.levelNo == 5 && !Sound.Level5.isPlaying()){
                    Sound.Level5.loop();
                }
                if(Game.levelNo == 6 && !Sound.Level6.isPlaying()){
                    Sound.Level6.loop();
                }
                if(Game.levelNo == 7 && !Sound.Level7.isPlaying()){
                    Sound.Level7.loop();
                }
                if(Game.levelNo == 8 && !Sound.Level8.isPlaying()){
                    Sound.Level8.loop();
                }
            }
        }
        
        //Manage Level: Last Tick
        if(lastTick) {
            lastTick = false;
            Sound.stopAll();
            if(!Sound.creditsSoundtrack.isPlaying()){
                Sound.creditsSoundtrack.play();
            }
            
            //Reset Level Time
            resetLevelTime();
        }
        
        //if(Game.getGame().menu == null && !Game.getGame().stateManager.currentState.getName().equals("menu")){
            
            buttonz.tick();
            
//            EnExplode.tick();
//            P1Explode.tick();
//            P1BExplode.tick();
            
//            POW.tick();
//            Bullet.tick();
//            tp2 = System.currentTimeMillis();
//            time = (float) ((tp2 - tp1)/1000.0);
//            tp1 = tp2;
            
            //Mouse Edge Map Scroll
//            float mapScrollSpeed = 400.0f;
//            if(MouseInput.MouseX < 15.0f) cameraPOSX -= mapScrollSpeed * time;           
//            if(MouseInput.MouseX > (float) (TicTacToe.getMainWidth() - 15.0f)) cameraPOSX += mapScrollSpeed * time;           
//            if(MouseInput.MouseY < 15.0f) cameraPOSY -= mapScrollSpeed * time;           
//            if(MouseInput.MouseY > (float) (TicTacToe.getMainHeight() - 15.0f)) cameraPOSY += mapScrollSpeed * time;
            
            //Clamp Map Boundaries
//            if(cameraPOSX < 0.0f) cameraPOSX = 0;
//            if(cameraPOSX >= (float) (TicTacToe.getMainWidth())) cameraPOSX = mapWidth;
//            if(cameraPOSY < 0.0f) cameraPOSY = 0;           
//            if(cameraPOSY >= (float) (TicTacToe.getMainHeight())) cameraPOSY = mapHeight;
            
//            System.out.println("Csmera POS X:"+cameraPOSX+" Y:"+cameraPOSY);
//            System.out.println("Mouse POS X:"+MouseInput.MouseX+" Y:"+MouseInput.MouseY);
//            System.out.println("Time:"+time);
            
//            if(MouseInput.MouseButton == 1){
//                Dummy p = new Dummy(MouseInput.MousePX + cameraPOSX, MouseInput.MousePY + cameraPOSY);
//                listObjects.add(p);
//            }
            
//            if(MouseInput.MouseButton == 0){
//                boom(MouseInput.MousePX + cameraPOSX, MouseInput.MousePY + cameraPOSY, 10.0f);
//            }
            
            
            for(int i = 0; i < 10; i++){
//                for(PhysicsObject p : listObjects){
//
//                    //Apply Gravity
//                    p.ay += 2.0f;
//
//                    //Update Velocity
//                    p.vx += p.ax * time;
//                    p.vy += p.ay * time;
//
//                    //Update POS
//                    float potentialX = p.px + p.vx * time;
//                    float potentialY = p.py + p.vy * time;
//
//                    //Reset Acceleration
//                    p.ax = 0.0f;
//                    p.ay = 0.0f;
//                    p.stable = false;
//
//                    //p.px = potentialX;
//                    //p.py = potentialY;
//
//                    //Collision Check With Map
//                    float angle = (float) Math.atan2(p.vy, p.vx);
//                    float responseX = 0;
//                    float responseY = 0;
//                    boolean collision = false;
//
//                    //Iterate through semicircle of objects radius rotated to direction of travel
//                    for(float r = angle - 3.14159f / 2.0f; r < angle + 3.14159f / 2.0f; r += 3.14159f / 8.0f){
//
//                        //Calculate test point on circumference of circle
//                        float testPOSX = (float) ((p.radius) * Math.cos(r) + potentialX);
//                        float testPOSY = (float) ((p.radius) * Math.sin(r) + potentialY);
//
//                        //Constrain to test within map boundary
//                        if(testPOSX >= mapWidth) testPOSX = mapWidth - 1;
//                        if(testPOSY >= mapHeight) testPOSY = mapHeight - 1;
//                        if(testPOSX < 0) testPOSX = 0;
//                        if(testPOSY < 0) testPOSY = 0;
//
//                        //Test if any points on semicircle intersect with terrain
//                        if(map[(int) testPOSY * mapWidth + (int) testPOSX] != '0'){
//
//                            //Accummulate collision points to give an escape response vector
//                            //Effectively, normal to the area of contact
//                            responseX += potentialX - testPOSX;
//                            responseY += potentialY - testPOSY;
//                            collision = true;
//                        }
//
//                    }
//
//                    float magVelocity = (float) Math.sqrt(p.vx*p.vx + p.vy*p.vy);
//                    float magResponse = (float) Math.sqrt(responseX*responseX + responseY*responseY);
//
//                    if(collision){
//                        //Force object to be stable, this stops the object penertrating the terrain
//                        p.stable = true;
//
//                        //Calculate reflection vector of objects velocity vector, using response vector as normal
//                        float dot = p.vx * (responseX / magResponse) + p.vy * (responseY / magResponse);
//
//                        //Use friction coefficient to dampen response (approximating energy loss)
//                        p.vx = p.friction * (-2.0f * dot * (responseX / magResponse) + p.vx);
//                        p.vy = p.friction * (-2.0f * dot * (responseY / magResponse) + p.vy);
//
//                        //Some objects will "die" after several bounces
//                        if(p.bounceB4Death > 0){
//                            p.bounceB4Death--;
//                            p.isDead = p.bounceB4Death == 0;
//
//                            //If object died, work out what to do next
//                            if(p.isDead){
//                                //Action upon object death
//                                // = 0 Nothing
//                                // > 0 Explosion
//                                int response = p.bounceDeathAction();
//                                if(response > 0) boom(p.px, p.py, response);
//                            }
//                        }
//
//                    } else {
//                        //No collision so update objects POS
//                        p.px = potentialX;
//                        p.py = potentialY;
//                    }
//
//                    //Turn off movement when tiny
//                    if(magVelocity < 0.1f) p.stable = true;
//                }
//
//                listObjects = getAll();
            
            }
          
    }
    
    
    /**
    * render(Render target, Graphics2D g)
    * 
    * 
    * Renders/Repaints Level Objects
    * 
    * @param target - the Render of Level
    * @param g2d
    */
    public void render(Render target, Graphics2D g2d){
        
        if(Game.showFPS){
            String fps = Game.thefps;
            //target.draw(fps, Labels.fpsX, Labels.fpsY, 0xfe1300);
        }
        if(Game.showUPS){
            String ups = Game.theUps;
            //target.draw(ups, Labels.upsX, Labels.upsY, 0xf0ff00);
        }
        if(Game.showGameTime){
            String gameTime = Game.theGameTime;
            //target.draw(gameTime, Labels.upsX+110, Labels.upsY+44, 0x008fea);
        }
        if(Game.showLevelTime){
            String levTime = theLevelTime;
            //target.draw(levTime, Labels.upsX+310, Labels.upsY+44, 0xff8fea);
        }
            
        //Draw Landscape
//        for(int x = 0; x < Game.getGame().getWidth(); x++){
//            for(int y = 0; y < Game.getGame().getHeight(); y++){
//                switch(map[(y + (int) cameraPOSY) * mapWidth + (x + (int) cameraPOSX)]){
//                    case '0':
//                        g2d.setColor(Color.CYAN);
//                        g2d.drawRect(x, y, 1, 1);
//                        break;
//                    case '1':
//                        g2d.setColor(groundColor);
//                        g2d.drawRect(x, y, 1, 1);
//                        break;
//                }
//            }
//        }
        
//        for(PhysicsObject p : listObjects){
//            p.render(g2d, cameraPOSX, cameraPOSY);
//        }

        if(Game.showBounds){
            g2d.setColor(Color.GREEN);
            //g2d.drawRect(groundBounds.x, groundBounds.y, groundBounds.width, groundBounds.height);
            g2d.setColor(Color.WHITE);
            //g2d.drawRect(Enemy.leftSide - 5, 29, 5, Display.game.getHeight() - (28 + groundBounds.height + 8));
            g2d.setColor(Color.WHITE);
            //g2d.drawRect(Enemy.rightSide + 19, 29, 5, Display.game.getHeight() - (28 + groundBounds.height + 8));
        }    
        
        if (Game.pauseTime > 0 && !Game.paused && Game.getGame().menu == null) {
            if(levelComplete){
                time = System.currentTimeMillis();
//                BRCExplode.clearAll();
//                Barricade.clearAll();
//                P1Explode.clearAll();
//                P1Bullet.clearAll();
                
                for (levelCompleteCount = 0; levelCompleteCount < 500; levelCompleteCount++) {
                    //Draw scaled 3D SI Icon: GOLD
                    if(time / 25 % 5 == 0){
                        //render Space Invaders Icon
                        //target.scaleDraw(Texture.buttonsA, 3, 234, 132, 48, 126, 50, 38, 0xFFBF00);
                        //target.scaleDraw(Texture.buttonsA, 3, 230, 128, 48, 126, 50, 38, 0xBF9B30);
                    } else if(time / 200 % 40 == 0){
                        //render Space Invaders Icon
                        //target.scaleDraw(Texture.buttonsA, 3, 234, 132, 48, 126, 50, 38, 0xBF9B30);
                        //target.scaleDraw(Texture.buttonsA, 3, 230, 128, 48, 126, 50, 38, 0xFFBF00);
                    }
                    if (time / 450 % 2 == 0) {

                        //COMPLETE
                        //target.scaleDraw(Texture.buttonsA, Labels.click2FocusScale, Labels.click2FocusX-20, Labels.click2FocusY+40, 235, 200, 220, 30, 0xBF9B30);
                        //target.scaleDraw(Texture.buttonsA, Labels.click2FocusScale, Labels.click2FocusX-24, Labels.click2FocusY+36, 235, 200, 220, 30, 0xffffff);

                        
                        //Level
                        //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelX-120, Labels.LevelY, 130, 300, 73, 35, levelTxtBGCol);
                        //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelX-116, Labels.LevelY-4, 130, 300, 73, 35, 0xffffff);

                        if (Game.levelNo == 1){
                            //level 1 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 200, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 200, 300, 15, 35, 0xffffff);
                        }
                        
                        if (Game.levelNo == 2) {
                            //level 2 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 220, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 220, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 3) {
                            //level 3 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 240, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 240, 300, 15, 35, 0xffffff);
                        }
                        
                        if (Game.levelNo == 4) {
                            //level 4 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 260, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 260, 300, 15, 35, 0xffffff);
                        }
                        
                        if (Game.levelNo == 5) {
                            //level 5 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 276, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 276, 300, 15, 35, 0xffffff);
                        }
                        
                        if (Game.levelNo == 6) {
                            //level 6 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 292, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 292, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 7) {
                            //level 7 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 310, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 310, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 8) {
                            //level 8 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 332, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 332, 300, 15, 35, 0xffffff);
                        }                        
                    
                        //target.drawText("Lives Bonus: "+Game.getLivesBonus(), 2, Labels.enterLevelX+120, Labels.enterLevelY+170, 0xFeca00);
                        //target.drawText("Time Bonus: "+Game.getTimeBonus(), 2, Labels.enterLevelX+120, Labels.enterLevelY+200, 0xFF0000);
                        //target.drawText("Accuracy Bonus: "+Game.getAccuracyBonus(), 2, Labels.enterLevelX+120, Labels.enterLevelY+230, 0xFFaa00);
                        //target.drawText("Level Bonus: "+Game.getLevelBonus(), 3, Labels.enterLevelX+120, Labels.enterLevelY+275, 0xFFce00);
                        
                        TicTacToe.setStatusBar("Level "+Game.levelNo+" : "+getLevelName()+" Completed!!");    
                    } else {
                        //target.drawText("Level Bonus: "+Game.getLevelBonus(), 3, Labels.enterLevelX+120, Labels.enterLevelY+275, 0xffffff);
                    }
                    
                    if (Game.levelNo == 1){
                        //level 1 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-30, Labels.enterLevelY+70, levelTxtBGCol);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-32, Labels.enterLevelY+68, 0xffffff);
                    }
                    if (Game.levelNo == 2){
                        //level 2 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX, Labels.enterLevelY+70, levelTxtBGCol);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-2, Labels.enterLevelY+68, 0xffffff);
                    }
                    if (Game.levelNo == 3){
                        //level 3 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX+10, Labels.enterLevelY+70, levelTxtBGCol);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX+8, Labels.enterLevelY+68, 0xffffff);
                    }
                    if (Game.levelNo == 4){
                        //level 4 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-5, Labels.enterLevelY+70, levelTxtBGCol);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-7, Labels.enterLevelY+68, 0xffffff);
                    }
                    if (Game.levelNo == 5){
                        //level 5 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX+10, Labels.enterLevelY+70, levelTxtBGCol);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX+8, Labels.enterLevelY+68, 0xffffff);
                    }
                    if (Game.levelNo == 6){
                        //level 6 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-22, Labels.enterLevelY+70, levelTxtBGCol);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-24, Labels.enterLevelY+68, 0xffffff);
                    }
                    if (Game.levelNo == 7){
                        //level 7 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-60, Labels.enterLevelY+70, levelTxtBGCol);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-62, Labels.enterLevelY+68, 0xffffff);
                    }
                    if (Game.levelNo == 8){
                        //level 8 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-50, Labels.enterLevelY+70, levelTxtBGCol);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-52, Labels.enterLevelY+68, 0xffffff);
                    }
                    
                    if (levelCompleteCount == 0) {
                        lastTick = true;
                        break;
                    }
                }
                
            } else {
                time = System.currentTimeMillis();
                for (levelStartCount = 0; levelStartCount < 100; levelStartCount++) {    
                    //Draw scaled 3D SI Icon: BLUE
                    if(time / 25 % 5 == 0){
                        //render Space Invaders Icon
                        //target.scaleDraw(Texture.buttonsA, 3, 234, 132, 48, 126, 50, 38, enterLvlIconBG);
                        //target.scaleDraw(Texture.buttonsA, 3, 230, 128, 48, 126, 50, 38, enterLvlIconFG);
                    } else if(time / 20 % 40 == 0){
                        //render Space Invaders Icon
                        //target.scaleDraw(Texture.buttonsA, 3, 234, 132, 48, 126, 50, 38, enterLvlIconFG);
                        //target.scaleDraw(Texture.buttonsA, 3, 230, 128, 48, 126, 50, 38, enterLvlIconBG);
                    }
                    if (time / 450 % 2 == 0) {

                        //Entering 3D
                        //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.enterLevelX, Labels.enterLevelY+30, 0, 300, 130, 35, levelTxtBGCol);
                        //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.enterLevelX-4, Labels.enterLevelY+26, 0, 300, 130, 35, 0xffffff);

                        //Level
                        //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelX, Labels.LevelY+30, 130, 300, 73, 35, levelTxtBGCol);
                        //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelX-4, Labels.LevelY+26, 130, 300, 73, 35, 0xffffff);

                        if (Game.levelNo == 1 || Game.levelNo == -1) {
                            
                            //level 1 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelY+30, 200, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelY+26, 200, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 2) {
                            //level 2 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 220, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 220, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 3) {
                            //level 3 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 240, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 240, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 4) {
                            //level 4 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 260, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 260, 300, 15, 35, 0xffffff);
                        }
                        
                        if (Game.levelNo == 5) {
                            //level 5 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 276, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 276, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 6) {
                            //level 6 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 292, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 292, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 7) {
                            //level 7 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 310, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 310, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 8) {
                            //level 8 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 332, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 332, 300, 15, 35, 0xffffff);
                        }
                        TicTacToe.setStatusBar("Entering Level "+Game.levelNo+" : "+getLevelName());
                        
                    }
                    
                    if (Game.levelNo == 1 || Game.levelNo == -1) {
                        //level 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-30, Labels.enterLevelY+100, 0xffffff);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-31, Labels.enterLevelY+99, levelTxtBGCol);
                    }
                    if (Game.levelNo == 2) {
                        //level 2 Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX, Labels.enterLevelY+100, 0xffffff);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-1, Labels.enterLevelY+99, levelTxtBGCol);
                    }
                    if (Game.levelNo == 3) {
                        //level 3 Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX+10, Labels.enterLevelY+100, 0xffffff);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX+9, Labels.enterLevelY+99, levelTxtBGCol);
                    }
                    if (Game.levelNo == 4) {
                        //level 4 Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-5, Labels.enterLevelY+100, 0xffffff);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-6, Labels.enterLevelY+99, levelTxtBGCol);
                    }
                    if (Game.levelNo == 5) {
                        //level 5 Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX+10, Labels.enterLevelY+100, 0xffffff);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX+9, Labels.enterLevelY+99, levelTxtBGCol);
                    }
                    if (Game.levelNo == 6) {
                        //level 6 Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-22, Labels.enterLevelY+100, 0xffffff);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-21, Labels.enterLevelY+99, levelTxtBGCol);
                    }
                    if (Game.levelNo == 7) {
                        //level 7 Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-60, Labels.enterLevelY+100, 0xffffff);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-61, Labels.enterLevelY+99, levelTxtBGCol);
                    }
                    if (Game.levelNo == 8) {
                        //level 8 Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-50, Labels.enterLevelY+100, 0xffffff);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-51, Labels.enterLevelY+99, levelTxtBGCol);
                    }
                    
                    if(levelStartCount == 100){
                        firstTick = true;
                        //Reset Level Time
                        resetLevelTime();
                        break;
                    }
                    
                }
            }
            
        }
    
    }

    
    /**
    * setBackground(int index)
    * 
    * 
    * @param index
    */
    public static void setBackground(int index) {
        //background = index;
    }

    
    /**
    * setGroundColor(int col)
    * 
    * 
    * @param col
    */
    private void setGroundColor(Color col) {
        groundColor = col;
    }

    
    /**
    * resetLevelTime()
    * 
    */
    public static void resetLevelTime() {
        System.out.println("Level: Resetting Level Time");
        Game.levelTime = 0;
    }
    
//    public static void drawWireFrameModel(Graphics2D g2d, Vector2f[] vecModelCoordinates, float _x, float _y, float ang, float r, Color col) {
//        int verts = vecModelCoordinates.length;
//        Vector2f[] vecTransformedCoordinates = new Vector2f[verts];
//        float s = r * worldScale;
//        
//        g2d.setColor(col);
//        //g2d.setPaint(_rockTP);
//        
//        //Rotate
//        for(int i = 0; i < verts; i++){
//            vecTransformedCoordinates[i] = new Vector2f(0, 0);
//            vecTransformedCoordinates[i].x = vecModelCoordinates[i].x * (float) Math.cos(ang) - vecModelCoordinates[i].y * (float) Math.sin(ang);
//            vecTransformedCoordinates[i].y = vecModelCoordinates[i].x * (float) Math.sin(ang) + vecModelCoordinates[i].y * (float) Math.cos(ang);
//        }
//        
//        //Scale
//        for(int i = 0; i < verts; i++){
//            vecTransformedCoordinates[i].x = vecTransformedCoordinates[i].x * s;
//            vecTransformedCoordinates[i].y = vecTransformedCoordinates[i].y * s;
//        }
//
//        //Translate
//        for(int i = 0; i < verts; i++){
//            vecTransformedCoordinates[i].x = vecTransformedCoordinates[i].x + _x;
//            vecTransformedCoordinates[i].y = vecTransformedCoordinates[i].y + _y;
//        }
//
//        //Draw Closed Polygon
////        for(int i = 0; i < verts + 1; i++){
////            int j = (i + 1);
////            g2d.drawLine((int) vecTransformedCoordinates[i % verts].x, (int) vecTransformedCoordinates[i % verts].y, (int) vecTransformedCoordinates[j % verts].x, (int) vecTransformedCoordinates[j % verts].y);
////        }
//        
////        GeneralPath ast = new GeneralPath();
////        ast.moveTo(vecTransformedCoordinates[0].x, vecTransformedCoordinates[0].y);
////        for(int i = 1; i < verts - 1; i++){
////            ast.lineTo(vecTransformedCoordinates[i % verts].x, (int) vecTransformedCoordinates[i % verts].y);
////        }
////        ast.closePath();
//        //g2d.fill(ast);
//        
////        g2d.setColor(col);
////        g2d.draw(ast);
//    }

    public static void drawSprite(Graphics2D g2d, BufferedImage _sprite, float _x, float _y, float f1, float radius) {
        g2d.drawImage(_sprite, (int) _x, (int) _y, null);
    }
    
    private static void boom(float worldX, float worldY, float radius) {
//        circleBresenham((int) worldX, (int) worldY, (int) radius);
        
//        for(PhysicsObject p : listObjects){
//            //Work out distance between explosion origin and object
//            float dx = p.px - worldX;
//            float dy = p.py - worldY;
//            float dist = (float) Math.sqrt(dx*dx + dy*dy);
//            if(dist < 0.0001f) dist = 0.0001f;
//            
//            //If within blast radius
//            if(dist < radius){
//                //Set velocity proportional and away from boom origin
//                p.vx = (dx/dist) * radius;
//                p.vy = (dy/dist) * radius;
//                p.stable = false;
//            }
//            
//        }
        
        //Launch debris proportional to blast size
//        for(int i = 0; i < (int) radius; i++){
//            listObjects.add(new Debris(worldX, worldY));
//        }
        
    }
    
//    private static void circleBresenham(int xc, int yc, int r) {
//        //Taken from wikipedia
//        int x = 0;
//        int y = r;
//        int p = 3 - 2 * r;
//        if(r < 0) return;
//        
//        while(y >= x){
//            //Modified to draw scan-lines instead of edges
//            drawLine(xc - x, xc + x, yc - y);
//            drawLine(xc - y, xc + y, yc - x);
//            drawLine(xc - x, xc + x, yc + y);
//            drawLine(xc - y, xc + y, yc + x);
//            if(p < 0){ 
//                p += 4 * x++ + 6; 
//            } else {
//                p += 4 * (x++ - y--) + 10;
//            }
//            
//        }
//        
//        
//    }
    
//    private static void drawLine(int sx, int ex, int ny) {
//        for(int i = sx; i < ex; i++){
//            if(ny >= 0 && ny < mapHeight && i >= 0 && i < mapWidth) map[ny * mapWidth + i] = 0;
//        }
//    }

//    private static List<PhysicsObject> getAll() {
//        listObjectsA = new ArrayList<>();
//        int j = 0;
//        
//        for (int i = 0; i < listObjects.size(); i++) {
//            if (listObjects.get(i).isDead == false) {
//                listObjectsA.add(j, listObjects.get(i));
//                
//                j++;
//            }
//        }
//        
//        return listObjectsA;
//    }
    
}
