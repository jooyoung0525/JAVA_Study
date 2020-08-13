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
			System.out.println("������ �����Ͱ� �����ϴ�..\n");
			return false;
		}
		
		if(vo.getPhone() == phone) {
			list.remove(vo);
			return true;
		}
		
		System.out.println("������ �����Ͱ� �����ϴ�.\n");
		return false;
	}
	
	
	
	@Override
	public List<AddressVO> listAddress() {
		return list;
	}

	
	
	@Override
	public AddressVO readAddress(String name) {
		
		for(AddressVO vo : list) { //����Ʈ���� ���� �̸������� ����
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
			if(vo.getName().startsWith(name)) { //�����ε� �˻� ����
				list2.add(vo);
			}
		}
		return list2;
	}
	
	
}