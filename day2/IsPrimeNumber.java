package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int number=3;
		boolean flag= false;
		for(int i=2;i<=number-1;i++) {
			if(number%2==0) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("non-prime");
		} else {
			System.out.println("prime");
		}
	}

}
