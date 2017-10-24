package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;
import java.util.ArrayList;

public class DrawSquare extends JPanel {
	

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		g.setColor(Color.decode("#852A2A"));
		g.fillRect(0, 0, 100, 100);
	}
	
	public DrawSquare() {
		super();
		
	}
	
}
