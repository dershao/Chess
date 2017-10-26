package main;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Board extends JFrame {
	
	public static final int ROWS = 8;
	public static final int COLS = 8;
	private JPanel panel; 
	private JPanel [] squares;
	
	public Board() {
		super("Chess");
		setSize(800, 800);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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

