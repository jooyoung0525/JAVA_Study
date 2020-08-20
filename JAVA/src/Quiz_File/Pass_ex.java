package Quiz_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Pass_ex {
	public static void main(String[] args) {
		Pass P = new Pass();
		
		P.loadFile();
		P.saveFile();
		System.out.println("저장완료...");
	}
}

class User1 implements Comparable<User1>{ //Comparable과 Comparator은 다름!
	
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
	
	public int getTot(){
		return kor+eng+mat;
	}
	
	
	@Override
	public int compareTo(User1 o) {
		
		return -(getTot()-o.getTot()); //내림차순 정렬
	}
	
	
}

class Pass{
	
	private List<User1>list = new LinkedList<>();
	
	private String savename = "pass.txt";
	
	
	public void loadFile() {
		//user.txt 파일을 읽어서 list에 저장한다.
		String readname = "user2.txt";
		BufferedReader br = null;
		
		File file = new File(readname);
		
		if(!file.exists())return;
		
		try { 
			//파일 내용을 한줄씩 읽어옴.
			br = new BufferedReader(new FileReader(file));
			String s;
			
			while((s = br.readLine())!=null) { 
				String[] ss = s.split(","); 
				if(ss.length != 4) {
					continue;
				}
				
				User1 us = new User1();
				us.setName(ss[0]);
				us.setKor(Integer.parseInt(ss[1]));
				us.setMat(Integer.parseInt(ss[2]));
				us.setEng(Integer.parseInt(ss[3]));
				
				list.add(us);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		} catch (Exception e) {
			
		}finally{
		 if(br != null) {
			 try {
				br.close();
			} catch (Exception e2) {
				
			}
		 }
		}
	}
	
	
	public void saveFile() {
		//pass.txt 파일에 users에 저장된 데이터를 저장한다.
		List<User1>users = passUser();
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("pass.txt"));
			for(User1 us : users) {
				bw.write(us.getName()+",");
				bw.write(us.getKor()+",");
				bw.write(us.getEng()+",");
				bw.write(us.getMat()+",");
				bw.write(us.getTot()+"\n");
			}
			System.out.println("파일 저장 완료...");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (Exception e2) {
				
				}
			}
		}
	}
	
	protected List<User1>passUser(){
		//합격자를 users에 저장 ==> 모든 과목 40점 이상, 평균 60 점 이상
		List<User1>users = new LinkedList<User1>();
	
		//users에 저장된 데이터를 총점 내림차순으로 정렬.
		Collections.sort(list);
		
		/*
		 Comparator<User> com = new Comparator<User>(){
			 @Override
			 public int compare(User o1, User o2){
			 	return -(o1.getTot()-o2.getTot());
			 }
		 };
		 */
		
		for(User1 u : list) {
			//System.out.println(u.getTot()+" "+u.getEng()+" "+u.getKor()+" "+ u.getMat());
			if(u.getTot()>=60 && u.getEng()>=40 && u.getKor()>=40 && u.getMat()>=40) {
				users.add(u);
			}
		}
		
		return users;
	}
}