package inheritance;

public class VIPCustomer extends Customer{
	//멤버변수
	private int agentID; //VIP고객 담당 상담원 아이디
	double saleRatio; //할인율
	
	//생성자
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);    //기본생성자 있을땐 없어도 가능   //파라미터 없어야 가능
		customerGrade = "VIP";  //고객 등급
		bonusRatio = 0.05;    //0.01 -> 0.05
		saleRatio = 0.1;
		this.agentID = agentID;
//		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	//오버라이딩 메서드
	// 가격 계산 메서드
	@Override       //타입변경 X
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);   //보너스 포인트 계산
		return price - (int)(price * saleRatio);
	}
	/*
	 * 참고 애노테이션
	 * @Override, @FunctionalInterface  <-주로 쓰는 것
	 * @Deprecated, @SuppressWarnings
	 */
	public int getAgentID() {
		return agentID;
	}
	
	public String ShowVIPInfo() {
		//상위 클래스의 멤버변수나 메서드를 참조하는 super
		return super.showCustomerInfo() + 
				"담당 상담원 아이디는 " + agentID + "입니다.";
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + 
				"이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
}
