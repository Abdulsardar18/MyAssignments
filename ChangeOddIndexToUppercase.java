package week2.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String Test="changeme";
		//Convert the given String to a character array
		char[]Array=Test.toCharArray();	
		//System.out.println(Array.length);
	
		// Using a for loop to iterate from the end to the beginning
		for(int i =0;i<Array.length;i++) {
		// to find odd index within the loop
		if(i%2!=0) {
		
		//change the character to uppercase only if the index is odd	
			Array[i] = Character.toUpperCase(Array[i]);
		}
		System.out.println("characters with the expected output:"+new String(Array));
		
		}	
		
	}

}
