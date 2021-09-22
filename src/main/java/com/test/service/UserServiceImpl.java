package com.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.domain.TeamTest;
import com.test.domain.UserTest;
import com.test.repository.UserTestRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserTestRepository userRepository;

	@Override
	public UserTest findByName(String name) {
		return userRepository.findByName(name);
	}

	@Override
	public UserTest findCommonBoss(UserTest employee1, UserTest employee2) {
		UserTest commonBoss = null;

		if (Optional.ofNullable(employee1).isPresent() && Optional.ofNullable(employee2).isPresent()) {
			TeamTest employee1Team = employee1.getTeam();
			TeamTest employee2Team = employee2.getTeam();

			List<TeamTest> teamList1 = new ArrayList<>();
			do {
				teamList1.add(employee1Team);
				employee1Team = employee1Team.getParent();
			} while (Optional.ofNullable(employee1Team).isPresent());

			List<TeamTest> teamList2 = new ArrayList<>();
			do {
				teamList2.add(employee2Team);
				employee2Team = employee2Team.getParent();
			} while (Optional.ofNullable(employee2Team).isPresent());

			Optional<TeamTest> commonTeam = teamList1.stream().filter(teamList2::contains).findFirst();
			if (commonTeam.isPresent()) {
				commonBoss = commonTeam.get().getBoss();

				if ((commonBoss.equals(employee1) || commonBoss.equals(employee2))
						&& Optional.ofNullable(commonBoss.getTeam().getParent()).isPresent()) {
					commonBoss = commonBoss.getTeam().getParent().getBoss();
				}
			}
		}

		return commonBoss;
	}
}