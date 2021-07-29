package headfirst.strategy.extend;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
	
	public void CopyBehavior(Duck source) {
		this.flyBehavior = source.flyBehavior;
		this.quackBehavior = source.quackBehavior;
		this.eggBehavior = source.eggBehavior;
	}
}
