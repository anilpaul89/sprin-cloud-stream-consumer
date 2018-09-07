package com.scalend.cloudsubcriber;

public class TestRequest {

	private String name;

	private String testing;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTesting() {
		return testing;
	}

	public void setTesting(String testing) {
		this.testing = testing;
	}

	@Override
	public String toString() {
		return "TestRequest [name=" + name + ", testing=" + testing + "]";
	}

}
