package oopreview.practice2;
public class Insect implements Sayable {	
	public void say() {		
		printOut();
	}
	private void printOut() {
		System.out.println("I have no name. I am an Insect");
		System.out.println("buzz");
		System.out.println("------------------");
	}	
	
}
