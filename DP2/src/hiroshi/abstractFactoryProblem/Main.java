package hiroshi.abstractFactoryProblem;

public class Main {
    public static void main(String[] args) {
        /* if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main ListFactory");
            System.out.println("Example 2: java Main TableFactory");
            System.exit(0);
        } 
    	Factory factory = Factory.getFactory("hiroshi.abstractFactoryProblem." + args[1]);
    	*/
        Factory factory = Factory.getFactory("hiroshi.abstractFactoryProblem.ListFactory");
    	// Factory factory = Factory.getFactory("hiroshi.abstractFactoryProblem.TableFactory");
        
        // 결과 화일은 workspace에 생성됨. 예를 들어 C:\eclipse-workspace\DP2
        
        Link samsung = factory.createLink("삼성전자", "http://www.samsung.com/");
        Link intel = factory.createLink("인텔", "http://www.intel.com/");
        
        Link naver = factory.createLink("네이버", "http://www.naver.com/");
        Link naverMaps = factory.createLink("네이버 지도", "http://maps.naver.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");
        
        Tray traySilicon = factory.createTray("반도체");
        traySilicon.add(samsung);
        traySilicon.add(intel);

        Tray traySearch = factory.createTray("검색엔진");
        traySearch.add(naver);
        traySearch.add(google);

        Tray trayPortal = factory.createTray("포탈");
        trayPortal.add(traySearch);
        trayPortal.add(naverMaps);
        
        Page page = factory.createPage("LinkPage", "설계패턴 교육");
        page.add(traySilicon);
        page.add(trayPortal);
        page.output();
    }
}
