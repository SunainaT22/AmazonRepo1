package Mpro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testanno {
	@BeforeClass
	void beforeclass() {
		System.out.println("beforeclass");
	}
@BeforeMethod
void beforeMethod() {
	System.out.println("beforemthod");
}
@Test
void test() {
	System.out.println("test");
}
@AfterMethod
void aftermethod() {
	System.out.println("aftermethod");
}
@AfterClass
void afterClass() {
	System.out.println("afterclass");
}
}
