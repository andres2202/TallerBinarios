package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.ManageUsers;
import model.TypeOfUse;
import model.User;
import persistence.FileManager;
import view.ConstantView;
import view.JFMainWindow;

public class Presenter implements ActionListener{

	private JFMainWindow jFMainWindow;
	private ManageUsers manageUsers;
	private FileManager fileManager;
	
	public Presenter() {
		this.jFMainWindow = new JFMainWindow(this);
		this.manageUsers = new ManageUsers();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Commands.valueOf(e.getActionCommand())) {
		case C_SEARCH_FILE: this.setVisibility(true); break;
		case CancelSelection: this.setVisibility(false); break;
		case ApproveSelection: readFile(); break;
		case C_SHOW_PERCENTAGE: this.showBarPercentage(); break;
		case C_SHOW_AVERAGE: this.showBarAverage(); break;
		default:
			break;
		}
	}
	
	private void showBarAverage() {
		jFMainWindow.showBarPercentage(manageUsers.listPercentageAverage(),ConstantView.TYPE_STRATUM,"Promedio de Estratos.");
	}

	private void showBarPercentage() {
		System.out.println(manageUsers.getAverageTypeUse(TypeOfUse.COMMERCIAL));
		jFMainWindow.showBarPercentage(manageUsers.listPercentageTypeUse(),ConstantView.USER_ENERGY,"Porcentaje por el punto de energia.");
	}

	private void readFile() {
		String pathIn = ConstantView.FOLDER_PATH_IN + jFMainWindow.getnameFile();
		fileManager = new FileManager(pathIn, ConstantView.FOLDER_PATH_OUT);
		ArrayList<User> listData;
		try {
			listData = fileManager.readFile();
			addUsers(listData);
			fileManager.writeFile(listData);
		} catch (IOException e) {
			e.printStackTrace();
		}
		setVisibility(false);
		updateTable();
	}
	
	private void updateTable() {
		ArrayList<Object[]> data = manageUsers.toListObject();
		for (int i = 0; i < data.size(); i++) {
			Object[] vector = data.get(i);
			jFMainWindow.addElement(vector);
		}
	}
	
	private void addUsers(ArrayList<User> datas) {
		for (User user : datas) {
			manageUsers.addUser(user);
		}
	}
	
	private void setVisibility(boolean value) {
		jFMainWindow.setDialog(value);		
	}

}
