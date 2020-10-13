/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.player;


//import com.LOGamez.enemiez.Enemy;
import com.LOGamez.graphics.*;
import com.LOGamez.level.*;
import com.LOGamez.tictactoe.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

/**
 *
 * @author Nicholas Wright
 */
public class Player {

    /**Attributes*/
    
    /**x variable of Player*/ 
    int x;
    
    /**y variable of Player*/ 
    int y;
    
    /**dx variable of Player*/ 
    double dx;
    
    /**dy variable of Player*/ 
    double dy;
    
    /**Pwidth variable of Player*/ 
    int Pwidth;
    
    /**Pheight variable of Player*/ 
    int Pheight;
    
    /**lives variable of Player*/ 
    public static int lives;
    
    /**startLives variable of Player*/
    int startLives;
    
    /**LALCount variable of Player*/
    int LALCount;
    
    /**P1Rect variable of Player*/
    public static Rectangle P1Rect;
    
    /**moveSpeed variable of Player*/
    public static int moveSpeed;
    
    /**pLives0X variable of Player*/
    public static int pLives0X = 540;
    
    /**pLives1X variable of Player*/
    public static int pLives1X = 560;
    
    /**pLives2X variable of Player*/
    public static int pLives2X = 580;
    
    /**pLivesScale variable of Player*/
    public static int pLivesScale = 16;
    
    /**pLivesY variable of Player*/
    public static int pLivesY = TicTacToe.getMainHeight() - 56;
    
    /**isFiring variable of Player*/
    boolean isFiring;
    
    /**isDead variable of Player*/
    boolean isDead;
    
    /**mouseLeft variable of Player*/
    public static boolean mouseLeft;
    
    /**mouseRight variable of Player*/
    public static boolean mouseRight;
    
    /**mouseFire variable of Player*/
    public static boolean mouseFire;
    
    /**playerImg variable of Player*/
    BufferedImage playerImg;
    
    /**pLivesImg variable of Player*/
    public static BufferedImage pLivesImg;
    
    /**imgP1 variable of Player*/
    BufferedImage imgP1;
    
    /**imgPLives variable of Player*/
    public static BufferedImage imgPLives;
    
    /**playerName variable of Player*/
    String playerName;
    
    /**playerImg0 variable of Player*/
    BufferedImage playerImg0;
    
    /**playerImg1 variable of Player*/
    BufferedImage playerImg1;
    
    /**playerImg2 variable of Player*/
    BufferedImage playerImg2;
    
    /**currentVec variable of Player*/
//    public static Vector2d currentVec;
    
    /**power variable of Player*/
    public static int power;

    /**levelNo variable of Player*/
    public static String levelNo;
    
    /**livesNo variable of Player*/
    public static String livesNo;
    
    /**playScore variable of Player*/
    private String playScore;
    
    /**mazes variable of Player*/
//    private List<Rectangle> mazes = new ArrayList<>();
    
    /**leftBlocked variable of Player*/
    private boolean leftBlocked = false;
    
    /**rightBlocked variable of Player*/
    private boolean rightBlocked = false;
    
    /**upBlocked variable of Player*/
    private boolean upBlocked = false;
    
    /**downBlocked variable of Player*/
    private boolean downBlocked = false;
    
    /**rLeft variable of Player*/
    private Rectangle rLeft;
    
    /**rRight variable of Player*/
    private Rectangle rRight;
    
    /**rTop variable of Player*/
    private Rectangle rTop;
    
    /**rBottom variable of Player*/
    private Rectangle rBottom;
    
    /**foods variable of Player*/
//    private List<Food> foods;
    
    /**pills variable of Player*/
//    private List<Pill> pills;
    
    /**isMoving variable of Player*/
    private boolean isMoving;
    
    /**playerAnim variable of Player*/
//    private Animation playerAnim = new Animation(18, 
//        new Texture("/sprites/pac_R0"), 
//        new Texture("/sprites/pac_R1"), 
//        new Texture("/sprites/pac_R0"), 
//        new Texture("/sprites/pac_R1")
//    );
    
    /**playerLeftAnim variable of Player*/
//    private final Animation playerLeftAnim = new Animation(18, 
//        new Texture("/sprites/pac_L0"), 
//        new Texture("/sprites/pac_L1"), 
//        new Texture("/sprites/pac_L0"), 
//        new Texture("/sprites/pac_L1")
//    );
    
