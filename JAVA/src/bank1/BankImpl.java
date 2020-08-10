package bank1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BankImpl implements Bank {
	private  Account[] accountList; // ���� ����
    private int totalAccount; // �� ���¼�
    
    public BankImpl() {
    	// �ִ� ���¼��� 50, �Ǵ� �ʱ� 10 �����ϸ� 10���� ����
    	accountList = new Account[50];
    	totalAccount = 0;
    }
    
    // ���� ��ȣ �����
	protected String generateAccountNo() {
	    String s="020-08-0000000";
	    if(totalAccount>0) {
	    	s=accountList[totalAccount-1].getAccountVO().getAccountNo();
	    }
	    
	    String s1=s.substring(0, s.lastIndexOf("-"));
	    String s2=s.substring(s.lastIndexOf("-")+1);
			
	    int n=Integer.parseInt(s2)+1;
			
	    s=s1+"-"+String.format("%07d", n);
	    
	    return s;
	}
    
	@Override
    public Account addAccount(String owner) {
		// ���� ���
		
		/*
		Account a = new Account();
		
		Date date = new Date(); //Date ��ü ( ���ó�¥ date -> string���� ��ȯ�Ͽ� vo�� �Ѱ���)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		String day = sdf.format(date);
		String acno = generateAccountNo();
		
		a.
	
		accountList[totalAccount]=;
		*/
		
		if(totalAccount>=accountList.length) return null;
		
		Date date = new Date(); //Date ��ü ( ���ó�¥ date -> string���� ��ȯ�Ͽ� vo�� �Ѱ���)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd_HH:mm:ss");
		String day = sdf.format(date); //��������
		
		
		String account_no = generateAccountNo(); //���»���
		
		Account account = new Account(); //Account�ȿ� �����ڿ��� AccountVO����
		AccountVO vo = account.getAccountVO(); //���� ������ Account���� ����� AccountVO������
		vo.setAccountNo(account_no);
		vo.setLaunch_date(day);
		vo.setOwner(owner);
		
		accountList[totalAccount++] = account;
		
    	return account;
    }

	@Override
    public long deposit(String accountNo, long amount) {
    	// �Ա�
    	
    	return 0L;
    }

	@Override
    public long withdraw(String accountNo, long amount) {
    	// ���
    	
    	return 0L;
    }
    
	@Override
	public long accountTransfer(String fromAccountNo, String toAccountNo, long amount) {
    	// ������ü
    	
    	return 0L;
    }

	@Override
    public long balance(String accountNo) {
    	// �ܾ���ȸ
    	
    	return 0L;
    }

	@Override
    public TransactionVO[] transactionHistory(String accountNo) {
    	// �ŷ�������ȸ
    	
    	return null;
    }

	@Override
    public Account readAccount(String accountNo) {
    	// ����-��ȣ�˻�
    	
    	return null;
    }

	@Override
    public Account[] getAccountList(String owner) {
    	// ����-�̸��˻�
    	
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
