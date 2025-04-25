import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import week1.day2.Chrome;

public class MarathonAmazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags for boys", Keys.ARROW_DOWN,Keys.ENTER);
	String result;
		
		result = driver.findElement(By.xpath("//h2[contains(@class,'a-size-base a-spacing-small')]")).getText();
		System.out.println("Total number of results: "+result );
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("s-result-sort-select_4")).click();
		String brandname;
		brandname = driver.findElement(By.xpath("//h2[@class='a-size-mini s-line-clamp-1']")).getText();
		System.out.println("Brand Name is: "+brandname);
		String discountPrice;
		discountPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
		System.out.println("Discount Price is: "+discountPrice);
		driver.getTitle();
		driver.close();	
		
	}

}
