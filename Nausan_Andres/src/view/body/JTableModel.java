package view.body;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import view.ConstantView;


public class JTableModel extends JTable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JTableModel(String[] nameColumns, DefaultTableModel model,Color background,Font fontHeader,Color foregorund,Font fontTable) {
		this.setModel(model);
		model.setColumnIdentifiers(nameColumns);
		this.getTableHeader().setBackground(ConstantView.COLOR_OF_HEADER_TABLE);
		this.getTableHeader().setFont(fontHeader);
		this.getTableHeader().setForeground(foregorund);
		this.setBackground(background);
		this.setFont(fontTable);
		this.setBorder(null);
		this.getTableHeader().setPreferredSize(new Dimension(0,70));
		this.getTableHeader().setReorderingAllowed(false);
		centerContent(model);
	}
	
	@Override
	public boolean isCellEditable(int row, int column) {
		return false;
	}



	public void addElementToTable(Object[] vector, DefaultTableModel model) {
		if(vector != null) {
			model.addRow(vector);
		}
	}
	
	public void deleteElementTable(DefaultTableModel model,String filingNumber) {
		int column = 0;
		for (int i = 0; i < model.getRowCount(); i++) {
			if(model.getValueAt(i, column).equals(filingNumber)) {
				model.removeRow(i);
			}
		}
	}
	
	public int getNumberRow(DefaultTableModel model,String filingNumber) {
		int column = 0;
		for (int i = 0; i < model.getRowCount(); i++) {
			if(model.getValueAt(i, column).equals(filingNumber)) {
				return i;
			}
		}
		return -1;
	}
	
	public void setRowcount(DefaultTableModel model) {
		model.setRowCount(0);
	}
	
	public void centerContent(DefaultTableModel model) {
		DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
		cellRender.setHorizontalAlignment(SwingConstants.CENTER);
		for (int i = 0; i < model.getColumnCount(); i++) {
			this.getColumnModel().getColumn(i).setCellRenderer(cellRender);  
		}
	}
}
