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
		System.out.println("����Ϸ�...");
	}
}

class User implements Comparable<User>{ //Comparable�� Comparator�� �ٸ�!
	
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
		
		return -(getTot()-o.getTot()); //�������� ����
	}
	
	
}

class Pass1{
	
	private List<User>list = new LinkedList<>();
	private String readname = "user2.txt";
	private String savename = "pass.txt";
	
	
	public void loadFile() {
		//user.txt ������ �о list�� �����Ѵ�.
		File file = new File(readname);
		
		if(!file.exists())return;
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))){ //���� ������ ���پ� �о��.
			String s;
			while((s = br.readLine())!=null) { //�о�� ������ ������
				String[] ss = s.split(","); //,�� �������� �ɰ���.
				if(ss.length != 4) {//��Ʈ���� ���̰� 4���ƴϸ� �ٽ� �о�´�.
					continue;
				}
				
				User us = new User();
				us.setName(ss[0]);
				us.setKor(Integer.parseInt(ss[1]));
				us.setMat(Integer.parseInt(ss[2]));
				us.setEng(Integer.parseInt(ss[3]));
				
				list.add(us);
			}
		} catch (EOFException e) { //��¾��� �����̾����� ��� �߻�.
			// ObjectInputStream�� ���̻� ���� �����Ͱ� ������
			// EOFException ���ܰ� �߻�
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void saveFile() {
		//pass.txt ���Ͽ� users�� ����� �����͸� �����Ѵ�.
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
			System.out.println("���� ���� �Ϸ�...");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected List<User>passUser(){
		//�հ��ڸ� users�� ���� ==> ��� ���� 40�� �̻�, ��� 60 �� �̻�
		List<User>users = new LinkedList<User>();
	
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
		
		for(User u : list) {
			//System.out.println(u.getTot()+" "+u.getEng()+" "+u.getKor()+" "+ u.getMat());
			if(u.getTot()>=60 && u.getEng()>=40 && u.getKor()>=40 && u.getMat()>=40) {
				users.add(u);
			}
		}
		
		return users;
	}
}