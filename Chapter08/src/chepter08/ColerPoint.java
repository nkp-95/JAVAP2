package chepter08;
//Point 를 상속받은 ColerPoint 선언
public class ColerPoint extends Point {
	private String coler; //점의 색 멤버 변수 = 인스턴스
	
	public ColerPoint() {}
	
	public ColerPoint(int x, int y, String Coler) {
		super(x, y);
		this.coler = Coler;
	}
	
	public void setColer(String coler) {
		this.coler = coler;
	}
	
	public void showColerPoint() {
		System.out.print(coler);
		showPoint();  //Point 클래스 showPoint 출력
	}
}
