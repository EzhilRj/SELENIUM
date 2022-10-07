package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

		@Test
		void ByEmail() {
			
			System.out.println("Login by Email");
			Assert.assertEquals("Ezhil", "Ezhil");
	}
		
		@Test
		void ByFacebook() {
			
			System.out.println("Login by FB");
			Assert.assertEquals("Ezhil", "Santhosh");
			
			
		}

}
