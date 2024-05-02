package com.utdb.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.utdb.driver.Driver;

public final class LoginpageTests extends BaseTests{

	private LoginpageTests() {
    }

	@Test
	public void test2()
	{
		Driver.getDriver().findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
	}
}
