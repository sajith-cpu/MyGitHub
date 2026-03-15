import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.options.SelectOption;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		Playwright pw = Playwright.create();

		// Deafult Headless Mode=false
		Browser b = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));


		Page p = b.newPage();
		p.navigate("https://www.facebook.com/reg");
		
		//Select by value
		p.selectOption("//*[@aria-label='Select day']","18");
		Thread.sleep(3000);
		
		//Select by index
		p.selectOption("//*[@aria-label='Select day']",new SelectOption().setIndex(15));
		
		Thread.sleep(3000);
		//Select by visible text
		p.selectOption("//*[@aria-label='Select day']",new SelectOption().setLabel("25"));
		Thread.sleep(3000);
		p.close();
	}

}
