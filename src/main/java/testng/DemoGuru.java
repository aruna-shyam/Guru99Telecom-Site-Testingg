package testng;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemoGuru 
{

	WebDriver driver;
	public String path="https://demo.guru99.com/telecom/index.html";


	
	
	@BeforeSuite
	public void launchbrowser() 
	{
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNA\\Desktop\\Selenium Driver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(chromeOptions);
	
	}
	
	@Test(priority=0)
	public void openSite() 
	   {
		
		driver.get(path);
		driver.manage().window().maximize();
		
		}
	
	@Test(priority=1)
	public void siteDetails() throws InterruptedException
	{
		WebElement user1=driver.findElement (By.xpath("/html/body/div[3]/div/div[1]/div[2]/table/tbody/tr/td[1]/a[2]"));
		user1.click();
		Thread.sleep(1000);
		driver.get(path);
		
		WebElement user2=driver.findElement (By.xpath("/html/body/div[3]/div/div[1]/div[2]/table/tbody/tr/td[2]/a[2]"));
		user2.click();
		Thread.sleep(1000);
		driver.get(path);
		
		WebElement user3=driver.findElement (By.xpath("/html/body/div[3]/div/div[1]/div[2]/table/tbody/tr/td[3]/a[2]"));
		user3.click();
		Thread.sleep(1000);
	    driver.get(path);
		
		WebElement user4=driver.findElement (By.xpath("/html/body/div[3]/div/div[1]/div[2]/table/tbody/tr/td[4]/a[2]"));
		user4.click();
		Thread.sleep(1000);
		driver.get(path);
	}
	
	@Test(priority=2)
	public void addCus() throws InterruptedException
	{
		
		WebElement cus1=driver.findElement (By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a"));
		cus1.click();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/telecom/addcustomer.php");
		WebElement cus2=driver.findElement (By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label"));
		cus2.click();
		Thread.sleep(2000);
		WebElement cus3=driver.findElement (By.xpath("//*[@id=\"fname\"]"));
		cus3.click();
		cus3.sendKeys("Aruna");
		Thread.sleep(2000);
		WebElement cus4=driver.findElement (By.xpath("//*[@id=\"lname\"]"));
		cus4.click();
		cus4.sendKeys("Shyam");
		Thread.sleep(2000);
		WebElement email= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.click();
		email.sendKeys("arunarsha1412@gmail.com");
		Thread.sleep(1500);
		WebElement address= driver.findElement(By.name("addr"));
		address.click();
		address.sendKeys("Rayakottai hudco hosur");
		Thread.sleep(1500);
		WebElement cus8=driver.findElement (By.xpath("//*[@id=\"telephoneno\"]"));
		cus8.click();
		cus8.sendKeys("8925446849");
		Thread.sleep(2000);
		WebElement cus9=driver.findElement (By.xpath("//*[@id=\"main\"]/div/form/div/div[9]/ul/li[1]/input"));
		cus9.click();
		
		WebElement cus10=driver.findElement (By.xpath("//*[@id=\"main\"]/div/div/ul/li/a"));
		cus10.click();
	}
	
	
	@Test(priority=3)
	public void addPlan() throws InterruptedException
	{
		
		WebElement pro1=driver.findElement (By.xpath("//*[@id=\"one\"]/div/div[3]/div[1]/h3/a"));
		pro1.click();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/telecom/addtariffplans.php");

		WebElement pro2=driver.findElement (By.xpath("//*[@id=\"rental1\"]"));
		pro2.click();
		pro2.sendKeys("1500");
		Thread.sleep(2000);
		WebElement pro3=driver.findElement (By.xpath("//*[@id=\"local_minutes\"]"));
		pro3.click();
		pro3.sendKeys("45");
		Thread.sleep(2000);
		WebElement pro4=driver.findElement (By.xpath("//*[@id=\"inter_minutes\"]"));
		pro4.click();
		pro4.sendKeys("60");
		Thread.sleep(2000);
		WebElement pro5=driver.findElement (By.xpath("//*[@id=\"sms_pack\"]"));
		pro5.click();
		pro5.sendKeys("100");
		Thread.sleep(2000);
		WebElement pro6=driver.findElement (By.xpath("//*[@id=\"minutes_charges\"]"));
		pro6.click();
		pro6.sendKeys("120");
		Thread.sleep(2000);
		WebElement pro7=driver.findElement (By.xpath("//*[@id=\"inter_charges\"]"));
		pro7.click();
		pro7.sendKeys("320");
		Thread.sleep(2000);
		WebElement pro8=driver.findElement (By.xpath("//*[@id=\"sms_charges\"]"));
		pro8.click();
		pro8.sendKeys("80");
		Thread.sleep(2000);
		
		WebElement pro9=driver.findElement (By.xpath("//*[@id=\"main\"]/div/form/div/div[36]/ul/li[1]/input"));
		pro9.click();
		
		WebElement pro10=driver.findElement (By.xpath("//*[@id=\"main\"]/div/ul/li/a"));
		pro10.click();
		
	}
	
	
	@Test(priority=4)
	public void addTarPlan() throws InterruptedException
	{
		
		WebElement clk1=driver.findElement (By.xpath("//*[@id=\"one\"]/div/div[1]/div[2]/h3/a"));
		clk1.click();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/telecom/assigntariffplantocustomer.php");
		
		WebElement clk2=driver.findElement (By.xpath("//*[@id=\"customer_id\"]"));
		clk2.click();
        clk2.sendKeys("147944");
        Thread.sleep(2000);
        WebElement clk=driver.findElement (By.xpath("//*[@id=\"main\"]/div/form/div/div[6]/input"));
		clk.click();
		Thread.sleep(2000);
        WebElement clk4=driver.findElement (By.xpath("//*[@id=\"main\"]/div/form/div[2]/input"));
		clk4.click();
		Thread.sleep(2000);
		WebElement clk5=driver.findElement (By.xpath("//*[@id=\"main\"]/div/ul/li/a"));
		clk5.click();
	}
	
	@Test(priority=5)
	public void payBill() throws InterruptedException
	{
		
		WebElement pay1=driver.findElement (By.xpath("//*[@id=\"one\"]/div/div[3]/div[2]/h3/a"));
		pay1.click();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/telecom/billing.php");
		
		WebElement pay2=driver.findElement (By.xpath("//*[@id=\"customer_id\"]"));
		pay2.click();
        pay2.sendKeys("147944");
        Thread.sleep(2000);
        WebElement pay3=driver.findElement (By.xpath("//*[@id=\"main\"]/div/form/div/div[6]/input"));
		pay3.click();
		
		Thread.sleep(2000);
		driver.get(path);
       
	}
	
	@AfterSuite
	public void closebrowser() 
    {
    	
		driver.quit();
    }
	
	

}
