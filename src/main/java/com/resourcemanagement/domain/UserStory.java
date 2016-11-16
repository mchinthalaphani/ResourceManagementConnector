package com.resourcemanagement.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class UserStory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "user_story_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userStoryId;

	@Column(name = "user_story_description")
	private String userStoryDescription;

	@Column(name = "estimated_time")
	private String estimatedTime;

	@Column(name = "actual_time_spent")
	private String actualTimeSpent;

	@Column(name = "remaining_time")
	private String remainingTime;

	@Column(name = "user_story_owner")
	private String userStoryOwner;

	@Column(name = "user_story_target_date")
	private Date userStoryTargetDate;

	@Column(name = "user_story_artifact")
	private String userStoryArtifact;

	@Column(name = "user_story_notes")
	private String userStoryNotes;

	@Enumerated(EnumType.STRING)
	@Column(name = "user_story_type")
	private UserStoryType userStoryType;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id", referencedColumnName = "project_id", nullable = false)
	private Project projects;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sprint_id", referencedColumnName = "sprint_id", nullable = false)
	private ProjectSprint projectSprints;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id", referencedColumnName ="category_id")
	private UserStoryCategory userStoryCategories;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "status_id", referencedColumnName ="status_id")
	private UserStoryStatus userStoryStatus;

	public ProjectSprint getProjectSprints() {
		return projectSprints;
	}

	public void setProjectSprints(ProjectSprint projectSprints) {
		this.projectSprints = projectSprints;
	}

	public UserStory() {
		super();

	}

	public Integer getUserStoryId() {
		return userStoryId;
	}

	public String getUserStoryDescription() {
		return userStoryDescription;
	}

	public void setUserStoryDescription(String userStoryDescription) {
		this.userStoryDescription = userStoryDescription;
	}

	public String getEstimatedTime() {
		return estimatedTime;
	}

	public void setEstimatedTime(String estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	public String getActualTimeSpent() {
		return actualTimeSpent;
	}

	public void setActualTimeSpent(String actualTimeSpent) {
		this.actualTimeSpent = actualTimeSpent;
	}

	public String getRemainingTime() {
		return remainingTime;
	}

	public void setRemainingTime(String remainingTime) {
		this.remainingTime = remainingTime;
	}

	public String getUserStoryOwner() {
		return userStoryOwner;
	}

	public void setUserStoryOwner(String userStoryOwner) {
		this.userStoryOwner = userStoryOwner;
	}

	public Date getUserStoryTargetDate() {
		return userStoryTargetDate;
	}

	public void setUserStoryTargetDate(Date userStoryTargetDate) {
		this.userStoryTargetDate = userStoryTargetDate;
	}

	public Project getProjects() {
		return projects;
	}

	public void setProjects(Project projects) {
		this.projects = projects;
	}

	public String getUserStoryArtifact() {
		return userStoryArtifact;
	}

	public void setUserStoryArtifact(String userStoryArtifact) {
		this.userStoryArtifact = userStoryArtifact;
	}

	public String getUserStoryNotes() {
		return userStoryNotes;
	}

	public void setUserStoryNotes(String userStoryNotes) {
		this.userStoryNotes = userStoryNotes;
	}

	public UserStoryType getUserStoryType() {
		return userStoryType;
	}

	public void setUserStoryType(UserStoryType userStoryType) {
		this.userStoryType = userStoryType;
	}
	
	public UserStoryCategory getUserStoryCategories() {
		return userStoryCategories;
	}
	

	public UserStoryStatus getUserStoryStatus() {
		return userStoryStatus;
	}

	public void setUserStoryStatus(UserStoryStatus userStoryStatus) {
		this.userStoryStatus = userStoryStatus;
	}

	public void setUserStoryCategories(UserStoryCategory userStoryCategories) {
		this.userStoryCategories = userStoryCategories;
	}


}
