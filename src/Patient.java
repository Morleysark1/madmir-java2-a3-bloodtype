
public class Patient {
	private int patientIdNumber;
	private int patientAge;
	private BloodType patientBloodData;
	private BloodType patientBloodType;
	
	//overloaded
	public Patient(int id, int age, BloodType bloodData){
		this.patientIdNumber = id;
		this.patientAge = age;
		this.patientBloodData = bloodData;
	}
	//default constructor
	public Patient(){
		this(0,0,new BloodType());
	}	
	//accessor method
		public int getPatientIdNumber() {
			return patientIdNumber;	
		}
		
		public int getPatientAge() {
			return patientAge;
		}
		
		public String getBloodType() {
			return patientBloodData.getBloodType() + 
					patientBloodData.getRhFactor();
		}
		
		//Mutator method
		public void setPatientIdNumber(int newId) {
			patientIdNumber = newId;
		}
		public void setPatientIdAge(int newAge) {
			patientAge = newAge;
		}
		
		public void setBloodType(BloodType newBloodType) {
			patientBloodType = newBloodType;
		
		
	}
}
