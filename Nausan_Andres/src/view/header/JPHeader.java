package view.header;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Commands;
import view.ConstantView;
import views.models.JModelButton;

public class JPHeader extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JModelButton jBtnSearchFile;
	private JPMenu jPMenu;
	
	public JPHeader(ActionListener actionListener) {
		this.setBackground(ConstantView.YELLOW_LIGHT);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		initComponents(actionListener);
	}
	
	private void initComponents(ActionListener actionListener) {
		this.jPMenu = new JPMenu(actionListener);
		this.add(jPMenu);

		this.jBtnSearchFile = new JModelButton(ConstantView.TXT_FILE,ConstantView.IMG_FILE,ConstantView.FONT_ARIAL_ROUNDER_15,25,25,ConstantView.COLOR_DARK_BLUE,ConstantView.WHITE);
		jBtnSearchFile.setActionCommand(Commands.C_SEARCH_FILE.toString());
		jBtnSearchFile.addActionListener(actionListener);
		this.add(jBtnSearchFile);
	}

}
