package hiroshi.builderAnswer;
import java.io.*;

public class XMLBuilder extends Builder {
    private String filename;                                 // �ۼ��� ���ϸ�
    private PrintWriter writer;                               // ���Ͽ� �� PrintWriter
    public void makeTitle(String title) {                       // XML ������ Ÿ��Ʋ
        filename = title + ".xml";                           // Ÿ��Ʋ�� ���ʷ� ���ϸ��� ����
        try {
            writer = new PrintWriter(new FileWriter(filename)); // PrintWriter�� �����
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<?xml version=\"1.0\" standalone=\"yes\"?>");        
        writer.println("<XMLdoc><Title>" + title + "</Title><Body>");
    }
    public void makeString(String str) {                        // XML ���Ͽ����� ���ڿ�
        writer.println("<String>" + str + "</String>");                   
    }
    public void makeItems(String[] items) {                     // XML ���Ͽ����� �����׸�
        writer.println("<List>");                                 // <Item> ���
        for (int i = 0; i < items.length; i++) {
            writer.println("<Item>" + items[i] + "</Item>");
        }
        writer.println("</List>");
    }
    public void close() {                                    // ������ �ϼ�
        writer.println("</Body></XMLdoc>");                     // �±׸� �ݴ´�
        writer.close();                                        // ������ �ݴ´�
    }
    public String getResult() {
        return filename;                                      // ���ϸ��� ��ȯ�Ѵ�
    }
}
