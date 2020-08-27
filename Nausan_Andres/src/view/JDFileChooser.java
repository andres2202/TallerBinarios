package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JDFileChooser extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JFileChooser jFileChooser;

	public JDFileChooser(ActionListener actionListener) {
		this.setLayout(new BorderLayout());
		this.setSize(new Dimension(600,600));
		initComponents(actionListener);
		this.setVisible(false);
	}
	
	private void initComponents(ActionListener actionListener) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		this.jFileChooser = new JFileChooser(new File("resources"));
		jFileChooser.addActionListener(actionListener);
		FileNameExtensionFilter filterFile = new FileNameExtensionFilter("comsuption","comsuption");
		jFileChooser.setFileFilter(filterFile);
		this.add(jFileChooser);
	}
	
	public String getNameFile() {
		return jFileChooser.getSelectedFile().getName();
	}
}
