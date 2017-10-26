package main;

import javax.swing.JFrame;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start {
	
	//start up window
	private JFrame frame;
	private Button startGameBtn;
	
	public static void main(String [] args) {
		new Start();
	}
	
	public Start() {
		prepareGUI();
	}
	
	private void prepareGUI() {
				
		initButtons();
		initJFrame();
	}
	
	private void initJFrame() {
		
		frame = new JFrame("Chess!");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridLayout(5, 3));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(startGameBtn);
		frame.setVisible(true);
	}
	
	private void initButtons() {
		
		startGameBtn = new Button("Start Game");
		startGameBtn.setPreferredSize(new Dimension(50, 50));
		startGameBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				new Board();
			}
		});
	}
}
