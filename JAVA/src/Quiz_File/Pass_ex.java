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
		System.out.println("����Ϸ�...");
	}
}

class User1 implements Comparable<User1>{ //Comparable�� Comparator�� �ٸ�!
	
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
		
		return -(getTot()-o.getTot()); //�������� ����
	}
	
	
}

class Pass{
	
	private List<User1>list = new LinkedList<>();
	
	private String savename = "pass.txt";
	
	
	public void loadFile() {
		//user.txt ������ �о list�� �����Ѵ�.
		String readname = "user2.txt";
		BufferedReader br = null;
		
		File file = new File(readname);
		
		if(!file.exists())return;
		
		try { 
			//���� ������ ���پ� �о��.
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
		//pass.txt ���Ͽ� users�� ����� �����͸� �����Ѵ�.
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
			System.out.println("���� ���� �Ϸ�...");
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
		//�հ��ڸ� users�� ���� ==> ��� ���� 40�� �̻�, ��� 60 �� �̻�
		List<User1>users = new LinkedList<User1>();
	
		//users�� ����� �����͸� ���� ������������ ����.
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