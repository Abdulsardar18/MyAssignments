package week2.day4;

public class Edge extends Browser {
 public void takeSnap() {
	 System.out.println("Snap taken");
 }
 public void clearCookies() {
	 System.out.println("clearCookies");
 }
 public static void main(String[]args) {
	 Edge obj = new Edge();
	 obj.browserName="Edge";
		obj.broswerVersion=159;
		System.out.println("browserName:"+obj.browserName);
		System.out.println("browserVersion:"+obj.broswerVersion);
 obj.openURL();
 obj.navigateBack();
 obj.takeSnap();
 obj.clearCookies();
 obj.CloseBrowser();

}

}