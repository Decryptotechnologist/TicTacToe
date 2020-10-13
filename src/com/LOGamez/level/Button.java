/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.level;

import com.LOGamez.graphics.Texture;
import com.LOGamez.tictactoe.TicTacToe;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Nicholas Wright
 */
public class Button {

    /**Attributes*/ 
    
    /**x variable of Button*/ 
    private int x;
    
    /**y variable of Button*/ 
    private int y;
    
    /**btnWidth variable of Button*/ 
    private int btnWidth;
    
    /**btnHeight variable of Button*/ 
    private int btnHeight;
    
    /**symbol variable of Button*/ 
    private String symbol;
    
    /**btnFont variable of Button*/ 
    private Font btnFont;
    
    /**btnColor variable of Button*/ 
    private Color btnColor;
    
    /**button variable of Button*/ 
    private JButton button;
    
    /**symbol variable of Button*/ 
    private List<Button> buttons;
    
    /**type variable of Button*/
    private int type;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private boolean firstTick;
    private boolean lastTick;
    private JPanel buttonPanel;
    private final BufferedImage noughtIcon = new Texture("/sprites/nought_192").getImage();
    private final BufferedImage crossIcon = new Texture("/sprites/cross_192").getImage();
    private int id;
    
    
    /**Links*/ 
    
    
    
    /**Constructor*/ 
    
    /**
     * Button Constructor
     * 
     * @param _type
     */
    public Button(int _type){
        this.type = _type;
        buttons = new ArrayList<>();
    }
    
    
    /**
     * Button Constructor
     * 
     * @param _x
     * @param _y
     * @param _w
     * @param _h
     * @param _c
     * @param _id
     * @param col
     */
    public Button(int _x, int _y, int _w, int _h, String _c, int _id, Color col){
        this.x = _x;
        this.y = _y;
        this.btnWidth = _w;
        this.btnHeight = _h;
        this.symbol = _c;
        this.id = _id;
        this.button = new JButton();
        
        button.setBounds(new Rectangle(this.x, this.y, this.btnWidth, this.btnHeight));
        button.setPreferredSize(new Dimension(this.btnWidth, this.btnHeight));
        button.setBorder(new LineBorder(Color.decode("#333"), 4, false));
        button.setBackground(col);
        button.setFont(btnFont);
        button.setVisible(true);
    }
    
    
    /**Public Protocol*/ 
    
    /**
     * init()
     * 
     */
    public void init(){
        GridLayout experimentalLayout = new GridLayout(1, 0, 0, 0);
        
        JPanel buttonPanel1 = new JPanel();
        buttonPanel1.setLayout(experimentalLayout);
        buttonPanel1.setBounds(new Rectangle(0, 0, TicTacToe.getMainWidth(), 200));
        buttonPanel1.setPreferredSize(new Dimension(TicTacToe.getMainWidth(), 200));
        buttonPanel1.setBackground(Color.decode("#8D8D8D"));
        
        JPanel buttonPanel2 = new JPanel();
        buttonPanel2.setLayout(experimentalLayout);
        buttonPanel2.setBounds(new Rectangle(0, 0, TicTacToe.getMainWidth(), 200));
        buttonPanel2.setPreferredSize(new Dimension(TicTacToe.getMainWidth(), 200));
        buttonPanel2.setBackground(Color.decode("#8D8D8D"));
        
        JPanel buttonPanel3 = new JPanel();
        buttonPanel3.setLayout(experimentalLayout);
        buttonPanel3.setBounds(new Rectangle(0, 0, TicTacToe.getMainWidth(), 200));
        buttonPanel3.setPreferredSize(new Dimension(TicTacToe.getMainWidth(), 200));
        buttonPanel3.setBackground(Color.decode("#8D8D8D"));
        
        button0 = new Button(0, 0, 200, 200, "A", 0, btnColor);
        button1 = new Button(200, 0, 200, 200, "A", 1, btnColor);
        button2 = new Button(400, 0, 200, 200, "A", 2, btnColor);
        buttons.add(button0);
        buttons.add(button1);
        buttons.add(button2);
        buttonPanel1.add(button0.button);
        buttonPanel1.add(button1.button);
        buttonPanel1.add(button2.button);
        
        button3 = new Button(0, 200, 200, 200, "A", 3, btnColor);
        button4 = new Button(200, 200, 200, 200, "A", 4, btnColor);
        button5 = new Button(400, 200, 200, 200, "A", 5, btnColor);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttonPanel2.add(button3.button);
        buttonPanel2.add(button4.button);
        buttonPanel2.add(button5.button);
        
        button6 = new Button(0, 400, 200, 200, "A", 6, btnColor);
        button7 = new Button(200, 400, 200, 200, "A", 7, btnColor);
        button8 = new Button(400, 400, 200, 200, "A", 8, btnColor);
        buttons.add(button6);
        buttons.add(button7);
        buttons.add(button8);
        buttonPanel3.add(button6.button);
        buttonPanel3.add(button7.button);
        buttonPanel3.add(button8.button);
        
        for(Button b : buttons){
            b.button.addMouseListener(new MouseAdapter(){
                @Override
                public void mousePressed(MouseEvent evt){
                    BtnMousePressed(evt, b.id);
                }
                @Override
                public void mouseReleased(MouseEvent evt){
                    BtnMouseReleased(evt, b.id);
                }
                
            });
        }
        
        
        
        buttonPanel = new JPanel();
        BoxLayout experimentalLayout1 = new BoxLayout(buttonPanel, 1);
        
        buttonPanel.setLayout(experimentalLayout1);
        buttonPanel.setBounds(new Rectangle(0, 0, TicTacToe.getMainWidth(), TicTacToe.getMainHeight()));
        buttonPanel.add(buttonPanel1);
        buttonPanel.add(buttonPanel2);
        buttonPanel.add(buttonPanel3);
        
        Level.panel.add(buttonPanel);
        
        firstTick = true;
        lastTick = false;
        
    }
    
    
    /**
     * tick()
     * 
     */
    public void tick(){
        if(firstTick) {
            //Set firstTick: false
            firstTick = false;
            
        }
        
        //Manage Level: Last Tick
        if(lastTick) {
            lastTick = false;
//            Sound.stopAll();
//            if(!Sound.creditsSoundtrack.isPlaying()){
//                Sound.creditsSoundtrack.play();
//            }
            
            //Reset Level Time
            //resetLevelTime();
        }
    }
    
    
    
    /**
     * render()
     * 
     */
    public void render(){}
    
    
    private void BtnMousePressed(MouseEvent evt, int _id) {
                    
    }

    private void BtnMouseReleased(MouseEvent evt, int _id) {
        JButton eSource = (JButton) evt.getSource();
        if(evt.getButton() == MouseEvent.BUTTON1){
            setCross(eSource, _id);
        }
        if(evt.getButton() == MouseEvent.BUTTON2){}
        if(evt.getButton() == MouseEvent.BUTTON3){
            setNought(eSource, _id);
        }
    }

    private void setNought(JButton eSource, int _id) {
        if(buttons.get(_id).symbol.equals("A")) {
            eSource.setIcon(new ImageIcon(noughtIcon));
            buttons.get(_id).symbol = "O";
        }
        checkWin();
    }

    private void setCross(JButton eSource, int _id) {
        if(buttons.get(_id).symbol.equals("A")) {
            eSource.setIcon(new ImageIcon(crossIcon.getScaledInstance(176, 176, Image.SCALE_SMOOTH)));
            buttons.get(_id).symbol = "X";
        }
        checkWin();
    }

    private void checkWin() {
//        int[] winLines = {0,1,2},
//                {3,4,5};
    }
    
}
