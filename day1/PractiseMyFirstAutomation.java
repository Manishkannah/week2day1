package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.GeckoDriverInfo;
//import org.openqa.selenium.safari.SafariDriver;
//import com.sun.org.apache.bcel.internal.generic.Select;

public class PractiseMyFirstAutomation {
	public static void main(String[] args) {
		//GeckoDriverInfo browser = new GeckoDriverInfo();
		EdgeDriver browser = new EdgeDriver();
		browser.get("http://leaftaps.com/opentaps/control/login");
		browser.manage().window().maximize();
		browser.findElement(By.id("username")).sendKeys("demoSalesManager");
		browser.findElement(By.id("password")).sendKeys("crmsfa");
		browser.findElement(By.className("decorativeSubmit")).click();
		browser.findElement(By.partialLinkText("CRM")).click();
		browser.findElement(By.linkText("Leads")).click();
		browser.findElement(By.linkText("Create Lead")).click();
		browser.findElement(By.className("inputBox")).sendKeys("MK");
		browser.findElement(By.id("createLeadForm_firstName")).sendKeys("manish");
		browser.findElement(By.id("createLeadForm_lastName")).sendKeys("kannah");
		browser.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Devu");
		browser.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		browser.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("manishkanna68@gmail.com");
		WebElement dropState =  browser.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select (dropState);
		state.selectByValue("CA");
		
		WebElement dropDown =  browser.findElement(By.id("createLeadForm_dataSourceId"));
		Select list = new Select (dropDown);
		list.selectByValue("LEAD_EMPLOYEE");
		//list.deselectByIndex(4);
		browser.findElement(By.className("smallSubmit")).click();
		
		
		
	}
	
		
		
			
		
				
		
	}


