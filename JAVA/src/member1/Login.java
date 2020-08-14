package member1;

public interface Login {
	public boolean isLogin(String id, String pwd);
	public void logout();
	public MemberVO loginMember();
}
