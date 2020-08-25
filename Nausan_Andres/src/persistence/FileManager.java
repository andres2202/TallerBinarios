package persistence;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import Utilities.Utilities;
import model.User;

public class FileManager {

	private String pathIn;
	private String pathOut;

	public FileManager(String pathIn, String pathOut) {
		this.pathIn = pathIn;
		this.pathOut = pathOut;
	}
	
	public ArrayList<User> readFile() throws IOException{
		ArrayList<User> list = new ArrayList<>();
		DataInputStream dataIn = null;
		FileInputStream fileIn = null;
		try {
			fileIn = new FileInputStream(pathIn);
			dataIn = new DataInputStream(fileIn);
			while (dataIn.available() > 0) {	
				User user = Utilities.createUser(dataIn);
				list.add(user);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (EOFException eof) {
			System.out.println(eof.getMessage());
		}finally {
			try {
				if(fileIn != null) {
					fileIn.close();
				}
				if(dataIn != null) {
					dataIn.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		return list;
	}
	
	public void writeFile(ArrayList<User> listObject) {
		FileOutputStream fileOutputStream = null;
		DataOutputStream dataOut = null;
		try {
			fileOutputStream = new FileOutputStream(pathOut,false);
			dataOut = new DataOutputStream(fileOutputStream);
			Utilities.writeFile(listObject, dataOut);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
			if(fileOutputStream != null) {
				fileOutputStream.close();				
			}
				if(dataOut != null) {
					dataOut.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
