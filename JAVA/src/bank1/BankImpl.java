package bank1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BankImpl implements Bank {
	private Account[] accountList; // 계좌 정보
	private int totalAccount; // 총 계좌수

	public BankImpl() {
		// 최대 계좌수는 50, 또는 초기 10 부족하면 10개씩 증가
		accountList = new Account[50];
		totalAccount = 0;
	}

	// 계좌 번호 만들기
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
		// 계좌 등록

		if (totalAccount >= accountList.length)
			return null;

		Date date = new Date(); // Date 객체 ( 오늘날짜 date -> string으로 변환하여 vo에 넘겨줌)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-HH:mm:ss");
		String day = sdf.format(date); // 개설일자

		String account_no = generateAccountNo(); // 계좌생성

		Account account = new Account(); // Account안에 생성자에서 AccountVO생성
		AccountVO vo = account.getAccountVO(); // 위에 생성된 Account내에 저장된 AccountVO가져옴
		vo.setAccountNo(account_no);
		vo.setLaunch_date(day);
		vo.setOwner(owner);

		accountList[totalAccount++] = account;

		return account;
	}

	@Override
	public long deposit(String accountNo, long amount) {
		// 입금------------

		TransactionVO vo = new TransactionVO();

		Account account = readAccount(accountNo);

		// accountNo의 계좌정보를 불러옴.
		long remain_money = balance(accountNo); // 해당 계좌의 마지막 잔고를 불러옴

		if (remain_money == -1L)
			return -1L;

		// 날짜
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-HH:mm:ss");
		String day = sdf.format(date);
		// 다른 정보
		
		remain_money += amount;

		// 새로운TransactionVO에 정보 입력
		vo.setTransaction_date(day);
		vo.setKind("입금");
		vo.setBalance(remain_money);
		vo.setAmount(amount);
		vo.setInfo("본인");

		boolean a = account.addTransaction(vo);
		if(!a) return -2L;

		return remain_money;
	}

	@Override
	public long withdraw(String accountNo, long amount) {
		// 출금
		TransactionVO vo = new TransactionVO();

		Account account = readAccount(accountNo);

		// accountNo의 계좌정보를 불러옴.
		long remain_money = balance(accountNo); // 해당 계좌의 마지막 잔고를 불러옴

		if (remain_money == -1L)
			return -1L;

		if(remain_money <amount) return -3L;
		
		// 날짜
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-HH:mm:ss");
		String day = sdf.format(date);
		// 다른 정보
		
		remain_money -= amount;

		// 새로운TransactionVO에 정보 입력
		vo.setTransaction_date(day);
		vo.setKind("출금");
		vo.setBalance(remain_money);
		vo.setAmount(amount);
		vo.setInfo("본인");

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
		
		// 날짜
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-HH:mm:ss");
		String day = sdf.format(date);
		String name = accofrom.getAccountVO().getOwner();
		
		tfrom.setTransaction_date(day);
		tfrom.setKind("출금");
		tfrom.setBalance(reFrom);
		tfrom.setAmount(amount);
		tfrom.setInfo("계좌이체");
		
		tto.setTransaction_date(day);
		tto.setKind("입금");
		tto.setBalance(reTo);
		tto.setAmount(amount);
		tto.setInfo(name);
		
		accofrom.addTransaction(tfrom);
		accoto.addTransaction(tto);
		
		return reFrom; //출금잔액
	}

	@Override
	public long balance(String accountNo) {
		// 잔액조회----------------------
		Account account = readAccount(accountNo);
		if (account == null)
			return -1L; // 계좌가 없을 경우 -1L 리턴

		long amount = 0;
		TransactionVO vo = account.getLastTransaction();
		
		if (vo != null) {
			amount = vo.getBalance();
		}
		return amount;
	}

	@Override
	public TransactionVO[] transactionHistory(String accountNo) {
		// 거래내역조회------------------계좌번호에 대한 내역을 뽑는거

		Account account = readAccount(accountNo);

		if (account == null)
			return null;

		TransactionVO[] vo = account.getTransactionList();

		return vo;
	}

	@Override
	public Account readAccount(String accountNo) {
		// 계좌-번호검색 //---------------------------

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
		// 계좌-이름검색
		Account[] result = new Account[50];
		
		return null;
	}

	@Override
	public Account[] getAccountList() {
		// 계좌-전체리스트

		return accountList;
	}

	@Override
	public int getTotalAccount() {
		// 계좌-전체계좌수

		return totalAccount;
	}
}
