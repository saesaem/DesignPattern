package oopreview.practice1;
public class Main {

	public static void main(String[] args) {
		Dog baduki = new Dog("Baduki");
		Cat nabi = new Cat("Nabi");
		Robot robo = new Robot();		
	
		baduki.bark();
		nabi.meow();
		robo.printOut();
	}

}
