package hiroshi.builderProblem;

public class Director {
    private Builder builder;
    public Director(Builder builder) {        // Builder의 Subclass의 인스턴스가 주어지므로
        this.builder = builder;             // builder 필드에 저장해 둔다.
    }
    public void construct() {               		// 문서구축
        builder.makeTitle("Greeting");              // 타이틀
        builder.makeString("Monring and Day");         // 문자열
        builder.makeItems(new String[]{            // 개별항목
            "Good Morning!",
            "How are you?",
        });
        builder.makeString("Night");                // 별도의 문자열
        builder.makeItems(new String[]{           // 별도의 개별항목
            "How are you?",
            "Good Night",            
        });
        builder.close();                           // 문서를 완성시킨다
    }
}
