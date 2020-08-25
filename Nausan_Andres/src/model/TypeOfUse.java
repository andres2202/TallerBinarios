package model;

public enum TypeOfUse {
	DOMESTIC("Domestico"),
	COMMERCIAL("Comercial");
	
	private final String traduction;
	
	private TypeOfUse(String value) {
		this.traduction = value;
	}

	public String getTraduction() {
		return traduction;
	}
	
	public static TypeOfUse getType(String traduction) {
		for (TypeOfUse type : TypeOfUse.values()) {
			if(traduction.equalsIgnoreCase(type.getTraduction())) {
				return type;
			}
		}
		return null;
	}
}
