package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
//		double z = x / y;
		 double z = x % y;
		
		// 잘못된 코드
		System.out.println(z + 2); // Infinity 또는 NaN 상태에서 계속해서 연산을 수행하면 안 됨. 어떤 연산을 하더라도 결과는 계속해서 Infinity와 NaN이 되므로 데이터가 엉딩이 될 수 있음.
		
		// 알맞은 코드
		// Double.isInfinite()와 Double.isNaN()를 사용 -> 이렇게 하면 변수값이 Infinity 또는  NaN일 경우 true를, 그렇지 않다면 fasle를 산출!
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가!");
		} else {
			System.out.println(z + 2);
		}

	}

}
