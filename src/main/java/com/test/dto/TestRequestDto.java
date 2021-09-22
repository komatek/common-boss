package com.test.dto;

import java.io.Serializable;

public class TestRequestDto implements Serializable {
	private static final long serialVersionUID = 3159723978991365907L;

	private String employee1;
	private String employee2;

	public String getEmployee1() {
		return employee1;
	}

	public void setEmployee1(String employee1) {
		this.employee1 = employee1;
	}

	public String getEmployee2() {
		return employee2;
	}

	public void setEmployee2(String employee2) {
		this.employee2 = employee2;
	}
}