package getterSetterMethod;
//Question 6 – Hospital Patient

//Create a Patient class.
//Fields: patientId, patientName, medicalHistory.
//Requirements: Medical history should not be accessible from another class. Only the Patient class
//should update it.

public class Patient {
	private int patientId;
	private String pName;
	private String medicalHistory;

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPname() {
		return pName;
	}

	public void setPname(String pName) {
		this.pName = pName;
	}

	private String getHistory() {
		return medicalHistory;
	}

	private void setHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
}
