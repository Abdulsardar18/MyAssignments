package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int input = 1121;
		int output = 0;
		
		for (int i = input ; i>0; i = i/10) {
			int rem = i % 10;
			output = (output*10) + rem;
		}
		if (input == output) {
			System.out.println("The value given is a Palindrome");
		}
		else
		{
			System.out.println("The value given is not a Palindrome");
		}
 
	
		
	}

}
 