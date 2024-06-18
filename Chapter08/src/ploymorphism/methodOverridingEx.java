package ploymorphism;

class Shape{  //상위 클래스 / 슈퍼 클래스
	//멤버변수
	public Shape next;
	//생성자
	public Shape() {
		next = null;
	}
	
	//메서드
	public void draw() {
		System.out.println("Shape");
	}
}	

class Line extends Shape{
	public void  draw() {
		System.out.println("Line");
	}
}
	
class Rect extends Shape{
	public void  draw() {
		System.out.println("Rect");
	}
}
	
class Circle extends Shape{
	public void  draw() {
		System.out.println("Circle");
	}
}
public class methodOverridingEx {
	//오버라이딩 활용
	public static void main(String[] args) {
		Shape start, last, obj;
		//링크드 리스트 구조로 도형 생성하여 연결
		start = new Line(); //1. Line 객체 연결
		last = start;  //last = new Line();
		obj =new Rect();
		last.next = obj; //2. 사각형 객체연결
		
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}
	}

//public class MethodOverridingEx {
//	
//	static void paint(Shape p) {
//		p.draw(); 
//	}
//
//	public static void main(String[] args) {
//		// 다형성 테스트
//		Line line = new Line();  //Shape p 에 넣어줌
//		paint(line);   //Shape p = new line();
//		paint(new Line());  //같은 의미
//		paint(new Rect());
//		paint(new Circle());
//
//	}

}
