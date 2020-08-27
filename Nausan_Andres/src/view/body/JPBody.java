package view.body;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import Utilities.Utilities;
import view.ConstantView;
import view.JPMainPanel;


public class JPBody extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTableModel jTable;
	private DefaultTableModel model;
	
	public JPBody(ActionListener actionListener) {
		initComponents(actionListener);
	}

	private void initComponents(ActionListener actionListener) {
		model = new DefaultTableModel();
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(0,(int)(JPMainPanel.SCREEN_SIZE.getHeight()*ConstantView.NINETY_PERCENTAGE)));
		String[] headers = ConstantView.HEADERS;
		this.jTable = new JTableModel(headers, model, Color.WHITE, ConstantView.FONT_FRAME,
				Color.WHITE, ConstantView.FONT_FRAME);
		JScrollPane jSTable = new JScrollPane(jTable);
		jTable.setRowHeight( 35 );
		this.add(jSTable);
		this.setBorder(null);
	}
	
	public void addElementToTable(Object[] vector) {
		vector[8] = Utilities.toFormatPrice((double) vector[8]);
		vector[9] = Utilities.toFormatPrice((double) vector[9]);
		vector[10] = Utilities.toFormatPrice((double) vector[10]);
		vector[11] = Utilities.toFormatPrice((double) vector[11]);
		vector[12] = Utilities.toFormatPrice((double) vector[12]);
		jTable.addElementToTable(vector, model);
	}
}
