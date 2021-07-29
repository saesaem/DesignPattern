package headfirst.factory.pizzafm.extended;

public class SeoulStyleTofuPizza extends Pizza {

	public SeoulStyleTofuPizza() { 
		name = "Seoul Style Tofu Pizza";
		dough = "Thin Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
