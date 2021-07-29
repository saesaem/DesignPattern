package hiroshi.builderAnswer;
import java.io.*;

public class XMLBuilder extends Builder {
    private String filename;                                 // 작성할 파일명
    private PrintWriter writer;                               // 파일에 쓸 PrintWriter
    public void makeTitle(String title) {                       // XML 파일의 타이틀
        filename = title + ".xml";                           // 타이틀을 기초로 파일명을 결정
        try {
            writer = new PrintWriter(new FileWriter(filename)); // PrintWriter을 만든다
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<?xml version=\"1.0\" standalone=\"yes\"?>");        
        writer.println("<XMLdoc><Title>" + title + "</Title><Body>");
    }
    public void makeString(String str) {                        // XML 파일에서의 문자열
        writer.println("<String>" + str + "</String>");                   
    }
    public void makeItems(String[] items) {                     // XML 파일에서의 개별항목
        writer.println("<List>");                                 // <Item> 출력
        for (int i = 0; i < items.length; i++) {
            writer.println("<Item>" + items[i] + "</Item>");
        }
        writer.println("</List>");
    }
    public void close() {                                    // 문서의 완성
        writer.println("</Body></XMLdoc>");                     // 태그를 닫는다
        writer.close();                                        // 파일을 닫는다
    }
    public String getResult() {
        return filename;                                      // 파일명을 반환한다
    }
}
