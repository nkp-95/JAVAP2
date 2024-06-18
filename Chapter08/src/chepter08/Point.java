package chepter08;

public class Point {
	private int x, y;  //한점을 구성하는 멤버 변수 = 인스턴스변수
	
	public Point() {
		this.x = this.y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {  // int showPoint 써도 getter 랑 같음
		System.out.println("(" + x + "," + y + ")");
	}

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
}
