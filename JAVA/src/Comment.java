public class Comment {
	
	//�޼ҵ� -> ����� �� �� �ִ� ���� ���� ����
    //����ȭ �ּ� (�޼ҵ� �տ� �ּ� �ٴµ� ��) --> /**+���� ==>  API���� �� ���� (����)
	//cmdâ > javadoc -use Comment.java > �ش��ο� html���� ���� > ����html �ڵ�����
	
	//ctrl + shift + \ ==> ������ �ּ�����
	//ctrl + shift + / ==> �ּ� �߰�
	
		/**    
		 * ¦������ �Ǻ��ϴ� �޼ҵ�
		 * <p> ������ 2�� ���� �������� 0�̸� ¦���̴�. </p>
		 * @param num     ¦������ �Ǻ��� ��
		 * @return        ¦�� ���θ� ��ȯ <code>boolean</code>
		 */
		
		public boolean isEven (int num) { 
			if(num%2 == 0) {
				return true;
			}
			return false;
		}
}
