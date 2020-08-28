package model;

import java.util.ArrayList;

public class ManageUsers {
	private ArrayList<User> listUsers;

	public ManageUsers() {
		this.listUsers = new ArrayList<>();
	}
	
	/**
	 * añade un nuevo usuario
	 * @param user
	 */
	public void addUser(User user) {
		listUsers.add(user);
	}

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
	
	
	
	
	public double getAverageTotal(int stratum) {
		double count = 0;
		int countUsers = 0;
		int sizeList = listUsers.size();
		for (int i = 0; i < sizeList; i++) {
			if(listUsers.get(i).getTenement().getStratum()==stratum){
					count += listUsers.get(i).calculateTotal();
					countUsers++;
			}
		}
		return (count/countUsers);
	}
	
	public Object[] listPercentageAverage() {
		return new Object[] {
				getAverageTotal(Constants.STRATUM_ONE),
				getAverageTotal(Constants.STRATUM_TWO),
				getAverageTotal(Constants.STRATUM_THREE),
				getAverageTotal(Constants.STRATUM_FOUR),
				getAverageTotal(Constants.STRATUM_FIVE)
		};
	}
}
