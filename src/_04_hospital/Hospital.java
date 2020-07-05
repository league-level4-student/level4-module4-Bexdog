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

	public void assignPatientsToDoctors() throws DoctorFullException {
		int doctorsfull=0;
		for(int i = 0; i<totalPats.size();i++) {
			System.out.println(doctorsfull);
			totalDocs.get(doctorsfull).assignPatient(totalPats.get(i));
			if(totalDocs.get(doctorsfull).getPatients().size()==3) {
				doctorsfull++;
				System.out.println(doctorsfull);
			}
		}

	}
}
