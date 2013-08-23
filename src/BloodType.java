public class BloodType {
	
	
	private String bloodType;
	private char rhFactor;
	
	//construction
	public BloodType(String newBloodType, char newRhFactor) {
		bloodType = newBloodType;
		rhFactor = newRhFactor;
		
	}
	
	public BloodType(String newBloodType) {
		this(newBloodType, '+');
	}
	public BloodType(char newRhFactor) {
		this("0",newRhFactor);
	}
	
	public BloodType() {
		this("0", '+');
		
	}

//accessor method
	public String getBloodType() {
	return bloodType;
}
public char getRhFactor() {
	return rhFactor;
	}


//mutator
public void setBlood(String blood) {
	bloodType = blood;
}

public void setRhFactor(char rh){
	rhFactor = rh;
	}


	}
