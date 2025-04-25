package week2.day4;

public class chrome extends Browser{
 
	public void openincognito() {
		System.out.println("incognito mode");
	}
	
	public void cacheClr() {
		System.out.println("cacheClr");
	}
	public static void main(String[]args) {
		chrome obj = new chrome();
		obj.browserName="Chrome";
		obj.broswerVersion=138;	
		System.out.println("browserName:"+obj.browserName);
		System.out.println("broswerVersion:"+obj.broswerVersion);
		obj.openURL();
		obj.openincognito();
		obj.navigateBack();
		obj.cacheClr();
		obj.CloseBrowser();
		

	}
}
