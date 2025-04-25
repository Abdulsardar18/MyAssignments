import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Marathon1Pvr {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='PVR AEROHUB Chennai']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='Select Date']")).click();
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		//driver.findElement(By.xpath("//span[text()='Select Movie']")).click();
		driver.findElement(By.xpath("(//span[text()='SACHEIN (RE RELEASE)'])[2]")).click();
		//driver.findElement(By.xpath("//span[text()='Select Timing']")).click();
		driver.findElement(By.xpath("(//span[text()='06:45 PM'])")).click();
		driver.findElement(By.xpath("(//span[text()='Book'])[5]")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("//span[text()='13']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		String seatNumber = driver.findElement(By.xpath("(//div[@class=\"seat-number\"]/p)")).getText();
		String grandTotal = driver.findElement(By.xpath("(//div[@class='grand-tota col-md-3']//span)")).getText();
		Thread.sleep(3000);
		System.out.println("The seat number is "+seatNumber);
		System.out.println("The Grand Total is "+grandTotal);
		String pageTitle = driver.getTitle(); 
		System.out.println(pageTitle);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]//i")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
