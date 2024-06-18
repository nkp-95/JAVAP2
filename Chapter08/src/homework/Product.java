package homework;




	
	


public class Product {
			/*
			 * 일련번호 1씩 증가(1200부터) ,상품명 제조사 가격
			 * 생성된 제품수 
			 * 
			 * 일련번호 static variable 을 이용해서 상품 생성될때 1200부터 1씩 증가
			 * 
			 * instance variable은 private멤버로 선언
			 * instance variable의 초기화 생성자 이용
			 * getter setter 이용
			 * 
			 * 예
			 *  출고 리스트
			 *  1200 새우깡 농심(주) 1900원
			 *  1201 빼빼로 롯데제과 2200원
			 *  1202 먹태깡 농심(주) 2500원
			 *  ------------------------
			 *  출고상품 3건
			 */
	private static int skID = 1200;
	private String skName;
	private String comName;
	private int price;
	private static int i = 0;
	private int num;
	
	public Product() {
		
	}
	//생성자
	public Product(String skName, String comName, int price) {
		
		this.skName = skName;
		this.comName = comName;
		this.price = price;
		num = skID++;
		i++;
	}
	//메서드
	public String showCustomerInfo() {   //show 전송 
		return num + "\t" + skName + 
				"\t" + comName + "\t" + price;// 출력 할때 System.out.println없이 하려면 
	}										  //public void show@@Info(){ System.out.println;} 설정

	public static int getSkID() {   //getter
		return skID;
	}

	public static void setSkID(int skID) {  //setter
		Product.skID = skID;
	}

	public String getSkName() {
		return skName;
	}

	public void setSkName(String skName) {
		this.skName = skName;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getI() {
		return i;
	}

	public static void setI(int i) {
		Product.i = i;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	
}

