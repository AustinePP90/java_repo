package ch02.sec03;

public class CharExample {

	public static void main(String[] args) {
		// 문자 타입 char
		char c1 = 'A'; // 문자 저장, 'A' 문자와 매핑되는 숫자: 65로 대입
		// 유니코드가 정수이므로 char 타입도 정수 타임임, 그렇게 때문에 char 변수에 유니코드 숫자를 직접 대입 가능
		char c2 = 65; // 유니코드 직접 저장, A 출력
		char c3 = '가'; // 문자 저장, '가' 문자와 매핑되는 숫자: 44032로 대입 
		char c4 = 44032; // 유니코드 직접 저장, 가 출력

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

//		char c = ''; // 공백 없는 작은 따옴표(') 두 개는 컴파일 에러가 발생
		char c5 = ' '; // 공백 하나를 포함해야 함!
	}

}
