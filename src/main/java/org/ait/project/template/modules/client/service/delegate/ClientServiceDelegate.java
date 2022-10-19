package org.ait.project.template.modules.client.service.delegate;
import org.ait.project.template.modules.client.model.entity.Client;
import org.ait.project.template.modules.project.model.entity.Project;

import java.util.List;

public interface ClientServiceDelegate {
   Client create(Client client);
   List<Client> getAll();
   List<Project> getProjectsByClientId(Integer id);
   Client getById(Integer id);
}
