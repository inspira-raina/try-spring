package org.ait.project.template.modules.task.controller;

import lombok.AllArgsConstructor;

import org.ait.project.template.modules.task.dto.request.TaskRequest;
import org.ait.project.template.modules.task.dto.response.TaskResponse;
import org.ait.project.template.modules.task.service.internal.TaskService;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/tasks")
    public ResponseEntity<ResponseTemplate<ResponseList<TaskResponse>>> getAllTask() {
        return taskService.getAllTask();
    }

    @GetMapping("/task/{id}")
    public  ResponseEntity<ResponseTemplate<ResponseDetail<TaskResponse>>> getTaskById(@PathVariable Integer id) {
        return taskService.getTaskById(id);
    }

    @PostMapping("/task")
    public ResponseEntity<ResponseTemplate<ResponseDetail<TaskResponse>>> addUser(@Valid @RequestBody TaskRequest taskRequest) {
        return taskService.newTask(taskRequest);
    }
}
