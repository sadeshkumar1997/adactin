package com.datadrivenexcel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.datadriven.DataDrivenBase;

public class Search extends DataDrivenBase{
	public Search() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement place;
	@FindBy(id="hotels")
	private WebElement food;
	@FindBy(id="room_type")
	private WebElement rooms;
	@FindBy(id="room_nos")
	private WebElement numberofroom;
	@FindBy(id="adult_room")
	private WebElement adult;
	@FindBy(id="child_room")
	private WebElement child;
	@FindBy(id="Submit")
	private WebElement search;
	public WebElement getPlace() {
		return place;
	}
	public WebElement getFood() {
		return food;
	}
	public WebElement getRooms() {
		return rooms;
	}
	public WebElement getNumberofroom() {
		return numberofroom;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSearch() {
		return search;
	}
	
}