    /**playerRightAnim variable of Player*/
//    private final Animation playerRightAnim = new Animation(18, 
//        new Texture("/sprites/pac_R0"), 
//        new Texture("/sprites/pac_R1"), 
//        new Texture("/sprites/pac_R0"), 
//        new Texture("/sprites/pac_R1")
//    );
    
    /**playerUpAnim variable of Player*/
//    private final Animation playerUpAnim = new Animation(18, 
//        new Texture("/sprites/pac_U0"), 
//        new Texture("/sprites/pac_U1"), 
//        new Texture("/sprites/pac_U0"), 
//        new Texture("/sprites/pac_U1")
//    );
    
    /**playerDownAnim variable of Player*/
//    private final Animation playerDownAnim = new Animation(18, 
//        new Texture("/sprites/pac_D0"), 
//        new Texture("/sprites/pac_D1"), 
//        new Texture("/sprites/pac_D0"), 
//        new Texture("/sprites/pac_D1")
//    );
    
    /**playerDeadAnim variable of Player*/
//    private final Animation playerDeadAnim = new Animation(18, 
//        new Texture("/sprites/pac_Dead0"), 
//        new Texture("/sprites/pac_Dead1"), 
//        new Texture("/sprites/pac_Dead2"), 
//        new Texture("/sprites/pac_Dead3"),
//        new Texture("/sprites/pac_Dead4"),
//        new Texture("/sprites/pac_Dead5")    
//    );
    
    /**ghosts variable of Player*/
//    private List<Enemy> ghosts;
    
    /**isDeadCount variable of Player*/
    private int isDeadCount = 0;
    
    

    
    /**Links*/
    
    
    
    
    
    /**Constructor*/
    
    
    /**
     * Player Constructor
     * 
     * 
     * @param x
     * @param y
     * @param w
     * @param h
     * @param name
     * @param Lives
     */
    public Player(int x, int y, int w, int h, String name, int Lives) {
        System.out.println("Player: New Player Created");
        
        this.x = x;
        this.y = y;
//        this.currentVec = new Vector2d(this.x, this.y);
        this.Pwidth = w;
        this.Pheight = h;
        playerName = name;
        lives = Lives;
        this.startLives = lives;
        this.LALCount = 0;
        this.P1Rect = new Rectangle(x+1, y+1, w-2, h-2);
        
        rLeft = new Rectangle(this.x-1, this.y, 3, this.Pheight);
        rRight = new Rectangle(this.x+Pwidth-2, this.y, 3, this.Pheight);
        rTop = new Rectangle(this.x, this.y-2, this.Pwidth, 3);
        rBottom = new Rectangle(this.x, this.y+Pheight-2, this.Pwidth, 3);
        
        moveSpeed = 3;
        isMoving = false;
        isDead = false;
        
//        pLivesImg = new Texture("/sprites/pac_R1").getImage();
//        playerImg = new Texture("/sprites/pac_R1").getImage();
//        playerImg0 = new Texture("/sprites/pac_D1").getImage();
//        playerImg1 = new Texture("/sprites/pac_L1").getImage();
//        playerImg2 = new Texture("/sprites/pac_U1").getImage();
        
        imgP1 = playerImg;
    }
    
    
    
