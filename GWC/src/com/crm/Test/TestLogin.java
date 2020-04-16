package com.crm.Test;

import org.testng.annotations.Test;

import com.crm.Generic.BaseTest;
import com.crm.pages.LoginPage;

public class TestLogin extends BaseTest {

	LoginPage lp;
	@Test
	public void usernametest() {
		
		lp=new LoginPage();
		lp.setUsername("fasilnaseeb");
		
		
	}
	
	
}
