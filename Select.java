package com.datadrivenexcel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.datadriven.DataDrivenBase;

public class Select extends DataDrivenBase {
	public Select() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	@FindBy(id="continue")
	private WebElement go;

	
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getGo() {
		return go;
	}
	

}
