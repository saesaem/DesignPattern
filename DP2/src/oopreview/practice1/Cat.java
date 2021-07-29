package oopreview.practice1;
public class Cat {
	String name;
	public Cat (String name) {
		this.name = name;
	}
	
	public void meow() {
		System.out.println("I am " + this.name);
		System.out.println("Meow");
		System.out.println("------------------");
	}
}
