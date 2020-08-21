import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class myGrid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();
				
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WIN10);

		URL url = new URL("http://192.168.43.213:4444/wd/hub");		
		RemoteWebDriver driver = new RemoteWebDriver(url , dc);
		
		driver.get("https://www.google.com/");
		System.out.println("Title of the page :" + driver.getTitle());
	}

}
