package bank1;

import java.text.NumberFormat;
import java.util.Scanner;

// ȭ�� �����
public class BankUI {
	private Scanner sc = new Scanner(System.in);
	private Bank bank = new BankImpl();

	public void menu() {
		int ch;
		while (true) {
			do {
				System.out.println("-----------------------------------------------");
				System.out.println("1.���°���  2.�Ա�  3.���  4.������ü 5.�ܾ���ȸ  6.�ŷ�����");
				System.out.println("7.���¹�ȣ�˻�  8.�̸��˻�  9.���¸���Ʈ 10.����");
				System.out.println("-----------------------------------------------");
				System.out.print("����=>");
				ch = sc.nextInt();
			} while (ch < 1 || ch > 10);

			if (ch == 10) {
				return;
			}

			switch (ch) {
			case 1:
				addAccount();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				accountTransfer();
				break;
			case 5:
				balance();
				break;
			case 6:
				transactionHistory();
				break;
			case 7:
				findByAccountNo();
				break;
			case 8:
				findByOwner();
				break;
			case 9:
				accountList();
				break;
			}
		}
	}

	
	
	public void addAccount() {
		System.out.println("\n[����-���� ����]");

		String owner;
		System.out.println("�̸�? ");
		owner = sc.next();

		Account account = bank.addAccount(owner);
		if (account == null) {
			System.out.println("���� ������ ���� �߽��ϴ�.\n");
			return;
		}

		AccountVO vo = account.getAccountVO();
		System.out.println("���� ���� ��ȣ : " + vo.getAccountNo());
	}

	
	
	public void deposit() {
		System.out.println("\n[����-�Ա�]");
		// --���¹�ȣ, �ݾ� �Է�
		// -- ����, ���� �ŷ���, �ܰ�, �ŷ����� ����
		// �ܰ�� �� ���Ҵ��� ���

		String accountNO;
		long money;

		System.out.print("�Ա��Ͻ� ���¹�ȣ�� �Է��ϼ���.");
		accountNO = sc.next();
		System.out.print("�ݾ��� �Է��ϼ���.");
		money = sc.nextLong();

		long deposit_result = bank.deposit(accountNO, money);

		if (deposit_result == -1L) {
			System.out.println("�������� �ʴ� �����Դϴ�.");
		}else if (deposit_result == -2L){
			System.out.println("�Ա��� �����߽��ϴ�.");
		}else{
			System.out.println("�Ա޿� �����߽��ϴ�.");
			System.out.println("�ܾ� : " + deposit_result);
		}
	}
	
	

	public void withdraw() {
		System.out.println("\n[����-���]");
		
		String accountNO;
		long money;

		System.out.print("����� ���¹�ȣ�� �Է��ϼ���.");
		accountNO = sc.next();
		System.out.print("�ݾ��� �Է��ϼ���.");
		money = sc.nextLong();

		long deposit_result = bank.withdraw(accountNO, money);

		if (deposit_result == -1L) {
			System.out.println("�������� �ʴ� �����Դϴ�.");
		}else if (deposit_result == -2L){
			System.out.println("����� �����߽��ϴ�.");
		}else if(deposit_result == -3L) {
			System.out.println("�ܾ׺���...");
		}else{
			System.out.println("��ݿ� �����߽��ϴ�.");
			System.out.println("�ܾ� : " + deposit_result);
		}
	}

	
	
	public void accountTransfer() {
		System.out.println("\n[����-������ü]");
		
		String accountFrom,accountTo;
		long money;
		
		System.out.print("����� ���¹�ȣ�� �Է��ϼ���.");
		accountFrom = sc.next();
		System.out.print("�ݾ��� �Է��ϼ���.");
		money = sc.nextLong();
		System.out.print("�Ա��� ���¹�ȣ�� �Է��ϼ���.");
		accountTo = sc.next();
		
		long sendmoney = bank.accountTransfer(accountFrom, accountTo, money);
		
		if(sendmoney == -1L)
			System.out.println("��� ���°� �����ϴ�.");
		else if(sendmoney == -2L)
			System.out.println("�Ա� ���°� �����ϴ�.");
		else if(sendmoney ==-3L)
			System.out.println("�ܾ� ����...");
		else
			System.out.println("������ü ����");
		
	}

	
	
