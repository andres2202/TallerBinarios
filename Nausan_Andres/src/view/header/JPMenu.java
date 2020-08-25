package view.header;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import view.ConstantView;

public class JPMenu extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JMenuBar menuBar;
	private JMenu percentages;
	private JMenuItem percentageUsers;
	private JMenu average;
	private JMenuItem averageUsers;

	public JPMenu(ActionListener actionListener) {
		showMenu(actionListener);
	}
	
	private void showMenu(ActionListener actionListener) {
		menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		
		percentages = new JMenuModel("Porcentages", ConstantView.FONT_FRAME, Color.BLUE, Color.white);
		percentageUsers = new JMenuItem("porcentajes de tipo de uso");
		percentages.add(percentageUsers);
		menuBar.add(percentages);
		
		average = new JMenuModel("Promedios",ConstantView.FONT_FRAME,Color.BLUE,Color.WHITE);
		averageUsers = new JMenuItem("Promedio de facturación por usuario");
		average.add(averageUsers);
		menuBar.add(average);
		
		this.add(menuBar);
	}
}


