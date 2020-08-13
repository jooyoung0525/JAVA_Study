package addresslist;

import java.util.ArrayList;
import java.util.List;



public class AddressImpl implements Address {

	private List<AddressVO> list = new ArrayList<>();
	
	@Override
	public void insertAddress(AddressVO vo) {
		list.add(vo);
	}
	
	
	
	@Override
	public boolean deleteAddress(String name,String phone) {
		
		AddressVO vo  = readAddress(name);
	
		if(vo == null) {
			System.out.println("삭제할 데이터가 없습니다..\n");
			return false;
		}
		
		if(vo.getPhone() == phone) {
			list.remove(vo);
			return true;
		}
		
		System.out.println("삭제할 데이터가 없습니다.\n");
		return false;
	}
	
	
	
	@Override
	public List<AddressVO> listAddress() {
		return list;
	}

	
	
	@Override
	public AddressVO readAddress(String name) {
		
		for(AddressVO vo : list) { //리스트에서 같은 이름있으면 리턴
			if(vo.getName().equals(name)) {
				return vo;
			}
		}
		return null;	
	}
	
	
	

	@Override
	public List<AddressVO> listAddress(String name) {
		List<AddressVO> list2 = new ArrayList<>();
		
		for(AddressVO vo : list2) {
			if(vo.getName().startsWith(name)) { //성씨로도 검색 가능
				list2.add(vo);
			}
		}
		return list2;
	}
	
	
}