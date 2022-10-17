package org.ait.project.template.modules.task.service.internal.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.template.modules.task.dto.request.TaskRequest;
import org.ait.project.template.modules.task.dto.response.TaskResponse;
import org.ait.project.template.modules.task.model.entity.Task;
import org.ait.project.template.modules.task.service.delegate.TaskServiceDelegate;
import org.ait.project.template.modules.task.service.internal.TaskService;
import org.ait.project.template.modules.task.transform.TaskMapper;
import org.ait.project.template.modules.user.dto.request.UserRequest;
import org.ait.project.template.modules.user.dto.response.UserResponse;
import org.ait.project.template.modules.user.model.entity.User;
import org.ait.project.template.modules.user.service.delegate.UserServiceDelegate;
import org.ait.project.template.modules.user.service.internal.UserService;
import org.ait.project.template.modules.user.transform.UserMapper;
import org.ait.project.template.shared.enums.ResponseEnum;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.ait.project.template.shared.utils.ResponseHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final ResponseHelper responseHelper;

    private final TaskServiceDelegate taskDelegate;

    private final TaskMapper taskMapper;

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<TaskResponse>>> newTask(TaskRequest taskRequest) {
        Task task = taskDelegate.newTask(taskMapper.toTaskRequest(taskRequest));
        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS, taskMapper.toTaskResponse(task));
    }

    @Override
    public ResponseEntity<ResponseTemplate<ResponseList<TaskResponse>>> getAllTask() {
        List<Task> taskList = taskDelegate.getAllTask();
        return responseHelper.createResponseCollection(ResponseEnum.SUCCESS, null, taskMapper.toTasksResponse(taskList));
    }

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<TaskResponse>>> getTaskById(Integer id) {
        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS, taskMapper.toTaskResponse(taskDelegate.getTaskById(id)));
    }
}
