package com.adactin.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.runner;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef  {
	
	
	public static WebDriver driver = runner.driver;
	
	
	
	@Given("User Launches The Adactin Application")
	public void user_launches_the_adactin_application() {
	driver.get("https://adactinhotelapp.com/");


	}




	@When("User Enters The Username In Username Field")
	public void user_enters_the_username_in_username_field() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("lokeshremon");
		
	    
	}
	@When("User Enters The Password In Password Field")
	public void user_enters_the_password_in_password_field() {

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Lokesh@04");
	    
	}
	@Then("User Clicks The Login Button And Navigate To Next Page")
	public void user_clicks_the_login_button_and_navigate_to_next_page() {

		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		}
	
	@When("User Selects The Location In The Location Field")
	public void user_selects_the_location_in_the_location_field() {
		WebElement Location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s1 = new Select(Location);
		
		s1.selectByValue("Melbourne");
	}
	@When("User Selects the Hotel Name.")
	public void user_selects_the_hotel_name() {

	    WebElement Hotelname = driver.findElement(By.xpath("//select[@name='hotels']"));
	    Select s4=new Select(Hotelname);
	    s4.selectByValue("Hotel Sunshine");
	}


	

	@When("User Enters The Hotels In Hotels Field")
	public void user_enters_the_hotels_in_hotels_field() {
		WebElement noofRooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
	    Select s2 = new Select(noofRooms);
	    s2.selectByVisibleText("3 - Three");
	    

	}
	@When("User Enters The RoomType In RoomType Field")
	public void user_enters_the_room_type_in_room_type_field() {
		   WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		    Select s5 =new Select(room);
		    s5.selectByVisibleText("Super Deluxe");
	  
	}
	@When("User Enters The Number Of Rooms In Number Of Rooms Field")
	public void user_enters_the_number_of_rooms_in_number_of_rooms_field() {
		WebElement noofRooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
	    Select s2 = new Select(noofRooms);
	    s2.selectByVisibleText("3 - Three");
	    
	}
	@When("User Enters The Check-In Date In Check-In Date Field")
	public void user_enters_the_check_in_date_in_check_in_date_field() {
	    
	}
	@When("User Enters The Check-Out Date In Check-Out Date Field")
	public void user_enters_the_check_out_date_in_check_out_date_field() {
	  
	}
	@When("User Enters The Number Of Adults In Adults Per Room Field")
	public void user_enters_the_number_of_adults_in_adults_per_room_field() {
		WebElement adultsPerRoom = driver.findElement(By.xpath("//select[@name='adult_room']"));
	    Select s3= new Select(adultsPerRoom);
	    s3.selectByValue("3");

	}
	@When("User Enters The Number Of Children In Children Per Room Field")
	public void user_enters_the_number_of_children_in_children_per_room_field() {
		WebElement childcount = driver.findElement(By.xpath("//select[@id='child_room']"));
	    Select s6 =new Select(childcount);
	    s6.selectByIndex(2);
	  
	}
	@Then("User Clicks The Search Button")
	public void user_clicks_the_search_button() {

	    WebElement searchbutton = driver.findElement(By.id("Submit"));
		searchbutton.click();
	}	
	@When("User Select the Hotels name and click the radiobutton.")
	public void user_select_the_hotels_name_and_click_the_radiobutton() {
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		   radio.click();
	}




	@When("User Click the continueButton.")
	public void user_click_the_continue_button() {
		WebElement cont = driver.findElement(By.xpath("//input[@name='continue']"));
	    cont.click();
	  
	}


	@When("User Enters the User First Name in the First Name Field")
public void user_enters_the_user_first_name_in_the_first_name_field() {
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
	    firstname.sendKeys("lokesh");
   
}




@When("User Enters the User Last Name in the Last Name Field")
public void user_enters_the_user_last_name_in_the_last_name_field() {
	WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
    lastname.sendKeys("G");
}
@When("User Enters the Billing Address in the Billing Address Field")
public void user_enters_the_billing_address_in_the_billing_address_field() {
	WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
    address.sendKeys("Anna Nagar");
    
}
@When("User Enters the Credit Card Number in the Credit Card Number Field")
public void user_enters_the_credit_card_number_in_the_credit_card_number_field() {
	 WebElement creditcard = driver.findElement(By.xpath("//input[@name='cc_num']"));
	    creditcard.sendKeys("1234567887654321");
}
@When("User Select the Credit Card Type in the Credit card list.")
public void user_select_the_credit_card_type_in_the_credit_card_list() {
    WebElement cctype = driver.findElement(By.xpath("//select[@class='select_combobox']"));
    Select s7 =new Select(cctype);
    s7.selectByIndex(1);
}
@When("User Select the Expiry Date and Select the Year.")
public void user_select_the_expiry_date_and_select_the_year() {
	WebElement year = driver.findElement(By.id("cc_exp_year"));
    Select s9 = new Select(year);
    s9.selectByIndex(12);
    
}

@When("User Select the Expiry Month.")
public void user_select_the_expiry_month() {

    WebElement Expiry = driver.findElement(By.id("cc_exp_month"));
    Select s8 = new Select(Expiry);
    s8.selectByIndex(5);
    
}

   
@When("User Enter the Cvv Number in cvv field.")
public void user_enter_the_cvv_number_in_cvv_field() {
	   WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	    cvv.sendKeys("124");
}
@Then("Select the Booknow Button.")
public void select_the_booknow_button() {
	 WebElement booknow = driver.findElement(By.xpath("//input[@name='book_now']"));
	    booknow.click();
	   

	    
}
@Given("User Click the Logout Button")
public void user_click_the_logout_button() {
	WebElement logout = driver.findElement(By.xpath("//input[@name='logout']"));
    logout.click();
    
}


	
	}


