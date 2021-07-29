package hiroshi.builderProblem;

public class Director {
    private Builder builder;
    public Director(Builder builder) {        // Builder�� Subclass�� �ν��Ͻ��� �־����Ƿ�
        this.builder = builder;             // builder �ʵ忡 ������ �д�.
    }
    public void construct() {               		// ��������
        builder.makeTitle("Greeting");              // Ÿ��Ʋ
        builder.makeString("Monring and Day");         // ���ڿ�
        builder.makeItems(new String[]{            // �����׸�
            "Good Morning!",
            "How are you?",
        });
        builder.makeString("Night");                // ������ ���ڿ�
        builder.makeItems(new String[]{           // ������ �����׸�
            "How are you?",
            "Good Night",            
        });
        builder.close();                           // ������ �ϼ���Ų��
    }
}
