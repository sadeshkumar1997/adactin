package com.datadrivenexcel;

import java.io.IOException;

import org.testng.annotations.Test;

import com.datadriven.DataDrivenBase;

public class MainTest extends DataDrivenBase {
	@Test
	public void test1() throws IOException {
		browserLaunch("https://adactinhotelapp.com/");
		AdactinLogin t = new AdactinLogin();
		inputText(t.getUser(),stringData(1,0));
		inputText(t.getPass(),stringData(1,1));
		logins(t.getLog());
		   
		Search e= new Search();
		dropDownText(e.getPlace(),stringData(1,2));
		dropDownText(e.getFood(),stringData(1,3));
		dropDownText(e.getRooms(),stringData(1,4));
		dropDownText(e.getNumberofroom(),stringData(1,5));
		dropDownText(e.getAdult(),stringData(1,6));
		dropDownText(e.getChild(),stringData(1,7));
		logins(e.getSearch());
		
		 Select w= new Select();
	
		 logins(w.getRadio());
		 logins(w.getGo());
		 
	BookHotel y= new BookHotel();
	
	inputText(y.getFirst(),stringData(1,8));
	inputText(y.getLast(),stringData(1,9));
	inputText(y.getAdd(),stringData(1,10));
	inputText(y.getCardnumber(),numericData(1,11));
	dropDownText(y.getCardtype(),stringData(1,12));
	dropDownText(y.getMonth(),stringData(1,13));
	dropDownText(y.getYear(),numericData(1,14));
	inputText(y.getCvvnumber(),numericData(1,15));
	logins(y.getBook());
	takesScreenshot();
	driver.quit();
	
	
	}

}
