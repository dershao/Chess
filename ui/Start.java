package main;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Start extends JFrame {

	private JPanel menuPanel;
	private Button startSingleGameBtn;
	private Button startTwoGameBtn;
	private Button quitGameBtn;
	
	public static void main(String [] args) {
		new Start();
	}
	
	public Start() {
		super("Chess!");
		
		initButtons();
		prepareGui();

		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(menuPanel);
		setVisible(true);
		
	}
	
	private void prepareGui() {
		
		menuPanel = new MenuPanel();
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		menuPanel.add(startSingleGameBtn, gbc);
		
		gbc.gridy = 1;
		menuPanel.add(startTwoGameBtn);
		
		gbc.gridy = 2;
		gbc.insets = new Insets(0, 0, 0, 0);
		menuPanel.add(quitGameBtn, gbc);	
	}
	
	private void initButtons() {
		
		startSingleGameBtn = new Button("Single Player");
		startSingleGameBtn.setPreferredSize(new Dimension(70, 50));
		startSingleGameBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				new Board();
			}
		});
		
		startTwoGameBtn = new Button("Two Player");
		startTwoGameBtn.setPreferredSize(new Dimension(70, 50));
		startTwoGameBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Board();
			}
		});
		
		quitGameBtn = new Button("Quit");
		quitGameBtn.setPreferredSize(new Dimension(70, 50));
		quitGameBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				dispose();
			}
		});
		
		//...and more buttons
	}
}
