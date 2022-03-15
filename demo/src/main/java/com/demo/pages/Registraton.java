package com.demo.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.baseclass.TestBase;

public class Registraton extends TestBase {
        //page factory ---> object repositrory
	
	
	
	   @FindBy(xpath ="/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
	   WebElement signin;
	
       @FindBy(name = "email_create")
   		WebElement email;
       
       @FindBy(id ="SubmitCreate")
       WebElement subclick;
       
       @FindBy(name = "id_gender")
       WebElement clickgender;
       
       @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input")
       WebElement addfirstname;
       
       @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[3]/input")
       WebElement addlastname;
       
       @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[5]/input")
       WebElement addpasswordname;
       
       @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[1]/div/select/option[6]")
       WebElement adddatename;
       
       @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[2]/div/select/option[7]")
       WebElement addmonthname;
       
       @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[3]/div/select/option[11]")
       WebElement addyearsname;
       
       @FindBy(name = "newsletter")
       WebElement clicknewaslettersname;
       
       @FindBy(id = "firstname")
       WebElement addfrstname;
       
       @FindBy(id = "lastname")
       WebElement addlstname;
       
       @FindBy(id = "company")
       WebElement addcompanyname;
       
       @FindBy(id = "mr john deo 123 main st unit 4561 kryton tn 38101 brightree pvt lmd ")
       WebElement addAddressname;
       
       @FindBy(id = "mr john deo 123 main st unit 4561 kryton tn 38101")
       WebElement addAddress2name;
       
       @FindBy(id = "city")
       WebElement addcityname;
       
       @FindBy(id = "id_state")
       WebElement addstatename;
       
       @FindBy(id = "postcode")
       WebElement addpostcodename;
       
       @FindBy(id = "uniform-id_country")
       WebElement addcountryname;
       
       @FindBy(id = "my another mobile number is 87828396823")
       WebElement addAdditionalinfoname;
       
       @FindBy(id = "phone")
       WebElement addPhonename;
       
       @FindBy(id = "phone_mobile")
       WebElement addAdditionalPhonename;
      
       
       public Registraton()
       {
    	   PageFactory.initElements(driver, this);
       }
       
       public void signinng()
       {
    	   signin.click();
       }
       
       public void enteremail()
       {
    	   email.sendKeys("rak66778844@gmail.com");
       }
       
       
       public void createAccount()
       {
   		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    	   clickgender.click();
    	   addfirstname.sendKeys("rakshith");
    	   addlastname.sendKeys("raksh");
    	   addpasswordname.sendKeys("rakshith123");
    	   adddatename.click();
    	   addmonthname.click();
    	   addyearsname.click();
    	   clicknewaslettersname.click();
    	   addfrstname.sendKeys("rakshith");
    	   addlstname.sendKeys("raksh");
    	   addcompanyname.sendKeys("IBM");
    	   addAddressname.sendKeys("mysore 306/A jp nagar");
    	   addAddress2name.sendKeys("bangalore shivaji nagar");
    	   addcityname.sendKeys("mysore");
    	   addstatename.sendKeys("karnataka");
    	   addpostcodename.sendKeys("123421");
    	   addcountryname.clear();
    	   addcountryname.sendKeys("india");
    	   addAdditionalinfoname.sendKeys("no other info");
    	   addPhonename.sendKeys("+18217672673");
    	   addAdditionalPhonename.sendKeys("+18977334342");
       }
       
       
       public void submitClick()
       {
    	   subclick.click();
       }
   		
   		

}
