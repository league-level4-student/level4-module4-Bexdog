package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
ArrayList <Doctor> totalDocs = new ArrayList <Doctor>();
ArrayList <Patient> totalPats = new ArrayList <Patient>();
	public void addDoctor(Doctor input) {
		totalDocs.add(input);
		
	}

	public List<Doctor> getDoctors() {
		return totalDocs;
	}

	public void addPatient(Patient input) {
		totalPats.add(input);
		
	}

	public List<Patient> getPatients() {
		return totalPats;
	}

}
