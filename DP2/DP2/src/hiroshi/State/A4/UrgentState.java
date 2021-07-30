package hiroshi.State.A4;
public class UrgentState implements State {
	private static UrgentState singleton = new UrgentState();
    private UrgentState() {                                // �����ڴ� private
    }
    public static State getInstance() {                 // ������ �ν��Ͻ��� ��´�
        return singleton;
    }
    public void doClock(Context context, int hour) {    // �ð�����  
        // �ð����������� �ƹ� ó���� ���� �ʴ´�               
    }                                                           
    public void doUse(Context context) {                // �ݰ���
        context.callSecurityCenter("���:������ �ݰ���!");
    }
    public void doAlarm(Context context) {              // ���
        context.callSecurityCenter("���(������)");
    }
    public void doPhone(Context context) {              // �Ϲ���ȭ
        context.callSecurityCenter("�Ϲ���ȭ(������)");
    }
    public String toString() {                          // ���ڿ� ǥ��
        return "[������]";
    }
}
