package member_map;

import java.util.Map;

public interface Member {
 public boolean insertInfo(String Id,MemberVO vo);
 public boolean deleteInfo(String Id, MemberVO vo);
 public MemberVO readMember(String Id);
 public Map<String,MemberVO> listMember();
}
