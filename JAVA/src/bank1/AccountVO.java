package bank1;

// °èÁÂÁ¤º¸
public class AccountVO {
	private String accountNo; // °èÁÂ¹øÈ£
	private String owner; // ¼ÒÀ¯ÀÚ
	private String launch_date; // °èÁÂ°³¼³ÀÏÀÚ -> ¿À´Ã³¯Â¥
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getLaunch_date() {
		return launch_date;
	}
	public void setLaunch_date(String launch_date) {
		this.launch_date = launch_date;
	}
	@Override
	public String toString() {
		return accountNo+"\t"+owner+"\t"+launch_date;
	}
	
	
}
