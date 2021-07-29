package headfirst.factory.pizzaaf.extended;

public class SeoulPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new SeoulPizzaIngredientFactory();

		if (item.equals("kimchee")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Seoul Style Kimchee Pizza");

		} else if (item.equals("tofu")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Seoul Style Tofu Pizza");

		}
		return pizza;
	}
}
