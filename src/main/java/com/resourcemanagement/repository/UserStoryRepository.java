package com.resourcemanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.resourcemanagement.domain.UserStory;

@Repository
public interface UserStoryRepository extends CrudRepository<UserStory, Integer> {

}
