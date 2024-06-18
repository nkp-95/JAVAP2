package homework;

import java.util.ArrayList;

public class Product2_2 {

	public static void main(String[] args) {
		Product2_1 product1 = new Product2_1("새우깡", "농심(주)", 1900);
		Product2_1 product2 = new Product2_1("빼빼로", "롯데제과", 2200);
		Product2_1 product3 = new Product2_1("먹태깡", "농심(주)", 2500);
		
		System.out.println("출고리스트");
		System.out.println(product1.showProductInfo());
		System.out.println(product2.showProductInfo());
		System.out.println(product3.showProductInfo());
		System.out.println("=======================================");
		System.out.printf("출고상품 %d건", Product2_1.getI());
		
		System.out.println();
		System.out.println();
		
		ArrayList<Product2_1> snack = new ArrayList<Product2_1>(); //= A a =new A
		
		snack.add(new Product2_1("새우깡", "농심(주)", 1900)); // a.add(new A( @@,@@,@@)); 
		snack.add(new Product2_1("빼빼로", "롯데제과", 2200));
		snack.add(new Product2_1("먹태깡", "농심(주)", 2500));
		
		for(Product2_1 P : snack) {//for(A 임의단어: a){ 임의단어.show@@Info();}
			P.showCustomer2Info();
		}
		System.out.println("______________________");
		System.out.printf("출고상품 %d건", Product2_1.getI());  //같은 클래스로 돌려서 6번 나옴
		
	}

}
