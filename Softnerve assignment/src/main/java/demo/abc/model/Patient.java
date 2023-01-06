package demo.abc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Patient")

public class Patient {
	
	 

	@Id
	private int patientId;
	
	
	private String patientName;

	private String patientContactNo;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String patientName, int patientId, String patientContactNo) {
		super();
		this.patientName = patientName;
		this.patientId = patientId;
		this.patientContactNo = patientContactNo;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientContactNo() {
		return patientContactNo;
	}

	public void setPatientContactNo(String patientContactNo) {
		this.patientContactNo = patientContactNo;
	}

	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientId=" + patientId + ", patientContactNo="
				+ patientContactNo + "]";
	}


}
