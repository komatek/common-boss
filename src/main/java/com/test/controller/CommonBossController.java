package com.test.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.domain.UserTest;
import com.test.dto.TestRequestDto;
import com.test.dto.TestResponseDto;
import com.test.service.UserService;

@RestController
public class CommonBossController {

	@Autowired
	private UserService userService;

	@PostMapping(path = "/lca")
	public TestResponseDto findCommonBoss(@RequestBody TestRequestDto request) {
		TestResponseDto responseObject = new TestResponseDto();
		responseObject.setResponseStatus("KO");

		String employee1Name = Optional.ofNullable(request.getEmployee1()).orElse("");
		String employee2Name = Optional.ofNullable(request.getEmployee2()).orElse("");

		UserTest employee1 = userService.findByName(employee1Name);
		UserTest employee2 = userService.findByName(employee2Name);

		UserTest commonBoss = userService.findCommonBoss(employee1, employee2);
		if (commonBoss != null) {
			responseObject.setResponseStatus("OK");

			responseObject.setBoss(commonBoss.getName());
			responseObject.setTeam(commonBoss.getTeam().getName());
		}

		return responseObject;
	}
}