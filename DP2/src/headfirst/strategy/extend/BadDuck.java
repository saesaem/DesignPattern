package headfirst.strategy.extend;

public class BadDuck extends Duck {
	static int fly_count = 0;
	public void display() {
		System.out.println("I am Badduck");
	}
	public void performFly() {
		fly_count ++;
		if (fly_count % 2 ==1) flyBehavior.fly();
	}
 
	public void performQuack() {
		quackBehavior.quack();
	}
 
	public void performEgg() {
		eggBehavior.spawn();
	}
}
