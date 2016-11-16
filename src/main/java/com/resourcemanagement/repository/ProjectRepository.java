package com.resourcemanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.resourcemanagement.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {

}
