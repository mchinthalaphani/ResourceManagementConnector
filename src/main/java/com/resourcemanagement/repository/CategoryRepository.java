package com.resourcemanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.resourcemanagement.domain.UserStoryCategory;

@Repository
public interface CategoryRepository extends CrudRepository<UserStoryCategory,Integer> {

}
