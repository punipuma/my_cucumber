package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import com.adactin.helper.PageObjectManager;
import com.adactin.pom.Itenary;
import com.adactin.pom.Login;
import com.adactin.runner.Runner;

import baseclass.com.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef extends BaseClass{
	
	public static WebDriver driver = Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^User entered the application URL successfully$")
	public void user_entered_the_application_URL_successfully() throws Throwable {
		getUrl("https://adactinhotelapp.com/index.php");
	
	
	}

	@When("^user enters the Email value$")
	public void user_enters_the_Email_value() throws Throwable {
	   inputData(pom.getL().getUsername(), "PunithaTest");
	}

	@When("^user enters the valid password$")
	public void user_enters_the_valid_password() throws Throwable {
		inputData(pom.getL().getPassword(), "punithatest");
	    
	}

	@When("^hit Login button$")
	public void hit_Login_button() throws Throwable {
		clickElement(pom.getL().getLogin());
	
	   
	}

	@Then("^user has to login into the booking page$")
	public void user_has_to_login_into_the_booking_page() throws Throwable {
		System.out.println("Scenario 1 - Navigated to");
		getTitle();
	}


@Given("^User already logged into the application using valid credentials$")
public void user_already_logged_into_the_application_using_valid_credentials() throws Throwable {

    
}

@Given("^user chooses the location using location drop down$")
public void user_chooses_the_location_using_location_drop_down() throws Throwable {
    selectDropdown(pom.getSh().getLocation(), "Sydney" , "visibletext");
    
}

@Given("^user chooses the hotels using hotels drop down$")
public void user_chooses_the_hotels_using_hotels_drop_down() throws Throwable {
	selectDropdown(pom.getSh().getHotels(), "Hotel Creek", "visibletext");
    
    
}

@Given("^user chooses the Roomtype using Roomtype drop down$")
public void user_chooses_the_Roomtype_using_Roomtype_drop_down() throws Throwable {
	selectDropdown(pom.getSh().getRoomtype(), "Super Deluxe", "visibletext");
    
    
}

@Given("^user chooses the Number of Rooms using Number of Rooms drop down$")
public void user_chooses_the_Number_of_Rooms_using_Number_of_Rooms_drop_down() throws Throwable {
    selectDropdown(pom.getSh().getRoomno(), "1 - One", "visibletext");
    
}

@Given("^user chooses the Check-in Dates using Check-in dates drop down$")
public void user_chooses_the_Check_in_Dates_using_Check_in_dates_drop_down() throws Throwable {
    inputData(pom.getSh().getDate(), "15/09/2021");
    
}

@Given("^user chooses the Check-out dates using Check-out dates drop down$")
public void user_chooses_the_Check_out_dates_using_Check_out_dates_drop_down() throws Throwable {
    inputData(pom.getSh().getDatepickout(), "17/09/2021");
    
}

@Given("^user chooses the Adults per room using Adults per room drop down$")
public void user_chooses_the_Adults_per_room_using_Adults_per_room_drop_down() throws Throwable {
    selectDropdown(pom.getSh().getAdultroom(), "1 - One", "visibletext");
    
}

@Given("^user chooses the Children per room using Children per room drop down$")
public void user_chooses_the_Children_per_room_using_Children_per_room_drop_down() throws Throwable {
    selectDropdown(pom.getSh().getChildroom(), "1 - One", "visibletext");
    
}

@Given("^user hits Search button$")
public void user_hits_Search_button() throws Throwable {
    clickElement(pom.getSh().getSubmit());
    
}

@Then("^User should navigate to select hotel page where all chosen details were displayed$")
public void user_should_navigate_to_select_hotel_page_where_all_chosen_details_were_displayed() throws Throwable {
    System.out.println("Scenario 2- Navigated to");
	getTitle();
    
}

@Given("^User naviagted to select hotel page$")
public void user_naviagted_to_select_hotel_page() throws Throwable {
    
    
}

@Given("^user chooses the radio button under select field$")
public void user_chooses_the_radio_button_under_select_field() throws Throwable {
	clickElement(pom.getBl().getRadiobutton());
	
    
    
}

@Then("^user hits the CONTINUE button$")
public void user_hits_the_CONTINUE_button() throws Throwable {
    clickElement(pom.getBl().getCont());
    
}

@Given("^User navigated to Book a hotel page by selecting the desired hotel$")
public void user_navigated_to_Book_a_hotel_page_by_selecting_the_desired_hotel() throws Throwable {
    }

@Given("^User enters Name in First name field$")
public void user_enters_Name_in_First_name_field() throws Throwable {
	inputData(pom.getBk().getFirstname(), "punitha");
    
   
}

@Given("^user enters Last name in Last name field$")
public void user_enters_Last_name_in_Last_name_field() throws Throwable {
	inputData(pom.getBk().getLastname(), "Mack");
    
   
}

@Given("^User enters Billing address in Billing address field$")
public void user_enters_Billing_address_in_Billing_address_field() throws Throwable {
	inputData(pom.getBk().getAddress(), "Chennai");
    
   
}

@Given("^user enters Credit card Number in Credit Card No field$")
public void user_enters_Credit_card_Number_in_Credit_Card_No_field() throws Throwable {
	inputData(pom.getBk().getCcnum(), "1234123412341234");
    
   
}

@Given("^user enters Credit card type in Credit card type field$")
public void user_enters_Credit_card_type_in_Credit_card_type_field() throws Throwable {
    selectDropdown(pom.getBk().getCctype(), "American Express", "visibletext");
   
}

@Given("^User chooses Expiry date from drop down$")
public void user_chooses_Expiry_date_from_drop_down() throws Throwable {
    selectDropdown(pom.getBk().getCcexpmonth(), "January", "visibletext");
    selectDropdown(pom.getBk().getCcexpyear(), "2022", "visibletext");
   
}

@Given("^user keyed in CVV number in CVV field$")
public void user_keyed_in_CVV_number_in_CVV_field() throws Throwable {
inputData(pom.getBk().getCvv(), "123");
    
   
}

@Then("^user hits Book now button$")
public void user_hits_Book_now_button() throws Throwable {
    clickElement(pom.getBk().getBookbutton());
    Thread.sleep(3000);
}

@Given("^All chosen details were auto generated in the Booking confirmation page$")
public void all_chosen_details_were_auto_generated_in_the_Booking_confirmation_page() throws Throwable {
   
    
}

@Given("^user hits MY ITINERARY button$")
public void user_hits_MY_ITINERARY_button() throws Throwable {

	scroll(pom.getIt().getItenary());
	clickElement(pom.getIt().getItenary());
   
    
}

@Then("^all booked itinerary should be displayed$")
public void all_booked_itinerary_should_be_displayed() throws Throwable {
   
    
}

@Given("^All booked hotel details were displayed$")
public void all_booked_hotel_details_were_displayed() throws Throwable {
   
    
}

@Given("^User check box the hotel which need to be cancelled$")
public void user_check_box_the_hotel_which_need_to_be_cancelled() throws Throwable {
   
    
}

@Given("^User hits Cancel selected button$")
public void user_hits_Cancel_selected_button() throws Throwable {
   
    
}

@Given("^user hits OK in warning pop up$")
public void user_hits_OK_in_warning_pop_up() throws Throwable {
   
    
}

@Then("^selected hotel booking gets cancelled$")
public void selected_hotel_booking_gets_cancelled() throws Throwable {
   
    
}

}

