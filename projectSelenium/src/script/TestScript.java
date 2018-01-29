package script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LoginPage;

@Listeners(generic.Listeners.class)

public class TestScript extends BaseTest
{
	@Test
	public void validLogin() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPage l = new LoginPage(d);
		l.username().sendKeys(Excel.readData("Sheet1", 1, 1));
		l.password().sendKeys(Excel.readData("Sheet1", 2, 1));
		l.login().click();
	}
	
//	@Test
//	public void inValidLogin() throws EncryptedDocumentException, InvalidFormatException, IOException
//	{
//		LoginPage l = new LoginPage(d);
//		l.username().sendKeys("bcbcb");
//		l.password().sendKeys("Sddfg");
//		Assert.fail();
//		l.login().click();
//	}
}
