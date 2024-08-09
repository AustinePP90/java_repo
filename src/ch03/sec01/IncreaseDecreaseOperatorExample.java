package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
//		int x = 1;
//		int y = 1;
//		int result1 = ++x + 10; -> x를 1 증가 -> int result1 = 2 + 10;
//		int result2 = y++ + 10; -> int result2 = 1 + 10; -> y를 1 증가;
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x= " + x);
		
		System.out.println("-----------------------------------");
		y--;
		--y;
		System.out.println("y= " + y);
		
		System.out.println("-----------------------------------");
		z= x++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("-----------------------------------");
		z = ++x;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("-----------------------------------");
		z = ++x + y++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);

	}

}
