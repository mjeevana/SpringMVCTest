package com.seenukarthi.springmvc;

import java.io.Serializable;

public class TestTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4275437605375148252L;

	private String testStr;

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
	
}
