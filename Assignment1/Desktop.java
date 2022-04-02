package org.system;

public class Desktop extends Computer {
	//derived class using Single Inheritance
	
	public void desktopSize() {
		System.out.println("Desktop Size is 16inch");
	}

	public static void main(String[] args) {
		Desktop desk = new Desktop();
		//Calling methods of both base and derived class
		desk.computerModel();
		desk.desktopSize();

	}

}
