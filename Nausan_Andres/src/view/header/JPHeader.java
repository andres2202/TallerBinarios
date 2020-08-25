package view.header;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Commands;

public class JPHeader extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton jBtnSearchFile;
	private JPMenu jPMenu;
	
	public JPHeader(ActionListener actionListener) {
		this.setBackground(Color.white);
		initComponents(actionListener);
	}
	
	private void initComponents(ActionListener actionListener) {
		this.jPMenu = new JPMenu(actionListener);
		this.add(jPMenu);

		this.jBtnSearchFile = new JButton("archivo");
		jBtnSearchFile.setActionCommand(Commands.C_SEARCH_FILE.toString());
		jBtnSearchFile.addActionListener(actionListener);
		this.add(jBtnSearchFile);
	}

}
