package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.By;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01() throws InterruptedException{
// Navigate to URL  www.google.com
driver.get( "https://www.google.com");

// sendkeys "linkedin login" Using Locator "XPath" //textarea[@class='gLFyf']
WebElement search= driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
search.sendKeys("linkedin login");
// click on the search button Using Locator "XPath" (//input[@class='gNO89b'])[1]
WebElement search1= driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]"));
search1.click();
// click on the login button of the linkedin page Using Locator "XPath" (//h3[@class='LC20lb MBeuO DKV0Md'])[1]
WebElement loginButton= driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
loginButton.click();

// click on username and perform sendkeys "username" Using Locator "XPath" //input[@id='username']
WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
username.sendKeys("");
// click on password and perform sendkeys "password" Using Locator "XPath" //input[@id='password']
WebElement password= driver.findElement(By.xpath("//input[@id='username']"));
password.sendKeys("");

//click on sign in
WebElement signIn=driver.findElement(By.xpath("//button[text()='Sign in']"));
signIn.click();

// click on the profile views section Using Locator "XPath" //a[@id='ember687']
driver.findElement(By.xpath("//a[@href='/me/profile-views/']")).click();
// get the count of the views  Using Locator "XPath" //p[@class='text-body-medium-bold pr1 text-heading-large']
List<WebElement> list = driver.findElements(By.xpath("//p[@class='text-body-medium-bold pr1 text-heading-large']"));
System.out.println("View Count is :" + list);
// use driver.navigate(). back();   
driver.navigate().back();

//click on impressions on your post Using Locator "XPath" //span[text()='Impressions of your post']
//(//span[@class='feed-identity-widget-item__stat'])[2]
List<WebElement> impressionCount= driver.findElements(By.xpath("(//span[@class='feed-identity-widget-item__stat'])[2]"));
System.out.println("impressionCount Count is :" + impressionCount.size());
//------------
// get the count of the views  Using Locator "XPath" (//span[@class='feed-identity-widget-item__stat'])[2]
// perform get text on webelement   (//span[@class='feed-identity-widget-item__stat'])[2]
// click on start a post  Using Locator "XPath" //button[@id='ember25']
WebElement startPost= driver.findElement(By.xpath("//button[@id='ember25']"));
startPost.click();
// click to set post sharing to connections only Using Locator "XPath" //div[@id='ember344']
WebElement sharePost= driver.findElement(By.xpath("//div[@id='ember344']"));
sharePost.click();
// set the post reach to connections only by clicking on  Using Locator "XPath" (//span[@class='sharing-shared-generic-list__image'])[2]
WebElement postReach= driver.findElement(By.xpath("(//span[@class='sharing-shared-generic-list__image'])[2]"));
postReach.click();
// click on done  Using Locator "XPath" //button[@id='ember386']
WebElement done= driver.findElement(By.xpath("//button[@id='ember386']"));
done.click();
// click on the textarea to type in  Using Locator "XPath" //div[@class='ql-editor ql-blank']
WebElement textArea= driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
textArea.click();
// sendkeys "firstpost" Using Locator "XPath" //div[@class='ql-editor ql-blank']
textArea.sendKeys("FirstPost");
// click on post Using Locator "XPath" //button[@id='ember420']
WebElement post= driver.findElement(By.xpath("//button[@id='ember420']"));
post.click();

}


}
