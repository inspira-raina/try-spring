package org.ait.project.template.modules.task.model.repository;

import org.ait.project.template.modules.task.model.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
