package pullscm;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsParameterTest {
	@Test
	public void receiveParamter() {
		String value = System.getProperty("browser");
		Reporter.log(value, true);
	}

}
