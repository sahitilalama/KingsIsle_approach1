package com.kingsisle.selenium;

import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiftCardsTest extends TestCase {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
	}

	@Test
	public void test() throws InterruptedException {
		System.out.println("Starting AutomationTest");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Configuration.gamepage);
		driver.manage().window().maximize();

		driver.findElement(By.xpath(Configuration.giftCard)).click();
		driver.findElement(By.xpath(Configuration.giftCert)).click();

		driver.findElement(By.id(Configuration.prepaidMembership)).click();
		driver.findElement(By.id(Configuration.crowns)).click();
		driver.findElement(By.xpath(Configuration.bundle)).click();

		clickAnElementByLinkText("Continue");

		driver.findElement(By.id(Configuration.personalizeTo))
				.sendKeys("Kingsisle");
		driver.findElement(By.id(Configuration.personalizeFrom)).sendKeys("Sahiti");
		driver.findElement(By.id(Configuration.personalizeMessage)).sendKeys(
				"Hello Kingsisle");

		clickAnElementById(Configuration.checkOutButton);

		driver.switchTo().frame(
				driver.findElement(By.name("jPopFrame_content")));
		clickAnElementByLinkText("Checkout with Credit Card");

		// clickAnElementById(Configuration.payPalButton);
		// clickAnElementByXpath(Configuration.cancelXpath);
		// clickAnElementById(Configuration.checkoutButton);

		// Write the assert Statements.
		assertEquals("Gift Item: KI Prepaid 1 Month",
				driver.findElement(By.xpath(Configuration.oneMonth)).getText());

		assertEquals("Gift Item: 5000 Crowns",
				driver.findElement(By.xpath(Configuration.numberOfCrowns))
						.getText());

		assertEquals(
				"Gift Bundle: Arcane Builders Bundle  + show items",
				driver.findElement(By.xpath(Configuration.arcaneBuildersBundle))
						.getText());

		assertEquals("Gift Certificate",
				driver.findElement(By.xpath(Configuration.account)).getText());
		assertEquals("1",
				driver.findElement(By.xpath(Configuration.quantityPrepaid))
						.getText());

		assertEquals("5,000",
				driver.findElement(By.xpath(Configuration.quantityCrowns))
						.getText());

		assertEquals("1",
				driver.findElement(By.xpath(Configuration.quantityBundles))
						.getText());

		assertEquals("$9.95",
				driver.findElement(By.xpath(Configuration.pricePrepaid))
						.getText());

		assertEquals("$10.00",
				driver.findElement(By.xpath(Configuration.priceCrowns))
						.getText());

		assertEquals("$39.00",
				driver.findElement(By.xpath(Configuration.priceBundles))
						.getText());

		assertEquals("$0.00", driver.findElement(By.xpath(Configuration.tax))
				.getText());

		assertEquals("$58.95", driver
				.findElement(By.xpath(Configuration.total)).getText());

		System.out.println("Completed Validation");

	}

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	public void clickAnElementByLinkText(String linkText) {
		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.linkText(linkText)));
		driver.findElement(By.linkText(linkText)).click();
	}

	public void clickAnElementById(String idString) {
		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(idString)));
		driver.findElement(By.id(idString)).click();
	}

	public void clickAnElementByXpath(String xpathString) {
		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath(xpathString)));
		driver.findElement(By.xpath(xpathString)).click();
	}

	public void waitForElementVisible(String str) {
		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(str)));

		driver.findElement(By.xpath(str)).click();
	}

}
