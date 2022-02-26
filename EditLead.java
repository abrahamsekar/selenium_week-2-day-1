package SeleniumSetuo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	 public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 WebElement elementUsername = driver.findElement(By.id("username"));
		 elementUsername.sendKeys("Demosalesmanager");
		 WebElement elementPassword = driver.findElement(By.id("password"));
		 elementPassword.sendKeys("crmsfa");
		 WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		 elementLoginButton.click();
		 WebElement elementCMRSFA = driver.findElement(By.linkText("CRM/SFA"));
		 elementCMRSFA.click();
		 WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		 elementLeads.click();
		 WebElement elementCreateLeads = driver.findElement(By.linkText("Create Lead"));
		 elementCreateLeads.click();
		 WebElement elementCompanyname = driver.findElement(By.id("createLeadForm_companyName"));
		 elementCompanyname.sendKeys("Cape Start");
		 WebElement elementFirstname = driver.findElement(By.id("createLeadForm_firstName"));
		 elementFirstname.sendKeys("Abraham");
		 WebElement elementLastname = driver.findElement(By.id("createLeadForm_lastName"));
		 elementLastname.sendKeys("Muthiah");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Abi");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Test data");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abrahammuthiah@gmail.com");
		 WebElement elementDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select dropDown = new Select(elementDropdown);
		 dropDown.selectByVisibleText("New York");
		 WebElement elementCreateLeadButton = driver.findElement(By.className("smallSubmit"));
		 elementCreateLeadButton.click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("createLeadForm_description")).clear();
		 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("about to test the function");
		 driver.findElement(By.className("smallSubmit")).click();
		 driver.getTitle();
		 
		 }
}
