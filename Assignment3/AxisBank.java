package week3.day1;

public class AxisBank extends BankInfo{
	//Child Class
	
	public void deposit() {
		System.out.println("Deposit Amount in Axis Bank");
	}
	
	public static void main(String[] args) {
		//Creating object for Child class
		AxisBank ab = new AxisBank();
		//Method Overriding of deposit method in Axis Bank Class
		ab.saving();
		ab.fixed();
		ab.deposit();

	}

}
