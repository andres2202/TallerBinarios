package Utilities;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import model.Tenement;
import model.TypeOfUse;
import model.User;

public class Utilities {

	public static User createUser( DataInputStream dataIn) throws IOException {
		User user = null;
		
		int id = dataIn.readInt();
		byte stratum = dataIn.readByte();
		byte numberOfInhabitants = dataIn.readByte();
		TypeOfUse typeOfUse = TypeOfUse.getType(dataIn.readUTF());
		int previousReading = dataIn.readInt();
		int currentReading = dataIn.readInt();
		Tenement tenement = new Tenement(stratum, numberOfInhabitants, typeOfUse, previousReading, currentReading);
		user = new User( id, tenement);
		return user;
	}
	
	public static void writeFile(ArrayList<User> list, DataOutputStream dataOut) {
		for (User user : list) {
			try {
				dataOut.writeInt(user.getId());
				dataOut.writeByte(user.getTenement().getStratum());
				dataOut.writeByte(user.getTenement().getNumberOfInhabitants());
				dataOut.writeUTF(user.getTenement().getTypeOfUse().getTraduction());
				dataOut.writeInt(user.getTenement().getPreviousReading());
				dataOut.writeInt(user.getTenement().getCurrentReading());
				dataOut.writeInt(user.calculateConsumption());
				dataOut.writeDouble(user.calculateGrossValue());
				dataOut.writeDouble(user.calculateSubsidy());
				dataOut.writeDouble(user.calculateTax());
				dataOut.writeDouble(user.calculateSurcharge());
				dataOut.writeDouble(user.calculateTotal());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String toFormatPrice(double value) {
		DecimalFormat format = new DecimalFormat("$ ###########,###.##");
		return format.format(value);
	}
}
