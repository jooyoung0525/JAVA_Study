package Quiz_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class PassApp {
	public static void main(String[] args) {
		PassService p = new PassService();
		
		p.loadFile();
		p.saveFile();
		System.out.println("합격자 저장 완료...");
	}
}

class UserVO {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return kor+eng+mat;
	}
}


class PassService {
	private List<UserVO> list=new LinkedList<>();
	
	public void loadFile() {
		// user.txt 파일을 읽어서 list에 저장한다.
		String pathname="user.txt";
		BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader(pathname));
			String s;
			
			while((s=br.readLine())!=null) {
				String[] ss=s.split(",");
				if(ss.length!=4) {
					continue;
				}
				
				UserVO vo=new UserVO();
				vo.setName(ss[0]);
				vo.setKor(Integer.parseInt(ss[1]));
				vo.setEng(Integer.parseInt(ss[2]));
				vo.setMat(Integer.parseInt(ss[3]));

				list.add(vo);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(br!=null) {
				try {
					br.close();
				} catch (Exception e2) {
				}
			}
		}
		
	}
	
	public void saveFile() {
		List<UserVO> users = passUser();
		
		// pass.txt 파일에 users에 저장된 데이터를 저장한다.
		BufferedWriter bw=null;
		try {
			bw=new BufferedWriter(new FileWriter("pass.txt"));
			for(UserVO vo : users) {
				bw.write(vo.getName()+",");
				bw.write(vo.getKor()+",");
				bw.write(vo.getEng()+",");
				bw.write(Integer.toString(vo.getMat()));//마지막은 문자열로 변경안하면 아스키코드로 출력
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(bw!=null) {
				try {
					bw.close();
				} catch (Exception e2) {
				}
			}
		}
		
	}

	public void saveFile2() {
		List<UserVO> users = passUser();
		
		// pass.txt 파일에 users에 저장된 데이터를 저장한다.
		PrintStream ps=null;
		try {
			ps=new PrintStream(new FileOutputStream("pass.txt"));
			for(UserVO vo : users) {
				ps.print(vo.getName()+",");
				ps.print(vo.getKor()+",");
				ps.print(vo.getEng()+",");
				ps.print(vo.getMat()+"\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (Exception e2) {
				}
			}
		}
		
	}
	
	protected List<UserVO> passUser() {
		List<UserVO> users=new LinkedList<>();
		
		// list에 저장된 데이터 중 합격자를 users에 저장
		// 각과목 40점이상, 평균 60점이상
		int ave;
		for(UserVO vo : list) {
			ave = vo.getTot()/3;
			if(vo.getKor()>=40&&vo.getEng()>=40&&vo.getMat()>=40&&ave>=60) {
				users.add(vo);
			}
		}
		
		// users에 저장된 데이터를 총점 내림차순으로 정렬
		Comparator<UserVO> comp=new Comparator<UserVO>() {
			@Override
			public int compare(UserVO o1, UserVO o2) {
				return -(o1.getTot()-o2.getTot());
			}
		};
		Collections.sort(users, comp);
		
		return users;
	}
}
