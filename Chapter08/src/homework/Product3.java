package homework;

import java.util.ArrayList;

public class Product3 {

	public static void main(String[] args) {
		
		ArrayList<Product_1> snack = new ArrayList<Product_1>();
		
		snack.add(new Product_1("새우깡", "농심(주)", 1900));
		snack.add(new Product_1("빼빼로", "롯데제과", 2200));
		snack.add(new Product_1("먹태깡", "농심(주)", 2500));
		
		
		System.out.println("출고리스트");
		
		for(Product_1 p: snack) {
//			System.out.println(p.showCustomerInfo());
			p.showCustomerInfo();
		}
		System.out.println();
		
		System.out.println("_____________________");
		System.out.printf("출고상품 %d건", Product.getI());
	}

}
