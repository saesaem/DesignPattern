package headfirst.strategy.extend;

public class SpawnNothing implements EggBehavior {
	@Override
	public void spawn() {
		System.out.println("I can't spawn :( ");
	}
}
