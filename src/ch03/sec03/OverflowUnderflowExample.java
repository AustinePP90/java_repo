package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
//		byte 타입 범위: -128 ~ 127

		byte var1 = 125;
		for (int i = 0; i < 5; i++) { // 5번 반복 실행
			var1++; // ++ 연산은 var1의 값을 1 증가시킴
			System.out.println("var1: " + var1);
		}

		System.out.println("---------------------------------");

		byte var2 = -125;
		for (int i = 0; i < 5; i++) { // 5번 반복 실행
			var2--; // -- 연산은 var2의 값을 1 감소시킴
			System.out.println("var2: " + var2);
		}

		// 연산 과정에서 int 타입에서 오버플로우 또는 언더플로우가 발생될 가능성이 있다면 long 타입으로 연산을 하자!
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z); // z: -727379968, 오버플로우 발생!, long 타입으로 연산 하자!
		long x2 = 1000000;
		long y2 = 1000000;
		long z2 = x2 * y2;
		System.out.println(z2); // z: 1000000000000;
	}

}
