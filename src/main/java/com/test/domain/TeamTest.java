package com.test.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TeamTest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne
	private TeamTest parent;

	private String name;

	@OneToOne
	private UserTest boss;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TeamTest getParent() {
		return parent;
	}

	public void setParent(TeamTest parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserTest getBoss() {
		return boss;
	}

	public void setBoss(UserTest boss) {
		this.boss = boss;
	}
}
