package oopreview.practice1;
public class Dog {
	String name;
	public Dog (String name) {
		this.name = name;
	}
	
	public void bark() {
		System.out.println("I am " + this.name);
		System.out.println("Bark");
		System.out.println("------------------");
	}
}