	public void balance() {
		System.out.println("\n[����-�ܾ���ȸ]");
		
		System.out.print("�˻��� ���¸� �Է����ּ���.");

		String accountNo;
		accountNo = sc.next();
		
		Account account = bank.readAccount(accountNo);
		if (account == null) {
			System.out.println("�������� �ʴ� �����Դϴ�.");
			return;
		}
		
		long remain = 0;
		remain = bank.balance(accountNo);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
	
		System.out.println(nf.format(remain)+" ���ҽ��ϴ�.");
	}

	
	
	public void transactionHistory() {
		System.out.println("\n[����-�ŷ�������ȸ]");// --------

		System.out.print("�˻��� ���¸� �Է����ּ���.");

		String accountNo;
		accountNo = sc.next();

		Account account = bank.readAccount(accountNo);
		if (account == null) {
			System.out.println("�������� �ʴ� �����Դϴ�.");
			return;
		}
		TransactionVO[] transactionList = bank.transactionHistory(accountNo);
		int totalTrans = account.getTotalTransaction();
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String s;
		
		if (totalTrans <= 0) {
			System.out.println("�ŷ��Ͻ� ������ �����ϴ�.");
		}
		else {
			System.out.println("�ŷ�����\t\t\t����\t�ŷ���\t�ܰ�\t�ŷ�����");
			System.out.println("=============================================================");
			for (int i = 0; i < totalTrans; i++) {
				TransactionVO vo = transactionList[i];
				System.out.print(vo.getTransaction_date() + "\t");
				System.out.print(vo.getKind() + "\t");
				s = nf.format(vo.getAmount());
				System.out.print(s+"\t");
				s = nf.format(vo.getBalance());
				System.out.print(s + "\t");
				System.out.println(vo.getInfo());

			}
		}

	}

	
	
	public void findByAccountNo() {
		System.out.println("\n[����-���¹�ȣ��ȸ]");
		
		
		System.out.print("�˻��� ���¸� �Է����ּ���.");

		String accountNo;
		accountNo = sc.next();
		
		Account account = bank.readAccount(accountNo);
		if(account == null) {
			System.out.println("�������� �ʴ� �����Դϴ�.");
			return;
		}
		
		AccountVO vo = account.getAccountVO();
		System.out.print("�̸� : "+vo.getOwner()+"\t");
		System.out.println("���� ������ : "+vo.getLaunch_date());
		System.out.println("�ܾ� : "+bank.balance(accountNo));
	}

	
	
	public void findByOwner() {
		System.out.println("\n[����-�̸��˻�]");
		
		
	}

	
	
	public void accountList() {
		System.out.println("\n[����-������ü����Ʈ]");

		Account[] accountList = bank.getAccountList(); // BankImpl�� Account ����Ʈ�� �����ͼ� ���ο� Account �迭�� ����
		int totalAccount = bank.getTotalAccount(); // ��ü���¼� ������

		System.out.println("���¹�ȣ\t\t�̸�\t��������\t\t\t�ܰ�");
		for (int i = 0; i < totalAccount; i++) {
			Account account = accountList[i];
			AccountVO vo = account.getAccountVO();
			/*
			 * System.out.print(vo.getAccountNo()+"\t");
			 * System.out.print(vo.getOwner()+"\t");
			 * System.out.print(vo.getLaunch_date()+"\t"); System.out.println(0+"\n");
			 */
			System.out.println(vo + "\t" + bank.balance(vo.getAccountNo())); // vo.toString() ������ toString()�� ��������!!!
		}
		System.out.println();
	}
}
