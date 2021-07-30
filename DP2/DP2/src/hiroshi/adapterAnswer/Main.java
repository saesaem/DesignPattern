package hiroshi.adapterAnswer;

// Using Object Adapter
public class Main {
    public static void main(String[] args) {
    	Banner b = new Banner("Hello");
        Print p = new PrintBanner(b);
        p.printWeak();
        p.printStrong();
    }
}
