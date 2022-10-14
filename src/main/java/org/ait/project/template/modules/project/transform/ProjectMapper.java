package org.ait.project.template.modules.project.transform;


import org.ait.project.template.modules.project.dto.request.ProjectRequest;
import org.ait.project.template.modules.project.dto.response.ProjectResponse;
import org.ait.project.template.modules.project.model.entity.Project;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    ProjectResponse toProjectResponse(Project project);
    List<ProjectResponse> toProjectsResponse(List<Project> projects);
    Project toProjectRequest(ProjectRequest projectRequest);
}