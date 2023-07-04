package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) {
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
 		 browser.findElement(By.id("createLeadForm_description")).sendKeys("Assigment2");
 		 browser.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("manishkanna68@gmail.com");
         WebElement dropState = browser.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
         Select state = new Select(dropState);
         state.selectByIndex(5);
         browser.findElement(By.className("smallSubmit")).click();
         browser.findElement(By.linkText("Edit")).click();
         browser.findElement(By.id("createLeadForm_description")).clear();
         browser.findElement(By.id("createLeadForm_importantNote")).sendKeys("added important point");
         //browser.findElement(By.name("submitButton"));
         browser.findElement(By.className("smallSubmit")).click();
         
         
         
	}

}
