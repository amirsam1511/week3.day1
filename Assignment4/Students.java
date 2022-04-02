package week3.day1;

public class Students {

	//declaring parameterized methods

	public void getStudentInfo(int id) {
		System.out.println("Student Id is " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student Id is " + id);
		System.out.println("Student Name is " + name);
	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("EmaidId is " + email);
		System.out.println("Phone Number is " + phoneNumber);
	}

	public static void main(String[] args) {
		//creating object for Student Class
		Students st = new Students();
		//Calling method (Overloading of getStudentInfo method)
		st.getStudentInfo(1);
		st.getStudentInfo(1, "XXX");
		st.getStudentInfo("testleaf@gmail.com", 9765423451L);

	}

}
