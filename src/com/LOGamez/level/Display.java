/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.level;

import com.LOGamez.graphics.Texture;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Nicholas Wright
 */
public class Display {
    
    /**Attributes*/ 
    
    /**panel variable of Display*/ 
    public JPanel panel;
    
    /**x variable of Display*/ 
    private final int x;
    
    /**y variable of Display*/ 
    private final int y;
    
    /**displayWidth variable of Display*/ 
    private final int displayWidth;
    
    /**displayHeight variable of Display*/ 
    private final int displayHeight;
    private final JPanel leftPanel;
    private final JLabel leftTopLabel;
    private Font displayFont;
    private final JLabel leftMiddleLabel;
    private final JLabel leftBottomLabel;
    private final JPanel rightPanel;
    private final JLabel rightTopLabel;
    private final JLabel rightMiddleLabel;
    private final JLabel rightBottomLabel;
    private final BufferedImage noughtIcon = new Texture("/sprites/nought_192").getImage();
    private final BufferedImage crossIcon = new Texture("/sprites/cross_192").getImage();

    
    /**Links*/ 
    
    
    
    /**Constructor*/ 
    
    
    /**
     * Display Constructor
     * 
     * @param _x
     * @param _y
     * @param _w
     * @param _h
     */ 
    public Display(int _x, int _y, int _w, int _h) {
        this.x = _x;
        this.y = _y;
        this.displayWidth = _w;
        this.displayHeight = _h;
        
        //Display Panel
        this.panel = new JPanel(new BorderLayout());
        panel.setBounds(new Rectangle(this.x, this.y, this.displayWidth, this.displayHeight));
        panel.setPreferredSize(new Dimension(this.displayWidth, this.displayHeight));
        panel.setVisible(true);
        
        //Left Panel
        this.leftPanel = new JPanel();
        leftPanel.setBounds(new Rectangle(this.x, this.y, this.displayWidth/2, this.displayHeight));
        leftPanel.setPreferredSize(new Dimension(this.displayWidth/2, this.displayHeight));
        leftPanel.setBackground(Color.decode("#8D8D8D"));
        leftPanel.setBorder(new LineBorder(Color.BLACK, 3, false));
        leftPanel.setVisible(true);
        
        this.leftTopLabel = new JLabel("Player 1 (LMB)", SwingUtilities.CENTER);
        leftTopLabel.setBounds(new Rectangle(0, 0, this.displayWidth/2, this.displayHeight/6));
        leftTopLabel.setPreferredSize(new Dimension(this.displayWidth/2, this.displayHeight/6));
        leftTopLabel.setFont(displayFont);
        leftTopLabel.setBackground(Color.decode("#8D8D8F"));
        leftTopLabel.setVisible(true);
        
        this.leftMiddleLabel = new JLabel(new ImageIcon(crossIcon.getScaledInstance(40, 40, Image.SCALE_SMOOTH)), JLabel.CENTER);
        leftMiddleLabel.setBounds(new Rectangle(0, 0, this.displayWidth/2, this.displayHeight/2-10));
        leftMiddleLabel.setPreferredSize(new Dimension(this.displayWidth/2, this.displayHeight/2-10));
        leftMiddleLabel.setFont(displayFont);
        leftMiddleLabel.setBackground(Color.decode("#8D8D8F"));
        leftMiddleLabel.setVisible(true);
        
        this.leftBottomLabel = new JLabel("Player 1's Go : Play Timer: 60", SwingUtilities.CENTER);
        leftBottomLabel.setBounds(new Rectangle(0, 0, this.displayWidth/2, this.displayHeight/6));
        leftBottomLabel.setPreferredSize(new Dimension(this.displayWidth/2, this.displayHeight/6));
        leftBottomLabel.setFont(displayFont);
        leftBottomLabel.setBackground(Color.decode("#8D8D8F"));
        leftBottomLabel.setVisible(true);
        
        leftPanel.add(leftTopLabel, BorderLayout.NORTH);
        leftPanel.add(leftMiddleLabel, BorderLayout.CENTER);
        leftPanel.add(leftBottomLabel, BorderLayout.SOUTH);
        
        
        //Right Panel
        this.rightPanel = new JPanel();
        rightPanel.setBounds(new Rectangle(this.x, this.y, this.displayWidth/2, this.displayHeight));
        rightPanel.setPreferredSize(new Dimension(this.displayWidth/2, this.displayHeight));
        rightPanel.setBackground(Color.decode("#8D8D8D"));
        rightPanel.setBorder(new LineBorder(Color.BLACK, 3, false));
        rightPanel.setVisible(true);
        
        this.rightTopLabel = new JLabel("Player 2  (RMB)", SwingUtilities.CENTER);
        rightTopLabel.setBounds(new Rectangle(0, 0, this.displayWidth/2, this.displayHeight/6));
        rightTopLabel.setPreferredSize(new Dimension(this.displayWidth/2, this.displayHeight/6));
        rightTopLabel.setFont(displayFont);
        rightTopLabel.setBackground(Color.decode("#8D8D8F"));
        rightTopLabel.setVisible(true);
        
        this.rightMiddleLabel = new JLabel(new ImageIcon(noughtIcon.getScaledInstance(40, 40, Image.SCALE_SMOOTH)), JLabel.CENTER);
        rightMiddleLabel.setBounds(new Rectangle(0, 0, this.displayWidth/2, this.displayHeight/2-10));
        rightMiddleLabel.setPreferredSize(new Dimension(this.displayWidth/2, this.displayHeight/2-10));
        rightMiddleLabel.setFont(displayFont);
        rightMiddleLabel.setBackground(Color.decode("#8D8D8F"));
        rightMiddleLabel.setVisible(true);
        
        this.rightBottomLabel = new JLabel("Player 2's Go : Play Timer: 60", SwingUtilities.CENTER);
        rightBottomLabel.setBounds(new Rectangle(0, 0, this.displayWidth/2, this.displayHeight/6));
        rightBottomLabel.setPreferredSize(new Dimension(this.displayWidth/2, this.displayHeight/6));
        rightBottomLabel.setFont(displayFont);
        rightBottomLabel.setBackground(Color.decode("#8D8D8F"));
        rightBottomLabel.setVisible(true);
        
        rightPanel.add(rightTopLabel, BorderLayout.NORTH);
        rightPanel.add(rightMiddleLabel, BorderLayout.CENTER);
        rightPanel.add(rightBottomLabel, BorderLayout.SOUTH);
        
        panel.add(leftPanel, BorderLayout.WEST);
        panel.add(rightPanel, BorderLayout.EAST);
    }
    
}
