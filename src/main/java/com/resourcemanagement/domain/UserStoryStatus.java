package com.resourcemanagement.domain;

import java.io.Serializable;
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
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class UserStoryStatus implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "status_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer statusId;

	@Enumerated(EnumType.STRING)
	@Column(name = "status_name")
	private UserStoryStatusType statusName;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userStoryStatus", fetch = FetchType.EAGER, orphanRemoval = true)
	private List<UserStory> userStories;
	
	
	public Integer getStatusId() {
		return statusId;
	}

	public UserStoryStatusType getStatusName() {
		return statusName;
	}

	public void setStatusName(UserStoryStatusType statusName) {
		this.statusName = statusName;
	}

	public List<UserStory> getUserStories() {
		return userStories;
	}

	public void setUserStories(List<UserStory> userStories) {
		this.userStories = userStories;
	}

}
