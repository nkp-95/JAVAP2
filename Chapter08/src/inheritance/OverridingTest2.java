package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		// 클래스 형변환(upcasting)과 재정의 메서드 호출 실습
		
		
		Customer customerKim = new VIPCustomer(10030, "나몰라", 2000);  //상위 클래스 타입로 해도 자식 클래스로 재정의 해놓으면 자식 클래스 동작
		customerKim.bonusPoint = 1000;
		System.out.println(customerKim.getCustomerName() + " 님이 지불해야 하는 금액은 " + 
				customerKim.calcPrice(10000) + "입니다");
	}

}
