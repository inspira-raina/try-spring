package org.ait.project.template.modules.task.service.delegate;
import org.ait.project.template.modules.task.model.entity.Task;

import java.util.List;

public interface TaskServiceDelegate {
   Task newTask(Task task);
   List<Task> getAllTask();
   Task getTaskById(Integer id);
}
