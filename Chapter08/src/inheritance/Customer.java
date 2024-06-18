package inheritance;

public class Customer {
	//멤버변수
	protected int customerID;  //고객 아이디
	protected String customerName; //고객이름
	protected String customerGrade; //고객 등급
	int bonusPoint;		//보너스 포인트
	double bonusRatio;  //적립비율
	
	//생성자
//	public Customer() {
////		System.out.println("기본 생성자 호출");
//		customerGrade = "SILVER";  //기본등급
//		bonusRatio = 0.01;    //보너스 포인트 기본 등급
//		System.out.println("Customer() 생성자 호출");
//	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
//		System.out.println("Customer() 생성자 호출");
	}
	
	
	//메서드
	// 가격 계산 메서드
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);   //보너스 포인트 계산
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + 
				"이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
}
