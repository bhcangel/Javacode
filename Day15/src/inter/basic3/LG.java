package inter.basic3;

public class LG implements Printed{

	public void turnOn() {
		
		System.out.println("Life is good");
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("Life is good");
		System.out.println("전원을 끕니다.");
		
	}

	public void print(String document) {
		System.out.println("Life is good");
		System.out.println("문서내용 : " + document);
	}

	public void colorPrint(String document, String color) {
		System.out.println("Life is good");
		System.out.println("문서내용 : " + document);
		System.out.println("색상 : " + color);
	}

	public int copy(int n) {
		System.out.println("Life is good");
		System.out.println(n + "장 복사");
		return n;
	}

}
