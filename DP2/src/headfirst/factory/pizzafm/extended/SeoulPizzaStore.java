package headfirst.factory.pizzafm.extended;

public class SeoulPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("kimchee")) {
            		return new SeoulStyleKimcheePizza();
        	} else if (item.equals("tofu")) {
        	    	return new SeoulStyleTofuPizza();       	
        	} else return null;
	}
}
