package org.ait.project.template.modules.project.service.delegate.impl;

import lombok.AllArgsConstructor;
import org.ait.project.template.modules.project.model.entity.Project;
import org.ait.project.template.modules.project.model.repository.ProjectRepository;
import org.ait.project.template.modules.project.service.delegate.ProjectServiceDelegate;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;


@Service
@AllArgsConstructor
public class ProjectServiceDelegateImpl implements ProjectServiceDelegate {

    private final ProjectRepository projectRepository;

    @Override
    public Project saveProject(Project project) {
        project.setCreatedAt(ZonedDateTime.now());
        return projectRepository.save(project);
    }

    @Override
    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project getProjectById(Integer id) {
        return projectRepository.findById(id).get();
    }
}
