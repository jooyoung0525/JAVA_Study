package addr2_teacher;

import java.util.List;

public interface Address {
	public void insertAddress(AddressVO vo);
	public AddressVO readAddress(String name, String tel);
	public List<AddressVO> listAddress();
	public List<AddressVO> listAddress(String name);
	public boolean deleteAddress(String name, String tel);
}
