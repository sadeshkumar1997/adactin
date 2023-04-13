package com.datadrivenexcel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.datadriven.DataDrivenBase;

public class BookHotel extends DataDrivenBase {
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement first;
	@FindBy(id="last_name")
	private WebElement last;
	@FindBy(id="address")
	private WebElement add;
	@FindBy(id="cc_num")
	private WebElement cardnumber;
	@FindBy(id="cc_type")
	private WebElement cardtype;
	@FindBy(id="cc_exp_month")
	private WebElement month;
	@FindBy(id="cc_exp_year")
	private WebElement year;
	@FindBy(id="cc_cvv")
	private WebElement cvvnumber;
	@FindBy(id="book_now")
	private WebElement book;
	
	
	
	public WebElement getFirst() {
		return first;
	}
	public WebElement getLast() {
		return last;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getCardnumber() {
		return cardnumber;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvvnumber() {
		return cvvnumber;
	}
	public WebElement getBook() {
		return book;
	}
	
	
	

}
