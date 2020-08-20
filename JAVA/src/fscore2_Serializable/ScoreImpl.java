package fscore2_Serializable;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ScoreImpl implements Score {

	private List<ScoreVO> list = new ArrayList<>();
	private String pathname = "score2.txt";

	public ScoreImpl() { // ������
		loadFile(); // ������ ���ÿ� ������ �о�ͼ� List�� ����.
	}

	@Override
	public void insertScore(ScoreVO vo) {
		list.add(vo);
	}

	@Override
	public boolean deleteScore(String hak) {
		ScoreVO vo = readScore(hak);
		if (vo == null) {
			return false;
		}

		list.remove(vo);
		return true;
	}

	@Override
	public List<ScoreVO> listScore() {
		return list;
	}

	@Override
	public ScoreVO readScore(String hak) {
		for (ScoreVO vo : list) {
			if (vo.getHak().equals(hak)) {
				return vo;
			}
		}

		return null;
	}

	@Override
	public void saveFile() {
		File file = new File(pathname);
		
		ObjectOutputStream oos = null;
		try {
			// ���� : ObjectOutputStream�� ������ ��, ù�ٿ� Ŭ�������� �����Ѵ�.
			// ���� ������ append�� �����ϸ� �����Ҷ����� Ŭ�������� ��� �߰��Ǿ� ������ �о� ���� �� ����.
			// ��, ObjectOutputStream�� append�� ��ü���� �Ұ�
			// ������ ��ü�� ����ȭ�ؾ���.
			oos = new ObjectOutputStream(new FileOutputStream(file));
			
			for(ScoreVO vo : list) {
				oos.writeObject(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(oos!= null) {
				try {
					oos.close();
				} catch (Exception e2) {
				}
			}
		}

	}

	protected void loadFile() {

		File file = new File(pathname);

		if (!file.exists()) {
			return;
		}
		
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			
			while(true) {
				ScoreVO vo = (ScoreVO)ois.readObject();
				list.add(vo);
			}
		} catch (EOFException e) { //��¾��� �����̾����� ��� �߻�.
			// ObjectInputStream�� ���̻� ���� �����Ͱ� ������
			// EOFException ���ܰ� �߻�
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			
		}catch (Exception e) {
			
		} finally {
			if(ois != null) {
				try {
					ois.close();
				} catch (Exception e2) {
				}
			}
		}

	}
}
