package ch04.sec02;

public class IfElseExample {

	public static void main(String[] args) {
		int score = 85;

		if (score >= 90) {
			System.out.println("점수가 90보다 크네?!");
			System.out.println("등급은 A!");
		} else { // score < 90일 경우를 의미
			System.out.println("점수가 90보다 작아!");
			System.out.println("등급은 B!");
		}

	}

}
