package view;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFMainWindow extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPMainPanel jPMainPanel;
	private JDFileChooser jDFileChooser;
	
	public JFMainWindow(ActionListener actionListener) {
		initFrame();
		initComponents(actionListener);
		this.setVisible(true);
	}
	
	private void initFrame() {
		this.setExtendedState(JFMainWindow.MAXIMIZED_BOTH);
		this.setIconImage(new ImageIcon(getClass().getResource(ConstantView.ICON_APP)).getImage());
		this.setDefaultCloseOperation(JFMainWindow.EXIT_ON_CLOSE);
		this.setTitle(ConstantView.APP_TITLE);
		this.setMinimumSize(new Dimension(600, 800));
		this.setFont(ConstantView.FONT_FRAME);
	}
	
	private void initComponents(ActionListener actionListener) {
		this.jPMainPanel = new JPMainPanel(actionListener);
		this.add(jPMainPanel);
		
		this.jDFileChooser = new JDFileChooser(actionListener);
		this.jDFileChooser.setLocationRelativeTo(this);
	}
	
	public void setDialog(boolean value) {
		jDFileChooser.setVisible(value);
	}
	
	public String getnameFile() {
		return jDFileChooser.getNameFile();
	}
	
	public void addElement(Object[] vector) {
		jPMainPanel.addElementToTable(vector);
	}
}
