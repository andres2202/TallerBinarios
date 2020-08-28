package view.header;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import controller.Commands;
import view.ConstantView;
import views.models.JModelMenu;
import views.models.JModelMenuItem;

public class JPMenu extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JMenuBar menuBar;
	private JModelMenu average,percentages;
	private JModelMenuItem averageUsers,percentageUsers;

	public JPMenu(ActionListener actionListener) {
		this.setBackground(ConstantView.YELLOW_LIGHT);
		this.setBorder(BorderFactory.createEmptyBorder(2, 15, 2,10));
		showMenu(actionListener);
	}
	
	private void showMenu(ActionListener actionListener) {
		menuBar = new JMenuBar();
		menuBar.setBackground(ConstantView.YELLOW_LIGHT);
		
		percentages = new JModelMenu(ConstantView.TXT_PERCENTAGE,ConstantView.YELLOW_LIGHT, ConstantView.BLACK,ConstantView.FONT_ARIAL_ROUNDER_15);
		percentageUsers = new JModelMenuItem(ConstantView.TXT_PERCENTAGE_USE, ConstantView.IMG_STADISTICS1,ConstantView.FONT_NEW_ROMAN_13, 25, 25);
		percentageUsers.setActionCommand(Commands.C_SHOW_PERCENTAGE.toString());
		percentageUsers.addActionListener(actionListener);
		
		average = new JModelMenu(ConstantView.TXT_AVERAGE,ConstantView.YELLOW_LIGHT, ConstantView.BLACK,ConstantView.FONT_ARIAL_ROUNDER_15);
		averageUsers = new JModelMenuItem(ConstantView.TXT_AVERAGE_USERS, ConstantView.IMG_STADISTICS2,ConstantView.FONT_NEW_ROMAN_13, 25, 25);
		averageUsers.setActionCommand(Commands.C_SHOW_AVERAGE.toString());
		averageUsers.addActionListener(actionListener);
		
		percentages.add(percentageUsers);
		average.add(averageUsers);
		menuBar.add(percentages);
		menuBar.add(average);
		this.add(menuBar);
	}
}


