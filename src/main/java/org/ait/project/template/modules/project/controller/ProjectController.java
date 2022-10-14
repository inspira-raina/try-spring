package org.ait.project.template.modules.project.controller;

import lombok.AllArgsConstructor;

import org.ait.project.template.modules.project.dto.request.ProjectRequest;
import org.ait.project.template.modules.project.dto.response.ProjectResponse;
import org.ait.project.template.modules.project.service.internal.ProjectService;
import org.ait.project.template.modules.user.dto.request.UserRequest;
import org.ait.project.template.modules.user.dto.response.UserResponse;
import org.ait.project.template.modules.user.service.internal.UserService;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @GetMapping("/projects")
    public ResponseEntity<ResponseTemplate<ResponseList<ProjectResponse>>> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/project/{id}")
    public  ResponseEntity<ResponseTemplate<ResponseDetail<ProjectResponse>>> getProjectById(@PathVariable Integer id) {
        return projectService.getProjectById(id);
    }

    @PostMapping("/project")
    public ResponseEntity<ResponseTemplate<ResponseDetail<ProjectResponse>>> addProject(@RequestBody ProjectRequest projectRequest) {
        return projectService.addProject(projectRequest);
    }
}
