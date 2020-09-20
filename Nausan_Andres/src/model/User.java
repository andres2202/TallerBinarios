package model;

public class User {
	private int id;
	private Tenement tenement;

	public User(int id,Tenement tenement) {
		this.id = id;
		this.tenement = tenement;
	}

	public int getId() {
		return id;
	}

	public Tenement getTenement() {
		return tenement;
	}
	/**
	 * consumo en kw de cada usuario
	 * @return diferencia de consumo actual y anterior
	 */
	public int calculateConsumption() {
		return tenement.getCurrentReading()-tenement.getPreviousReading();
	}
	/**
	 * valor bruto de facturaci�n
	 * @return valor bruto
	 */
	public double calculateGrossValue() {
		if(this.getTenement().getStratum() < 3) {
			return (Constants.LOW_TURNOVER_VALUE*calculateConsumption());
		}else {
			return (Constants.HIGH_TURNOVER_VALUE*calculateConsumption());
		}

	}
	/**
	 * si excede consumo
	 * @param totalConsumption
	 * @param maxValue
	 * @return true or false
	 */
	public boolean isExceed(int totalConsumption, int maxValue) {
		if(totalConsumption <= maxValue) {
			return false;
			
		}
		return true;
	}
	/**
	 * subsidio
	 * @return
	 */
	public double calculateSubsidy() {
		int maxValue = tenement.getNumberOfInhabitants()*Constants.MAX_VALUE_OF_CONSUMPTION;
		int totalConsumption = calculateConsumption();
		int stratum = this.getTenement().getStratum(); 
		double totalPay = calculateGrossValue();
		if(stratum < 3 && !isExceed( totalConsumption,maxValue)) {
			return (totalPay*Constants.P_SUBSIDY);
		}
		return 0;
	}
	/**
	 * impuesto
	 * @return
	 */
	public double calculateTax() {
		int totalConsumption = calculateConsumption();
		int stratum = this.getTenement().getStratum(); 
		double totalPay = totalConsumption*Constants.HIGH_TURNOVER_VALUE;
		if(stratum > 2) {
			return (totalPay*Constants.P_HYDROCARBON_TAX);
		}
		return 0;
	}
	/**
	 * recargo
	 * @return
	 */
	public double calculateSurcharge() {
		int maxValue = tenement.getNumberOfInhabitants()*Constants.MAX_VALUE_OF_CONSUMPTION;
		int totalConsumption = calculateConsumption();
		int stratum = this.getTenement().getStratum(); 
		double totalPay = calculateGrossValue();
		if(stratum > 2 && isExceed( totalConsumption,maxValue)) {
			return (totalPay*Constants.P_SURCHARGE);
		}
		return 0;		
	}
	/**
	 * Valor neto de la facturaci�n
	 * @return
	 */
	public double calculateTotal() {
		int stratum = this.getTenement().getStratum(); 
		double totalPay = calculateGrossValue();
		if(stratum < 3) {
			return(totalPay-calculateSubsidy());
		}else {
			return (totalPay+calculateTax()+calculateSurcharge());
		}
	}
}

