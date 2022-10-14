package org.ait.project.template.modules.project.service.internal;

import org.ait.project.template.modules.project.dto.request.ProjectRequest;
import org.ait.project.template.modules.project.dto.response.ProjectResponse;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;

public interface ProjectService {
    ResponseEntity<ResponseTemplate<ResponseDetail<ProjectResponse>>> addProject(ProjectRequest projectRequest);

    ResponseEntity<ResponseTemplate<ResponseList<ProjectResponse>>> getAllProjects();

    ResponseEntity<ResponseTemplate<ResponseDetail<ProjectResponse>>> getProjectById(Integer id);
}
