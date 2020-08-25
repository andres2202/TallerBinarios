package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import view.body.JPBody;
import view.header.JPHeader;

public class JPMainPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPHeader jPHeader;
	private JPBody jPBody;
	
	public static final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
		
	public JPMainPanel(ActionListener actionListener) {
		this.setLayout(new BorderLayout());
		initComponents(actionListener);
	}
	
	private void initComponents(ActionListener actionListener) {
		this.jPHeader = new JPHeader(actionListener);
		this.add(jPHeader,BorderLayout.NORTH);
		
		this.jPBody = new JPBody(actionListener);
		this.add(jPBody, BorderLayout.CENTER);
	}
	
	public void addElementToTable(Object[] vector){
		jPBody.addElementToTable(vector);
	}
}
