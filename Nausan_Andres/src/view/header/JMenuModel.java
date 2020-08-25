package view.header;

import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JMenu;

public class JMenuModel extends JMenu{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JMenuModel(String text, Font font, Color foreground, Color background) {
		super(text);
		this.setFont(font);
		this.setForeground(foreground);
		this.setBackground(background);
	}
	
	public JMenuModel(Icon Iconimage, Font font, Color foreground) {
		this.setIcon(Iconimage);
		this.setFont(font);
		this.setForeground(foreground);
	}
}