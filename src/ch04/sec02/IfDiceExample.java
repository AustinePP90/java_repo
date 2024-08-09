package ch04.sec02;

public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6 + 1); // 주사위 번호 하나 뽑기 코드

		if (num == 1) {
			System.out.println("1번 등장!");

		} else if (num == 2) {
			System.out.println("2번 등장!");
		} else if (num == 3) {
			System.out.println("3번 등장!");

		} else if (num == 4) {
			System.out.println("4번 등장!");

		} else if (num == 5) {
			System.out.println("5번 등장!");
		} else
			System.out.println("6번 등장!");
	}

}
