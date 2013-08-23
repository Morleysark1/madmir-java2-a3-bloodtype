
public class TestPatient {

	private static Object keithsBloodType;

	public static void main(String[] args) {
		BloodType ashleysBloodType = new BloodType("B", '-');
		Patient ashley = new Patient(45682,23,ashleysBloodType);
		Patient keith = new Patient();
		Patient clyde = new Patient();
		
		
		keith.setPatientIdAge(30);
		keith.setPatientIdNumber(35460);
		BloodType keithsBloodType = new BloodType("B", '+');
		keith.setBloodType(keithsBloodType);
		
	
		System.out.println("keith's ID number is " + keith.getPatientAge() + " he is " + keith.getPatientAge() + " year old. his blood type is " + 
		keith.getBloodType());
		
		
		
	}


}
