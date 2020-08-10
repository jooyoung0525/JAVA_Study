package bank1;

// 계좌 정보 및 계좌 거래 내역 정보
public class Account {
	private AccountVO accountVO;  // 계좌정보
	private TransactionVO[] transactionList; // 계좌별거래내역
	private int totalTransaction; // 거래내역건수
	
	public Account() {
    	// 최대 거래내역건수는 50, 또는 초기 10으로 설정후 10씩 증가
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
		return totalTransaction;
	}
}
