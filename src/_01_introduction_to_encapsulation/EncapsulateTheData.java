package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private static int itemsReceived; //must not be negative. All negative arguments get set to 0.
	static int getItems() {
		return itemsReceived;
	}
	static void setItems(int i) {
		if(i>0) {
		itemsReceived = i;
		}
	}
	private static float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	static float getDegrees() {
		return degreesTurned;
	}
	static void setDegrees(float i) {
		if(i>=0.0&&i<=360.0) {
		degreesTurned = i;
		}
	}
	private static String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	static String getNomeclature() {
		return nomenclature;
	}
	static void setNomeclature(String i) {
		if(i!="") {
		nomenclature = i;
		}
	}
	private static Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	static Object getmemberObj() {
		return memberObj;
	}
	static void setmemberObj(Object i) {
		memberObj = i;
	}
	public static void main(String[] args) {
		assertEquals(itemsReceived, getItems());
		assertEquals(degreesTurned, getDegrees());
		assertEquals(nomenclature, getNomeclature());
		assertEquals(memberObj, getmemberObj());
	}
}
