package model;

import java.util.ArrayList;

public class ManageUsers {
    private ArrayList<User> listUsers;

    public ManageUsers() {
        this.listUsers = new ArrayList<>();
    }

    public ArrayList<User> getListUsers() {
        return listUsers;
    }


    /**
     * añade un nuevo usuario
     *
     * @param user
     */
    public void addUser(User user) {
        listUsers.add(user);
    }

    public Object[] toObjectVector(int index) {
        User user = listUsers.get(index);
        Object[] vector = {
                user.getId(), user.getTenement().getStratum(),
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
     * @return list
     */
    public ArrayList<Object[]> toListObject() {
        ArrayList<Object[]> list = new ArrayList<>();
        for (int i = 0; i < listUsers.size(); i++) {
            Object[] vector = toObjectVector(i);
            list.add(vector);
        }
        return list;
    }

    /**
     * @param typeOfUse
     * @return
     */
    public double getAverageTypeUse(TypeOfUse typeOfUse) {
        int count = 0;
        for (User user : listUsers) {
            if (user.getTenement().getTypeOfUse().equals(typeOfUse)) {
                count++;
            }
        }
        return ((double) count * 100 / listUsers.size());
    }


    public Object[] listPercentageTypeUse() {
        return new Object[]{
                getAverageTypeUse(TypeOfUse.DOMESTIC),
                getAverageTypeUse(TypeOfUse.COMMERCIAL)
        };
    }

    private double getGenerealAv() {
        double value = 0;
        for (User user : listUsers) {
            value += user.calculateTotal();
        }
        return value;
    }

    public double getAverageTotal(int stratum) {
        double count = 0;
        double value = getGenerealAv();
        int sizeList = listUsers.size();
        for (int i = 0; i < sizeList; i++) {
            if (listUsers.get(i).getTenement().getStratum() == stratum) {
                count += listUsers.get(i).calculateTotal();
            }
        }
        return (count / value) * 100;
    }

    public Object[] listPercentageAverage() {
        return new Object[]{
                getAverageTotal(Constants.STRATUM_ONE),
                getAverageTotal(Constants.STRATUM_TWO),
                getAverageTotal(Constants.STRATUM_THREE),
                getAverageTotal(Constants.STRATUM_FOUR),
                getAverageTotal(Constants.STRATUM_FIVE)
        };
    }
}
