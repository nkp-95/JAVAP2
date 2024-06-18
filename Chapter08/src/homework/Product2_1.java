package homework;

public class Product2_1 {
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
	private int ser = 1200;
	private String sName;
	private String comName;
	private int pay;
	private int num;
	private static int i = 0;
	
	public Product2_1(){
		
	}
	
	public Product2_1(String sName, String comName, int pay) {
		this.sName = sName;
		this.comName = comName;
		this.pay = pay;
		num = ser +=1;
		i++;
		
	}
	
	public String showProductInfo() {
		return num + " " + sName + " " + comName + " " + pay;
	}
	
	public void showCustomer2Info() {
		System.out.println(num + " " + sName + " " + comName + " " + pay);
	}
	public int getSer() {
		return ser;
	}

	public void setSer(int ser) {
		this.ser = ser;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	
	
	
	
	
	
	
}
