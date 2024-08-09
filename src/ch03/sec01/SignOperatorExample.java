package ch03.sec01;

public class SignOperatorExample {

	public static void main(String[] args) {
//		byte b = 100;
//		byte result = -b; // 컴파일 에러, 정수 타입(byte short, int) 연산의 결과는 int 타입임. 부호를 변경하는 것도 연산이므로 int 타입 변수에 대입 해야함. -> int result = -b;
		
		
		int x = -100;
		x = -x;
		System.out.println("x: " + x);
		
		byte b = 100;
		int y = -b;
		System.out.println("y: " + y);
		
		System.out.println("x + y: " + (x + y));
	}

}
