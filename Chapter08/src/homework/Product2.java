package homework;

public class Product2 {

	public static void main(String[] args) {
		
		Product product1 = new Product("새우깡", "농심(주)", 1900);
		Product product2 = new Product("빼빼로", "롯데제과", 2200);
		Product product3 = new Product("먹태깡", "농심(주)", 2500);
		
		System.out.println("출고리스트");
		System.out.println(product1.showCustomerInfo());
		System.out.println(product2.showCustomerInfo());
		System.out.println(product3.showCustomerInfo());
		System.out.println("_____________________");
		System.out.printf("출고상품 %d건", Product.getI());
	}

}
