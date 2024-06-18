package chepter08;

public class ColerPointEx {

	public static void main(String[] args) {
		// 점 x, y 를 갖는 Point 클래스와 상속받아 색을 가진 점을 표현하는
		//ColerPoint클래스 테스트
		Point p = new Point();  //Point 객체 생성
		p.set(1, 2);
		p.showPoint();
		
		ColerPoint cp = new ColerPoint();  //하위객체
		cp.set(3, 4);  //상위클래스의 메서드도 호출가능
		cp.setColer("red");
		cp.showColerPoint();

	}

}
