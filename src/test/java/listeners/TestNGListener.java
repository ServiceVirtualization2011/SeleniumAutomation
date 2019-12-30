package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener
{
	public void onTestStart(ITestResult result) {
        System.out.println("New Test Started" + result.getName());
}
	}

