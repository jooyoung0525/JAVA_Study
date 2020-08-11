package bank1;

import java.text.NumberFormat;
import java.util.Scanner;

// 화면 입출력
public class BankUI {
	private Scanner sc = new Scanner(System.in);
	private Bank bank = new BankImpl();

	public void menu() {
		int ch;
		while (true) {
			do {
				System.out.println("-----------------------------------------------");
				System.out.println("1.계좌개설  2.입금  3.출금  4.계좌이체 5.잔액조회  6.거래내역");
				System.out.println("7.계좌번호검색  8.이름검색  9.계좌리스트 10.종료");
				System.out.println("-----------------------------------------------");
				System.out.print("선택=>");
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
		System.out.println("\n[개인-계좌 개설]");

		String owner;
		System.out.println("이름? ");
		owner = sc.next();

		Account account = bank.addAccount(owner);
		if (account == null) {
			System.out.println("계좌 개설이 실패 했습니다.\n");
			return;
		}

		AccountVO vo = account.getAccountVO();
		System.out.println("계좌 개설 번호 : " + vo.getAccountNo());
	}

	
	
	public void deposit() {
		System.out.println("\n[개인-입금]");
		// --계좌번호, 금액 입력
		// -- 일자, 구분 거래액, 잔고, 거래정보 저장
		// 잔고는 얼마 남았는지 출력

		String accountNO;
		long money;

		System.out.print("입금하실 계좌번호를 입력하세요.");
		accountNO = sc.next();
		System.out.print("금액을 입력하세요.");
		money = sc.nextLong();

		long deposit_result = bank.deposit(accountNO, money);

		if (deposit_result == -1L) {
			System.out.println("존재하지 않는 계좌입니다.");
		}else if (deposit_result == -2L){
			System.out.println("입금이 실패했습니다.");
		}else{
			System.out.println("입급에 성공했습니다.");
			System.out.println("잔액 : " + deposit_result);
		}
	}
	
	

	public void withdraw() {
		System.out.println("\n[개인-출금]");
		
		String accountNO;
		long money;

		System.out.print("출금할 계좌번호를 입력하세요.");
		accountNO = sc.next();
		System.out.print("금액을 입력하세요.");
		money = sc.nextLong();

		long deposit_result = bank.withdraw(accountNO, money);

		if (deposit_result == -1L) {
			System.out.println("존재하지 않는 계좌입니다.");
		}else if (deposit_result == -2L){
			System.out.println("출금이 실패했습니다.");
		}else if(deposit_result == -3L) {
			System.out.println("잔액부족...");
		}else{
			System.out.println("출금에 성공했습니다.");
			System.out.println("잔액 : " + deposit_result);
		}
	}

	
	
	public void accountTransfer() {
		System.out.println("\n[개인-계좌이체]");
		
		String accountFrom,accountTo;
		long money;
		
		System.out.print("출금할 계좌번호를 입력하세요.");
		accountFrom = sc.next();
		System.out.print("금액을 입력하세요.");
		money = sc.nextLong();
		System.out.print("입금할 계좌번호를 입력하세요.");
		accountTo = sc.next();
		
		long sendmoney = bank.accountTransfer(accountFrom, accountTo, money);
		
		if(sendmoney == -1L)
			System.out.println("출금 계좌가 없습니다.");
		else if(sendmoney == -2L)
			System.out.println("입금 계좌가 없습니다.");
		else if(sendmoney ==-3L)
			System.out.println("잔액 부족...");
		else
			System.out.println("계좌이체 성공");
		
	}

	
	
	public void balance() {
		System.out.println("\n[개인-잔액조회]");
		
		System.out.print("검색할 계좌를 입력해주세요.");

		String accountNo;
		accountNo = sc.next();
		
		Account account = bank.readAccount(accountNo);
		if (account == null) {
			System.out.println("존재하지 않는 계좌입니다.");
			return;
		}
		
		long remain = 0;
		remain = bank.balance(accountNo);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
	
		System.out.println(nf.format(remain)+" 남았습니다.");
	}

	
	
	public void transactionHistory() {
		System.out.println("\n[개인-거래내역조회]");// --------

		System.out.print("검색할 계좌를 입력해주세요.");

		String accountNo;
		accountNo = sc.next();

		Account account = bank.readAccount(accountNo);
		if (account == null) {
			System.out.println("존재하지 않는 계좌입니다.");
			return;
		}
		TransactionVO[] transactionList = bank.transactionHistory(accountNo);
		int totalTrans = account.getTotalTransaction();
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String s;
		
		if (totalTrans <= 0) {
			System.out.println("거래하신 내역이 없습니다.");
		}
		else {
			System.out.println("거래일자\t\t\t구분\t거래액\t잔고\t거래정보");
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
		System.out.println("\n[은행-계좌번호조회]");
		
		
		System.out.print("검색할 계좌를 입력해주세요.");

		String accountNo;
		accountNo = sc.next();
		
		Account account = bank.readAccount(accountNo);
		if(account == null) {
			System.out.println("존재하지 않는 계좌입니다.");
			return;
		}
		
		AccountVO vo = account.getAccountVO();
		System.out.print("이름 : "+vo.getOwner()+"\t");
		System.out.println("계좌 생성일 : "+vo.getLaunch_date());
		System.out.println("잔액 : "+bank.balance(accountNo));
	}

	
	
	public void findByOwner() {
		System.out.println("\n[은행-이름검색]");
		
		
	}

	
	
	public void accountList() {
		System.out.println("\n[은행-계좌전체리스트]");

		Account[] accountList = bank.getAccountList(); // BankImpl의 Account 리스트를 가져와서 새로운 Account 배열에 저장
		int totalAccount = bank.getTotalAccount(); // 전체계좌수 가져옴

		System.out.println("계좌번호\t\t이름\t개설일자\t\t\t잔고");
		for (int i = 0; i < totalAccount; i++) {
			Account account = accountList[i];
			AccountVO vo = account.getAccountVO();
			/*
			 * System.out.print(vo.getAccountNo()+"\t");
			 * System.out.print(vo.getOwner()+"\t");
			 * System.out.print(vo.getLaunch_date()+"\t"); System.out.println(0+"\n");
			 */
			System.out.println(vo + "\t" + bank.balance(vo.getAccountNo())); // vo.toString() 이지만 toString()은 생략가능!!!
		}
		System.out.println();
	}
}
