package hiroshi.State.A3;
public interface Context {

    public abstract void setClock(int hour);                // �ð�����
    public abstract void changeState(State state);          // ������ȯ
    public abstract void callSecurityCenter(String msg);     // ����� ȣ��
    public abstract void recordLog(String msg);            // ����� ���
}
