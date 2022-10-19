package org.ait.project.template.modules.project.model.repository;

import org.ait.project.template.modules.project.model.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
    List<Project> findAllByClientId(Integer clientId);
}
