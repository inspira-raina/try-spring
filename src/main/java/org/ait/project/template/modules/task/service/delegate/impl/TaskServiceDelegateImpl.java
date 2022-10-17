package org.ait.project.template.modules.task.service.delegate.impl;

import lombok.AllArgsConstructor;
import org.ait.project.template.modules.task.model.entity.Task;
import org.ait.project.template.modules.task.model.repository.TaskRepository;
import org.ait.project.template.modules.task.service.delegate.TaskServiceDelegate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskServiceDelegateImpl implements TaskServiceDelegate {

    private final TaskRepository taskRepository;

    @Override
    public Task newTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Integer id) {
        return taskRepository.findById(id).get();
    }
}
