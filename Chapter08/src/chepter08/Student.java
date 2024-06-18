package chepter08;

public class Student extends Person {
	//메서드
	public void set() {// 아무것도 없어도 extends로 상속 받아서 사용 가능
		//weight = 75;  //private 은 외부 접근 불가
		setWight(99); 
		age = 30;  //같은 폴더 디폴트는 접근 가능
		name = "홍길동";//퍼블릭은 모두 접근 가능
		height = 175; //상위 클래스 prodected는 같은 폴더에서 접근 가능, 
						// 폴더여도 자식이면 접근 가능
		
	}
}
