package bank1;

// �ŷ����� ����
public class TransactionVO {
	private String transaction_date; // �ŷ�����
	private String kind; // ����(�Ա�/���)
	private long amount; // �ŷ���
	private long balance; // �ܰ�
	private String info; // �ŷ�����(������ü��...)
	
	public String getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}
