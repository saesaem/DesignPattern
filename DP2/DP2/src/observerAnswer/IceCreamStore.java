package observerAnswer;

import java.util.Observable;

import java.util.Observer;

public class IceCreamStore implements Observer {
	private boolean state = false ;
	public IceCreamStore() {
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WhetherDataSubject) {
			WhetherDataSubject whetherData = (WhetherDataSubject) o;
			whetherChanged(whetherData.getTemperature());
		}
	}
	public void whetherChanged(float temperature) {
		if (temperature >= 20.0f) 
			state = true;
		else state = false;
		isSelling();
	}
	public void isSelling() {
		System.out.println("IceCream " + (state ? "" : "Not ") + "Sale !");
	}
}
