package view.body;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

import controller.Commands;
import view.ConstantView;
import views.models.JModelButton;
import views.models.JModelLabel;

public class JPEast extends JToolBar{
	
	JModelButton average,percentage;
	JModelLabel space;

	public JPEast(ActionListener actionListener) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setFloatable(false);
		this.setBackground(ConstantView.WHITE);
		this.setBorder(new EmptyBorder(150, 2, 50,2));
		initComponents(actionListener);
	}

	private void initComponents(ActionListener actionListener) {
		percentage = new JModelButton(ConstantView.TXT_PERCENTAGE,ConstantView.IMG_STADISTICS1,25,25);
		percentage.setActionCommand(Commands.C_SHOW_PERCENTAGE.toString());
		percentage.addActionListener(actionListener);
		this.add(percentage);
		
		space = new JModelLabel("<html>hola<p>hola<p>hola<p>hola<p> <html>",ConstantView.WHITE,ConstantView.FONT_ARIAL_ROUNDER_17);
		this.add(space);
		
		average = new JModelButton(" "+ConstantView.TXT_AVERAGE+" ",ConstantView.IMG_STADISTICS2,25,25);
		average.setActionCommand(Commands.C_SHOW_AVERAGE.toString());
		average.addActionListener(actionListener);
		this.add(average);
		
	}

}
