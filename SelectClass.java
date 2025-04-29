package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abdul");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sardar");
		WebElement elementOne = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select optionOne=new Select(elementOne);
		optionOne.selectByIndex(4);
		WebElement elementTwo = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select optionTwo=new Select(elementTwo);
		optionTwo.selectByVisibleText("Automobile");
		WebElement elementThree = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select optionThree=new Select(elementThree);
		optionThree.selectByValue("OWN_CCORP");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
		
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.close();
	}

}
