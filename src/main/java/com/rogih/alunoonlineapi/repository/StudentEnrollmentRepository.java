package com.rogih.alunoonlineapi.repository;

import com.rogih.alunoonlineapi.model.StudentEnrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentEnrollmentRepository extends JpaRepository<StudentEnrollment, Long> {
    List<StudentEnrollment> findByStudentId(Long studentId);
}
