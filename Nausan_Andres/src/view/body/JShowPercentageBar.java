package view.body;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.ConstantView;
import views.models.JModelButton;
import views.models.JModelLabel;
import views.models.JModelProgressBar;

public class JShowPercentageBar extends JDialog{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JModelLabel label;
	JPanel jPanel;
	JModelButton delete,cancel;

	public JShowPercentageBar(int width,int height) {
		setModal(true);
		setIconImage( new ImageIcon(getClass().getResource(ConstantView.IMG_MONEY)).getImage());
		getContentPane().setBackground(ConstantView.WHITE);
		this.setSize(new Dimension(width,height));
		initComponents();
	}
	
	private void initComponents() {
		jPanel = new JPanel();
		jPanel.setBorder(new EmptyBorder(50, 20, 50, 20));
		BoxLayout box = new BoxLayout(jPanel, BoxLayout.Y_AXIS);
		jPanel.setLayout(box);
		jPanel.setBackground(ConstantView.WHITE);
		
	}
	
	public void resetAverage(Object[] objects, String[] headers,String title) {
		this.setTitle(title);
		int max =200, min = 20;
		for (int i = 0; i < objects.length; i++) {
			double doubleAux = (double) objects[i];
			label = new JModelLabel(headers[i],ConstantView.BLACK,ConstantView.FONT_ARIAL_ROUNDER_15);
			JModelProgressBar jBar = new JModelProgressBar((int)doubleAux, 300, 60,ConstantView.COLOR_DARK_BLUE,min,max);
			jPanel.add(label);
			jPanel.add(jBar);
		}
		this.add(jPanel);
	}
	
	public void resetDatas(Object[] objects, String[] headers,String title) {
		this.setTitle(title);
		for (int i = 0; i < objects.length; i++) {
			double doubleAux = (double) objects[i];
			label = new JModelLabel(headers[i],ConstantView.BLACK,ConstantView.FONT_ARIAL_ROUNDER_15);
			JModelProgressBar jBar = new JModelProgressBar((int)doubleAux, 300, 40,ConstantView.COLOR_DARK_BLUE);
			jPanel.add(label);
			jPanel.add(jBar);
		}
		this.add(jPanel);
	}
}
