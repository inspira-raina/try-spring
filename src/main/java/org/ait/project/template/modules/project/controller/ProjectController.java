package org.ait.project.template.modules.project.controller;

import lombok.RequiredArgsConstructor;
import org.ait.project.template.modules.project.dto.request.ProjectRequest;
import org.ait.project.template.modules.project.dto.response.ProjectResponse;
import org.ait.project.template.modules.project.service.internal.ProjectService;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProjectController implements ProjectService{

    private final ProjectService projectService;

    @Override
    @GetMapping("/projects")
    public ResponseEntity<ResponseTemplate<ResponseList<ProjectResponse>>> getAllProjects() {
        return projectService.getAllProjects();
    }

    @Override
    @GetMapping("/project/{id}")
    public  ResponseEntity<ResponseTemplate<ResponseDetail<ProjectResponse>>> getProjectById(@PathVariable Integer id) {
        return projectService.getProjectById(id);
    }

    @Override
    @PostMapping("/project")
    public ResponseEntity<ResponseTemplate<ResponseDetail<ProjectResponse>>> addProject(@RequestBody ProjectRequest projectRequest) {
        return projectService.addProject(projectRequest);
    }
}
