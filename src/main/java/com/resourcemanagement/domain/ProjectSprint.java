package com.resourcemanagement.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ProjectSprint implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "sprint_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sprintId;
	
	@Column(name = "sprint_Number")
	private  String sprintNumber;
	
	@Column(name = "sprintOwner")
	private String sprintOwner;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "sprint_status")
	private SprintStatus sprintStatus;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id", referencedColumnName = "project_id", nullable = false )
	private Project projects;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "projectSprints", fetch = FetchType.EAGER, orphanRemoval = true)
	private List<UserStory> userStories;

	public Integer getSprintId() {
		return sprintId;
	}

	public String getSprintNumber() {
		return sprintNumber;
	}

	public void setSprintNumber(String sprintNumber) {
		this.sprintNumber = sprintNumber;
	}

	public String getSprintOwner() {
		return sprintOwner;
	}

	public void setSprintOwner(String sprintOwner) {
		this.sprintOwner = sprintOwner;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public SprintStatus getSprintStatus() {
		return sprintStatus;
	}

	public void setSprintStatus(SprintStatus sprintStatus) {
		this.sprintStatus = sprintStatus;
	}

	public Project getProjects() {
		return projects;
	}

	public void setProjects(Project projects) {
		this.projects = projects;
	}

	public List<UserStory> getUserStories() {
		return userStories;
	}

	public void setUserStories(List<UserStory> userStories) {
		this.userStories = userStories;
	}
	
	
	

}
