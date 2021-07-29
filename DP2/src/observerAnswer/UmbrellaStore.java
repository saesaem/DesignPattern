package observerAnswer;
import java.util.Observable;
import java.util.Observer;

public class UmbrellaStore implements Observer {
	
	private boolean sellingState;
	// default constructor
	public UmbrellaStore() {
		this.sellingState = false;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WhetherDataSubject) {
			WhetherDataSubject whetherData = (WhetherDataSubject) o;
			whetherChanged(whetherData.getRainfall());
		}
	}
	public void whetherChanged(float rainfall) {
		if (rainfall >= 5.0f)// when rainfall exceeds 5.0mm
			sellingState = true;
		else // when rainfall < 5.0
			sellingState = false;
		isSelling();
	}

	public void isSelling() {
		System.out.println("Umbrella "+ ((sellingState) ? "":"Not ") + "Sale !");
	}
}
