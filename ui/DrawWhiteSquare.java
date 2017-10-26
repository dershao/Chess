package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;
import java.util.ArrayList;

public class DrawWhiteSquare extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//set color of component as WHITE
		g.setColor(Color.decode("#FFFFFF"));
		//set size 100 x 100
		g.fillRect(0, 0, 100, 100);
	}
	
	public DrawWhiteSquare() {
		//call super constructor
		super();
	}
}
