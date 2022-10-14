package org.ait.project.template.modules.client.service.delegate;
import org.ait.project.template.modules.client.model.entity.Client;

import java.util.List;

public interface ClientServiceDelegate {
   Client create(Client client);
   List<Client> getAll();
   Client getById(Integer id);
}
