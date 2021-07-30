package headfirst.factory.pizzafm.extended;

import java.util.ArrayList;
import java.util.Iterator;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore seoulStore = new SeoulPizzaStore();
		ArrayList pizzaCollection = new ArrayList();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		pizzaCollection.add(pizza);
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		pizzaCollection.add(pizza);

		pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		pizzaCollection.add(pizza);
 
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		pizzaCollection.add(pizza);

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		pizzaCollection.add(pizza);
 
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		pizzaCollection.add(pizza);

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		pizzaCollection.add(pizza);
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		pizzaCollection.add(pizza);
		
		pizza = seoulStore.orderPizza("kimchee");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		pizzaCollection.add(pizza);
		
		pizza = seoulStore.orderPizza("tofu");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		pizzaCollection.add(pizza);
		
		System.out.println("---  Pizzas containing Tomato Sauce ---");
		Iterator i = pizzaCollection.iterator();
		while (i.hasNext()) {
			Pizza p = (Pizza) (i.next());
			if (p.sauce.indexOf("Tomato") >= 0) System.out.println("Found : " + p.name); 
		
		}
	}
}
