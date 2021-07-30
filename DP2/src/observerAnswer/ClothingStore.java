package observerAnswer;

import java.util.Observable;
import java.util.Observer;

//import WhetherDataSubject;

// TODO : Apply the Observer pattern to ClothingStore class
public class ClothingStore implements Observer {
	private static final int SUMMER_CLOTHS = 1;
	private static final int WINTER_CLOTHS = 2;
	
	private int state;
	
	public ClothingStore() {
		state = SUMMER_CLOTHS;
	}
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WhetherDataSubject) {
			WhetherDataSubject whetherData = (WhetherDataSubject) o;
			whetherChanged(whetherData.getTemperature());
		}
		
	}
	public void whetherChanged(float temperature) {
		if(temperature >= 15.0f) // when temperature exceeds 15.0'c
			state = SUMMER_CLOTHS; // selling summer cloths
		else // when temperature < 15.0
			state = WINTER_CLOTHS;
		kindOfSellingCloths();
	}
	public void kindOfSellingCloths() {
		System.out.println("Selling " + ((state == SUMMER_CLOTHS) ? "Summer" : "Winter") + " cloths !");
	}
}
