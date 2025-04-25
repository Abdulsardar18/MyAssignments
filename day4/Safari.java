package week2.day4;

public class Safari extends Browser{
	public void readerMode() {
		 System.out.println("Reader mode");
}
	public void fullScreenMode() {
		 System.out.println("fullScreenMode");
	}
	public static void main(String[]args) {
		Safari obj2 = new Safari();
		obj2.browserName="Safari";
		obj2.broswerVersion=115;
		
		System.out.println("browserName:"+obj2.browserName);
		System.out.println("browserVersion:"+obj2.broswerVersion);
		obj2.openURL();
		obj2.navigateBack();
		obj2.readerMode();
		obj2.fullScreenMode();
		obj2.CloseBrowser();
		
		
}
}