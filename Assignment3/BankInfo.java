package week3.day1;

public class BankInfo extends AxisBank{
	//Child Class
	
	public void saving() {
		System.out.println("Savings Amount");
	}
	
	public void fixed() {
		System.out.println("Fixed Amount");
	}
	
	public void deposit() {
		System.out.println("Deposit Amount in Bank Info");
	}

	public static void main(String[] args) {
		//Creating object for Child class
		BankInfo b = new BankInfo();
		//Method Overriding of deposit method in Axis Bank Class
		b.deposit();

	}
}
