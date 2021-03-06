package com.springcourse.repositories;

import com.springcourse.models.RequestStage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestStageRepository extends JpaRepository<RequestStage, Long> {

    List<RequestStage> findAllByRequestId(Long id);
}
