package com.resourcemanagement.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class UserStoryCategory implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "category_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer categoryId;
	
	@Column(name = "category_name")
	private String categoryName;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userStoryCategories", fetch = FetchType.EAGER, orphanRemoval = true)
	private List<UserStory> userStories;
	
	public Integer getCategoryId() {
		return categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<UserStory> getUserStories() {
		return userStories;
	}

	public void setUserStories(List<UserStory> userStories) {
		this.userStories = userStories;
	}
	
	

}
