import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FbLogin {

	public static void main(String[] args) throws InterruptedException {
		Playwright pw= Playwright.create();
		Browser b=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		 BrowserContext context = b.newContext(new Browser.NewContextOptions().setViewportSize(null) // disables fixed viewport
	            );
		Page p = b.newPage();
		
		
		
		p.navigate("https://facebook.com");
		System.out.println("Page title:"+p.title());
		System.out.println("Page url:"+p.url());
		p.locator("//*[@name='email']").fill("sajithpulparambil");
		p.locator("*[type='password']").type("sajithpulparambil",new Locator.TypeOptions().setDelay(1000));
		
		p.locator("//*[@aria-label='Log in']").click();
		
		Thread.sleep(3000);
		p.close();
		
		

	}

}
