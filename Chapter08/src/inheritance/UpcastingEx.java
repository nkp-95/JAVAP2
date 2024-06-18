package inheritance;

public class UpcastingEx {

	public static void main(String[] args) {
		//업캐스팅 예제 가시성
		Person person;  //상위클래스로 형 변환  /다운캐스팅은 상위클래스에서 하위클래스로 변환
		Student student = new Student("이재문");
		person = student;   //upcasting
		//Person person = new Student("이재문"); 이랑 같은 뜻
		
		
		System.out.println(person.name);  //오류없음
		
		//person.grade = "1학년";  //컴파일 오류
		//person.depertment = "Computer";
	}

}
