package com.utdb.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.utdb.driver.Driver;

public final class HomepageTests extends BaseTests {

	private HomepageTests() {
	}


	@Test
	public void test1()
	{
		Driver.getDriver().findElement(By.name("q")).sendKeys("UTDB",Keys.ENTER);

	}

}
