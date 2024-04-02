package ders20;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class OdevTest {

	@Test
	void firstTest() {

		System.setProperty("webdirever.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/elements");

		WebElement buttonClick = driver.findElement(new By.ByCssSelector(".btn[id=item-4]"));
		buttonClick.click();

		List<WebElement> clickMeButton = driver.findElements(new By.ByCssSelector(".btn-primary"));

		clickMeButton.get(2).click();

		WebElement dynamicText = driver.findElement(new By.ByCssSelector("#dynamicClickMessage"));
		String text = dynamicText.getText();
		System.out.println(text);

	}

	@Test
	void secondTest() {

		System.setProperty("webdirever.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/webtables");

		WebElement addButton = driver.findElement(new By.ByCssSelector(".btn-primary"));
		addButton.click();
		
		WebElement firstName = driver.findElement(new By.ByCssSelector("#firstName"));
		firstName.click();
		firstName.sendKeys("Emre");
		
		WebElement lastName = driver.findElement(new By.ByCssSelector("#lastName"));
		lastName.click();
		lastName.sendKeys("Eser");
		
		WebElement userEmail = driver.findElement(new By.ByCssSelector("#userEmail"));
		userEmail.click();
		userEmail.sendKeys("emre.eser@sebit.com.tr");
		
		WebElement age = driver.findElement(new By.ByCssSelector("#age"));
		age.click();
		age.sendKeys("28");
		
		WebElement salary = driver.findElement(new By.ByCssSelector("#salary"));
		salary.click();
		salary.sendKeys("34000");
		
		WebElement department = driver.findElement(new By.ByCssSelector("#department"));
		department.click();
		department.sendKeys("IT");
		
		WebElement submitButton = driver.findElement(new By.ByCssSelector("#submit"));
		submitButton.click();
		
		WebElement editButton = driver.findElement(new By.ByCssSelector("#edit-record-4"));
		editButton.click();
		
		WebElement editFirstName = driver.findElement(new By.ByCssSelector("#firstName"));
		editFirstName.click();
		editFirstName.clear();
		editFirstName.sendKeys("Kenan");
		
		WebElement editSubmitButton = driver.findElement(new By.ByCssSelector("#submit"));
		editSubmitButton.click();





		




		
		





	}

}
