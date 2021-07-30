package observerAnswer;

import java.util.Observable;

/*
 * Using java.util.Observable
 * */
public class WhetherDataSubject extends Observable {
	private float temperature = 25.0f;
	private float rainfall = 0.0f;

	// default constructor
	public WhetherDataSubject() {
	}
	
	public void setMeasurements(float temperature, float rainfall) {
		this.temperature = temperature;
		this.rainfall = rainfall;
		setChanged();
	}
	
	public void setTemperature(float temperature) {
		this.temperature = temperature;
		setChanged();
	}
	
	public void setRainfall(float rainfall) {
		this.rainfall = rainfall;
		setChanged();
	}
	
	public float getRainfall() { return this.rainfall; }
	public float getTemperature() { return this.temperature; }
	
	public void currentState() {
		System.out.printf("===== Current state ===== \n Temperature : %.1f'c \n Rainfall : %.1fmm \n=========================\n",
				temperature, rainfall);
	}
}

// TODO : Á¤´ä ¼Â 
