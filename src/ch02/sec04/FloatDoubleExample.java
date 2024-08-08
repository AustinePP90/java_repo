package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// 컴파일러는 실수 리터럴을 기본적으로 double 타입으로 해석, float 타입에 대입하고 싶다면 리터럴 뒤에 소문자 'f'나 대문자 'F'를 붙여야 함!
		double varD = 3.14;
		float varF = 3.14f; // float varF = 3.14F;
		System.out.println(varD);
		System.out.println(varF);
		
		// 정밀도 확인
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);

		// 10의 거듭제곱 리터럴
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3; // 2.0 * 10의 -3승(-1000)
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
	}

}
