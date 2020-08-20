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

	public ScoreImpl() { // 생성자
		loadFile(); // 생성과 동시에 정보를 읽어와서 List에 저장.
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
			// 주의 : ObjectOutputStream은 저장할 떄, 첫줄에 클래스명을 저장한다.
			// 따라서 파일을 append로 저장하면 저장할때마다 클래스명이 계속 추가되어 파일을 읽어 들일 수 없다.
			// 즉, ObjectOutputStream은 append로 객체생성 불가
			// 저장할 객체는 직렬화해야함.
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
		} catch (EOFException e) { //출력안함 파일이없으면 계속 발생.
			// ObjectInputStream은 더이상 읽을 데이터가 없으면
			// EOFException 예외가 발생
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
