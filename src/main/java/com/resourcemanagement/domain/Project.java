package com.resourcemanagement.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Project implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "project_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer projectId;

	@Column(name = "project_name")
	private String projectName;
	
	@Column(name = "project_description")
	private String projectDescription;
	
	@Column(name = "project_client_name")
	private String projectClientName;

	@Column(name = "project_startdate")
	private Date projectStartDate;

	@Column(name = "project_enddate")
	private Date projectEndDate;

	@Column(name = "project_status")
	private String projectStatus;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "projects", fetch = FetchType.EAGER, orphanRemoval = true)
	private List<UserStory> userstories;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "projects", fetch = FetchType.EAGER, orphanRemoval = true)
	private List<ProjectSprint> projectSprints;

	public Project() {
		super();
		userstories = new ArrayList<UserStory>();
		projectSprints = new ArrayList<ProjectSprint>();
	}

	public Integer getProjectId() {
		return projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public Date getProjectEndDate() {
		return projectEndDate;
	}

	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}


	public String getProjectClientName() {
		return projectClientName;
	}

	public void setProjectClientName(String projectClientName) {
		this.projectClientName = projectClientName;
	}

	public List<UserStory> getUserstories() {
		return userstories;
	}

	public void setUserstories(List<UserStory> userstories) {
		this.userstories = userstories;
	}


	public List<ProjectSprint> getProjectSprints() {
		return projectSprints;
	}

	public void setProjectSprints(List<ProjectSprint> projectSprints) {
		this.projectSprints = projectSprints;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

}
