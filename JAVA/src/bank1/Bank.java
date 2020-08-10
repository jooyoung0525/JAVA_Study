package bank1;

public interface Bank {
	// ���� ���
    public Account addAccount(String owner);
    // �Ա�
    public long deposit(String accountNo, long amount);
    // ���
    public long withdraw(String accountNo, long amount);
    // ������ü
    public long accountTransfer(String fromAccountNo, String toAccountNo, long amount);
    // �ܾ���ȸ
    public long balance(String accountNo);
    // �ŷ�������ȸ
    public TransactionVO[] transactionHistory(String accountNo);
    // ����-��ȣ�˻�
    public Account readAccount(String accountNo);
    // ����-�̸��˻�
    public Account[] getAccountList(String owner);
    // ����-��ü����Ʈ
	public Account[] getAccountList();
	// ����-��ü���¼�
	public int getTotalAccount();
}
