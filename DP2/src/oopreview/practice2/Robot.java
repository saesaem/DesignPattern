package oopreview.practice2;
public class Robot implements Sayable {

	@Override
	public void say() {
		// TODO Auto-generated method stub
		printOut();
	}
	private void printOut() {
		System.out.println("I have no name. I am a Robot");
		System.out.println("Beep");
		System.out.println("------------------");
	}
}
