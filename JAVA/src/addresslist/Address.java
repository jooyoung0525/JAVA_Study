package addresslist;

import java.util.List;

public interface Address {
	public void insertAddress(AddressVO vo);
	public boolean deleteAddress(String name,String phone);
	public List<AddressVO> listAddress();
	public AddressVO readAddress(String name);
	public List<AddressVO> listAddress(String name);
	
}
