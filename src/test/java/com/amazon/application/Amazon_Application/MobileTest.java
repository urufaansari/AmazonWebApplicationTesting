package com.amazon.application.Amazon_Application;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.MobilePage;

public class MobileTest extends BaseTest {
	@Test
	public void test1() throws Exception { 
  
        // driver.get("https:// www.gmail.com"); 
        MobilePage mobilepage =  PageFactory.initElements(driver, MobilePage.class); 
        mobilepage.click_mobile_category();
        mobilepage.click_and_accessories();
    //    mobilepage.click_deal_of_the_day();
    //   mobilepage.add_item_to_cart();

     }
}
