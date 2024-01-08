package org.QA.Util;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class ListenerClass extends BaseClass implements IRetryAnalyzer, IAnnotationTransformer, ITestListener
{

	int limit = 3;
	int count = 0;
	
	public boolean retry(ITestResult result) {
		if (count<limit) {
			count++;
			return true;
		}

		return false;
	}
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(ListenerClass.class);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		try {
			screenShot("*/Screenshot");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
