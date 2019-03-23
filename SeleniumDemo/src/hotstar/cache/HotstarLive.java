package hotstar.cache;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotstarLive {
	 public static void main(String[] args) throws InterruptedException {
		 	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 	int i;
			for(i=0; i<100; i++) {
				try {
					WebDriver driver = new ChromeDriver(); 
					driver.get("https://www.hotstar.com/sports/cricket/australia-in-india-2019/india-vs-australia-m189945/live-streaming/2001710198");
//					driver.manage().window().maximize();

//					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//					driver.findElement(By.className("vjs-big-play-button")).click();
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					driver.findElement(By.className("vjs-fullscreen-control")).click();
					
//					driver.findElement(By.xpath("//*[@id=\"my_video_1\"]/button")).click();
					
				    Thread.sleep(540000);
				    driver.close();
			    } catch (InterruptedException e) {
			    	throw new InterruptedException();
			    }
			}
	 }
}
