package bank1;

// ���� ���� �� ���� �ŷ� ���� ����
public class Account {
	private AccountVO accountVO;  // ��������
	private TransactionVO[] transactionList; // ���º��ŷ�����
	private int totalTransaction; // �ŷ������Ǽ�
	
	public Account() {
    	// �ִ� �ŷ������Ǽ��� 50, �Ǵ� �ʱ� 10���� ������ 10�� ����
		accountVO = new AccountVO();
		transactionList = new TransactionVO[50];
		totalTransaction = 0;
	}
	
	public AccountVO getAccountVO() {
		return accountVO;
	}
	
	public TransactionVO[] getTransactionList() {
		return transactionList;
	}
	
	public int getTotalTransaction() {
		//��ü �ŷ� �Ǽ�
		return totalTransaction;
	}
	
	public boolean addTransaction(TransactionVO vo) {
		//�ŷ� ���� ���
		if(totalTransaction>=50) return false;
		
		transactionList[totalTransaction++]=vo;
		return true;
	}
	
	public TransactionVO getLastTransaction() {	
		//������ �ŷ� ����
		if(totalTransaction > 0)
			return transactionList[totalTransaction-1];
		
		return null;
	}
}
