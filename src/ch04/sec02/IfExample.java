package ch04.sec02;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90보다 크네?!");
			System.out.println("등급은 A!");
		}

		if (score < 90)
			System.out.println("점수가 90보다 작아!"); // 중괄호 블록 내에 실행문이 하나밖에 없다면 중괄호를 생략할 수 있음!
			System.out.println("등급은 B!"); // 중괄호 밖에서 작성한 실행문이라서 if문과는 상관없음!

	}

}
