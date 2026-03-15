package maven;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Test {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver",
//				"D:\\User\\Desktop\\GSIT\\Automation Testing\\Enviornment Setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/sectors/bse/bankex");

		WebElement table = driver.findElement(By.xpath("//*[@class='dataTable']"));

//		List<WebElement> bankName= table.findElements(By.tagName("a"));	
//		System.out.println("Bank names:");
//		for(WebElement r: bankName) {
//			System.out.println(r.getText());
//		}
		List<WebElement> bankName = table.findElements(By.xpath("//table[@class='dataTable']//tr"));
		System.out.println("full data:");
		for (WebElement r : bankName) {
			System.out.print(r.getText() + "\t");
		}
		System.out.println();

		List<WebElement> group = table.findElements(By.xpath("//table[@class='dataTable']//td[2]"));
		System.out.println("Group:");
		for (WebElement r : group) {
			System.out.print(r.getText() + "\t");
		}
		System.out.println();
		
		List<WebElement> row3 = table.findElements(By.xpath("//table[@class='dataTable']//tr[3]"));
		System.out.println("row3:");
		for (WebElement r : row3) {
			System.out.print(r.getText() + "\t");
		}
		System.out.println();
		
		List<WebElement> header = table.findElements(By.xpath("//table[@class='dataTable']//th"));
		System.out.println("Header names:");
		for (WebElement r : header) {
			System.out.print(r.getText() + "\t");
		}
		System.out.println();

		List<WebElement> body = table.findElements(By.xpath("//table[@class='dataTable']//td"));
		System.out.println("Body :");
		for (WebElement r : body) {
			System.out.print(r.getText() + "\t");
		}
		System.out.println();
		//single element
		WebElement e = table.findElement(By.xpath("//*[@class='dataTable']//tr[4]//td[3]"));
		System.out.println("Element :"+e.getText());
		
		System.out.println();

		Thread.sleep(3000);
		driver.close();

	}
}
