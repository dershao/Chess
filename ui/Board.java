package main;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Board extends JFrame {
	
	public static final int ROWS = 8;
	public static final int COLS = 8;
	private JPanel panel; 
	private JPanel [][] squares;
	
	public Board() {
		super("Chess");
		setSize(800, 800);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
			   
		panel = new JPanel();
		squares = new JPanel[8][8];
		panel.setLayout(new GridLayout(ROWS, COLS));
		
		for (int i = 0; i < ROWS; i++) {
			makeBoardRow(i, i % 2);
		}	   	 
		
		add(panel);

		setVisible(true);
    }
	
	private void makeBoardRow(int currentRow, int startingColor) {
		
		//ascii value of letter 'a' - used for generating board column identifier
		int columnLabel = 97;
		
		for (int j = 0; j < COLS; j++) {
			squares[currentRow][j] = new DrawSquare( (j + startingColor) % 2, currentRow + 1 , (char) (columnLabel + j));
			panel.add(squares[currentRow][j]);
		}
	}
}

