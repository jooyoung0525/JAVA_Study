package Quiz_File;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Pass_teacher {
	public static void main(String[] args) {
		Pass P = new Pass();
		
		P.loadFile();
		P.saveFile();
		System.out.println("저장완료...");
	}
}

class User implements Comparable<User>{ //Comparable과 Comparator은 다름!
	
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
	public int compareTo(User o) {
		
		return -(getTot()-o.getTot()); //내림차순 정렬
	}
	
	
}

class Pass1{
	
	private List<User>list = new LinkedList<>();
	private String readname = "user2.txt";
	private String savename = "pass.txt";
	
	
	public void loadFile() {
		//user.txt 파일을 읽어서 list에 저장한다.
		File file = new File(readname);
		
		if(!file.exists())return;
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))){ //파일 내용을 한줄씩 읽어옴.
			String s;
			while((s = br.readLine())!=null) { //읽어올 정보가 있으면
				String[] ss = s.split(","); //,을 기준으로 쪼갠다.
				if(ss.length != 4) {//스트링의 길이가 4가아니면 다시 읽어온다.
					continue;
				}
				
				User us = new User();
				us.setName(ss[0]);
				us.setKor(Integer.parseInt(ss[1]));
				us.setMat(Integer.parseInt(ss[2]));
				us.setEng(Integer.parseInt(ss[3]));
				
				list.add(us);
			}
		} catch (EOFException e) { //출력안함 파일이없으면 계속 발생.
			// ObjectInputStream은 더이상 읽을 데이터가 없으면
			// EOFException 예외가 발생
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void saveFile() {
		//pass.txt 파일에 users에 저장된 데이터를 저장한다.
		List<User>users = passUser();
		
		File file = new File(savename);
		try(PrintStream ps = new PrintStream(new FileOutputStream(file))) {
			for(User us : users) {
				ps.print(us.getName()+",");
				ps.print(us.getKor()+",");
				ps.print(us.getEng()+",");
				ps.print(us.getMat()+",");
				ps.print(us.getTot()+"\n");
			}
			System.out.println("파일 저장 완료...");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected List<User>passUser(){
		//합격자를 users에 저장 ==> 모든 과목 40점 이상, 평균 60 점 이상
		List<User>users = new LinkedList<User>();
	
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
		
		for(User u : list) {
			//System.out.println(u.getTot()+" "+u.getEng()+" "+u.getKor()+" "+ u.getMat());
			if(u.getTot()>=60 && u.getEng()>=40 && u.getKor()>=40 && u.getMat()>=40) {
				users.add(u);
			}
		}
		
		return users;
	}
}