package com.example.demo.adapter.repository;
import com.example.demo.domain.entity.WorkList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkListRepository extends JpaRepository<WorkList, Long> {
}
