package hiroshi.adapterAnswer;
public class PrintBanner implements Print {
    private Banner banner;
    
    public PrintBanner(Banner b) {
    	this.banner = b;        
    }
    public void printWeak() {
        banner.showWithParen();
    }
    public void printStrong() {
        banner.showWithAster();
    }
}
