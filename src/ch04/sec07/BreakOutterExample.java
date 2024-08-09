package ch04.sec07;

public class BreakOutterExample {

	public static void main(String[] args) {
		// 반목문이 중첩되어 있을 경우 break 문은 가장 가가운 반복문만 종료하고 바깥쪽 반복문은 종료시키지 않는다.
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter; // 바깥쪽 for 문까지 빠져나오도록 바깥쪽 for 문에 Outter라는 라벨을 붙임!
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
