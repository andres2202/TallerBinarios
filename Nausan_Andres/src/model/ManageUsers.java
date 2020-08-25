package model;

import java.util.ArrayList;
//Prueba 2
public class ManageUsers {
	private ArrayList<User> listUsers;

	public ManageUsers() {
		this.listUsers = new ArrayList<>();
	}
	
	public void addUser(User user) {
		listUsers.add(user);
	}
	
	//Hola Crack scs ff
	public Object[] toObjectVector(int index) {
		User user = listUsers.get(index);
		Object[] vector= {
				user.getName(),
				user.getId(),user.getTenement().getStratum(),
				user.getTenement().getNumberOfInhabitants(),
				user.getTenement().getTypeOfUse().getTraduction(),
				user.getTenement().getPreviousReading(),
				user.getTenement().getCurrentReading(),
				user.calculateConsumption(),
				user.calculateGrossValue(),
				user.calculateSubsidy(),
				user.calculateTax(),
				user.calculateSurcharge(),
				user.calculateTotal()
		};
		return vector;
	}
	/**
	 * 
	 * @return list
	 */
	public ArrayList<Object[]> toListObject(){
		ArrayList<Object[]> list = new ArrayList<>();
		for (int i = 0; i < listUsers.size(); i++) {
			Object[] vector = toObjectVector(i);
			list.add(vector);
		}
		return list;
	}
}
