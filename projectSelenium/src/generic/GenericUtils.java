package generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils 
{
	public static void selectByText(WebElement element , String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public static void selectBYIndex(WebElement element , int n)
	{
		Select s = new Select(element);
		s.selectByIndex(n);
	}
	
	public static void mouseOver(WebElement target)
	{
		Actions a = new Actions(BaseTest.d);
		a.moveToElement(target);
	}
	
	public static void scroll(int x , int y)
	{
		JavascriptExecutor j = (JavascriptExecutor) BaseTest.d;
		j.executeScript("window.scrollBy("+x+","+y+")", "");
	}
}
