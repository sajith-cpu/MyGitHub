import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class CheckAndUncheck {

	public static void main(String[] args) throws InterruptedException {
		Playwright pw = Playwright.create();

		// Deafult Headless Mode=false
		Browser b = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));


		Page p = b.newPage();
		p.navigate("https://www.bankofamerica.com/");
		
		Locator cb=p.locator("//*[@name='saveOnlineID']");
		PlaywrightAssertions.assertThat(cb).not().isChecked();
		cb.check();
		Thread.sleep(3000);
		cb.uncheck();
		PlaywrightAssertions.assertThat(cb).not().isChecked();
		
		Thread.sleep(3000);
		p.close();
	}

}
