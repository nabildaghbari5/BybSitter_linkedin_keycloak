package com.babysitting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.babysitting.model.Parent;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Integer> {

}
