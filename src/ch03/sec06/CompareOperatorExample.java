package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);

		// 피연산자의 타입이 다를 경우에는 비교 연산을 수행하기 전에 타입을 일치시킴.
		// ex) 'A' == 65는 'A'가 int 타입으로 변환되어 65가 된 다음 65 == 65로 비교됨.
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2); // 65 < 66
		System.out.println("result4: " + result4);

		// ex) 3 == 3.0은 3을 double 타입인 3.0으로 변환한 다음 3.0 == 3.0으로 비교함.
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4);
		System.out.println("result5: " + result5);

		// ex) 0.1f == 0.1은 예외!, 부동 소수점 방식을 사용하는 실수 타입은 0.1을 정확히 표현할 수 없을 뿐만 아니라 float
		// 타입과 double 타입의 정밀도 차이가 남!
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 == (float) num6); // 피연산자를 float 타입으로 강제 타입 변환 후에 비교 연산을 하면 됨!
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);

		// 문자열을 비교할 때에는 equals()와 !equals()를 사용
		String str1 = "짜바";
		String str2 = "Java";
		boolean result8 = (str1.equals(str2));
		boolean result9 = (!str1.equals(str2));
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
	}
}
