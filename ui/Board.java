package main;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Board extends JFrame {
	
	private static final int ROWS = 8;
	private static final int COLS = 8;
	private static final int AREA = 64;
	private JPanel panel; 
	private JPanel [] squares;
	
	
	public static void main(String [] args) {
	   new Board();
	}
	
	public Board() {
		super("Chess");
		setSize(800, 800);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
			   
		panel = new JPanel();
		squares = new JPanel[64];
		panel.setLayout(new GridLayout(ROWS, COLS));
		
		for (int i = 0; i < ROWS; i++) {
			makeBoardRow(i % 2);
		}	   	   
		add(panel);

		setVisible(true);
    }
	
	private void makeBoardRow(int startingColor) {
		for (int i = 0; i < COLS; i++) {
			if ( (i + startingColor) % 2 == 0) {
				squares[i] = new DrawWhiteSquare();
			}
			else {
				squares[i] = new DrawSquare();
			}
			panel.add(squares[i]);
		}
	}
}


/*package main;

import java.awt.GridLayout;
import java.awt.Panel;
import java.util.ArrayList;

import javax.swing.*;


public class Board {

	   private static final int ROWS = 8;
	   private static final int COLS = 8;
	   private JFrame mainFrame;
	   private JPanel [][] squares;
	   private Panel controlPanel;
	
	   public Board(){
		  squares = new JPanel[ROWS][COLS];
	      prepareGUI();
	   }
	   
	   public static void main(String[] args){
	      Board  awtControlDemo = new Board();
	      awtControlDemo.showEventDemo();
	   }
	
	   private void prepareGUI(){
	      mainFrame = new JFrame("Java AWT Examples");
	      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      mainFrame.setSize(800,800);
	      mainFrame.setResizable(false);
	      
	      for (int i = 0;  i < ROWS; i++) {
	    	  for (int j = 0; j < COLS; j += 2) {
	    		  squares[i][j] = new DrawSquare();
	    		  squares[i][j+1] = new DrawWhiteSquare();
	    		  mainFrame.add(squares[i][j]);
	    		  mainFrame.add(squares[i][j+1]);
	    	  }
	      }

	      controlPanel = new Panel();
	      controlPanel.setLayout(new GridLayout(ROWS, COLS));
	
	      mainFrame.add(controlPanel);
	      mainFrame.setVisible(true);  
	   }
	
	   private void showEventDemo(){
	
	
	      mainFrame.setVisible(true);  
	   }
	
}
*/