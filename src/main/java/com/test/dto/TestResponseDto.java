package com.test.dto;

import java.io.Serializable;

public class TestResponseDto implements Serializable {
	private static final long serialVersionUID = 3159723978991365907L;

	private String responseStatus;
	private String boss;
	private String team;

	public String getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}

	public String getBoss() {
		return boss;
	}

	public void setBoss(String boss) {
		this.boss = boss;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
}