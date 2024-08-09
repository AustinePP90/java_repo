package ch04.sec03;

public class SwitchExpressionsExample {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {
		case 'A', 'a' -> {
			System.out.println("우수 회원, 삐빅!");
		}
		case 'B', 'b' -> {
			System.out.println("일반 회원, 삐빅!");
		}
		default -> {
			System.out.println("손놈...");
		}
		}

		// 중괄호 안에 실행문이 하나만 있을 경우에는 중괄호를 생랼할 수 있다.
		switch (grade) {
		case 'A', 'a' -> System.out.println("우수 회원, 삐빅!");
		case 'B', 'b' -> System.out.println("일반 회원, 삐빅!");
		default -> System.out.println("손놈...");

		}
	}

}
