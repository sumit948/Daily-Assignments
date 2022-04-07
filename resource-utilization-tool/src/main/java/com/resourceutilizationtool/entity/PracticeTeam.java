package com.resourceutilizationtool.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "practice_team")
public class PracticeTeam {

	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "practice_id")
	@Id
	private String practiceId;

	@Column(name = "practice_team")
	private String practiceTeam;

	public String getPracticeId() {
		return practiceId;
	}

	public void setPracticeId(String practiceId) {
		this.practiceId = practiceId;
	}

	public String getPracticeTeam() {
		return practiceTeam;
	}

	public void setPracticeTeam(String practiceTeam) {
		this.practiceTeam = practiceTeam;
	}
}
