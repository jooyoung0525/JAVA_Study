package member_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MemberImpl implements Member {

	private Map<String,MemberVO>map = new LinkedHashMap<>();
	
	@Override
	public boolean insertInfo(String Id, MemberVO vo) {
		
		if(map.containsKey(Id)) {
			return false;
		}
		map.put(Id,vo);
		return true;
	}

	@Override
	public boolean deleteInfo(String Id, MemberVO vo) {
		if(!map.containsKey(Id)) {
			return false;
		}
		map.remove(Id);
		return true;
	}

	@Override
	public MemberVO readMember(String Id) {
		
		MemberVO vo = map.get(Id);
		
		return vo;
	}

	@Override
	public Map<String, MemberVO> listMember() {
	
		return map;
	}
	
	
}
