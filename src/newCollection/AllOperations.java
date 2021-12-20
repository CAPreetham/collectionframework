package newCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllOperations {
		
	public static void split()
	{
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=QJ0iUNe27c8");
		String[] vals = driver.getTitle().split(" ");
		for (String str : vals) {
		System.out.println(str);
			
		}
	}
	public static void list()
	{
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com");
			List<WebElement> eles = driver.findElements(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-rich-grid-renderer/div[6]/ytd-rich-grid-row[2]"));
			for (WebElement element : eles) {
				System.out.println(element.getText());
			}
		}
	public static void map()
	{
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
        ArrayList<WebElement> Elementlishead = (ArrayList<WebElement>)driver.findElements(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-rich-grid-renderer/div[6]/ytd-rich-grid-row[2]"));
        Iterator<WebElement> itrhead = Elementlishead.iterator();
        System.out.println(itrhead.next().getText());
	}
	
			public static void main(String[] args)
			{
				split();
				list();
				map();
			}
}