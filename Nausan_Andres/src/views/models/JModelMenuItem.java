package views.models;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;


public class JModelMenuItem extends JMenuItem{

	public JModelMenuItem(String text) {
		super(text);
	}
	
	public JModelMenuItem(String text,Font font,Color background) {
		super(text);
		this.setFont(font);
		this.setBackground(background);

	}
	
	public JModelMenuItem(String text,String imagePath,Font font,int width,int height) {
		super(text);
		ImageIcon imagen = new ImageIcon(getClass().getResource(imagePath));
		Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
		this.setIcon(icon);
		this.setFont(font);
	}
	
	public JModelMenuItem(String text,String imagePath,Font font) {
		super(text);
		this.setIcon( new ImageIcon(getClass().getResource(imagePath)));
		this.setFont(font);
	}
	
	public JModelMenuItem(String text,String imagePath,int width,int height) {
		this.setText(text);
		ImageIcon imagen = new ImageIcon(getClass().getResource(imagePath));
		Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
		this.setIcon(icon);
	}
	
}
