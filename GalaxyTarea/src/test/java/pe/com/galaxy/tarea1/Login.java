package pe.com.galaxy.tarea1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends Base {
  @Test
  public void log() throws InterruptedException {
	  Thread.sleep(5000);
	  WebElement mail = driver.findElement(By.cssSelector("input[name='username']"));
	  mail.clear();
	  mail.sendKeys("Admin");
	  WebElement pass= driver.findElement(By.cssSelector("input[name='password']"));
	  pass.clear();
	  pass.sendKeys("admin123");
	  WebElement log = driver.findElement(By.tagName("button"));
	  log.click();
	  Thread.sleep(5000);
	  
	  
	  WebElement add = driver.findElement(By.cssSelector("div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-paper-container:nth-child(3) div.orangehrm-header-container:nth-child(1) > button.oxd-button.oxd-button--medium.oxd-button--secondary"));
	  add.click();
	  
	  
	  
	  Thread.sleep(5000);
	  
	  WebElement firstname= driver.findElement(By.name("firstName"));
	  firstname.clear();
	  firstname.sendKeys("Joel");
	  
	  WebElement middlename= driver.findElement(By.cssSelector("input[name='middleName']"));
	  middlename.clear();
	  middlename.sendKeys("Noe");
	  
	  WebElement lastname= driver.findElement(By.cssSelector("input[name='lastName']"));
	  lastname.clear();
	  lastname.sendKeys("Torres Azañedo");
	  
	  WebElement save= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/button[2]"));
	  save.submit();
  }
}
