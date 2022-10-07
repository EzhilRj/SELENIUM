package Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {

	public void onTeststart(ITestResult tr) {

		System.out.println("Test Started");

	}

	public void onTestSucess(ITestResult tr) {

		System.out.println("Test Successfully passed");

	}

	public void onTestFailure(ITestResult tr) {

		System.out.println("Test is Failed");

	}

	public void onTestSkipped(ITestResult tr) {

		System.out.println("Test is Skipped");

	}

}
