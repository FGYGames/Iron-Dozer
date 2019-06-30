package dev.skyjam.IronDozer.Renderengine;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Text extends JPanel {

	private static final long serialVersionUID = 1L;

	void Panel(){
		setBackground(Color.red);
	}

	public void draw(Graphics g) {
	
		super.paint(g);
		g.setColor(Color.WHITE);
		
		g.setFont(new Font(null, Font.BOLD,30));
		
		g.drawString("Oh yeah", 500, 500);
		
	}
}
