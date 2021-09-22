package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.domain.TeamTest;
import com.test.domain.UserTest;
import com.test.repository.TeamTestRepository;
import com.test.repository.UserTestRepository;

@SpringBootApplication
public class StartApplication implements CommandLineRunner {

	@Autowired
	private TeamTestRepository teamRepository;
	@Autowired
	private UserTestRepository userRepository;

	private static final Logger log = LoggerFactory.getLogger(StartApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

	@Override
	public void run(String... args) {
		log.info("StartApplication...");

		prepareEnvironment();
		System.out.println("\n SYSTEM STARTED");
	}

	private void prepareEnvironment() {
		/* TEAMS */
		TeamTest team1 = new TeamTest();
		team1.setName("CEO");
		teamRepository.save(team1);

		TeamTest team2 = new TeamTest();
		team2.setName("Managing");
		team2.setParent(team1);
		teamRepository.save(team2);

		TeamTest team3 = new TeamTest();
		team3.setName("Consulting");
		team3.setParent(team2);
		teamRepository.save(team3);

		TeamTest team4 = new TeamTest();
		team4.setName("Training");
		team4.setParent(team2);
		teamRepository.save(team4);

		TeamTest team5 = new TeamTest();
		team5.setName("Corporate");
		team5.setParent(team2);
		teamRepository.save(team5);

		TeamTest team6 = new TeamTest();
		team6.setName("Marketing");
		team6.setParent(team3);
		teamRepository.save(team6);

		TeamTest team7 = new TeamTest();
		team7.setName("Implementation");
		team7.setParent(team3);
		teamRepository.save(team7);

		TeamTest team8 = new TeamTest();
		team8.setName("Maintenance");
		team8.setParent(team3);
		teamRepository.save(team8);

		TeamTest team9 = new TeamTest();
		team9.setName("Sales");
		team9.setParent(team4);
		teamRepository.save(team9);

		TeamTest team10 = new TeamTest();
		team10.setName("Public");
		team10.setParent(team4);
		teamRepository.save(team10);

		TeamTest team11 = new TeamTest();
		team11.setName("Course");
		team11.setParent(team4);
		teamRepository.save(team11);

		TeamTest team12 = new TeamTest();
		team12.setName("Special");
		team12.setParent(team4);
		teamRepository.save(team12);

		TeamTest team13 = new TeamTest();
		team13.setName("Accounts");
		team13.setParent(team5);
		teamRepository.save(team13);

		TeamTest team14 = new TeamTest();
		team14.setName("Administration");
		team14.setParent(team5);
		teamRepository.save(team14);

		/* USERS */
		UserTest user1 = new UserTest();
		user1.setName("Baby Yoda");
		user1.setTeam(team1);
		userRepository.save(user1);

		UserTest user2 = new UserTest();
		user2.setName("Geralt");
		user2.setTeam(team2);
		userRepository.save(user2);

		UserTest user3 = new UserTest();
		user3.setName("Luffy");
		user3.setTeam(team2);
		userRepository.save(user3);

		UserTest user4 = new UserTest();
		user4.setName("Zoro");
		user4.setTeam(team3);
		userRepository.save(user4);

		UserTest user5 = new UserTest();
		user5.setName("Sanji");
		user5.setTeam(team3);
		userRepository.save(user5);

		UserTest user6 = new UserTest();
		user6.setName("Nami");
		user6.setTeam(team4);
		userRepository.save(user6);

		UserTest user7 = new UserTest();
		user7.setName("Goku");
		user7.setTeam(team4);
		userRepository.save(user7);

		UserTest user8 = new UserTest();
		user8.setName("Kulilin");
		user8.setTeam(team5);
		userRepository.save(user8);

		UserTest user9 = new UserTest();
		user9.setName("Bulma");
		user9.setTeam(team5);
		userRepository.save(user9);

		UserTest user10 = new UserTest();
		user10.setName("Silvester");
		user10.setTeam(team6);
		userRepository.save(user10);

		UserTest user11 = new UserTest();
		user11.setName("Arnold");
		user11.setTeam(team6);
		userRepository.save(user11);

		UserTest user12 = new UserTest();
		user12.setName("Arthur");
		user12.setTeam(team7);
		userRepository.save(user12);

		UserTest user13 = new UserTest();
		user13.setName("John");
		user13.setTeam(team7);
		userRepository.save(user13);

		UserTest user14 = new UserTest();
		user14.setName("Jack");
		user14.setTeam(team8);
		userRepository.save(user14);

		UserTest user15 = new UserTest();
		user15.setName("Alex");
		user15.setTeam(team8);
		userRepository.save(user15);

		UserTest user16 = new UserTest();
		user16.setName("Helene");
		user16.setTeam(team9);
		userRepository.save(user16);

		UserTest user17 = new UserTest();
		user17.setName("Nicky");
		user17.setTeam(team9);
		userRepository.save(user17);

		UserTest user18 = new UserTest();
		user18.setName("Martha");
		user18.setTeam(team10);
		userRepository.save(user18);

		UserTest user19 = new UserTest();
		user19.setName("Sylvia");
		user19.setTeam(team10);
		userRepository.save(user19);

		UserTest user20 = new UserTest();
		user20.setName("Mando");
		user20.setTeam(team11);
		userRepository.save(user20);

		UserTest user21 = new UserTest();
		user21.setName("Paul");
		user21.setTeam(team11);
		userRepository.save(user21);

		UserTest user22 = new UserTest();
		user22.setName("Richard");
		user22.setTeam(team12);
		userRepository.save(user22);

		UserTest user23 = new UserTest();
		user23.setName("Gilfoyle");
		user23.setTeam(team12);
		userRepository.save(user23);

		UserTest user24 = new UserTest();
		user24.setName("Dinesh");
		user24.setTeam(team13);
		userRepository.save(user24);

		UserTest user25 = new UserTest();
		user25.setName("Rick");
		user25.setTeam(team13);
		userRepository.save(user25);

		UserTest user26 = new UserTest();
		user26.setName("Morty");
		user26.setTeam(team14);
		userRepository.save(user26);

		UserTest user27 = new UserTest();
		user27.setName("Mark");
		user27.setTeam(team14);
		userRepository.save(user27);

		/* SET UP BOSSES */
		team1.setBoss(user1);
		teamRepository.save(team1);

		team2.setBoss(user2);
		teamRepository.save(team2);

		team3.setBoss(user4);
		teamRepository.save(team3);

		team4.setBoss(user6);
		teamRepository.save(team4);

		team5.setBoss(user8);
		teamRepository.save(team5);

		team6.setBoss(user10);
		teamRepository.save(team6);

		team7.setBoss(user12);
		teamRepository.save(team7);

		team8.setBoss(user14);
		teamRepository.save(team8);

		team9.setBoss(user16);
		teamRepository.save(team9);

		team10.setBoss(user18);
		teamRepository.save(team10);

		team11.setBoss(user20);
		teamRepository.save(team11);

		team12.setBoss(user22);
		teamRepository.save(team12);

		team13.setBoss(user24);
		teamRepository.save(team13);

		team14.setBoss(user26);
		teamRepository.save(team14);
	}
}