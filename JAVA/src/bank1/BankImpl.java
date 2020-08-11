package bank1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BankImpl implements Bank {
	private Account[] accountList; // ���� ����
	private int totalAccount; // �� ���¼�

	public BankImpl() {
		// �ִ� ���¼��� 50, �Ǵ� �ʱ� 10 �����ϸ� 10���� ����
		accountList = new Account[50];
		totalAccount = 0;
	}

	// ���� ��ȣ �����
	protected String generateAccountNo() {
		String s = "020-08-0000000";
		if (totalAccount > 0) {
			s = accountList[totalAccount - 1].getAccountVO().getAccountNo();
		}

		String s1 = s.substring(0, s.lastIndexOf("-"));
		String s2 = s.substring(s.lastIndexOf("-") + 1);

		int n = Integer.parseInt(s2) + 1;

		s = s1 + "-" + String.format("%07d", n);

		return s;
	}

	@Override
	public Account addAccount(String owner) {
		// ���� ���

		if (totalAccount >= accountList.length)
			return null;

		Date date = new Date(); // Date ��ü ( ���ó�¥ date -> string���� ��ȯ�Ͽ� vo�� �Ѱ���)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-HH:mm:ss");
		String day = sdf.format(date); // ��������

		String account_no = generateAccountNo(); // ���»���

		Account account = new Account(); // Account�ȿ� �����ڿ��� AccountVO����
		AccountVO vo = account.getAccountVO(); // ���� ������ Account���� ����� AccountVO������
		vo.setAccountNo(account_no);
		vo.setLaunch_date(day);
		vo.setOwner(owner);

		accountList[totalAccount++] = account;

		return account;
	}

	@Override
	public long deposit(String accountNo, long amount) {
		// �Ա�------------

		TransactionVO vo = new TransactionVO();

		Account account = readAccount(accountNo);

		// accountNo�� ���������� �ҷ���.
		long remain_money = balance(accountNo); // �ش� ������ ������ �ܰ� �ҷ���

		if (remain_money == -1L)
			return -1L;

		// ��¥
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-HH:mm:ss");
		String day = sdf.format(date);
		// �ٸ� ����
		
		remain_money += amount;

		// ���ο�TransactionVO�� ���� �Է�
		vo.setTransaction_date(day);
		vo.setKind("�Ա�");
		vo.setBalance(remain_money);
		vo.setAmount(amount);
		vo.setInfo("����");

		boolean a = account.addTransaction(vo);
		if(!a) return -2L;

		return remain_money;
	}

	@Override
	public long withdraw(String accountNo, long amount) {
		// ���
		TransactionVO vo = new TransactionVO();

		Account account = readAccount(accountNo);

		// accountNo�� ���������� �ҷ���.
		long remain_money = balance(accountNo); // �ش� ������ ������ �ܰ� �ҷ���

		if (remain_money == -1L)
			return -1L;

		if(remain_money <amount) return -3L;
		
		// ��¥
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-HH:mm:ss");
		String day = sdf.format(date);
		// �ٸ� ����
		
		remain_money -= amount;

		// ���ο�TransactionVO�� ���� �Է�
		vo.setTransaction_date(day);
		vo.setKind("���");
		vo.setBalance(remain_money);
		vo.setAmount(amount);
		vo.setInfo("����");

		boolean a = account.addTransaction(vo);
		if(!a) return -2L;

		return remain_money;
	}

	@Override //a->b
	public long accountTransfer(String fromAccountNo, String toAccountNo, long amount) {
		
		TransactionVO tfrom = new TransactionVO();
		Account accofrom = readAccount(fromAccountNo);
		if(accofrom == null) return -1L;
		
		TransactionVO tto = new TransactionVO();
		Account accoto = readAccount(toAccountNo);
		if(accoto == null) return -2L;
		
		long reFrom = balance(fromAccountNo);
		long reTo = balance(toAccountNo);
		
		if(reFrom < amount) return -3L;
		
		reFrom -= amount;
		reTo +=amount;
		
		// ��¥
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-HH:mm:ss");
		String day = sdf.format(date);
		String name = accofrom.getAccountVO().getOwner();
		
		tfrom.setTransaction_date(day);
		tfrom.setKind("���");
		tfrom.setBalance(reFrom);
		tfrom.setAmount(amount);
		tfrom.setInfo("������ü");
		
		tto.setTransaction_date(day);
		tto.setKind("�Ա�");
		tto.setBalance(reTo);
		tto.setAmount(amount);
		tto.setInfo(name);
		
		accofrom.addTransaction(tfrom);
		accoto.addTransaction(tto);
		
		return reFrom; //����ܾ�
	}

	@Override
	public long balance(String accountNo) {
		// �ܾ���ȸ----------------------
		Account account = readAccount(accountNo);
		if (account == null)
			return -1L; // ���°� ���� ��� -1L ����

		long amount = 0;
		TransactionVO vo = account.getLastTransaction();
		
		if (vo != null) {
			amount = vo.getBalance();
		}
		return amount;
	}

	@Override
	public TransactionVO[] transactionHistory(String accountNo) {
		// �ŷ�������ȸ------------------���¹�ȣ�� ���� ������ �̴°�

		Account account = readAccount(accountNo);

		if (account == null)
			return null;

		TransactionVO[] vo = account.getTransactionList();

		return vo;
	}

	@Override
	public Account readAccount(String accountNo) {
		// ����-��ȣ�˻� //---------------------------

		for (int i = 0; i < totalAccount; i++) {
			Account account = accountList[i];
			AccountVO vo = account.getAccountVO();
			if (vo.getAccountNo().equals(accountNo)) {
				return account;
			}
		}
		return null;
	}

	@Override
	public Account[] getAccountList(String owner) {
		// ����-�̸��˻�
		Account[] result = new Account[50];
		
		return null;
	}

	@Override
	public Account[] getAccountList() {
		// ����-��ü����Ʈ

		return accountList;
	}

	@Override
	public int getTotalAccount() {
		// ����-��ü���¼�

		return totalAccount;
	}
}
