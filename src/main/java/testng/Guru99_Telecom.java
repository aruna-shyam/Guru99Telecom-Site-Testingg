package testng;
import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Guru99_Telecom 
{
WebDriver driver;
public String path="https://demo.guru99.com/telecom/index.html";
	
	@BeforeSuite
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNA\\Desktop\\Selenium Driver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
	}
	
	@Test(priority=0)
	public void openguru99_telecom() {
		driver.get(path);
	 }
	
	@Test(priority=1)
	public void add_customer() throws InterruptedException
	{
		WebElement addcustomer= driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a"));
		addcustomer.click();
		Thread.sleep(1000);
	}
	@Test(priority=2)
	public void adsremove() {
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0\"]")));
		WebElement ads=driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]"));
		ads.click();
	}
	@Test(priority=3)
	public void add_customer1() throws InterruptedException
	{
		Thread.sleep(1500);	
		WebElement backgroundcheck= driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label"));
		backgroundcheck.click();
		Thread.sleep(1500);
		WebElement firstname= driver.findElement(By.xpath("//*[@id=\"fname\"]"));
		firstname.click();
		firstname.sendKeys("Aruna");
		Thread.sleep(1500);
		WebElement lastname= driver.findElement(By.xpath("//*[@id=\"lname\"]"));
		lastname.click();
		lastname.sendKeys("Shyam");
		Thread.sleep(1500);
		WebElement email= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.click();
		email.sendKeys("arunarsha1412@gmail.com");
		Thread.sleep(1500);
		WebElement address= driver.findElement(By.name("addr"));
		address.click();
		address.sendKeys("Hosur");
		Thread.sleep(1500);
		WebElement phone=driver.findElement(By.xpath("//*[@id=\"telephoneno\"]"));
		phone.click();
		phone.sendKeys("9789654432");
		Thread.sleep(1500);
		WebElement submitbutton=driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[9]/ul/li[1]"));
		submitbutton.click();
		Thread.sleep(1500);
	}
	//screenshot
	@Test(priority=4)
	public void add_customer2() throws IOException, InterruptedException
	{
		File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file1,new File("C:\\Users\\ARUNA\\Pictures\\Screenshots\\Screenshot (87).png"));
		Thread.sleep(1500);
	}
	@Test(priority=5)
	public void add_customer3() throws InterruptedException
	{
		WebElement homebutton=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/ul/li/a"));
		homebutton.click();
		Thread.sleep(1500);
	}
	
	@Test(priority=6)
	public void add_traffic_plan_to_customer() throws InterruptedException
	{
		WebElement addtrafficplantocustomer=driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[2]/h3/a"));
		addtrafficplantocustomer.click();
		Thread.sleep(1500);
	}
	@Test(priority=7)
	public void add_traffic_plan_to_customer1() throws InterruptedException
	{
		WebElement customerid=driver.findElement(By.xpath("//*[@id=\"customer_id\"]"));
		customerid.click();
		customerid.sendKeys("343879");
		Thread.sleep(1000);
		WebElement submitbutton=driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[6]/input"));
		submitbutton.click();
		Thread.sleep(1500);
	}
	@Test(priority=8)
	public void add_traffic_plan_to_customer2() throws InterruptedException
	{
		WebElement radiobutton=driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[1]/table/tbody/tr/td[1]"));
		radiobutton.click();
		Thread.sleep(1500);
		//scrolling
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,2500)");
    	Thread.sleep(1500);
    	js.executeScript("scrollBy(0,-2200)");
    	Thread.sleep(1500);
    
		WebElement addtrafficplanbutton=driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[2]/input"));
		addtrafficplanbutton.click();
		Thread.sleep(1500);
	}
	@Test(priority=9)
	public void add_traffic_plan_to_customer3() throws InterruptedException
	{
		WebElement homebutton=driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/a"));
		homebutton.click();
		Thread.sleep(1500);
	}
	
	@Test(priority=10)
	public void add_traffic_plan() throws InterruptedException
	{
		WebElement addtrafficplan=driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[3]/div[1]/h3/a"));
		addtrafficplan.click();
		Thread.sleep(1500);
	}
	@Test(priority=11)
	public void add_traffic_plan1() throws InterruptedException
	{
		WebElement monthlyrental=driver.findElement(By.xpath("//*[@id=\"rental1\"]"));
		monthlyrental.click();
		monthlyrental.sendKeys("1700");
		Thread.sleep(1500);
		WebElement freelocalminutes=driver.findElement(By.xpath("//*[@id=\"local_minutes\"]"));
		freelocalminutes.click();
		freelocalminutes.sendKeys("78");
		Thread.sleep(1500);
		WebElement interminutes=driver.findElement(By.xpath("//*[@id=\"inter_minutes\"]"));
		interminutes.click();
		interminutes.sendKeys("90");
		Thread.sleep(1500);
		WebElement smspack=driver.findElement(By.xpath("//*[@id=\"sms_pack\"]"));
		smspack.click();
		smspack.sendKeys("100");
		Thread.sleep(1500);
		//scrolling
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,2500)");
    
		WebElement minutescharges=driver.findElement(By.xpath("//*[@id=\"minutes_charges\"]"));
		minutescharges.click();
		minutescharges.sendKeys("520");
		Thread.sleep(1500);
		WebElement intercharges=driver.findElement(By.xpath("//*[@id=\"inter_charges\"]"));
		intercharges.click();
		intercharges.sendKeys("700");
		Thread.sleep(1500);
		WebElement smscharges=driver.findElement(By.xpath("//*[@id=\"sms_charges\"]"));
		smscharges.click();
		smscharges.sendKeys("450");
		Thread.sleep(1000);
		WebElement submitbutton=driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[36]/ul/li[1]/input"));
		submitbutton.click();
		Thread.sleep(1500);
	}
	@Test(priority=12)
	public void add_traffic_plan2() throws InterruptedException
	{
	    WebElement homebutton=driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/a"));
	    homebutton.click();
	    Thread.sleep(1500);
	}
	
	@Test(priority=13)
	public void pay_billing() throws InterruptedException
	{
		WebElement paybilling=driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[3]/div[2]/h3/a"));
		paybilling.click();
		Thread.sleep(1500);
	}
	@Test(priority=14)
	public void pay_billing1() throws InterruptedException
	{
		WebElement customerid=driver.findElement(By.xpath("//*[@id=\"customer_id\"]"));
		customerid.click();
		customerid.sendKeys("343879");
		Thread.sleep(1500);
		WebElement submitbutton=driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[6]/input"));
		submitbutton.click();
		Thread.sleep(1500);
		//scrolling
		JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("scrollBy(0,2500)");
	    Thread.sleep(1500);
	    
	}
	@Test(priority=15)
	public void pay_billing2() throws InterruptedException
	{
	    WebElement gurulogo=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/a[2]"));
	    gurulogo.click();
	    Thread.sleep(2500);
	}
	@Test(priority=16)
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
	
	@AfterSuite
	public void closebrowser() 
	{	
	    driver.quit();
	}
	
}
