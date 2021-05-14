package com.example.coding.workout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(isolation = Isolation.REPEATABLE_READ)
public interface StudentRepo extends JpaRepository<Student,Long> {

}
