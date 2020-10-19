package test;

import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void sampleTest() {
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		
		System.out.println(BROWSER);
		System.out.println(USERNAME);
	}

}