    /**Public Protocol*/
    
    
    /**
     * increasePlayerLives(int liv)
     * 
     * 
     * @param liv
     */
    public void increasePlayerLives(int liv) {
        lives += liv;
    }
    
    
    /**
     * render(Game game, Graphics2D g2d)
     * 
     *
     * @param g2d
     */
    public void render(Graphics2D g2d){
        Graphics2D g2d_Player = g2d;
        AffineTransform oldXForm = g2d.getTransform();
        
        //Draw Game Title
        g2d_Player.setColor(Color.GREEN);
        g2d_Player.drawString(Game.TITLE, Game.gameWidth/2 - Game.TITLE.length() * 3, 12);
        ///////////////////////////////////////////////////////////////////////////////////

        //Draw Player Name
        g2d_Player.setColor(Color.GRAY);
        g2d_Player.drawString("Player Name: ", Game.gameWidth/2 - Game.getPName().length() * 8, 28);
        g2d_Player.setColor(Color.GRAY);
        g2d_Player.drawString(Game.getPName(), Game.gameWidth/2 + Game.getPName().length() * 2, 28);
        ///////////////////////////////////////////////////////////////////////////////////
        
        //Draw Player Lives
        if(lives == 3){            
            g2d_Player.drawImage(imgPLives, pLives2X, pLivesY, pLivesScale, pLivesScale, null);
            g2d_Player.drawImage(imgPLives, pLives1X, pLivesY, pLivesScale, pLivesScale, null);
            g2d_Player.drawImage(imgPLives, pLives0X, pLivesY, pLivesScale, pLivesScale, null);
        }
        
        if(lives == 2){
            g2d_Player.drawImage(imgPLives, pLives1X, pLivesY, pLivesScale, pLivesScale, null);
            g2d_Player.drawImage(imgPLives, pLives0X, pLivesY, pLivesScale, pLivesScale, null);
        }
        
        if(lives == 1){
            g2d_Player.drawImage(imgPLives, pLives0X, pLivesY, pLivesScale, pLivesScale, null);
        }
        ///////////////////////////////////////////////////////////////////////////////////
        
        //Draw Hi-Score
        Font currentFont = new Font("default", Font.BOLD, 28);
        g2d_Player.setFont(currentFont);
        g2d_Player.setColor(Color.YELLOW);
        ///////////////////////////////////////////////////////////////////////////////////
        
        //Draw Current Score
        String currentScore;
        if(Game.gameScore == 0){ 
            currentScore = "000000";
        } else if(Game.gameScore > 0 && Game.gameScore < 1000){
            currentScore = "000"+Game.gameScore;
        } else if(Game.gameScore > 1000 && Game.gameScore < 10000){ 
            currentScore = "00"+Game.gameScore;
        } else if(Game.gameScore > 10000 && Game.gameScore < 100000){
            currentScore = "0"+Game.gameScore;
        } else if(Game.gameScore > 100000 && Game.gameScore < 1000000){ 
            currentScore = "0"+Game.gameScore;
        } else {
            currentScore = ""+Game.gameScore;
        }
        
        g2d_Player.drawString(currentScore, 36, 30);
        currentFont = new Font("default", Font.PLAIN, 10);
        g2d_Player.setFont(currentFont);
        ///////////////////////////////////////////////////////////////////////////////////
        
//        if(isDead) playerDeadAnim.render(g2d, x, y, Pwidth, Pheight);
                
        if(this.isDead == false){
            if(isMoving){
                //Draw Player Animation
//                playerAnim.render(g2d, x, y, Pwidth, Pheight);
            } else {
                //Draw Player
                g2d_Player.drawImage(imgP1, x, y, Pwidth, Pheight, null);//Pwidth, Pheight, null);
                ///////////////////////////////////////////////////////////////////////////////////
                
            }
            
            //Draw Bounds
            if(Game.showBounds || Game.showPlayerBounds){
                //Draw Bounding Box
                g2d_Player.setColor(Color.CYAN);
                g2d_Player.drawRect(x, y, Pwidth, Pheight);
                ///////////////////////////////////////////////////////////////////////////////////
            
                g2d_Player.setColor(Color.red);
                g2d_Player.drawRect(P1Rect.x, P1Rect.y, P1Rect.width, P1Rect.height);
                
                g2d_Player.setColor(Color.DARK_GRAY);
                g2d_Player.drawRect(rRight.x, rRight.y, rRight.width, rRight.height);
                
                g2d_Player.setColor(Color.BLUE);
                g2d_Player.drawRect(rLeft.x, rLeft.y, rLeft.width, rLeft.height);
                
                g2d_Player.setColor(Color.white);
                g2d_Player.drawRect(rTop.x, rTop.y, rTop.width, rTop.height);
                
                g2d_Player.setColor(Color.yellow);
                g2d_Player.drawRect(rBottom.x, rBottom.y, rBottom.width, rBottom.height);
                
                g2d_Player.setColor(Color.green);
                g2d_Player.drawOval(P1Rect.x+1, P1Rect.y+1, P1Rect.width-2, P1Rect.height-2);
                
                g2d_Player.setColor(Color.orange);
                g2d_Player.drawLine(x + Pwidth/2, y, x + Pwidth/2, y+14);
                g2d_Player.drawLine(x, y + Pheight/2, x + 64, y + Pheight/2);
            }
            ///////////////////////////////////////////////////////////////////////////////////
            
        }
        
        g2d.setTransform(oldXForm);
        g2d_Player.setTransform(oldXForm);
    
    }
    
    
    /**
     * tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire)
     * 
     * 
     * @param game
     * @param up
     * @param down
     * @param left
     * @param right
     * @param fire
     */
    public void tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire){//, boolean rotLeft, boolean rotRight){
        checkCollisions();
        //Load Player Lives Image
        imgPLives = pLivesImg;        
        
        if(left){
            isMoving = true;
//            playerAnim = playerLeftAnim;
            imgP1 = playerImg1;
//            if(x > 30){
            if(!leftBlocked){
                dx -= moveSpeed;
                P1Rect.x -= moveSpeed;
                rLeft.x -= moveSpeed;
                rRight.x -= moveSpeed;
                rTop.x -= moveSpeed;
                rBottom.x -= moveSpeed;
                
                if(x < 0){
                    this.x = TicTacToe.getMainWidth() - 15;
                    P1Rect.x = this.x;
                }
            }
        } else 
        
        if(right){
            isMoving = true;
//            playerAnim = playerRightAnim;
            imgP1 = playerImg;
//            if(x < game.getWidth() - 59){//width - 68
            if(!rightBlocked){
                dx += moveSpeed;
                P1Rect.x += moveSpeed;
                rLeft.x -= moveSpeed;
                rRight.x -= moveSpeed;
                rTop.x -= moveSpeed;
                rBottom.x -= moveSpeed;
                
                if(x > TicTacToe.getMainWidth()){
                    this.x = 15;
                    P1Rect.x = this.x;
                }
            }
        } else
            
        if(down){
            isMoving = true;
//            playerAnim = playerDownAnim;
            imgP1 = playerImg0;
//            if(y < game.getHeight() - 120){//height - 110
            if(!downBlocked){
                dy += moveSpeed;
                P1Rect.y += moveSpeed;
                rLeft.y -= moveSpeed;
                rRight.y -= moveSpeed;
                rTop.y -= moveSpeed;
                rBottom.y -= moveSpeed;
            }
        } else 
        
        if(up){
            isMoving = true;
//            playerAnim = playerUpAnim;
            imgP1 = playerImg2;
//            if(y > 62){
            if(!upBlocked){
                dy -= moveSpeed;
                P1Rect.y -= moveSpeed;
                rLeft.y -= moveSpeed;
                rRight.y -= moveSpeed;
                rTop.y -= moveSpeed;
                rBottom.y -= moveSpeed;
            }
        }
        
        if(fire){
            if(game.menu == null){
                if(isFiring == false){
                    //ball.fire();
                    isFiring = true;
                    //shotsFired++;
                }
            }
        }
        
        if(mouseFire){
            if(game.menu == null){
                if(isFiring == false){
                    //ball.fire();
                    isFiring = true;
                    fire = false;
                }
            }
        }
        
        if(Player.lives == 0){
            isDead = true;
            dead();
	}
        
        Player.lives = Player.getLives();
        x += dx;
        y += dy;
        
//        currentVec = new Vector2d(x, y);
        
        dx = 0;
        dy = 0;
        
        leftBlocked = false;
        rightBlocked = false;
        upBlocked = false;
        downBlocked = false;
        
        rLeft = new Rectangle(this.x-1, this.y+3, 3, this.Pheight-6);
        rRight = new Rectangle(this.x+Pwidth-1, this.y+3, 3, this.Pheight-6);
        rTop = new Rectangle(this.x+3, this.y-2, this.Pwidth-6, 3);
        rBottom = new Rectangle(this.x+3, this.y+Pheight-1, this.Pwidth-6, 3);
        
        if(!up && !down && !left && !right){
            isMoving = false;
        } else {
//            playerAnim.run();
//            playerLeftAnim.run();
//            playerRightAnim.run();
//            playerUpAnim.run();
//            playerDownAnim.run();
        }
        
//        playerDeadAnim.run();
        
        if(isDeadCount > 0 && isDead){ 
            isDeadCount--;
            System.out.println("Target Count: "+isDeadCount);
        } 
        if(isDeadCount == 0 && isDead){
            resetPlayer();
        }
        
    }
    
    
    /**
    * P1Hit()
    * 
    */
    public void P1Hit(){
        if(isDeadCount == 0 && isDead == false){
            loseALife();
            if(LALCount < startLives){
                LALCount += 1;
            } else {
                LALCount = 0;
            }
        }
    }
    
    
    /**
    * loseALife()
    * 
    */
    public void loseALife(){
        if(LALCount < 1){
            if(lives >= 1){
                lives--;
                isDead = true;
                isDeadCount = 110;
                
                if(Game.getGameSound()){
//                    Sound.P1Exp.play();
                }
            }
        }
    }
    
    
    /**
    * dead()
    * 
    * 
    */
    public void dead(){
        System.out.println("Player: GAME OVER!!!");
        isDead = true;
        Game.loseGame();
    }
    
    
    /**
    * getLives()
    * 
    * 
    * @return lives
    */
    public static int getLives() {
        return lives;
    }
    
    
    /**
    * setPlayerName(String name)
    * 
    * 
    * @param name
    */
    public void setPlayerName(String name) {
        this.playerName = name;
    }
    
    
    
    /**
    * setPOW(int pow)
    * 
    * 
    * @param pow
    */
    public static void setPOW(int pow) {
        
    }
    
    
    /**
    * getPOW()
    * 
    * 
    * @return power
    */
    public static int getPOW() {
        return power;
    }

    
    /**
    * extraLife()
    * 
    * Checks if LALCount is less than 1 then 
    * checks if live is greater than or equal 
    * to 1. As the checks pass lives is 
    * decremented by 1 and a P1Explode is 
    * fired via the P1Explode.P1Detonate(this) 
    * message.
    * 
    */
    public void extraLife(){
	lives++;
	
        setPOW(getPOW());
    }

    
    /**
    * getPlayScore()
    * 
    * 
    * @return playScore
    */
    public String getPlayScore() {
        return playScore;
    }

    
    /**
    * setLives(int liv)
    * 
    * 
    * @param liv
    */
    public void setLives(int liv) {
        lives = liv;
    }

    
    /**
     * getBounds()
     * 
     * 
     * @return n1
     */
    public Rectangle getBounds() {
        Rectangle n1 = new Rectangle(P1Rect.x + P1Rect.width/8, P1Rect.y + P1Rect.height/2, P1Rect.width/4, P1Rect.height/2);
        return n1;
    }

    
    /**
     * checkCollisions()
     * 
     * 
     */
    private void checkCollisions() {
//        mazes = Maze.getAllRect();
//        foods = Food.getAll();
//        pills = Pill.getAll();
//        ghosts = Enemy.getAllEnemies();
        
//        for(Rectangle rMaze : mazes){
//            if(rLeft.intersects(rMaze)) leftBlocked = true;
//            
//            if(rRight.intersects(rMaze)) rightBlocked = true;
//            
//            if(rTop.intersects(rMaze)) upBlocked = true;
//            
//            if(rBottom.intersects(rMaze)) downBlocked = true;
//            
//        }
        
//        Rectangle pR = new Rectangle(this.x, this.y, this.Pwidth, this.Pheight);
//        for(Food aFood : foods){
//            Rectangle r1 = new Rectangle(aFood.x, aFood.y, aFood.width, aFood.height);
//            if(pR.intersects(r1)){
//                //increase score
//                Game.increaseScore(10);
//                
//                //Food hit
//                Food.hit(aFood);
//            }
//        }
        
//        for(Pill aPill : pills){
//            Rectangle r1 = new Rectangle(aPill.x, aPill.y, aPill.width, aPill.height);
//            if(pR.intersects(r1)){
//                //increase score
//                Game.increaseScore(50);
//                
//                //Change Enemy Behavior
//                for(Enemy aGhost : ghosts){
//                    aGhost.isTarget = true;
//                    Enemy.isTargetCount = 400;
//                }
//                
//                //Pill hit
//                Pill.hit(aPill);
//            }
//        }
        
//        for(Enemy aGhost : ghosts){
//            Rectangle r1 = new Rectangle(aGhost.x, aGhost.y, aGhost.width, aGhost.height);
//            if(pR.intersects(r1)){
//                
//                if(aGhost.isTarget){
//                    //increase score
//                    Game.increaseScore(200);
//
//                    //Change Enemy Behavior
//
//                    //Enemy hit
//                    Enemy.EnemyHit(aGhost);
//                } else {
//                    if(!aGhost.isDead){
//                        P1Hit();
//                    
//                        break;
//                    }
//                }
//                
//            }
//            
//        }
    }
    
    
    /**
     * getX()
     * 
     * @return (int) currentVec.x
     */
//    public static int getX(){
//        return (int) currentVec.x;
//    }
    
    
    /**
     * getY()
     * 
     * @return (int) currentVec.y
     */
//    public static int getY(){
//        return (int) currentVec.y;
//    }

    
    /**
     * resetPlayer()
     * 
     */
    private void resetPlayer() {
        this.x = Level.playerStartX;
        this.y = Level.playerStartY;
        isDead = false;
    }

}
