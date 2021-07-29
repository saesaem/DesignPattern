package hiroshi.builderAnswer;
import java.io.*;

public class HTMLBuilder extends Builder {
    private String filename;                                 // �ۼ��� ���ϸ�
    private PrintWriter writer;                               // ���Ͽ� �� PrintWriter
    public void makeTitle(String title) {                       // HTML ������ Ÿ��Ʋ
        filename = title + ".html";                           // Ÿ��Ʋ�� ���ʷ� ���ϸ��� ����
        try {
            writer = new PrintWriter(new FileWriter(filename)); // PrintWriter�� �����
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>"); 
// Ÿ��Ʋ ���
        writer.println("<h1>" + title + "</h1>");
    }
    public void makeString(String str) {                        // HTML ���Ͽ����� ���ڿ�
        writer.println("<p>" + str + "</p>");                   // <p> �±׷� ���
    }
    public void makeItems(String[] items) {                     // HTML ���Ͽ����� �����׸�
        writer.println("<ul>");                                 // <ul>�� <li>�� ���
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }
    public void close() {                                    // ������ �ϼ�
        writer.println("</body></html>");                     // �±׸� �ݴ´�
        writer.close();                                        // ������ �ݴ´�
    }
    public String getResult() {
        return filename;                                      // ���ϸ��� ��ȯ�Ѵ�
    }
}
