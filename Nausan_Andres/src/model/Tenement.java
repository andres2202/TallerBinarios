package model;

public class Tenement {
	private byte stratum;
	private byte numberOfInhabitants;
	private TypeOfUse typeOfUse;
	private int previousReading;
	private int currentReading;
	
	public Tenement(byte stratum, byte numberOfInhabitants, TypeOfUse typeOfUse, int previousReading,
			int currentReading) {
		this.stratum = stratum;
		this.numberOfInhabitants = numberOfInhabitants;
		this.typeOfUse = typeOfUse;
		this.previousReading = previousReading;
		this.currentReading = currentReading;
	}

	public byte getStratum() {
		return stratum;
	}

	public void setStratum(byte stratum) {
		this.stratum = stratum;
	}

	public byte getNumberOfInhabitants() {
		return numberOfInhabitants;
	}

	public void setNumberOfInhabitants(byte numberOfInhabitants) {
		this.numberOfInhabitants = numberOfInhabitants;
	}

	public TypeOfUse getTypeOfUse() {
		return typeOfUse;
	}

	public void setTypeOfUse(TypeOfUse typeOfUse) {
		this.typeOfUse = typeOfUse;
	}

	public int getPreviousReading() {
		return previousReading;
	}

	public void setPreviousReading(int previousReading) {
		this.previousReading = previousReading;
	}

	public int getCurrentReading() {
		return currentReading;
	}

	public void setCurrentReading(int currentReading) {
		this.currentReading = currentReading;
	}
}
