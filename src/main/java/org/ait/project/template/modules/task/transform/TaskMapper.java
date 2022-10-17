package org.ait.project.template.modules.task.transform;


import org.ait.project.template.modules.task.dto.request.TaskRequest;
import org.ait.project.template.modules.task.dto.response.TaskResponse;
import org.ait.project.template.modules.task.model.entity.Task;
import org.ait.project.template.modules.user.dto.request.UserRequest;
import org.ait.project.template.modules.user.dto.response.UserResponse;
import org.ait.project.template.modules.user.model.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskResponse toTaskResponse(Task task);
    List<TaskResponse> toTasksResponse(List<Task> tasks);
    Task toTaskRequest(TaskRequest taskRequest);
}