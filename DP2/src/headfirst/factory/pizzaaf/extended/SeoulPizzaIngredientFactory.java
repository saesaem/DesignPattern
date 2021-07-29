package headfirst.factory.pizzaaf.extended;

public class SeoulPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new SeoulCrustDough();
	}

	public Sauce createSauce() {
		return new SeoulTomatoSauce();
	}

	public Cheese createCheese() {
		return new SeoulCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new SeoulSpinach() };
		                      
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SeoulPepperoni();
	}

	public Clams createClam() {
		return new SeoulClams();
	}
}
