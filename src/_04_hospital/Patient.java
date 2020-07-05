package _04_hospital;

public class Patient {
	boolean pulseChecked = false;
	boolean feelsCaredFor() {
		if(pulseChecked) {
			return true;
		}
		return false;
	}
	void checkPulse() {
		pulseChecked = true;
	}
}
