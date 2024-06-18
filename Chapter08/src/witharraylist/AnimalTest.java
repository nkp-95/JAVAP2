package witharraylist;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 활짝 펴고 멀리 날라갑니다.");
	}
}

public class AnimalTest {
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList) {
			ani.move();
		}
	}
	
	public void testCasting() {
		for(int i=0; i<aniList.size(); i++) {
			Animal ani = aniList.get(i);
			if(ani instanceof Human) {
			Human h = (Human)ani;
			h.readBook();
			}else if(ani instanceof Tiger) {
			Tiger t = (Tiger)ani;
			t.hunting();
			}else if(ani instanceof Eagle) {
				Eagle h = (Eagle)ani;
				h.flying();
				}else {
					System.out.println("지원되지 않는 타입 입니다.");
				}
		}
	}
	
	public static void main(String[] args) {
		// 다형성과 다운캐스팅 연습
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		
		System.out.println("다운캐스팅 테스트");
		aTest.testCasting();

	}
	
	

}
