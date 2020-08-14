package member1;

import java.util.LinkedList;
import java.util.List;

public class MemberImpl implements Member {
	private List<MemberVO> list = new LinkedList<>();

	@Override
	public boolean insertMember(MemberVO vo) {
		if(readMember(vo.getId())!=null) {
			return false;
		}
		
		boolean b = list.add(vo);
		
		return b;
	}

	@Override
	public MemberVO readMember(String id) {
		for(MemberVO vo : list) {
			if(vo.getId().equals(id)) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public boolean deleteMember(String id) {
		MemberVO vo = readMember(id);
		if(vo==null) {
			return false;
		}
		
		list.remove(vo);
		
		return true;
	}

	@Override
	public List<MemberVO> listMember() {
		return list;
	}
}
