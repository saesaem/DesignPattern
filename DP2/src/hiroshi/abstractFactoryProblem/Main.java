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
        
        // ��� ȭ���� workspace�� ������. ���� ��� C:\eclipse-workspace\DP2
        
        Link samsung = factory.createLink("�Ｚ����", "http://www.samsung.com/");
        Link intel = factory.createLink("����", "http://www.intel.com/");
        
        Link naver = factory.createLink("���̹�", "http://www.naver.com/");
        Link naverMaps = factory.createLink("���̹� ����", "http://maps.naver.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");
        
        Tray traySilicon = factory.createTray("�ݵ�ü");
        traySilicon.add(samsung);
        traySilicon.add(intel);

        Tray traySearch = factory.createTray("�˻�����");
        traySearch.add(naver);
        traySearch.add(google);

        Tray trayPortal = factory.createTray("��Ż");
        trayPortal.add(traySearch);
        trayPortal.add(naverMaps);
        
        Page page = factory.createPage("LinkPage", "�������� ����");
        page.add(traySilicon);
        page.add(trayPortal);
        page.output();
    }
}
