package org.ait.project.template.modules.task.service.internal;

import org.ait.project.template.modules.task.dto.request.TaskRequest;
import org.ait.project.template.modules.task.dto.response.TaskResponse;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;

public interface TaskService {
    ResponseEntity<ResponseTemplate<ResponseDetail<TaskResponse>>> newTask(TaskRequest taskRequest);
    ResponseEntity<ResponseTemplate<ResponseList<TaskResponse>>> getAllTask();
    ResponseEntity<ResponseTemplate<ResponseDetail<TaskResponse>>> getTaskById(Integer id);
}
