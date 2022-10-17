package org.ait.project.template.modules.project.transform;


import org.ait.project.template.modules.client.transform.ClientMapper;
import org.ait.project.template.modules.project.dto.request.ProjectRequest;
import org.ait.project.template.modules.project.dto.response.ProjectResponse;
import org.ait.project.template.modules.project.model.entity.Project;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring", uses = ClientMapper.class)
public interface ProjectMapper {
    @Named("mapToProject")
    @Mapping(source = "project.client", target = "clientResponse", qualifiedByName = "mapToClient")
    ProjectResponse mapToProject(Project project);

    @IterableMapping(qualifiedByName = "mapToProject")
    List<ProjectResponse> mapToProjectList(List<Project> projectList);

    Project toProjectRequest(ProjectRequest projectRequest);
}