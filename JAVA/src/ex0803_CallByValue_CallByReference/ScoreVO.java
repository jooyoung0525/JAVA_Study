package ex0803_CallByValue_CallByReference;

/*
 * - 속성
 *   이름, 국, 영, 수 , 총, 평균
 *   => 최대 50명
 *   
 * - 기능
 * 1. 입력
 * 2. 출력
 * 3. 검색  
 *  
 * */

//VO ->value object :한사람의 자료를 저장하는 것.

public class ScoreVO {
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
	
	
	//총점
	public int getTot() {
		return kor+eng+mat;
	}
	
	//평균
	public int getAvg() {
		return getTot()/3;
	}
	
	
}
