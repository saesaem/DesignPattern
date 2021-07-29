package headfirst.strategy.extend;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
    EggBehavior eggBehavior;
    
	public Duck() {
		setEggBehavior(new SpawnNothing());
	}
 
	public void setFlyBehavior (FlyBehavior fb) {
		flyBehavior = fb;
	}
 
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
 
	public void setEggBehavior(EggBehavior eb) {
		eggBehavior = eb;
	}
	
	abstract void display();
 
	public void performFly() {
		flyBehavior.fly();
	}
 
	public void performQuack() {
		quackBehavior.quack();
	}
 
	public void performEgg() {
		eggBehavior.spawn();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
