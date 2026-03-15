import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightBasic {

	public static void main(String[] args) throws InterruptedException {
		Playwright pw = Playwright.create();
		
		//Deafult Headless Mode=false
		Browser b= pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		// Headless Mode 
//		Browser b= pw.chromium().launch();
		
		Page p = b.newPage();
		p.navigate("https://playwright.dev/");
		
		Thread.sleep(3000);
		p.close();
		

	}

}
