package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		// 산술 연산을 정확하게 계산하고 싶다면 실수 타입을 사용하지 말자!
		int apple = 1; // 사과 1개
		double pieceUnit = 0.1; // 사과 1개를 0.1 단위의 10조각 
		int number = 7;
		
		double result = apple - number*pieceUnit; // 사과 1개에서 사과 0.7조각을 뺌 -> 0.3조각을 result 변수에 저장
		System.out.println("사과 1개에서 남은 양: " + result);
		// AccuracyExample2로 이어짐---------------------------------------------------------------------
	}

}
