package fscore1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ScoreImpl implements Score {

	private List<ScoreVO> list = new ArrayList<>();
	private String pathname = "score.txt";

	public ScoreImpl() { //������
		loadFile(); //������ ���ÿ� ������ �о�ͼ� List�� ����.
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
		
		//PrintStream: ���� ��Ʈ������ ��¿� ���� ���� ���� �޼ҵ带 ������ �ִ�.
		//System.out �� PrintStream�� ��ü��.
		try (PrintStream ps = new PrintStream(new FileOutputStream(file))){
			for(ScoreVO vo : list) {
				ps.print(vo.getHak()+",");
				ps.print(vo.getName()+",");
				ps.print(vo.getKor()+",");
				ps.print(vo.getEng()+",");
				ps.print(vo.getMat()+"\n");
			}
			System.out.println("���� ���� �Ϸ�...");
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

	protected void loadFile() {

		File file = new File(pathname);

		if (!file.exists()) {
			return;
		}

		// br�� �ڵ� close
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String s;
			while ((s = br.readLine()) != null) {
				String[] ss = s.split(",");
				if (ss.length != 5) {
					continue;
				}

				ScoreVO vo = new ScoreVO();

				vo.setHak(ss[0]);
				vo.setName(ss[1]);
				vo.setKor(Integer.parseInt(ss[2]));
				vo.setEng(Integer.parseInt(ss[3]));
				vo.setMat(Integer.parseInt(ss[4]));
				// ������ ������ �о� ��� ArrayList�� ����.
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
