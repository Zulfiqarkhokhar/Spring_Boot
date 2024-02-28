package com.FetchData.FetchData.repository;

import com.FetchData.FetchData.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
    public void deleteById(Long id);
}
