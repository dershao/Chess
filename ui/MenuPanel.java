package main;

import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MenuPanel extends JPanel {
	
	BufferedImage backgroundImage;

	public MenuPanel() {
		
		setLayout(new GridBagLayout());
		setSize(400, 400);
		
		//sample image quickly made in paint
		try {
			backgroundImage = ImageIO.read(getClass().getResource("/images/menu.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgroundImage , 0, 0, this);
	}
}
