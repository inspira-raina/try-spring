package org.ait.project.template.modules.project.service.internal.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.template.modules.project.dto.request.ProjectRequest;
import org.ait.project.template.modules.project.dto.response.ProjectResponse;
import org.ait.project.template.modules.project.model.entity.Project;
import org.ait.project.template.modules.project.service.delegate.ProjectServiceDelegate;
import org.ait.project.template.modules.project.service.internal.ProjectService;
import org.ait.project.template.modules.project.transform.ProjectMapper;
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
public class ProjectServiceImpl implements ProjectService {

    private final ResponseHelper responseHelper;

    private final ProjectServiceDelegate projectDelegate;

    private final ProjectMapper projectMapper;

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<ProjectResponse>>> addProject(ProjectRequest projectRequest) {
        Project project = projectDelegate.saveProject(projectMapper.toProjectRequest(projectRequest));
        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS, projectMapper.mapToProject(project));
    }

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<ProjectResponse>>> getProjectById(Integer id) {
        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS, projectMapper.mapToProject(projectDelegate.getProjectById(id)));
    }

    @Override
    public ResponseEntity<ResponseTemplate<ResponseList<ProjectResponse>>> getAllProjects() {
        List<Project> projectList = projectDelegate.getProjects();
        return  responseHelper.createResponseCollection(ResponseEnum.SUCCESS, null, projectMapper.mapToProjectList(projectList));
    }
}
