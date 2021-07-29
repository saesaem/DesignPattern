package headfirst.factory.pizzafm.extended;

public class SeoulStyleKimcheePizza extends Pizza {

	public SeoulStyleKimcheePizza() { 
		name = "Seoul Style Kimchee Pizza";
		dough = "Thin Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
