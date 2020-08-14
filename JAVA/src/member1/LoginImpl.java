package member1;

public class LoginImpl implements Login{
	private MemberVO loginUser; //로그인 된 사람을 저장하기 위한 객체
	private Member member; //new를 생성하면 기존의 정보는 없어짐 ==> 의존관계!!!
	
	public LoginImpl(Member member) {
		this.member = member;
	}
	
	@Override
	public boolean isLogin(String id, String pwd) { //로그인 되는지 안되는지 확인만 하는 메소드
		loginUser = null;
		
		MemberVO vo = member.readMember(id); //해당아이디가 있는지 없는지 검사.
		if(vo==null) { //아이디가 없음
			return false;
		}
		
		if(vo.getPwd().equals(pwd)) {
			loginUser = vo;
			return true;
		}
		
		return false;
	}

	@Override
	public void logout() { //로그인된 정보 지우면 로그아웃
		loginUser = null;
	}

	@Override
	public MemberVO loginMember() { //로그인을 하기 위한 메소드이기 때문에 로그인정보 넘김
		return loginUser;
	}
}
