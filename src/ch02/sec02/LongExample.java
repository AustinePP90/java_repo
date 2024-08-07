package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		/*
		 * 컴파일러는 정수 리터럴을 int 타입 값으로 간주하기 때문에 에러 발생!(뒤에 소문자 l이나 대문자L을 써서 long 타입 값임을
		 * 컴파일러에게 알려 줘야 한다 , 1000000000000 -> 1000000000000L)
		 */
		long var3 = 100000000000l;
		long var4 = 1000000000000L;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);

	}

}
