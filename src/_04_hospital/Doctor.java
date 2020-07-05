package _04_hospital;

import java.util.ArrayList;

public class Doctor{
	ArrayList <Patient> pats = new ArrayList <Patient>();
 boolean performsSurgery() {
	 return false;
 }
 boolean makesHouseCalls() {
	  return false;
 }
 void assignPatient(Patient pat) throws DoctorFullException {
	 if(pats.size()==3) {
		throw new DoctorFullException();
	 }
	 pats.add(pat);
 }
 ArrayList getPatients() {
	 return pats;
 }
 void doMedicine() {
	 for(int i = 0; i<pats.size();i++) {
		 pats.get(i).checkPulse();
	 }
 }
}
