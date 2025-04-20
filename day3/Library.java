package week1.day3;

public class Library {

	String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		
		Library obj1=new Library();
		//obj1.addBook("Java");
		//String a=obj1.addBook("Java");
		//System.out.println(a);
		System.out.println("Book name is :"+ obj1.addBook("Java"));
		
		obj1.issueBook();

	}

}
