package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class DrawSquare extends JPanel {
	
	private int row;
	private char col;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	public DrawSquare(int color, int row, char col) {
		
		if (color == 1) {
			//dark brown color
			setBackground(Color.decode("#852A2A"));
		}
		else {
			//beige color
			setBackground(Color.decode("#F5F5DC"));
		}
		
		this.row = row;
		this.col = col;
	}
	
	public String getCoordinate() {
		
		return Character.toString(col) + row;
	}
}
