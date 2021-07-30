package oopreview.practice2;
public class Main {

	public static void main(String[] args) {
		Dog baduki = new Dog("Baduki");
		Cat nabi = new Cat("Nabi");
		Robot robo = new Robot();		
	    Insect i = new Insect();
	    
		baduki.say();
		nabi.say();
		robo.say();
		
		Animal aref = null;
		Sayable sref = null;
		Canine cref = null;
		
		System.out.println("\n[Start using Anmial Class referece]");
		aref = baduki;	aref.say();
		aref = nabi; aref.say();
		
		//Trigger error
		//aref = robo; aref.say();
		
		System.out.println("\n[Start using Sayable Interface referece]");
		sref = baduki; 	sref.say();
		sref = nabi; sref.say();
		sref = robo; sref.say();
		
		System.out.println("\n[Start using Canine Class referece]");
		cref = baduki; 	sref.say();
		
		i.say();
		sref = i;
		
		//Trigger error
		//cref = nabi; cref.say();
		//cref = robo; cref.say();
	}

}
