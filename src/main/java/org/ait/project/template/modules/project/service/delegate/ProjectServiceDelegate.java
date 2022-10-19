package org.ait.project.template.modules.project.service.delegate;

import org.ait.project.template.modules.project.model.entity.Project;

import java.util.List;

public interface ProjectServiceDelegate {
   Project saveProject(Project project);
   List<Project> getProjects();

   Project getProjectById(Integer id);

}
