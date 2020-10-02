package com.game;

import java.awt.EventQueue;
import javax.swing.JFrame;

//This code is based on a tutorial.

public class Snake extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8088634531325732453L;

	public Snake() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
               
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}
